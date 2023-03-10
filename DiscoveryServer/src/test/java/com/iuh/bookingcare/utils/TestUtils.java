package com.iuh.bookingcare.utils;

import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;
import java.io.Serializable;

public abstract class TestUtils {

    public static boolean isValid(String json) {
        try {
            JsonParser.parseString(json);
            return true;
        } catch (JsonSyntaxException jse) {
            return false;
        }
    }

    public static boolean isSerializable(final Class c) {
        return (Serializable.class.isAssignableFrom(c));
    }

    public static boolean isSerializable(final Object c) {
        return isSerializable(c.getClass());
    }
}
