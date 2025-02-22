package net.jpsama.acm.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.jpsama.acm.Acm;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup COH_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Acm.MOD_ID, "acm"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.acm"))
                    .icon( () -> new ItemStack(ModItems.BUBBY_BAR)).entries((displayContext, entries) -> {
                        entries.add(ModItems.BUBBY_BAR);
                        entries.add(ModItems.BUBBY_WRAPPER);
                        entries.add(ModItems.GTICKET);
                        entries.add(ModItems.FISSYDRINK);

                    }).build());

    public static void registerItemGroups(){
        Acm.LOGGER.info("Adding Item Groups for " + Acm.MOD_ID);
    }
}
