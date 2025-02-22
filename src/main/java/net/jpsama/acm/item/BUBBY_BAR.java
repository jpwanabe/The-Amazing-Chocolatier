package net.jpsama.acm.item;

import net.jpsama.acm.effect.ModEffects;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.world.World;

import java.util.Random;



public class BUBBY_BAR extends Item {
    public BUBBY_BAR(Settings settings) {
        super(settings);
    }
    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        // Call the original method to apply normal food behavior (hunger refill, effects, etc.)
        ItemStack result = super.finishUsing(stack, world, user);


        if (!world.isClient && user instanceof PlayerEntity player) {
            player.addStatusEffect(new StatusEffectInstance(ModEffects.SUGAR_RUSH, 600, 0)); // Lasts 10 seconds
        }

        // Ensure this runs only on the server side
        if (!world.isClient && user instanceof PlayerEntity player) {
            Random random = new Random();
            double chance = 0.05;
            if (random.nextDouble() < chance) {
                ItemStack bonusItem = new ItemStack(ModItems.BUBBY_BAR, 1);
                player.getInventory().insertStack(bonusItem);
                player.sendMessage(Text.literal("§fYou found a whole §bBubby Bar§f inside of your §bBubby Bar?"), false);
                player.sendMessage(Text.literal("§4HOW?"), false);

            }
            double chance2 = 0.10;
            if (random.nextDouble() < chance2) {
                ItemStack item2 = new ItemStack(ModItems.BUBBY_WRAPPER, 1);
                player.getInventory().insertStack(item2);
                player.sendMessage(Text.literal("§aWow! §fYou didn't eat the §bwrapper §fthis time!"), false);
            }

            double chance3 = 0.01;
            if (random.nextDouble() < chance3) {
                ItemStack item2 = new ItemStack(ModItems.GTICKET, 1);
                player.getInventory().insertStack(item2);
                player.sendMessage(Text.literal("§fYou found a §6GOLDEN TICKET §f!"), false);
            }
        }

        return result; // Return the item stack (consumed food)
    }
}