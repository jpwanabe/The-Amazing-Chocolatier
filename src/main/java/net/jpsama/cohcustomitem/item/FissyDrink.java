package net.jpsama.cohcustomitem.item;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.UseAction;
import net.minecraft.world.World;

public class FissyDrink extends Item {
    public FissyDrink(Settings settings){
        super(settings.food(new FoodComponent.Builder()
                .hunger(0)
                .saturationModifier(100)
                .alwaysEdible()
                .statusEffect(new StatusEffectInstance(StatusEffects.LEVITATION, 100, 2), 1.0F)
                .statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 100, 1), 0.2F)
                .build()));
    }

    @Override
    public UseAction getUseAction(ItemStack stack){
        return UseAction.DRINK;
    }

    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user){
        if (user instanceof PlayerEntity player){
            player.getInventory().insertStack(new ItemStack(Items.GLASS_BOTTLE));
        }
        return super.finishUsing(stack, world, user);
    }
}
