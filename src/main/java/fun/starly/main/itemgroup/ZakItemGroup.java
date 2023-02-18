package fun.starly.main.itemgroup;

import fun.starly.main.ZakMod;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ZakItemGroup {
    public static final ItemGroup SUBGROUP = FabricItemGroup.builder(new Identifier(ZakMod.MOD_ID))
            .displayName(Text.literal("Sub mod"))
            .icon(() -> new ItemStack(Items.DIAMOND))
            .build();
}
