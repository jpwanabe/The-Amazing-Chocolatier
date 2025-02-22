package net.jpsama.acm;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.item.v1.ItemTooltipCallback;
import net.jpsama.acm.item.ModItems;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;

public class AcmClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ItemTooltipCallback.EVENT.register((stack, context, tooltip) -> {
            if (stack.getItem() == ModItems.LIFTINGDRINK) {
                tooltip.add(Text.translatable("item.acm.liftingdrink.tooltip").formatted(Formatting.GRAY));
            }
        });
    }
}