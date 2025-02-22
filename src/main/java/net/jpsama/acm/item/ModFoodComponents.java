package net.jpsama.acm.item;

import net.minecraft.item.FoodComponent;

public class ModFoodComponents {

    public static final FoodComponent BUBBY_BAR = new FoodComponent.Builder().hunger(10).saturationModifier(10)
            .alwaysEdible().build();

    public static final FoodComponent FISSYDRINK = new FoodComponent.Builder().hunger(0).saturationModifier(10)
            .alwaysEdible().build();
}
