package net.aoitake.fluffy.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.FoodComponents;

public class modFoodComponents {
    public static final FoodComponent CHEESE = new FoodComponent.Builder().hunger(5).saturationModifier(0.6f).build();
    public static final FoodComponent SHINZO_BERRY
            = new FoodComponent.Builder().hunger(4).saturationModifier(1.2f).statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 800, 0), 1.0f).alwaysEdible().build();
}