package itamio.toggleitemframes;

/** Pure rules for toggling item-frame invisibility. */
public final class ToggleItemFramesLogic {
    private ToggleItemFramesLogic() {}

    /** Invisibility is a boolean NBT flag: a right-click flips it. */
    public static boolean toggleInvisible(boolean current) { return !current; }

    /** Only a real item frame may be toggled, and only when allowed. */
    public static boolean canToggle(boolean itemFrame, boolean allowed) {
        return itemFrame && allowed;
    }
}
