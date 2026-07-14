/*
 * Copyright (c) 2026 Osiris-Team.
 * All rights reserved.
 *
 * This software is copyrighted work, licensed under the terms
 * of the MIT-License. Consult the "LICENSE" file for details.
 */

package com.osiris.autoplug.client.utils;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class UtilsEnvironmentTest {
    @Test
    void detectsPterodactylEnvVars() {
        UtilsEnvironment utilsEnvironment = new UtilsEnvironment();

        Map<String, String> env = new HashMap<>();
        env.put("P_SERVER_UUID", "abc");
        assertTrue(utilsEnvironment.isPterodactylEnvironment(env));

        env.clear();
        env.put("PTERODACTYL_SERVER_UUID", "abc");
        assertTrue(utilsEnvironment.isPterodactylEnvironment(env));
    }

    @Test
    void ignoresNonPterodactylEnvVars() {
        UtilsEnvironment utilsEnvironment = new UtilsEnvironment();

        Map<String, String> env = new HashMap<>();
        env.put("SERVER_UUID", "abc");
        env.put("PANEL_NAME", "AutoPlug");
        assertFalse(utilsEnvironment.isPterodactylEnvironment(env));
    }
}
