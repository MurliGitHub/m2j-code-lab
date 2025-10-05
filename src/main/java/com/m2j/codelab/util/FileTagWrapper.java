package com.m2j.codelab.util;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Utility class for wrapping each line of a text file with customizable XML-like tags.
 *
 * Example:
 *   Input line:  name
 *   Result:      <field>name</field>
 */
public final class FileTagWrapper {

    private FileTagWrapper() {
        // Prevent instantiation
    }

    /**
     * Reads a text file, wraps each line inside the given XML-like tags, and writes to an output file.
     *
     * @param inputPath    Path to input file
     * @param outputPath   Path to output file
     * @param tagName      Tag name to wrap lines with (e.g. "field" → <field>...</field>)
     * @param skipBlank    Whether to skip blank or empty lines
     * @return true if the operation succeeded, false otherwise
     */
    public static boolean wrapLinesWithTag(String inputPath, String outputPath, String tagName, boolean skipBlank) {
        Path input = Paths.get(inputPath);
        Path output = Paths.get(outputPath);

        try (Stream<String> lines = Files.lines(input, StandardCharsets.UTF_8)) {

            List<String> wrappedLines = lines
                    .filter(line -> !skipBlank || !line.isBlank())
                    .map(line -> "<" + tagName + ">" + line.trim() + "</" + tagName + ">")
                    .collect(Collectors.toList());

            Files.write(output, wrappedLines, StandardCharsets.UTF_8,
                    StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);

            return true;

        } catch (IOException e) {
            System.err.println("Error processing file: " + e.getMessage());
            return false;
        }
    }
}

