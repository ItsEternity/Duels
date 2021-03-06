package me.realized.duels.util.compat;

import me.realized.duels.util.inventory.ItemBuilder;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public final class Items {

    private static final String PANE = "STAINED_GLASS_PANE";

    public static final ItemStack ORANGE_PANE;
    public static final ItemStack BLUE_PANE;
    public static final ItemStack RED_PANE;
    public static final ItemStack GRAY_PANE;
    public static final ItemStack WHITE_PANE;
    public static final ItemStack GREEN_PANE;
    public static final ItemStack HEAD;
    public static final Material SKELETON_HEAD;
    public static final ItemStack OFF;
    public static final ItemStack ON;
    public static final Material MUSHROOM_SOUP;
    public static final Material EMPTY_MAP;

    static {
        ORANGE_PANE = (CompatUtil.isPre1_13() ? ItemBuilder.of(PANE, 1, (short) 1) : ItemBuilder.of(Material.ORANGE_STAINED_GLASS_PANE)).name(" ").build();
        BLUE_PANE = (CompatUtil.isPre1_13() ? ItemBuilder.of(PANE, 1, (short) 11) : ItemBuilder.of(Material.BLUE_STAINED_GLASS_PANE)).name(" ").build();
        RED_PANE = (CompatUtil.isPre1_13() ? ItemBuilder.of(PANE, 1, (short) 14) : ItemBuilder.of(Material.RED_STAINED_GLASS_PANE)).build();
        GRAY_PANE = (CompatUtil.isPre1_13() ? ItemBuilder.of(PANE, 1, (short) 7) : ItemBuilder.of(Material.GRAY_STAINED_GLASS_PANE)).build();
        WHITE_PANE = (CompatUtil.isPre1_13() ? ItemBuilder.of(PANE, 1, (short) 0) : ItemBuilder.of(Material.WHITE_STAINED_GLASS_PANE)).build();
        GREEN_PANE = (CompatUtil.isPre1_13() ? ItemBuilder.of(PANE, 1, (short) 5) : ItemBuilder.of(Material.LIME_STAINED_GLASS_PANE)).build();
        HEAD = (CompatUtil.isPre1_13() ? ItemBuilder.of("SKULL_ITEM", 1, (short) 3) : ItemBuilder.of(Material.PLAYER_HEAD)).build();
        SKELETON_HEAD = CompatUtil.isPre1_13() ? Material.matchMaterial("SKULL_ITEM") : Material.SKELETON_SKULL;
        OFF = (CompatUtil.isPre1_13() ? ItemBuilder.of("INK_SACK", 1, (short) 8) : ItemBuilder.of(Material.GRAY_DYE)).build();
        ON = (CompatUtil.isPre1_13() ? ItemBuilder.of("INK_SACK", 1, (short) 10) : ItemBuilder.of(Material.LIME_DYE)).build();
        MUSHROOM_SOUP = CompatUtil.isPre1_13() ? Material.matchMaterial("MUSHROOM_SOUP") : Material.MUSHROOM_STEW;
        EMPTY_MAP = CompatUtil.isPre1_13() ? Material.matchMaterial("EMPTY_MAP") : Material.MAP;
    }

    public static boolean equals(final ItemStack item, final ItemStack other) {
        return item.getType() == other.getType() && item.getDurability() == other.getDurability();
    }

    private Items() {}
}
