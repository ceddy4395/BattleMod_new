package com.ceddy4395.BattleMod.init;

import com.ceddy4395.BattleMod.BattleMod;
import com.ceddy4395.BattleMod.reference;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;

import net.minecraftforge.fml.common.registry.GameRegistry;

public class BattleModItems {

    public static Item bronze_ingot;
    public static Item copper_ingot;
    public static Item steel_ingot;//needs texturing
    public static Item steel_dust;//needs texturing

    public static void init(){
        bronze_ingot = new Item().setUnlocalizedName("bronze_ingot").setCreativeTab(BattleMod.tabBattleMod);
        copper_ingot = new Item().setUnlocalizedName("copper_ingot").setCreativeTab(BattleMod.tabBattleMod);
        steel_ingot = new Item().setUnlocalizedName("steel_ingot").setCreativeTab(BattleMod.tabBattleMod);
        steel_dust = new Item().setUnlocalizedName("steel_dust").setCreativeTab(BattleMod.tabBattleMod);
    }

    public static void register(){
        GameRegistry.registerItem(bronze_ingot, bronze_ingot.getUnlocalizedName().substring(5)); //substring will get rid of tile. before the name
        GameRegistry.registerItem(copper_ingot, copper_ingot.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(steel_ingot, steel_ingot.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(steel_dust, steel_dust.getUnlocalizedName().substring(5));

    }

    public static void registerRender() {
        registerRender(bronze_ingot);
        registerRender(copper_ingot);
        registerRender(steel_ingot);
        registerRender(steel_dust);
    }

    public static void registerRender(Item item){
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(reference.Mod_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    }

}
