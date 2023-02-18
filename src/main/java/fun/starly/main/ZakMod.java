package fun.starly.main;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ZakMod implements ModInitializer {
	public static final String MOD_ID = "sub-zakviel-mod";
	public static final Logger LOGGER = LoggerFactory.getLogger("sub-zakviel-mod");

	@Override
	public void onInitialize() {

		LOGGER.info("Hello Fabric world!");
	}
}