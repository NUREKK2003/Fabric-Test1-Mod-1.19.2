package net.nurek.testfabricmod1.item.custom;

import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterial;

public class ModPickaxeItem extends PickaxeItem {
    /**
     * Access widened by fabric-transitive-access-wideners-v1 to accessible
     *
     * @param material
     * @param attackDamage
     * @param attackSpeed
     * @param settings
     */
    public ModPickaxeItem(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }
}
