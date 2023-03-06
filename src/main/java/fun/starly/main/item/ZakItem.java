package fun.starly.main.item;

import fun.starly.main.ZakMod;
import fun.starly.main.ZakModClient;
import fun.starly.main.itemgroup.ZakItemGroup;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ZakItem {
    public static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(ZakMod.MOD_ID, name), item);
    }

    private static void addItemGroup(ItemGroup group, Item item){
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }

    public static void addItemToItemGroup(){
        addItemGroup(ZakItemGroup.SUBGROUP, RUBIDY);
        addItemGroup(ZakItemGroup.SUBGROUP, METALIUM);
        addItemGroup(ZakItemGroup.SUBGROUP, ENTERIUM);
        addItemGroup(ZakItemGroup.SUBGROUP, CERIUM);

        addItemGroup(ZakItemGroup.SUBGROUP, RUBIDY_IGNOT);
        addItemGroup(ZakItemGroup.SUBGROUP, METALIUM_IGNOT);
        addItemGroup(ZakItemGroup.SUBGROUP, ENTERIUM_IGNOT);
        addItemGroup(ZakItemGroup.SUBGROUP, CERIUM_IGNOT);
    }

    public static final Item RUBIDY = registerItem("rubidium",
            new Item(new FabricItemSettings()));
    public static final Item METALIUM = registerItem("metalium",
            new Item(new FabricItemSettings()));
    public static final Item ENTERIUM = registerItem("enterium",
            new Item(new FabricItemSettings()));
    public static final Item CERIUM = registerItem("cerium",
            new Item(new FabricItemSettings()));

    public static final Item RUBIDY_IGNOT = registerItem("rubidium_ignot",
            new Item(new FabricItemSettings()));
    public static final Item METALIUM_IGNOT = registerItem("metalium_ignot",
            new Item(new FabricItemSettings()));
    public static final Item ENTERIUM_IGNOT = registerItem("enterium_ignot",
            new Item(new FabricItemSettings()));
    public static final Item CERIUM_IGNOT = registerItem("cerium_ignot",
            new Item(new FabricItemSettings()));



    public static void registerModItems(){
        ZakMod.LOGGER.info("Регистрация айтемов мода для " + ZakMod.MOD_ID);
        addItemToItemGroup();
    }
}
