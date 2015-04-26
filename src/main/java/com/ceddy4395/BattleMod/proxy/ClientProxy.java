package com.ceddy4395.BattleMod.proxy;


import com.ceddy4395.BattleMod.BattleMod;
import com.ceddy4395.BattleMod.init.BattleModBlocks;
import com.ceddy4395.BattleMod.init.BattleModItems;

public class ClientProxy extends CommonProxy {

    @Override
    public void registerRenders() {
        BattleModBlocks.registerRenders();
        BattleModItems.registerRender();
    }



}
