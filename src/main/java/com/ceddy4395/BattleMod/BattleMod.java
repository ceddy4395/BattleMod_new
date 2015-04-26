package com.ceddy4395.BattleMod;


import com.ceddy4395.BattleMod.init.BattleModBlocks;
import com.ceddy4395.BattleMod.init.BattleModItems;
import com.ceddy4395.BattleMod.proxy.*;
import com.ceddy4395.BattleMod.recipes.*;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.*;
import net.minecraftforge.fml.common.registry.GameRegistry;

//referncing the mod
@Mod(modid = reference.Mod_ID, name = reference.Mod_Name, version = reference.Mod_Version)

public class BattleMod {






    @SidedProxy(clientSide = reference.CLIENT_PROXY_CLASS, serverSide = reference.COMMON_PROXY_CLASS)
    public static CommonProxy proxy;

    public static final battleModtab tabBattleMod = new battleModtab("tabBattleMod");


    //loading pre launch
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){

        GameRegistry.registerWorldGenerator(new battleModWorldGen(), 0);


        BattleModItems.init();
        BattleModItems.register();

        BattleModBlocks.init();
        BattleModBlocks.register();



    }
    //loading during launch
    @Mod.EventHandler
    public void init(FMLInitializationEvent event){

        proxy.registerRenders();
        craftingRecipes.Register();
        smeltingRecipes.Register();

    }
    //loading after launch
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }
}
