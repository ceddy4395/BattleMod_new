package com.ceddy4395.BattleMod;


import com.ceddy4395.BattleMod.init.BattleModBlocks;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

import java.util.Random;

public class battleModWorldGen implements IWorldGenerator {

    @Override
    public void generate(Random rand, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
        switch (world.provider.getDimensionId()) {
            case -1:
                generateNether(world, rand, chunkX * 16, chunkZ * 16);
                break;
            case 0:
                generateOverworld(world, rand, chunkX * 16, chunkZ * 16);
                break;
            case 1:
                generateEnd(world, rand, chunkX * 16, chunkZ * 16);
                break;
        }
    }

    private void generateNether(World world, Random rand, int chunkX, int chunkZ) {

    }


    private void generateEnd(World world, Random rand, int chunkX, int chunkZ) {

    }

    private void generateOverworld(World world, Random random, int x, int z) {
        generateOre(BattleModBlocks.bronze_Ore, world, random, x, z, 2, 10, 5, 0, 70, Blocks.stone);
        generateOre(BattleModBlocks.copper_Ore, world, random, x, z, 2, 10, 5, 0, 70, Blocks.stone);

    }


    public void generateOre(Block block, World world, Random random, int chunkX, int chunkZ, int minVeinSize, int maxVeinSize, int chance, int minY, int maxY, Block generateIn) {
        int vienSize = minVeinSize + random.nextInt(maxVeinSize - minVeinSize);
        int heightRange = maxY - minY;
        WorldGenMinable gen = new WorldGenMinable(block.getDefaultState(), vienSize);
        for (int i = 0; i < chance; i++) {
            int xRand = chunkX * 16 + random.nextInt(16);
            int yRand = random.nextInt(heightRange) + minY;
            int zRand = chunkZ * 16 + random.nextInt(16);
            gen.generate(world, random, new BlockPos(xRand, yRand, zRand));

        }
    }



}

