package de.daschi.nochunkgenerator;

import org.bukkit.generator.ChunkGenerator;
import org.bukkit.plugin.java.JavaPlugin;

public final class NoChunkGenerator extends JavaPlugin {

    @Override
    public ChunkGenerator getDefaultWorldGenerator(final String worldName, final String id) {
        return new NoChunkWorldGenerator();
    }
}
