package net.nurek.testfabricmod1.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.nurek.testfabricmod1.TestMod;

public class ModItemGroup {
    public static final ItemGroup AMETHYST = FabricItemGroupBuilder.build(new Identifier(TestMod.MOD_ID, "amethyst"),
            () -> new ItemStack(ModItems.AMETHYST_INGOT));
}
