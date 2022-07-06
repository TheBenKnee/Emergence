package com.github.thebenknee.emergence.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab
{
    public static final CreativeModeTab EMERGENCE_TAB = new CreativeModeTab("emergencetab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.ZIRCON.get());
        }
    };
}
