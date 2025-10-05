package com.m2j.codelab.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.lang.reflect.Field;

public final class ReflectionUtils {
    private static final Logger logger = LoggerFactory.getLogger(ReflectionUtils.class);
    private ReflectionUtils() {
    }

    public static boolean isNonEmptyResponse(Object object) {
        if (object == null) return false;

        Class<?> clazz = object.getClass();
        while (clazz != null) {
            for (Field f : clazz.getDeclaredFields()) {
                try {
                    f.setAccessible(true);
                    Object value = f.get(object);
                    if (value != null) {
                        return true;
                    }
                } catch (IllegalAccessException e) {
                    logger.error("Error reading field {}: {}", f.getName(), e.getMessage());
                }
            }
            clazz = clazz.getSuperclass(); // check inherited fields
        }
        return false;
    }

}
