package fun.starly.main;

import fun.starly.main.item.ZakArmorMaterial;
import fun.starly.main.item.ZakItem;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ZakMod implements ModInitializer {
	public static final String MOD_ID = "sub";
	public static final Logger LOGGER = LoggerFactory.getLogger("sub");

	@Override
	public void onInitialize() {
		ZakItem.registerModItems();
		ZakArmorMaterial.registerModItems();
	}
}