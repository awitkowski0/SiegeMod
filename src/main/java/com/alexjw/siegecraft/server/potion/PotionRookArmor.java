package com.alexjw.siegecraft.server.potion;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.ai.attributes.AbstractAttributeMap;
import net.minecraft.potion.Potion;

public class PotionRookArmor extends Potion {
    public PotionRookArmor(boolean p_i46817_1_, int p_i46817_2_) {
        super(p_i46817_1_, p_i46817_2_);
        ModPotions.POTIONS.add(this);
    }

    public void removeAttributesModifiersFromEntity(EntityLivingBase entityLivingBase, AbstractAttributeMap attributeMap, int i) {
        super.removeAttributesModifiersFromEntity(entityLivingBase, attributeMap, i);
        if (entityLivingBase.getHealth() > entityLivingBase.getMaxHealth()) {
            entityLivingBase.setHealth(entityLivingBase.getMaxHealth());
        }
    }
}

