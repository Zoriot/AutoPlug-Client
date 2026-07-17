package com.osiris.autoplug.client.tasks.updater.plugins;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class InstalledPluginLoader {
    public Loader loader;

    public InstalledPluginLoader(@NotNull String software) {
        if (software.equalsIgnoreCase("velocity")) {
            loader = Loader.VELOCITY;
        } else if (software.equalsIgnoreCase("bungeecord")) {
            loader = Loader.BUNGEECORD;
        } else loader = Loader.SPIGOT_AND_FORKS;
    }

    public List<String> getLoaderList() {
        switch (loader) {
            case VELOCITY:
                return List.of("velocity");
            case BUNGEECORD:
                return List.of("bungeecord", "waterfall");
            case SPIGOT_AND_FORKS:
                return List.of("spigot", "paper", "purpur");
        }
        return List.of();
    }

    public enum Loader {
        VELOCITY,
        BUNGEECORD,
        SPIGOT_AND_FORKS
    }

}
