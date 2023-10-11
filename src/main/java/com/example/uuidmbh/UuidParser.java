package com.example.uuidmbh;

import java.util.UUID;
import java.util.regex.Pattern;

public class UuidParser {

    private static final Pattern UUID_PATTERN = Pattern.compile("[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[89ab][0-9a-f]{3}-[0-9a-f]{12}");

    public UUID uuidWithPatternGuard(String s) {
        if (UUID_PATTERN.matcher(s).matches()) {
            return UUID.fromString(s);
        } else {
            return null;
        }
    }

    public UUID uuidWithExceptionGuard(String s) {
        try {
            return UUID.fromString(s);
        } catch (Exception e) {
            return null;
        }
    }

}
