package net.nurek.testfabricmod1.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.nurek.testfabricmod1.TestMod;
import net.nurek.testfabricmod1.item.custom.ModAxeItem;
import net.nurek.testfabricmod1.item.custom.ModHoelItem;
import net.nurek.testfabricmod1.item.custom.ModPickaxeItem;


public class ModItems {
    //rejestracja nowego itemu
    public static  final  Item AMETHYST_INGOT = registeredItem("amethyst_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.AMETHYST)));

    public static  final  Item AMETHYST_NUGGET = registeredItem("amethyst_nugget",
            new Item(new FabricItemSettings().group(ModItemGroup.AMETHYST)));

    // narzędzia
    public static final Item AMETHYST_SWORD = registeredItem("amethyst_sword",
            new SwordItem(ModToolMaterials.AMETHYST,1,2f,
                    new FabricItemSettings().group(ModItemGroup.AMETHYST)));

    public static final Item AMETHYST_AXE = registeredItem("amethyst_axe",
            new ModAxeItem(ModToolMaterials.AMETHYST,3,1f,
                    new FabricItemSettings().group(ModItemGroup.AMETHYST)));

    public static final Item AMETHYST_HOE = registeredItem("amethyst_hoe",
            new ModHoelItem(ModToolMaterials.AMETHYST,0,0f,
                    new FabricItemSettings().group(ModItemGroup.AMETHYST)));

    public static final Item AMETHYST_SHOVEL = registeredItem("amethyst_shovel",
            new ShovelItem(ModToolMaterials.AMETHYST,0,1f,
                    new FabricItemSettings().group(ModItemGroup.AMETHYST)));

    public static final Item AMETHYST_PICKAXE = registeredItem("amethyst_pickaxe",
            new ModPickaxeItem(ModToolMaterials.AMETHYST,1,0f,
                    new FabricItemSettings().group(ModItemGroup.AMETHYST)));

    // importuje stworzony przedmiot do plików gry
    private static Item registeredItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(TestMod.MOD_ID,name),item);
    }

    public static void registerModItems(){
        TestMod.LOGGER.info("Registering Mod Items for "+TestMod.MOD_ID);
    }

}
