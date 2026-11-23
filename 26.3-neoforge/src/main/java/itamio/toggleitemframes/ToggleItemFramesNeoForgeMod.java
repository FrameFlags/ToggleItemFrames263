package itamio.toggleitemframes;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** Toggle Item Frames — unofficial 26.3 port (NeoForge). */
@Mod(ToggleItemFramesNeoForgeMod.MOD_ID)
public class ToggleItemFramesNeoForgeMod {
    public static final String MOD_ID = "toggleitemframes263";
    public static final Logger LOGGER = LoggerFactory.getLogger("Toggle Item Frames");

    public ToggleItemFramesNeoForgeMod(IEventBus modEventBus, ModContainer modContainer) {
        LOGGER.info("[Toggle Item Frames] initialized on Minecraft 26.3 (NeoForge)");
    }
}
