package net.nurek.testfabricmod1.item.custom;

import net.minecraft.item.AxeItem;
import net.minecraft.item.ToolMaterial;

public class ModAxeItem extends AxeItem {
    /**
     * Access widened by fabric-transitive-access-wideners-v1 to accessible
     *
     * @param material
     * @param attackDamage
     * @param attackSpeed
     * @param settings
     */
    public ModAxeItem(ToolMaterial material, float attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }
}
