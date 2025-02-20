package net.jpsama.cohcustomitem.effect;

import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.util.Identifier;

import java.util.UUID;

public class SugarRush extends StatusEffect {
    private static final UUID SUGAR_RUSH_SPEED_ID = UUID.fromString("e64c3dc0-24bb-4d7d-92c1-54f9d6e30e9f");
    private static final UUID SUGAR_RUSH_HASTE_ID = UUID.fromString("c56b8d27-b0d9-4a5e-9805-217db7df2c48");

    public SugarRush() {
        super(StatusEffectCategory.BENEFICIAL, 0xFF66CC); // Pinkish color

        // Add Speed Boost
        this.addAttributeModifier(EntityAttributes.GENERIC_MOVEMENT_SPEED, SUGAR_RUSH_SPEED_ID.toString(),
                0.2, EntityAttributeModifier.Operation.MULTIPLY_TOTAL);

        // Add Attack Speed (Haste-like)
        this.addAttributeModifier(EntityAttributes.GENERIC_ATTACK_SPEED, SUGAR_RUSH_HASTE_ID.toString(),
                0.3, EntityAttributeModifier.Operation.MULTIPLY_TOTAL);
    }

    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        // Apply effect every tick
        return true;
    }



}
