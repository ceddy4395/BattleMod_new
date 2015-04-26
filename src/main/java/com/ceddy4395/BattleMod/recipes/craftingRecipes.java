package com.ceddy4395.BattleMod.recipes;

import com.ceddy4395.BattleMod.init.BattleModBlocks;
import com.ceddy4395.BattleMod.init.BattleModItems;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;



public class craftingRecipes {

    public static void Register (){
        GameRegistry.addShapedRecipe(new ItemStack(BattleModBlocks.bronze_Block), new Object[]{"***", "***", "***", '*', BattleModItems.bronze_ingot});
        GameRegistry.addShapelessRecipe(new ItemStack(BattleModItems.bronze_ingot, 9), new Object[]{BattleModBlocks.bronze_Block});

        GameRegistry.addShapedRecipe(new ItemStack(BattleModBlocks.copper_Block), new Object[]{"***", "***", "***", '*', BattleModItems.copper_ingot});
        GameRegistry.addShapelessRecipe(new ItemStack(BattleModItems.copper_ingot, 9), new Object[]{BattleModBlocks.copper_Block});

        GameRegistry.addShapedRecipe(new ItemStack(BattleModItems.steel_dust), new Object[]{"*^*", "^*^", "*^*", '^', Items.iron_ingot, '*', Items.coal});
        GameRegistry.addShapedRecipe(new ItemStack(BattleModItems.steel_dust), new Object[] {"*^*", "^*^", "*^*", '^', Items.iron_ingot, '*',new ItemStack(Items.coal, 1,1)});
        //TODO fix the  charcoal bug!
    }

}
