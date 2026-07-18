package com.osiris.autoplug.client.tasks.updater.plugins;

import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.Locale;
import java.util.Set;

public class InstalledPluginLoader {
    public Loader loader;

    private static final Set<String> BUNGEE_FORKS = Set.of(
            "bungeecord",
            "waterfall"
    );

    private static final Set<String> FOLIA_FORKS = Set.of(
            "folia",
            "luminolmc",
            "canvas",
            "shreddedpaper"
    );

    public InstalledPluginLoader(@NotNull String software) {
        String type = software.toLowerCase(Locale.ROOT);

        if (type.equals("velocity")) {
            loader = Loader.VELOCITY;
        } else if (BUNGEE_FORKS.contains(type)) {
            loader = Loader.BUNGEECORD;
        } else if (FOLIA_FORKS.contains(type)) {
            loader = Loader.FOLIA_COMPATIBLE;
        } else {
            loader = Loader.SPIGOT_AND_FORKS;
        }
    }

    public List<String> getLoaderList() {
        switch (loader) {
            case VELOCITY:
                return List.of("velocity");
            case BUNGEECORD:
                return List.of("bungeecord", "waterfall");
            case SPIGOT_AND_FORKS:
                return List.of("spigot", "paper", "purpur", "bukkit");
            case FOLIA_COMPATIBLE:
                return List.of("folia");
        }
        return List.of();
    }

    public enum Loader {
        VELOCITY,
        BUNGEECORD,
        SPIGOT_AND_FORKS,
        FOLIA_COMPATIBLE
    }

}
