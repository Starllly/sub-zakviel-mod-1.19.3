package fun.starly.main.item;

import fun.starly.main.ZakMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ZakItem {
    public static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(ZakMod.MOD_ID, name), item);
    }

    public static void registerModItems(){
        ZakMod.LOGGER.info("Регистрация айтемов мода для " + ZakMod.MOD_ID);
    }

    public static final Item RUBIDY = registerItem("rubidy",
            new Item(new FabricItemSettings()));
}
