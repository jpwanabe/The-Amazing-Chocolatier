package net.jpsama.acm.effect;

import net.jpsama.acm.Acm;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEffects {
    public static final StatusEffect SUGAR_RUSH = new net.jpsama.acm.effect.SugarRush(); //

    public static void registerEffects() {
        Registry.register(Registries.STATUS_EFFECT, new Identifier(Acm.MOD_ID, "sugar_rush"), SUGAR_RUSH);
    }
}
