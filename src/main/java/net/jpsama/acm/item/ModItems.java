package net.jpsama.acm.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.jpsama.acm.Acm;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item BUBBY_BAR = registerItem("bubby_bar", new BUBBY_BAR(new FabricItemSettings().food(ModFoodComponents.BUBBY_BAR)));
    public static final Item BUBBY_WRAPPER = registerItem("bubby_wrapper", new Item(new FabricItemSettings()));
    public static final Item GTICKET = registerItem("gticket", new Item(new FabricItemSettings()));
    public static final Item LIFTINGDRINK = registerItem("liftingdrink", new LIFTINGDRINK(new FabricItemSettings().food(ModFoodComponents.LIFTINGDRINK)));
    public static final Item EMPTYDRINK = registerItem("emptydrink", new Item(new FabricItemSettings()));




    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries){
        entries.add(BUBBY_BAR);
        entries.add(BUBBY_WRAPPER);
        entries.add(GTICKET);
        entries.add(LIFTINGDRINK);
        entries.add(EMPTYDRINK);
    }


    private static Item registerItem(String name, Item item){
    return Registry.register(Registries.ITEM, new Identifier(Acm.MOD_ID, name), item);
    }
    public static void registerModItems() {
        Acm.LOGGER.info("Registering Mod Items for " + Acm.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
    }

}
