package net.jpsama.cohcustomitem.effect;

import net.jpsama.cohcustomitem.Cohcustomitem;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEffects {
    public static final StatusEffect SUGAR_RUSH = new net.jpsama.cohcustomitem.effect.SugarRush(); //

    public static void registerEffects() {
        Registry.register(Registries.STATUS_EFFECT, new Identifier(Cohcustomitem.MOD_ID, "sugar_rush"), SUGAR_RUSH);
    }
}
