/*
 * Copyright (c) 2026 Osiris-Team.
 * All rights reserved.
 *
 * This software is copyrighted work, licensed under the terms
 * of the MIT-License. Consult the "LICENSE" file for details.
 */

package com.osiris.autoplug.client.utils;

import java.util.Locale;
import java.util.Map;

public class UtilsEnvironment {
    public boolean isPterodactylEnvironment() {
        return isPterodactylEnvironment(System.getenv());
    }

    public boolean isPterodactylEnvironment(Map<String, String> env) {
        for (String key : env.keySet()) {
            if (key == null) continue;
            String upperKey = key.toUpperCase(Locale.ROOT);
            if (upperKey.startsWith("PTERODACTYL_")) return true;
            if (upperKey.startsWith("P_SERVER_")) return true;
        }
        return false;
    }
}
