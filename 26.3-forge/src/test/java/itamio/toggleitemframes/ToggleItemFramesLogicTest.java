package itamio.toggleitemframes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ToggleItemFramesLogicTest {
    @Test void togglesFlag() {
        assertFalse(ToggleItemFramesLogic.toggleInvisible(true));
        assertTrue(ToggleItemFramesLogic.toggleInvisible(false));
    }
    @Test void gatesInteraction() {
        assertTrue(ToggleItemFramesLogic.canToggle(true, true));
        assertFalse(ToggleItemFramesLogic.canToggle(false, true));
        assertFalse(ToggleItemFramesLogic.canToggle(true, false));
    }
}
