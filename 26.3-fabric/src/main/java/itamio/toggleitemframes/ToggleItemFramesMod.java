package itamio.toggleitemframes;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** Toggle Item Frames — unofficial 26.3 port (Fabric). */
public class ToggleItemFramesMod implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("Toggle Item Frames");

    @Override
    public void onInitialize() {
        LOGGER.info("[Toggle Item Frames] initialized on Minecraft 26.3 (Fabric)");
    }
}
