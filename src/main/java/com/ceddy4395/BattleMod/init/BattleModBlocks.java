package com.ceddy4395.BattleMod.init;


import com.ceddy4395.BattleMod.BattleMod;
import com.ceddy4395.BattleMod.blocks.blockOre;
import com.ceddy4395.BattleMod.reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BattleModBlocks {

    //ores
    public static Block bronze_Ore;
    public static Block copper_Ore;

    //blocks
    public static Block bronze_Block;
    public static Block copper_Block;

    public static void init() {
        //ores
        bronze_Ore = new blockOre(Material.rock).setUnlocalizedName("bronze_Ore").setCreativeTab(BattleMod.tabBattleMod);
        copper_Ore = new blockOre(Material.rock).setUnlocalizedName("copper_Ore").setCreativeTab(BattleMod.tabBattleMod);

        //blocks
        bronze_Block = new blockOre(Material.iron).setUnlocalizedName("bronze_Block").setCreativeTab(BattleMod.tabBattleMod);
        copper_Block = new blockOre(Material.iron).setUnlocalizedName("copper_Block").setCreativeTab(BattleMod.tabBattleMod);
    }

    public static void register() {
        //ores
        GameRegistry.registerBlock(bronze_Ore, bronze_Ore.getUnlocalizedName().substring(5)).setHardness(3F).setHarvestLevel("pickaxe", 2);;
        GameRegistry.registerBlock(copper_Ore, copper_Ore.getUnlocalizedName().substring(5)).setHardness(3F).setHarvestLevel("pickaxe", 2);;

        //blocks
        GameRegistry.registerBlock(bronze_Block, bronze_Block.getUnlocalizedName().substring(5)).setHardness(3F).setHarvestLevel("pickaxe", 2);
        GameRegistry.registerBlock(copper_Block, copper_Block.getUnlocalizedName().substring(5)).setHardness(3F).setHarvestLevel("pickaxe", 2);
    }

    public static void registerRenders() {
        //ores
        registerRenders(bronze_Ore);
        registerRenders(copper_Ore);

        //blocks
        registerRenders(bronze_Block);
        registerRenders(copper_Block);
    }

    public static void registerRenders(Block block) {
        Item item = Item.getItemFromBlock(block);
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(reference.Mod_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));

    }

}

