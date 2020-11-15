package de.daschi.nochunkgenerator;

import org.bukkit.World;
import org.bukkit.generator.ChunkGenerator;

import java.util.Random;

public class NoChunkWorldGenerator extends ChunkGenerator {
    @Override
    public ChunkData generateChunkData(final World world, final Random random, final int x, final int z, final BiomeGrid biome) {
        return this.createChunkData(world);
    }
}
