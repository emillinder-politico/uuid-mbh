package com.example.uuidmbh;

import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class UuidParserTest {

    @Test
    void testRandomUuids() {
        UuidParser uuidParser = new UuidParser();
        for (int i = 0; i < 1000000; i++) {
            String string = UUID.randomUUID().toString();
            UUID uuid = uuidParser.uuidWithPatternGuard(string);
            assertNotNull(uuid, string + " should be a valid UUID");
        }
    }
}
