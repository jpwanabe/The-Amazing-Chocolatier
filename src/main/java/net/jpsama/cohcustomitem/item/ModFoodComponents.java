package net.jpsama.cohcustomitem.item;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.FoodComponents;
import net.minecraft.stat.Stat;

public class ModFoodComponents {

    public static final FoodComponent BUBBY_BAR = new FoodComponent.Builder().hunger(10).saturationModifier(10)
            .alwaysEdible().statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 600, 4), 1).build();
}
