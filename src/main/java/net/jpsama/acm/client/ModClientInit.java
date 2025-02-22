package net.jpsama.acm.client; // Check this matches fabric.mod.json

import net.fabricmc.api.ClientModInitializer;
import net.jpsama.acm.item.ModItems;
import net.minecraft.client.item.ModelPredicateProviderRegistry;
import net.minecraft.entity.ItemEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModClientInit implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        registerModelPredicates();
    }

    private void registerModelPredicates() {
        ModelPredicateProviderRegistry.register(
                ModItems.GTICKET,
                new Identifier("acm", "in_hand"),
                (stack, world, entity, seed) -> {
                    if (entity != null) {
                        // Case 1: Held in hand
                        ItemStack mainHand = entity.getMainHandStack();
                        ItemStack offHand = entity.getOffHandStack();
                        if (stack == mainHand || stack == offHand) {
                            return 1.0F; // In hand texture
                        }
                    }
                    // Case 2: Item is dropped (rendered as an entity)
                    if (world != null && stack.getHolder() instanceof ItemEntity) {
                        return 1.0F; // Dropped texture
                    }

                    return 0.0F;
                }
        );
    }
}
