package itamio.toggleitemframes;

import com.mojang.logging.LogUtils;
import net.minecraftforge.fml.common.Mod;
import org.slf4j.Logger;

/** Toggle Item Frames — unofficial 1.20.1 port (Forge). */
@Mod(ToggleItemFramesMod.MOD_ID)
public class ToggleItemFramesMod {
    public static final String MOD_ID = "toggleitemframes263_1201";
    public static final Logger LOGGER = LogUtils.getLogger();

    public ToggleItemFramesMod() {
        LOGGER.info("[Toggle Item Frames] initialized on Minecraft 1.20.1 (Forge)");
    }
}
