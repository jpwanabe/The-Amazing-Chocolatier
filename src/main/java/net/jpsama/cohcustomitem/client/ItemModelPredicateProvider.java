package net.jpsama.cohcustomitem.client;

import net.minecraft.client.item.ModelPredicateProviderRegistry;
import net.minecraft.util.Identifier;
import net.jpsama.cohcustomitem.item.ModItems;

public class ItemModelPredicateProvider {
    public static void register() {
        ModelPredicateProviderRegistry.register(ModItems.GTICKET,
                new Identifier("cohcustomitem", "in_hand"),
                (stack, world, entity, seed) ->
                        entity != null && entity.isUsingItem() ? 1.0F : 0.0F
        );
    }
}
