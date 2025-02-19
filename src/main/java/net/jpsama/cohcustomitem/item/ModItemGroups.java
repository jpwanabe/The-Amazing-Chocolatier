package net.jpsama.cohcustomitem.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.jpsama.cohcustomitem.Cohcustomitem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup COH_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Cohcustomitem.MOD_ID, "coh"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.coh"))
                    .icon( () -> new ItemStack(ModItems.BUBBY_BAR)).entries((displayContext, entries) -> {
                        entries.add(ModItems.BUBBY_BAR);
                        entries.add(ModItems.BUBBY_WRAPPER);

                    }).build());

    public static void registerItemGroups(){
        Cohcustomitem.LOGGER.info("Adding Item Groups for " +Cohcustomitem.MOD_ID);
    }
}
