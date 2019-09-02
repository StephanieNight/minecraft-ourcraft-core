/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.the_nights.ourcraft.core.item;

import com.google.common.collect.Multimap;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;

import java.util.UUID;

/**
 *
 * @author Stephanie
 */
public class ItemCustomKatana extends SwordItem {

    protected static final UUID ATTACK_REACH_MODIFIER = UUID.fromString("26cb07a3-209d-4110-8e10-1010243614c8");
    protected static final UUID ATTACK_KNOCKBACK_MODIFIER = UUID.fromString("26cb07a3-209d-4110-8e10-1010243614c8");
    private final float attackReach;
    private final float attackKnockBack;
    public ItemCustomKatana(IItemTier itemTier, Item.Properties props) {
        super(itemTier, 1, -1.6f, props);
        this.attackReach =-2;
        this.attackKnockBack =-2;
    }
       /**
    * Gets a map of item attribute modifiers, used by ItemSword to increase hit damage.
    */
       /*
   public Multimap<String, AttributeModifier> getAttributeModifiers(EquipmentSlotType equipmentSlot) {
        Multimap<String, AttributeModifier> multimap = super.getAttributeModifiers(equipmentSlot);
        if (equipmentSlot == EquipmentSlotType.MAINHAND) {
            multimap.put(SharedMonsterAttributes.ATTACK_KNOCKBACK.getName(), new AttributeModifier(ATTACK_KNOCKBACK_MODIFIER, "Weapon modifier", (double)this.attackKnockBack, AttributeModifier.Operation.ADDITION));
            //multimap.put(GenericAttributes.ATTACK_SPEED.getName(), new AttributeModifier(ATTACK_SPEED_MODIFIER, "Weapon modifier", (double)this.attackSpeed, AttributeModifier.Operation.ADDITION));
        }

        return multimap;
    }
*/
}