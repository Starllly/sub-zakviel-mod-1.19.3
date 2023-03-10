package fun.starly.main.block;

import fun.starly.main.ZakMod;
import fun.starly.main.ZakModClient;
import fun.starly.main.itemgroup.ZakItemGroup;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ZakBlock {
    public static Block registerBlock(String name, Block block, ItemGroup group){
        registerBlockItem(name, block, group);
        return Registry.register(Registries.BLOCK, new Identifier(ZakMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group){
        Item item = Registry.register(Registries.ITEM, new Identifier(ZakMod.MOD_ID, name), new BlockItem(block, new FabricItemSettings()));
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
        return item;
    }

    public static void registerModBlock(){
        ZakMod.LOGGER.info("Регистрация блково для + "+ ZakMod.MOD_ID);
    }

    public static final Block RUBIDY_ORE = registerBlock("rubidium_ore_block",
            new Block(FabricBlockSettings.of(Material.STONE)
                    .strength(4.0f)
                    .requiresTool()), ZakItemGroup.SUBGROUP);
}
