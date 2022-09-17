package net.nurek.testfabricmod1.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.nurek.testfabricmod1.TestMod;



public class ModItems {
    //rejestracja nowego itemu
    public static  final  Item AMETHYST_INGOT = registeredItem("amethyst_ingot",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    // importuje stworzony przedmiot do plików gry
    private static Item registeredItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(TestMod.MOD_ID,name),item);
    }

    public static void registerModItems(){
        TestMod.LOGGER.info("Registering Mod Items for "+TestMod.MOD_ID);
    }

}
