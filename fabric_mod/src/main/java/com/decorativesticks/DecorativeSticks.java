package com.decorativesticks;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.Block;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.HorizontalFacingBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class DecorativeSticks implements ModInitializer {
    public static final String MOD_ID = "decorative_sticks";
    
    public static final Block VERTICAL_LEFT_WHITE_TERRACOTTA = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "vertical_left_white_terracotta"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.WHITE_TERRACOTTA))
    );
    public static final Item VERTICAL_LEFT_WHITE_TERRACOTTA_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "vertical_left_white_terracotta"),
        new BlockItem(VERTICAL_LEFT_WHITE_TERRACOTTA, new Item.Settings())
    );
    
    public static final Block VERTICAL_LEFT_ORANGE_TERRACOTTA = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "vertical_left_orange_terracotta"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.ORANGE_TERRACOTTA))
    );
    public static final Item VERTICAL_LEFT_ORANGE_TERRACOTTA_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "vertical_left_orange_terracotta"),
        new BlockItem(VERTICAL_LEFT_ORANGE_TERRACOTTA, new Item.Settings())
    );
    
    public static final Block VERTICAL_LEFT_MAGENTA_TERRACOTTA = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "vertical_left_magenta_terracotta"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.MAGENTA_TERRACOTTA))
    );
    public static final Item VERTICAL_LEFT_MAGENTA_TERRACOTTA_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "vertical_left_magenta_terracotta"),
        new BlockItem(VERTICAL_LEFT_MAGENTA_TERRACOTTA, new Item.Settings())
    );
    
    public static final Block VERTICAL_LEFT_LIGHT_BLUE_TERRACOTTA = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "vertical_left_light_blue_terracotta"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.LIGHT_BLUE_TERRACOTTA))
    );
    public static final Item VERTICAL_LEFT_LIGHT_BLUE_TERRACOTTA_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "vertical_left_light_blue_terracotta"),
        new BlockItem(VERTICAL_LEFT_LIGHT_BLUE_TERRACOTTA, new Item.Settings())
    );
    
    public static final Block VERTICAL_LEFT_YELLOW_TERRACOTTA = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "vertical_left_yellow_terracotta"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.YELLOW_TERRACOTTA))
    );
    public static final Item VERTICAL_LEFT_YELLOW_TERRACOTTA_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "vertical_left_yellow_terracotta"),
        new BlockItem(VERTICAL_LEFT_YELLOW_TERRACOTTA, new Item.Settings())
    );
    
    public static final Block VERTICAL_LEFT_LIME_TERRACOTTA = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "vertical_left_lime_terracotta"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.LIME_TERRACOTTA))
    );
    public static final Item VERTICAL_LEFT_LIME_TERRACOTTA_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "vertical_left_lime_terracotta"),
        new BlockItem(VERTICAL_LEFT_LIME_TERRACOTTA, new Item.Settings())
    );
    
    public static final Block VERTICAL_LEFT_PINK_TERRACOTTA = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "vertical_left_pink_terracotta"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.PINK_TERRACOTTA))
    );
    public static final Item VERTICAL_LEFT_PINK_TERRACOTTA_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "vertical_left_pink_terracotta"),
        new BlockItem(VERTICAL_LEFT_PINK_TERRACOTTA, new Item.Settings())
    );
    
    public static final Block VERTICAL_LEFT_GRAY_TERRACOTTA = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "vertical_left_gray_terracotta"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.GRAY_TERRACOTTA))
    );
    public static final Item VERTICAL_LEFT_GRAY_TERRACOTTA_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "vertical_left_gray_terracotta"),
        new BlockItem(VERTICAL_LEFT_GRAY_TERRACOTTA, new Item.Settings())
    );
    
    public static final Block VERTICAL_LEFT_LIGHT_GRAY_TERRACOTTA = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "vertical_left_light_gray_terracotta"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.LIGHT_GRAY_TERRACOTTA))
    );
    public static final Item VERTICAL_LEFT_LIGHT_GRAY_TERRACOTTA_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "vertical_left_light_gray_terracotta"),
        new BlockItem(VERTICAL_LEFT_LIGHT_GRAY_TERRACOTTA, new Item.Settings())
    );
    
    public static final Block VERTICAL_LEFT_CYAN_TERRACOTTA = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "vertical_left_cyan_terracotta"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.CYAN_TERRACOTTA))
    );
    public static final Item VERTICAL_LEFT_CYAN_TERRACOTTA_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "vertical_left_cyan_terracotta"),
        new BlockItem(VERTICAL_LEFT_CYAN_TERRACOTTA, new Item.Settings())
    );
    
    public static final Block VERTICAL_LEFT_PURPLE_TERRACOTTA = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "vertical_left_purple_terracotta"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.PURPLE_TERRACOTTA))
    );
    public static final Item VERTICAL_LEFT_PURPLE_TERRACOTTA_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "vertical_left_purple_terracotta"),
        new BlockItem(VERTICAL_LEFT_PURPLE_TERRACOTTA, new Item.Settings())
    );
    
    public static final Block VERTICAL_LEFT_BLUE_TERRACOTTA = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "vertical_left_blue_terracotta"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.BLUE_TERRACOTTA))
    );
    public static final Item VERTICAL_LEFT_BLUE_TERRACOTTA_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "vertical_left_blue_terracotta"),
        new BlockItem(VERTICAL_LEFT_BLUE_TERRACOTTA, new Item.Settings())
    );
    
    public static final Block VERTICAL_LEFT_BROWN_TERRACOTTA = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "vertical_left_brown_terracotta"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.BROWN_TERRACOTTA))
    );
    public static final Item VERTICAL_LEFT_BROWN_TERRACOTTA_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "vertical_left_brown_terracotta"),
        new BlockItem(VERTICAL_LEFT_BROWN_TERRACOTTA, new Item.Settings())
    );
    
    public static final Block VERTICAL_LEFT_GREEN_TERRACOTTA = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "vertical_left_green_terracotta"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.GREEN_TERRACOTTA))
    );
    public static final Item VERTICAL_LEFT_GREEN_TERRACOTTA_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "vertical_left_green_terracotta"),
        new BlockItem(VERTICAL_LEFT_GREEN_TERRACOTTA, new Item.Settings())
    );
    
    public static final Block VERTICAL_LEFT_RED_TERRACOTTA = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "vertical_left_red_terracotta"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.RED_TERRACOTTA))
    );
    public static final Item VERTICAL_LEFT_RED_TERRACOTTA_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "vertical_left_red_terracotta"),
        new BlockItem(VERTICAL_LEFT_RED_TERRACOTTA, new Item.Settings())
    );
    
    public static final Block VERTICAL_LEFT_BLACK_TERRACOTTA = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "vertical_left_black_terracotta"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.BLACK_TERRACOTTA))
    );
    public static final Item VERTICAL_LEFT_BLACK_TERRACOTTA_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "vertical_left_black_terracotta"),
        new BlockItem(VERTICAL_LEFT_BLACK_TERRACOTTA, new Item.Settings())
    );
    
    public static final Block VERTICAL_LEFT_WHITE_CONCRETE = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "vertical_left_white_concrete"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.WHITE_CONCRETE))
    );
    public static final Item VERTICAL_LEFT_WHITE_CONCRETE_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "vertical_left_white_concrete"),
        new BlockItem(VERTICAL_LEFT_WHITE_CONCRETE, new Item.Settings())
    );
    
    public static final Block VERTICAL_LEFT_ORANGE_CONCRETE = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "vertical_left_orange_concrete"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.ORANGE_CONCRETE))
    );
    public static final Item VERTICAL_LEFT_ORANGE_CONCRETE_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "vertical_left_orange_concrete"),
        new BlockItem(VERTICAL_LEFT_ORANGE_CONCRETE, new Item.Settings())
    );
    
    public static final Block VERTICAL_LEFT_MAGENTA_CONCRETE = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "vertical_left_magenta_concrete"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.MAGENTA_CONCRETE))
    );
    public static final Item VERTICAL_LEFT_MAGENTA_CONCRETE_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "vertical_left_magenta_concrete"),
        new BlockItem(VERTICAL_LEFT_MAGENTA_CONCRETE, new Item.Settings())
    );
    
    public static final Block VERTICAL_LEFT_LIGHT_BLUE_CONCRETE = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "vertical_left_light_blue_concrete"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.LIGHT_BLUE_CONCRETE))
    );
    public static final Item VERTICAL_LEFT_LIGHT_BLUE_CONCRETE_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "vertical_left_light_blue_concrete"),
        new BlockItem(VERTICAL_LEFT_LIGHT_BLUE_CONCRETE, new Item.Settings())
    );
    
    public static final Block VERTICAL_LEFT_YELLOW_CONCRETE = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "vertical_left_yellow_concrete"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.YELLOW_CONCRETE))
    );
    public static final Item VERTICAL_LEFT_YELLOW_CONCRETE_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "vertical_left_yellow_concrete"),
        new BlockItem(VERTICAL_LEFT_YELLOW_CONCRETE, new Item.Settings())
    );
    
    public static final Block VERTICAL_LEFT_LIME_CONCRETE = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "vertical_left_lime_concrete"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.LIME_CONCRETE))
    );
    public static final Item VERTICAL_LEFT_LIME_CONCRETE_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "vertical_left_lime_concrete"),
        new BlockItem(VERTICAL_LEFT_LIME_CONCRETE, new Item.Settings())
    );
    
    public static final Block VERTICAL_LEFT_PINK_CONCRETE = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "vertical_left_pink_concrete"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.PINK_CONCRETE))
    );
    public static final Item VERTICAL_LEFT_PINK_CONCRETE_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "vertical_left_pink_concrete"),
        new BlockItem(VERTICAL_LEFT_PINK_CONCRETE, new Item.Settings())
    );
    
    public static final Block VERTICAL_LEFT_GRAY_CONCRETE = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "vertical_left_gray_concrete"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.GRAY_CONCRETE))
    );
    public static final Item VERTICAL_LEFT_GRAY_CONCRETE_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "vertical_left_gray_concrete"),
        new BlockItem(VERTICAL_LEFT_GRAY_CONCRETE, new Item.Settings())
    );
    
    public static final Block VERTICAL_LEFT_LIGHT_GRAY_CONCRETE = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "vertical_left_light_gray_concrete"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.LIGHT_GRAY_CONCRETE))
    );
    public static final Item VERTICAL_LEFT_LIGHT_GRAY_CONCRETE_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "vertical_left_light_gray_concrete"),
        new BlockItem(VERTICAL_LEFT_LIGHT_GRAY_CONCRETE, new Item.Settings())
    );
    
    public static final Block VERTICAL_LEFT_CYAN_CONCRETE = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "vertical_left_cyan_concrete"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.CYAN_CONCRETE))
    );
    public static final Item VERTICAL_LEFT_CYAN_CONCRETE_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "vertical_left_cyan_concrete"),
        new BlockItem(VERTICAL_LEFT_CYAN_CONCRETE, new Item.Settings())
    );
    
    public static final Block VERTICAL_LEFT_PURPLE_CONCRETE = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "vertical_left_purple_concrete"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.PURPLE_CONCRETE))
    );
    public static final Item VERTICAL_LEFT_PURPLE_CONCRETE_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "vertical_left_purple_concrete"),
        new BlockItem(VERTICAL_LEFT_PURPLE_CONCRETE, new Item.Settings())
    );
    
    public static final Block VERTICAL_LEFT_BLUE_CONCRETE = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "vertical_left_blue_concrete"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.BLUE_CONCRETE))
    );
    public static final Item VERTICAL_LEFT_BLUE_CONCRETE_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "vertical_left_blue_concrete"),
        new BlockItem(VERTICAL_LEFT_BLUE_CONCRETE, new Item.Settings())
    );
    
    public static final Block VERTICAL_LEFT_BROWN_CONCRETE = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "vertical_left_brown_concrete"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.BROWN_CONCRETE))
    );
    public static final Item VERTICAL_LEFT_BROWN_CONCRETE_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "vertical_left_brown_concrete"),
        new BlockItem(VERTICAL_LEFT_BROWN_CONCRETE, new Item.Settings())
    );
    
    public static final Block VERTICAL_LEFT_GREEN_CONCRETE = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "vertical_left_green_concrete"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.GREEN_CONCRETE))
    );
    public static final Item VERTICAL_LEFT_GREEN_CONCRETE_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "vertical_left_green_concrete"),
        new BlockItem(VERTICAL_LEFT_GREEN_CONCRETE, new Item.Settings())
    );
    
    public static final Block VERTICAL_LEFT_RED_CONCRETE = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "vertical_left_red_concrete"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.RED_CONCRETE))
    );
    public static final Item VERTICAL_LEFT_RED_CONCRETE_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "vertical_left_red_concrete"),
        new BlockItem(VERTICAL_LEFT_RED_CONCRETE, new Item.Settings())
    );
    
    public static final Block VERTICAL_LEFT_BLACK_CONCRETE = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "vertical_left_black_concrete"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.BLACK_CONCRETE))
    );
    public static final Item VERTICAL_LEFT_BLACK_CONCRETE_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "vertical_left_black_concrete"),
        new BlockItem(VERTICAL_LEFT_BLACK_CONCRETE, new Item.Settings())
    );
    
    public static final Block VERTICAL_RIGHT_WHITE_TERRACOTTA = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "vertical_right_white_terracotta"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.WHITE_TERRACOTTA))
    );
    public static final Item VERTICAL_RIGHT_WHITE_TERRACOTTA_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "vertical_right_white_terracotta"),
        new BlockItem(VERTICAL_RIGHT_WHITE_TERRACOTTA, new Item.Settings())
    );
    
    public static final Block VERTICAL_RIGHT_ORANGE_TERRACOTTA = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "vertical_right_orange_terracotta"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.ORANGE_TERRACOTTA))
    );
    public static final Item VERTICAL_RIGHT_ORANGE_TERRACOTTA_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "vertical_right_orange_terracotta"),
        new BlockItem(VERTICAL_RIGHT_ORANGE_TERRACOTTA, new Item.Settings())
    );
    
    public static final Block VERTICAL_RIGHT_MAGENTA_TERRACOTTA = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "vertical_right_magenta_terracotta"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.MAGENTA_TERRACOTTA))
    );
    public static final Item VERTICAL_RIGHT_MAGENTA_TERRACOTTA_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "vertical_right_magenta_terracotta"),
        new BlockItem(VERTICAL_RIGHT_MAGENTA_TERRACOTTA, new Item.Settings())
    );
    
    public static final Block VERTICAL_RIGHT_LIGHT_BLUE_TERRACOTTA = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "vertical_right_light_blue_terracotta"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.LIGHT_BLUE_TERRACOTTA))
    );
    public static final Item VERTICAL_RIGHT_LIGHT_BLUE_TERRACOTTA_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "vertical_right_light_blue_terracotta"),
        new BlockItem(VERTICAL_RIGHT_LIGHT_BLUE_TERRACOTTA, new Item.Settings())
    );
    
    public static final Block VERTICAL_RIGHT_YELLOW_TERRACOTTA = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "vertical_right_yellow_terracotta"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.YELLOW_TERRACOTTA))
    );
    public static final Item VERTICAL_RIGHT_YELLOW_TERRACOTTA_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "vertical_right_yellow_terracotta"),
        new BlockItem(VERTICAL_RIGHT_YELLOW_TERRACOTTA, new Item.Settings())
    );
    
    public static final Block VERTICAL_RIGHT_LIME_TERRACOTTA = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "vertical_right_lime_terracotta"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.LIME_TERRACOTTA))
    );
    public static final Item VERTICAL_RIGHT_LIME_TERRACOTTA_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "vertical_right_lime_terracotta"),
        new BlockItem(VERTICAL_RIGHT_LIME_TERRACOTTA, new Item.Settings())
    );
    
    public static final Block VERTICAL_RIGHT_PINK_TERRACOTTA = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "vertical_right_pink_terracotta"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.PINK_TERRACOTTA))
    );
    public static final Item VERTICAL_RIGHT_PINK_TERRACOTTA_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "vertical_right_pink_terracotta"),
        new BlockItem(VERTICAL_RIGHT_PINK_TERRACOTTA, new Item.Settings())
    );
    
    public static final Block VERTICAL_RIGHT_GRAY_TERRACOTTA = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "vertical_right_gray_terracotta"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.GRAY_TERRACOTTA))
    );
    public static final Item VERTICAL_RIGHT_GRAY_TERRACOTTA_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "vertical_right_gray_terracotta"),
        new BlockItem(VERTICAL_RIGHT_GRAY_TERRACOTTA, new Item.Settings())
    );
    
    public static final Block VERTICAL_RIGHT_LIGHT_GRAY_TERRACOTTA = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "vertical_right_light_gray_terracotta"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.LIGHT_GRAY_TERRACOTTA))
    );
    public static final Item VERTICAL_RIGHT_LIGHT_GRAY_TERRACOTTA_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "vertical_right_light_gray_terracotta"),
        new BlockItem(VERTICAL_RIGHT_LIGHT_GRAY_TERRACOTTA, new Item.Settings())
    );
    
    public static final Block VERTICAL_RIGHT_CYAN_TERRACOTTA = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "vertical_right_cyan_terracotta"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.CYAN_TERRACOTTA))
    );
    public static final Item VERTICAL_RIGHT_CYAN_TERRACOTTA_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "vertical_right_cyan_terracotta"),
        new BlockItem(VERTICAL_RIGHT_CYAN_TERRACOTTA, new Item.Settings())
    );
    
    public static final Block VERTICAL_RIGHT_PURPLE_TERRACOTTA = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "vertical_right_purple_terracotta"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.PURPLE_TERRACOTTA))
    );
    public static final Item VERTICAL_RIGHT_PURPLE_TERRACOTTA_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "vertical_right_purple_terracotta"),
        new BlockItem(VERTICAL_RIGHT_PURPLE_TERRACOTTA, new Item.Settings())
    );
    
    public static final Block VERTICAL_RIGHT_BLUE_TERRACOTTA = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "vertical_right_blue_terracotta"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.BLUE_TERRACOTTA))
    );
    public static final Item VERTICAL_RIGHT_BLUE_TERRACOTTA_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "vertical_right_blue_terracotta"),
        new BlockItem(VERTICAL_RIGHT_BLUE_TERRACOTTA, new Item.Settings())
    );
    
    public static final Block VERTICAL_RIGHT_BROWN_TERRACOTTA = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "vertical_right_brown_terracotta"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.BROWN_TERRACOTTA))
    );
    public static final Item VERTICAL_RIGHT_BROWN_TERRACOTTA_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "vertical_right_brown_terracotta"),
        new BlockItem(VERTICAL_RIGHT_BROWN_TERRACOTTA, new Item.Settings())
    );
    
    public static final Block VERTICAL_RIGHT_GREEN_TERRACOTTA = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "vertical_right_green_terracotta"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.GREEN_TERRACOTTA))
    );
    public static final Item VERTICAL_RIGHT_GREEN_TERRACOTTA_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "vertical_right_green_terracotta"),
        new BlockItem(VERTICAL_RIGHT_GREEN_TERRACOTTA, new Item.Settings())
    );
    
    public static final Block VERTICAL_RIGHT_RED_TERRACOTTA = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "vertical_right_red_terracotta"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.RED_TERRACOTTA))
    );
    public static final Item VERTICAL_RIGHT_RED_TERRACOTTA_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "vertical_right_red_terracotta"),
        new BlockItem(VERTICAL_RIGHT_RED_TERRACOTTA, new Item.Settings())
    );
    
    public static final Block VERTICAL_RIGHT_BLACK_TERRACOTTA = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "vertical_right_black_terracotta"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.BLACK_TERRACOTTA))
    );
    public static final Item VERTICAL_RIGHT_BLACK_TERRACOTTA_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "vertical_right_black_terracotta"),
        new BlockItem(VERTICAL_RIGHT_BLACK_TERRACOTTA, new Item.Settings())
    );
    
    public static final Block VERTICAL_RIGHT_WHITE_CONCRETE = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "vertical_right_white_concrete"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.WHITE_CONCRETE))
    );
    public static final Item VERTICAL_RIGHT_WHITE_CONCRETE_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "vertical_right_white_concrete"),
        new BlockItem(VERTICAL_RIGHT_WHITE_CONCRETE, new Item.Settings())
    );
    
    public static final Block VERTICAL_RIGHT_ORANGE_CONCRETE = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "vertical_right_orange_concrete"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.ORANGE_CONCRETE))
    );
    public static final Item VERTICAL_RIGHT_ORANGE_CONCRETE_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "vertical_right_orange_concrete"),
        new BlockItem(VERTICAL_RIGHT_ORANGE_CONCRETE, new Item.Settings())
    );
    
    public static final Block VERTICAL_RIGHT_MAGENTA_CONCRETE = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "vertical_right_magenta_concrete"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.MAGENTA_CONCRETE))
    );
    public static final Item VERTICAL_RIGHT_MAGENTA_CONCRETE_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "vertical_right_magenta_concrete"),
        new BlockItem(VERTICAL_RIGHT_MAGENTA_CONCRETE, new Item.Settings())
    );
    
    public static final Block VERTICAL_RIGHT_LIGHT_BLUE_CONCRETE = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "vertical_right_light_blue_concrete"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.LIGHT_BLUE_CONCRETE))
    );
    public static final Item VERTICAL_RIGHT_LIGHT_BLUE_CONCRETE_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "vertical_right_light_blue_concrete"),
        new BlockItem(VERTICAL_RIGHT_LIGHT_BLUE_CONCRETE, new Item.Settings())
    );
    
    public static final Block VERTICAL_RIGHT_YELLOW_CONCRETE = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "vertical_right_yellow_concrete"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.YELLOW_CONCRETE))
    );
    public static final Item VERTICAL_RIGHT_YELLOW_CONCRETE_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "vertical_right_yellow_concrete"),
        new BlockItem(VERTICAL_RIGHT_YELLOW_CONCRETE, new Item.Settings())
    );
    
    public static final Block VERTICAL_RIGHT_LIME_CONCRETE = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "vertical_right_lime_concrete"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.LIME_CONCRETE))
    );
    public static final Item VERTICAL_RIGHT_LIME_CONCRETE_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "vertical_right_lime_concrete"),
        new BlockItem(VERTICAL_RIGHT_LIME_CONCRETE, new Item.Settings())
    );
    
    public static final Block VERTICAL_RIGHT_PINK_CONCRETE = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "vertical_right_pink_concrete"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.PINK_CONCRETE))
    );
    public static final Item VERTICAL_RIGHT_PINK_CONCRETE_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "vertical_right_pink_concrete"),
        new BlockItem(VERTICAL_RIGHT_PINK_CONCRETE, new Item.Settings())
    );
    
    public static final Block VERTICAL_RIGHT_GRAY_CONCRETE = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "vertical_right_gray_concrete"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.GRAY_CONCRETE))
    );
    public static final Item VERTICAL_RIGHT_GRAY_CONCRETE_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "vertical_right_gray_concrete"),
        new BlockItem(VERTICAL_RIGHT_GRAY_CONCRETE, new Item.Settings())
    );
    
    public static final Block VERTICAL_RIGHT_LIGHT_GRAY_CONCRETE = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "vertical_right_light_gray_concrete"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.LIGHT_GRAY_CONCRETE))
    );
    public static final Item VERTICAL_RIGHT_LIGHT_GRAY_CONCRETE_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "vertical_right_light_gray_concrete"),
        new BlockItem(VERTICAL_RIGHT_LIGHT_GRAY_CONCRETE, new Item.Settings())
    );
    
    public static final Block VERTICAL_RIGHT_CYAN_CONCRETE = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "vertical_right_cyan_concrete"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.CYAN_CONCRETE))
    );
    public static final Item VERTICAL_RIGHT_CYAN_CONCRETE_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "vertical_right_cyan_concrete"),
        new BlockItem(VERTICAL_RIGHT_CYAN_CONCRETE, new Item.Settings())
    );
    
    public static final Block VERTICAL_RIGHT_PURPLE_CONCRETE = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "vertical_right_purple_concrete"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.PURPLE_CONCRETE))
    );
    public static final Item VERTICAL_RIGHT_PURPLE_CONCRETE_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "vertical_right_purple_concrete"),
        new BlockItem(VERTICAL_RIGHT_PURPLE_CONCRETE, new Item.Settings())
    );
    
    public static final Block VERTICAL_RIGHT_BLUE_CONCRETE = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "vertical_right_blue_concrete"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.BLUE_CONCRETE))
    );
    public static final Item VERTICAL_RIGHT_BLUE_CONCRETE_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "vertical_right_blue_concrete"),
        new BlockItem(VERTICAL_RIGHT_BLUE_CONCRETE, new Item.Settings())
    );
    
    public static final Block VERTICAL_RIGHT_BROWN_CONCRETE = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "vertical_right_brown_concrete"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.BROWN_CONCRETE))
    );
    public static final Item VERTICAL_RIGHT_BROWN_CONCRETE_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "vertical_right_brown_concrete"),
        new BlockItem(VERTICAL_RIGHT_BROWN_CONCRETE, new Item.Settings())
    );
    
    public static final Block VERTICAL_RIGHT_GREEN_CONCRETE = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "vertical_right_green_concrete"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.GREEN_CONCRETE))
    );
    public static final Item VERTICAL_RIGHT_GREEN_CONCRETE_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "vertical_right_green_concrete"),
        new BlockItem(VERTICAL_RIGHT_GREEN_CONCRETE, new Item.Settings())
    );
    
    public static final Block VERTICAL_RIGHT_RED_CONCRETE = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "vertical_right_red_concrete"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.RED_CONCRETE))
    );
    public static final Item VERTICAL_RIGHT_RED_CONCRETE_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "vertical_right_red_concrete"),
        new BlockItem(VERTICAL_RIGHT_RED_CONCRETE, new Item.Settings())
    );
    
    public static final Block VERTICAL_RIGHT_BLACK_CONCRETE = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "vertical_right_black_concrete"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.BLACK_CONCRETE))
    );
    public static final Item VERTICAL_RIGHT_BLACK_CONCRETE_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "vertical_right_black_concrete"),
        new BlockItem(VERTICAL_RIGHT_BLACK_CONCRETE, new Item.Settings())
    );
    
    public static final Block VERTICAL_CENTER_WHITE_TERRACOTTA = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "vertical_center_white_terracotta"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.WHITE_TERRACOTTA))
    );
    public static final Item VERTICAL_CENTER_WHITE_TERRACOTTA_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "vertical_center_white_terracotta"),
        new BlockItem(VERTICAL_CENTER_WHITE_TERRACOTTA, new Item.Settings())
    );
    
    public static final Block VERTICAL_CENTER_ORANGE_TERRACOTTA = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "vertical_center_orange_terracotta"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.ORANGE_TERRACOTTA))
    );
    public static final Item VERTICAL_CENTER_ORANGE_TERRACOTTA_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "vertical_center_orange_terracotta"),
        new BlockItem(VERTICAL_CENTER_ORANGE_TERRACOTTA, new Item.Settings())
    );
    
    public static final Block VERTICAL_CENTER_MAGENTA_TERRACOTTA = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "vertical_center_magenta_terracotta"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.MAGENTA_TERRACOTTA))
    );
    public static final Item VERTICAL_CENTER_MAGENTA_TERRACOTTA_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "vertical_center_magenta_terracotta"),
        new BlockItem(VERTICAL_CENTER_MAGENTA_TERRACOTTA, new Item.Settings())
    );
    
    public static final Block VERTICAL_CENTER_LIGHT_BLUE_TERRACOTTA = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "vertical_center_light_blue_terracotta"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.LIGHT_BLUE_TERRACOTTA))
    );
    public static final Item VERTICAL_CENTER_LIGHT_BLUE_TERRACOTTA_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "vertical_center_light_blue_terracotta"),
        new BlockItem(VERTICAL_CENTER_LIGHT_BLUE_TERRACOTTA, new Item.Settings())
    );
    
    public static final Block VERTICAL_CENTER_YELLOW_TERRACOTTA = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "vertical_center_yellow_terracotta"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.YELLOW_TERRACOTTA))
    );
    public static final Item VERTICAL_CENTER_YELLOW_TERRACOTTA_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "vertical_center_yellow_terracotta"),
        new BlockItem(VERTICAL_CENTER_YELLOW_TERRACOTTA, new Item.Settings())
    );
    
    public static final Block VERTICAL_CENTER_LIME_TERRACOTTA = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "vertical_center_lime_terracotta"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.LIME_TERRACOTTA))
    );
    public static final Item VERTICAL_CENTER_LIME_TERRACOTTA_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "vertical_center_lime_terracotta"),
        new BlockItem(VERTICAL_CENTER_LIME_TERRACOTTA, new Item.Settings())
    );
    
    public static final Block VERTICAL_CENTER_PINK_TERRACOTTA = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "vertical_center_pink_terracotta"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.PINK_TERRACOTTA))
    );
    public static final Item VERTICAL_CENTER_PINK_TERRACOTTA_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "vertical_center_pink_terracotta"),
        new BlockItem(VERTICAL_CENTER_PINK_TERRACOTTA, new Item.Settings())
    );
    
    public static final Block VERTICAL_CENTER_GRAY_TERRACOTTA = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "vertical_center_gray_terracotta"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.GRAY_TERRACOTTA))
    );
    public static final Item VERTICAL_CENTER_GRAY_TERRACOTTA_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "vertical_center_gray_terracotta"),
        new BlockItem(VERTICAL_CENTER_GRAY_TERRACOTTA, new Item.Settings())
    );
    
    public static final Block VERTICAL_CENTER_LIGHT_GRAY_TERRACOTTA = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "vertical_center_light_gray_terracotta"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.LIGHT_GRAY_TERRACOTTA))
    );
    public static final Item VERTICAL_CENTER_LIGHT_GRAY_TERRACOTTA_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "vertical_center_light_gray_terracotta"),
        new BlockItem(VERTICAL_CENTER_LIGHT_GRAY_TERRACOTTA, new Item.Settings())
    );
    
    public static final Block VERTICAL_CENTER_CYAN_TERRACOTTA = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "vertical_center_cyan_terracotta"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.CYAN_TERRACOTTA))
    );
    public static final Item VERTICAL_CENTER_CYAN_TERRACOTTA_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "vertical_center_cyan_terracotta"),
        new BlockItem(VERTICAL_CENTER_CYAN_TERRACOTTA, new Item.Settings())
    );
    
    public static final Block VERTICAL_CENTER_PURPLE_TERRACOTTA = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "vertical_center_purple_terracotta"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.PURPLE_TERRACOTTA))
    );
    public static final Item VERTICAL_CENTER_PURPLE_TERRACOTTA_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "vertical_center_purple_terracotta"),
        new BlockItem(VERTICAL_CENTER_PURPLE_TERRACOTTA, new Item.Settings())
    );
    
    public static final Block VERTICAL_CENTER_BLUE_TERRACOTTA = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "vertical_center_blue_terracotta"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.BLUE_TERRACOTTA))
    );
    public static final Item VERTICAL_CENTER_BLUE_TERRACOTTA_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "vertical_center_blue_terracotta"),
        new BlockItem(VERTICAL_CENTER_BLUE_TERRACOTTA, new Item.Settings())
    );
    
    public static final Block VERTICAL_CENTER_BROWN_TERRACOTTA = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "vertical_center_brown_terracotta"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.BROWN_TERRACOTTA))
    );
    public static final Item VERTICAL_CENTER_BROWN_TERRACOTTA_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "vertical_center_brown_terracotta"),
        new BlockItem(VERTICAL_CENTER_BROWN_TERRACOTTA, new Item.Settings())
    );
    
    public static final Block VERTICAL_CENTER_GREEN_TERRACOTTA = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "vertical_center_green_terracotta"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.GREEN_TERRACOTTA))
    );
    public static final Item VERTICAL_CENTER_GREEN_TERRACOTTA_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "vertical_center_green_terracotta"),
        new BlockItem(VERTICAL_CENTER_GREEN_TERRACOTTA, new Item.Settings())
    );
    
    public static final Block VERTICAL_CENTER_RED_TERRACOTTA = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "vertical_center_red_terracotta"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.RED_TERRACOTTA))
    );
    public static final Item VERTICAL_CENTER_RED_TERRACOTTA_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "vertical_center_red_terracotta"),
        new BlockItem(VERTICAL_CENTER_RED_TERRACOTTA, new Item.Settings())
    );
    
    public static final Block VERTICAL_CENTER_BLACK_TERRACOTTA = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "vertical_center_black_terracotta"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.BLACK_TERRACOTTA))
    );
    public static final Item VERTICAL_CENTER_BLACK_TERRACOTTA_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "vertical_center_black_terracotta"),
        new BlockItem(VERTICAL_CENTER_BLACK_TERRACOTTA, new Item.Settings())
    );
    
    public static final Block VERTICAL_CENTER_WHITE_CONCRETE = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "vertical_center_white_concrete"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.WHITE_CONCRETE))
    );
    public static final Item VERTICAL_CENTER_WHITE_CONCRETE_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "vertical_center_white_concrete"),
        new BlockItem(VERTICAL_CENTER_WHITE_CONCRETE, new Item.Settings())
    );
    
    public static final Block VERTICAL_CENTER_ORANGE_CONCRETE = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "vertical_center_orange_concrete"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.ORANGE_CONCRETE))
    );
    public static final Item VERTICAL_CENTER_ORANGE_CONCRETE_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "vertical_center_orange_concrete"),
        new BlockItem(VERTICAL_CENTER_ORANGE_CONCRETE, new Item.Settings())
    );
    
    public static final Block VERTICAL_CENTER_MAGENTA_CONCRETE = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "vertical_center_magenta_concrete"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.MAGENTA_CONCRETE))
    );
    public static final Item VERTICAL_CENTER_MAGENTA_CONCRETE_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "vertical_center_magenta_concrete"),
        new BlockItem(VERTICAL_CENTER_MAGENTA_CONCRETE, new Item.Settings())
    );
    
    public static final Block VERTICAL_CENTER_LIGHT_BLUE_CONCRETE = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "vertical_center_light_blue_concrete"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.LIGHT_BLUE_CONCRETE))
    );
    public static final Item VERTICAL_CENTER_LIGHT_BLUE_CONCRETE_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "vertical_center_light_blue_concrete"),
        new BlockItem(VERTICAL_CENTER_LIGHT_BLUE_CONCRETE, new Item.Settings())
    );
    
    public static final Block VERTICAL_CENTER_YELLOW_CONCRETE = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "vertical_center_yellow_concrete"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.YELLOW_CONCRETE))
    );
    public static final Item VERTICAL_CENTER_YELLOW_CONCRETE_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "vertical_center_yellow_concrete"),
        new BlockItem(VERTICAL_CENTER_YELLOW_CONCRETE, new Item.Settings())
    );
    
    public static final Block VERTICAL_CENTER_LIME_CONCRETE = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "vertical_center_lime_concrete"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.LIME_CONCRETE))
    );
    public static final Item VERTICAL_CENTER_LIME_CONCRETE_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "vertical_center_lime_concrete"),
        new BlockItem(VERTICAL_CENTER_LIME_CONCRETE, new Item.Settings())
    );
    
    public static final Block VERTICAL_CENTER_PINK_CONCRETE = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "vertical_center_pink_concrete"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.PINK_CONCRETE))
    );
    public static final Item VERTICAL_CENTER_PINK_CONCRETE_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "vertical_center_pink_concrete"),
        new BlockItem(VERTICAL_CENTER_PINK_CONCRETE, new Item.Settings())
    );
    
    public static final Block VERTICAL_CENTER_GRAY_CONCRETE = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "vertical_center_gray_concrete"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.GRAY_CONCRETE))
    );
    public static final Item VERTICAL_CENTER_GRAY_CONCRETE_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "vertical_center_gray_concrete"),
        new BlockItem(VERTICAL_CENTER_GRAY_CONCRETE, new Item.Settings())
    );
    
    public static final Block VERTICAL_CENTER_LIGHT_GRAY_CONCRETE = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "vertical_center_light_gray_concrete"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.LIGHT_GRAY_CONCRETE))
    );
    public static final Item VERTICAL_CENTER_LIGHT_GRAY_CONCRETE_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "vertical_center_light_gray_concrete"),
        new BlockItem(VERTICAL_CENTER_LIGHT_GRAY_CONCRETE, new Item.Settings())
    );
    
    public static final Block VERTICAL_CENTER_CYAN_CONCRETE = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "vertical_center_cyan_concrete"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.CYAN_CONCRETE))
    );
    public static final Item VERTICAL_CENTER_CYAN_CONCRETE_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "vertical_center_cyan_concrete"),
        new BlockItem(VERTICAL_CENTER_CYAN_CONCRETE, new Item.Settings())
    );
    
    public static final Block VERTICAL_CENTER_PURPLE_CONCRETE = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "vertical_center_purple_concrete"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.PURPLE_CONCRETE))
    );
    public static final Item VERTICAL_CENTER_PURPLE_CONCRETE_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "vertical_center_purple_concrete"),
        new BlockItem(VERTICAL_CENTER_PURPLE_CONCRETE, new Item.Settings())
    );
    
    public static final Block VERTICAL_CENTER_BLUE_CONCRETE = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "vertical_center_blue_concrete"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.BLUE_CONCRETE))
    );
    public static final Item VERTICAL_CENTER_BLUE_CONCRETE_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "vertical_center_blue_concrete"),
        new BlockItem(VERTICAL_CENTER_BLUE_CONCRETE, new Item.Settings())
    );
    
    public static final Block VERTICAL_CENTER_BROWN_CONCRETE = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "vertical_center_brown_concrete"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.BROWN_CONCRETE))
    );
    public static final Item VERTICAL_CENTER_BROWN_CONCRETE_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "vertical_center_brown_concrete"),
        new BlockItem(VERTICAL_CENTER_BROWN_CONCRETE, new Item.Settings())
    );
    
    public static final Block VERTICAL_CENTER_GREEN_CONCRETE = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "vertical_center_green_concrete"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.GREEN_CONCRETE))
    );
    public static final Item VERTICAL_CENTER_GREEN_CONCRETE_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "vertical_center_green_concrete"),
        new BlockItem(VERTICAL_CENTER_GREEN_CONCRETE, new Item.Settings())
    );
    
    public static final Block VERTICAL_CENTER_RED_CONCRETE = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "vertical_center_red_concrete"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.RED_CONCRETE))
    );
    public static final Item VERTICAL_CENTER_RED_CONCRETE_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "vertical_center_red_concrete"),
        new BlockItem(VERTICAL_CENTER_RED_CONCRETE, new Item.Settings())
    );
    
    public static final Block VERTICAL_CENTER_BLACK_CONCRETE = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "vertical_center_black_concrete"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.BLACK_CONCRETE))
    );
    public static final Item VERTICAL_CENTER_BLACK_CONCRETE_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "vertical_center_black_concrete"),
        new BlockItem(VERTICAL_CENTER_BLACK_CONCRETE, new Item.Settings())
    );
    
    public static final Block VERTICAL_MIDDLE_WHITE_TERRACOTTA = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "vertical_middle_white_terracotta"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.WHITE_TERRACOTTA))
    );
    public static final Item VERTICAL_MIDDLE_WHITE_TERRACOTTA_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "vertical_middle_white_terracotta"),
        new BlockItem(VERTICAL_MIDDLE_WHITE_TERRACOTTA, new Item.Settings())
    );
    
    public static final Block VERTICAL_MIDDLE_ORANGE_TERRACOTTA = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "vertical_middle_orange_terracotta"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.ORANGE_TERRACOTTA))
    );
    public static final Item VERTICAL_MIDDLE_ORANGE_TERRACOTTA_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "vertical_middle_orange_terracotta"),
        new BlockItem(VERTICAL_MIDDLE_ORANGE_TERRACOTTA, new Item.Settings())
    );
    
    public static final Block VERTICAL_MIDDLE_MAGENTA_TERRACOTTA = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "vertical_middle_magenta_terracotta"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.MAGENTA_TERRACOTTA))
    );
    public static final Item VERTICAL_MIDDLE_MAGENTA_TERRACOTTA_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "vertical_middle_magenta_terracotta"),
        new BlockItem(VERTICAL_MIDDLE_MAGENTA_TERRACOTTA, new Item.Settings())
    );
    
    public static final Block VERTICAL_MIDDLE_LIGHT_BLUE_TERRACOTTA = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "vertical_middle_light_blue_terracotta"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.LIGHT_BLUE_TERRACOTTA))
    );
    public static final Item VERTICAL_MIDDLE_LIGHT_BLUE_TERRACOTTA_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "vertical_middle_light_blue_terracotta"),
        new BlockItem(VERTICAL_MIDDLE_LIGHT_BLUE_TERRACOTTA, new Item.Settings())
    );
    
    public static final Block VERTICAL_MIDDLE_YELLOW_TERRACOTTA = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "vertical_middle_yellow_terracotta"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.YELLOW_TERRACOTTA))
    );
    public static final Item VERTICAL_MIDDLE_YELLOW_TERRACOTTA_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "vertical_middle_yellow_terracotta"),
        new BlockItem(VERTICAL_MIDDLE_YELLOW_TERRACOTTA, new Item.Settings())
    );
    
    public static final Block VERTICAL_MIDDLE_LIME_TERRACOTTA = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "vertical_middle_lime_terracotta"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.LIME_TERRACOTTA))
    );
    public static final Item VERTICAL_MIDDLE_LIME_TERRACOTTA_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "vertical_middle_lime_terracotta"),
        new BlockItem(VERTICAL_MIDDLE_LIME_TERRACOTTA, new Item.Settings())
    );
    
    public static final Block VERTICAL_MIDDLE_PINK_TERRACOTTA = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "vertical_middle_pink_terracotta"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.PINK_TERRACOTTA))
    );
    public static final Item VERTICAL_MIDDLE_PINK_TERRACOTTA_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "vertical_middle_pink_terracotta"),
        new BlockItem(VERTICAL_MIDDLE_PINK_TERRACOTTA, new Item.Settings())
    );
    
    public static final Block VERTICAL_MIDDLE_GRAY_TERRACOTTA = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "vertical_middle_gray_terracotta"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.GRAY_TERRACOTTA))
    );
    public static final Item VERTICAL_MIDDLE_GRAY_TERRACOTTA_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "vertical_middle_gray_terracotta"),
        new BlockItem(VERTICAL_MIDDLE_GRAY_TERRACOTTA, new Item.Settings())
    );
    
    public static final Block VERTICAL_MIDDLE_LIGHT_GRAY_TERRACOTTA = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "vertical_middle_light_gray_terracotta"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.LIGHT_GRAY_TERRACOTTA))
    );
    public static final Item VERTICAL_MIDDLE_LIGHT_GRAY_TERRACOTTA_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "vertical_middle_light_gray_terracotta"),
        new BlockItem(VERTICAL_MIDDLE_LIGHT_GRAY_TERRACOTTA, new Item.Settings())
    );
    
    public static final Block VERTICAL_MIDDLE_CYAN_TERRACOTTA = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "vertical_middle_cyan_terracotta"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.CYAN_TERRACOTTA))
    );
    public static final Item VERTICAL_MIDDLE_CYAN_TERRACOTTA_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "vertical_middle_cyan_terracotta"),
        new BlockItem(VERTICAL_MIDDLE_CYAN_TERRACOTTA, new Item.Settings())
    );
    
    public static final Block VERTICAL_MIDDLE_PURPLE_TERRACOTTA = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "vertical_middle_purple_terracotta"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.PURPLE_TERRACOTTA))
    );
    public static final Item VERTICAL_MIDDLE_PURPLE_TERRACOTTA_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "vertical_middle_purple_terracotta"),
        new BlockItem(VERTICAL_MIDDLE_PURPLE_TERRACOTTA, new Item.Settings())
    );
    
    public static final Block VERTICAL_MIDDLE_BLUE_TERRACOTTA = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "vertical_middle_blue_terracotta"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.BLUE_TERRACOTTA))
    );
    public static final Item VERTICAL_MIDDLE_BLUE_TERRACOTTA_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "vertical_middle_blue_terracotta"),
        new BlockItem(VERTICAL_MIDDLE_BLUE_TERRACOTTA, new Item.Settings())
    );
    
    public static final Block VERTICAL_MIDDLE_BROWN_TERRACOTTA = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "vertical_middle_brown_terracotta"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.BROWN_TERRACOTTA))
    );
    public static final Item VERTICAL_MIDDLE_BROWN_TERRACOTTA_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "vertical_middle_brown_terracotta"),
        new BlockItem(VERTICAL_MIDDLE_BROWN_TERRACOTTA, new Item.Settings())
    );
    
    public static final Block VERTICAL_MIDDLE_GREEN_TERRACOTTA = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "vertical_middle_green_terracotta"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.GREEN_TERRACOTTA))
    );
    public static final Item VERTICAL_MIDDLE_GREEN_TERRACOTTA_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "vertical_middle_green_terracotta"),
        new BlockItem(VERTICAL_MIDDLE_GREEN_TERRACOTTA, new Item.Settings())
    );
    
    public static final Block VERTICAL_MIDDLE_RED_TERRACOTTA = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "vertical_middle_red_terracotta"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.RED_TERRACOTTA))
    );
    public static final Item VERTICAL_MIDDLE_RED_TERRACOTTA_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "vertical_middle_red_terracotta"),
        new BlockItem(VERTICAL_MIDDLE_RED_TERRACOTTA, new Item.Settings())
    );
    
    public static final Block VERTICAL_MIDDLE_BLACK_TERRACOTTA = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "vertical_middle_black_terracotta"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.BLACK_TERRACOTTA))
    );
    public static final Item VERTICAL_MIDDLE_BLACK_TERRACOTTA_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "vertical_middle_black_terracotta"),
        new BlockItem(VERTICAL_MIDDLE_BLACK_TERRACOTTA, new Item.Settings())
    );
    
    public static final Block VERTICAL_MIDDLE_WHITE_CONCRETE = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "vertical_middle_white_concrete"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.WHITE_CONCRETE))
    );
    public static final Item VERTICAL_MIDDLE_WHITE_CONCRETE_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "vertical_middle_white_concrete"),
        new BlockItem(VERTICAL_MIDDLE_WHITE_CONCRETE, new Item.Settings())
    );
    
    public static final Block VERTICAL_MIDDLE_ORANGE_CONCRETE = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "vertical_middle_orange_concrete"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.ORANGE_CONCRETE))
    );
    public static final Item VERTICAL_MIDDLE_ORANGE_CONCRETE_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "vertical_middle_orange_concrete"),
        new BlockItem(VERTICAL_MIDDLE_ORANGE_CONCRETE, new Item.Settings())
    );
    
    public static final Block VERTICAL_MIDDLE_MAGENTA_CONCRETE = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "vertical_middle_magenta_concrete"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.MAGENTA_CONCRETE))
    );
    public static final Item VERTICAL_MIDDLE_MAGENTA_CONCRETE_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "vertical_middle_magenta_concrete"),
        new BlockItem(VERTICAL_MIDDLE_MAGENTA_CONCRETE, new Item.Settings())
    );
    
    public static final Block VERTICAL_MIDDLE_LIGHT_BLUE_CONCRETE = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "vertical_middle_light_blue_concrete"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.LIGHT_BLUE_CONCRETE))
    );
    public static final Item VERTICAL_MIDDLE_LIGHT_BLUE_CONCRETE_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "vertical_middle_light_blue_concrete"),
        new BlockItem(VERTICAL_MIDDLE_LIGHT_BLUE_CONCRETE, new Item.Settings())
    );
    
    public static final Block VERTICAL_MIDDLE_YELLOW_CONCRETE = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "vertical_middle_yellow_concrete"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.YELLOW_CONCRETE))
    );
    public static final Item VERTICAL_MIDDLE_YELLOW_CONCRETE_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "vertical_middle_yellow_concrete"),
        new BlockItem(VERTICAL_MIDDLE_YELLOW_CONCRETE, new Item.Settings())
    );
    
    public static final Block VERTICAL_MIDDLE_LIME_CONCRETE = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "vertical_middle_lime_concrete"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.LIME_CONCRETE))
    );
    public static final Item VERTICAL_MIDDLE_LIME_CONCRETE_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "vertical_middle_lime_concrete"),
        new BlockItem(VERTICAL_MIDDLE_LIME_CONCRETE, new Item.Settings())
    );
    
    public static final Block VERTICAL_MIDDLE_PINK_CONCRETE = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "vertical_middle_pink_concrete"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.PINK_CONCRETE))
    );
    public static final Item VERTICAL_MIDDLE_PINK_CONCRETE_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "vertical_middle_pink_concrete"),
        new BlockItem(VERTICAL_MIDDLE_PINK_CONCRETE, new Item.Settings())
    );
    
    public static final Block VERTICAL_MIDDLE_GRAY_CONCRETE = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "vertical_middle_gray_concrete"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.GRAY_CONCRETE))
    );
    public static final Item VERTICAL_MIDDLE_GRAY_CONCRETE_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "vertical_middle_gray_concrete"),
        new BlockItem(VERTICAL_MIDDLE_GRAY_CONCRETE, new Item.Settings())
    );
    
    public static final Block VERTICAL_MIDDLE_LIGHT_GRAY_CONCRETE = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "vertical_middle_light_gray_concrete"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.LIGHT_GRAY_CONCRETE))
    );
    public static final Item VERTICAL_MIDDLE_LIGHT_GRAY_CONCRETE_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "vertical_middle_light_gray_concrete"),
        new BlockItem(VERTICAL_MIDDLE_LIGHT_GRAY_CONCRETE, new Item.Settings())
    );
    
    public static final Block VERTICAL_MIDDLE_CYAN_CONCRETE = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "vertical_middle_cyan_concrete"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.CYAN_CONCRETE))
    );
    public static final Item VERTICAL_MIDDLE_CYAN_CONCRETE_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "vertical_middle_cyan_concrete"),
        new BlockItem(VERTICAL_MIDDLE_CYAN_CONCRETE, new Item.Settings())
    );
    
    public static final Block VERTICAL_MIDDLE_PURPLE_CONCRETE = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "vertical_middle_purple_concrete"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.PURPLE_CONCRETE))
    );
    public static final Item VERTICAL_MIDDLE_PURPLE_CONCRETE_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "vertical_middle_purple_concrete"),
        new BlockItem(VERTICAL_MIDDLE_PURPLE_CONCRETE, new Item.Settings())
    );
    
    public static final Block VERTICAL_MIDDLE_BLUE_CONCRETE = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "vertical_middle_blue_concrete"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.BLUE_CONCRETE))
    );
    public static final Item VERTICAL_MIDDLE_BLUE_CONCRETE_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "vertical_middle_blue_concrete"),
        new BlockItem(VERTICAL_MIDDLE_BLUE_CONCRETE, new Item.Settings())
    );
    
    public static final Block VERTICAL_MIDDLE_BROWN_CONCRETE = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "vertical_middle_brown_concrete"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.BROWN_CONCRETE))
    );
    public static final Item VERTICAL_MIDDLE_BROWN_CONCRETE_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "vertical_middle_brown_concrete"),
        new BlockItem(VERTICAL_MIDDLE_BROWN_CONCRETE, new Item.Settings())
    );
    
    public static final Block VERTICAL_MIDDLE_GREEN_CONCRETE = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "vertical_middle_green_concrete"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.GREEN_CONCRETE))
    );
    public static final Item VERTICAL_MIDDLE_GREEN_CONCRETE_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "vertical_middle_green_concrete"),
        new BlockItem(VERTICAL_MIDDLE_GREEN_CONCRETE, new Item.Settings())
    );
    
    public static final Block VERTICAL_MIDDLE_RED_CONCRETE = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "vertical_middle_red_concrete"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.RED_CONCRETE))
    );
    public static final Item VERTICAL_MIDDLE_RED_CONCRETE_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "vertical_middle_red_concrete"),
        new BlockItem(VERTICAL_MIDDLE_RED_CONCRETE, new Item.Settings())
    );
    
    public static final Block VERTICAL_MIDDLE_BLACK_CONCRETE = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "vertical_middle_black_concrete"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.BLACK_CONCRETE))
    );
    public static final Item VERTICAL_MIDDLE_BLACK_CONCRETE_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "vertical_middle_black_concrete"),
        new BlockItem(VERTICAL_MIDDLE_BLACK_CONCRETE, new Item.Settings())
    );
    
    public static final Block HORIZONTAL_TOP_WHITE_TERRACOTTA = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "horizontal_top_white_terracotta"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.WHITE_TERRACOTTA))
    );
    public static final Item HORIZONTAL_TOP_WHITE_TERRACOTTA_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "horizontal_top_white_terracotta"),
        new BlockItem(HORIZONTAL_TOP_WHITE_TERRACOTTA, new Item.Settings())
    );
    
    public static final Block HORIZONTAL_TOP_ORANGE_TERRACOTTA = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "horizontal_top_orange_terracotta"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.ORANGE_TERRACOTTA))
    );
    public static final Item HORIZONTAL_TOP_ORANGE_TERRACOTTA_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "horizontal_top_orange_terracotta"),
        new BlockItem(HORIZONTAL_TOP_ORANGE_TERRACOTTA, new Item.Settings())
    );
    
    public static final Block HORIZONTAL_TOP_MAGENTA_TERRACOTTA = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "horizontal_top_magenta_terracotta"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.MAGENTA_TERRACOTTA))
    );
    public static final Item HORIZONTAL_TOP_MAGENTA_TERRACOTTA_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "horizontal_top_magenta_terracotta"),
        new BlockItem(HORIZONTAL_TOP_MAGENTA_TERRACOTTA, new Item.Settings())
    );
    
    public static final Block HORIZONTAL_TOP_LIGHT_BLUE_TERRACOTTA = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "horizontal_top_light_blue_terracotta"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.LIGHT_BLUE_TERRACOTTA))
    );
    public static final Item HORIZONTAL_TOP_LIGHT_BLUE_TERRACOTTA_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "horizontal_top_light_blue_terracotta"),
        new BlockItem(HORIZONTAL_TOP_LIGHT_BLUE_TERRACOTTA, new Item.Settings())
    );
    
    public static final Block HORIZONTAL_TOP_YELLOW_TERRACOTTA = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "horizontal_top_yellow_terracotta"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.YELLOW_TERRACOTTA))
    );
    public static final Item HORIZONTAL_TOP_YELLOW_TERRACOTTA_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "horizontal_top_yellow_terracotta"),
        new BlockItem(HORIZONTAL_TOP_YELLOW_TERRACOTTA, new Item.Settings())
    );
    
    public static final Block HORIZONTAL_TOP_LIME_TERRACOTTA = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "horizontal_top_lime_terracotta"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.LIME_TERRACOTTA))
    );
    public static final Item HORIZONTAL_TOP_LIME_TERRACOTTA_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "horizontal_top_lime_terracotta"),
        new BlockItem(HORIZONTAL_TOP_LIME_TERRACOTTA, new Item.Settings())
    );
    
    public static final Block HORIZONTAL_TOP_PINK_TERRACOTTA = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "horizontal_top_pink_terracotta"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.PINK_TERRACOTTA))
    );
    public static final Item HORIZONTAL_TOP_PINK_TERRACOTTA_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "horizontal_top_pink_terracotta"),
        new BlockItem(HORIZONTAL_TOP_PINK_TERRACOTTA, new Item.Settings())
    );
    
    public static final Block HORIZONTAL_TOP_GRAY_TERRACOTTA = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "horizontal_top_gray_terracotta"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.GRAY_TERRACOTTA))
    );
    public static final Item HORIZONTAL_TOP_GRAY_TERRACOTTA_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "horizontal_top_gray_terracotta"),
        new BlockItem(HORIZONTAL_TOP_GRAY_TERRACOTTA, new Item.Settings())
    );
    
    public static final Block HORIZONTAL_TOP_LIGHT_GRAY_TERRACOTTA = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "horizontal_top_light_gray_terracotta"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.LIGHT_GRAY_TERRACOTTA))
    );
    public static final Item HORIZONTAL_TOP_LIGHT_GRAY_TERRACOTTA_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "horizontal_top_light_gray_terracotta"),
        new BlockItem(HORIZONTAL_TOP_LIGHT_GRAY_TERRACOTTA, new Item.Settings())
    );
    
    public static final Block HORIZONTAL_TOP_CYAN_TERRACOTTA = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "horizontal_top_cyan_terracotta"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.CYAN_TERRACOTTA))
    );
    public static final Item HORIZONTAL_TOP_CYAN_TERRACOTTA_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "horizontal_top_cyan_terracotta"),
        new BlockItem(HORIZONTAL_TOP_CYAN_TERRACOTTA, new Item.Settings())
    );
    
    public static final Block HORIZONTAL_TOP_PURPLE_TERRACOTTA = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "horizontal_top_purple_terracotta"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.PURPLE_TERRACOTTA))
    );
    public static final Item HORIZONTAL_TOP_PURPLE_TERRACOTTA_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "horizontal_top_purple_terracotta"),
        new BlockItem(HORIZONTAL_TOP_PURPLE_TERRACOTTA, new Item.Settings())
    );
    
    public static final Block HORIZONTAL_TOP_BLUE_TERRACOTTA = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "horizontal_top_blue_terracotta"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.BLUE_TERRACOTTA))
    );
    public static final Item HORIZONTAL_TOP_BLUE_TERRACOTTA_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "horizontal_top_blue_terracotta"),
        new BlockItem(HORIZONTAL_TOP_BLUE_TERRACOTTA, new Item.Settings())
    );
    
    public static final Block HORIZONTAL_TOP_BROWN_TERRACOTTA = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "horizontal_top_brown_terracotta"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.BROWN_TERRACOTTA))
    );
    public static final Item HORIZONTAL_TOP_BROWN_TERRACOTTA_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "horizontal_top_brown_terracotta"),
        new BlockItem(HORIZONTAL_TOP_BROWN_TERRACOTTA, new Item.Settings())
    );
    
    public static final Block HORIZONTAL_TOP_GREEN_TERRACOTTA = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "horizontal_top_green_terracotta"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.GREEN_TERRACOTTA))
    );
    public static final Item HORIZONTAL_TOP_GREEN_TERRACOTTA_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "horizontal_top_green_terracotta"),
        new BlockItem(HORIZONTAL_TOP_GREEN_TERRACOTTA, new Item.Settings())
    );
    
    public static final Block HORIZONTAL_TOP_RED_TERRACOTTA = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "horizontal_top_red_terracotta"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.RED_TERRACOTTA))
    );
    public static final Item HORIZONTAL_TOP_RED_TERRACOTTA_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "horizontal_top_red_terracotta"),
        new BlockItem(HORIZONTAL_TOP_RED_TERRACOTTA, new Item.Settings())
    );
    
    public static final Block HORIZONTAL_TOP_BLACK_TERRACOTTA = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "horizontal_top_black_terracotta"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.BLACK_TERRACOTTA))
    );
    public static final Item HORIZONTAL_TOP_BLACK_TERRACOTTA_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "horizontal_top_black_terracotta"),
        new BlockItem(HORIZONTAL_TOP_BLACK_TERRACOTTA, new Item.Settings())
    );
    
    public static final Block HORIZONTAL_TOP_WHITE_CONCRETE = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "horizontal_top_white_concrete"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.WHITE_CONCRETE))
    );
    public static final Item HORIZONTAL_TOP_WHITE_CONCRETE_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "horizontal_top_white_concrete"),
        new BlockItem(HORIZONTAL_TOP_WHITE_CONCRETE, new Item.Settings())
    );
    
    public static final Block HORIZONTAL_TOP_ORANGE_CONCRETE = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "horizontal_top_orange_concrete"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.ORANGE_CONCRETE))
    );
    public static final Item HORIZONTAL_TOP_ORANGE_CONCRETE_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "horizontal_top_orange_concrete"),
        new BlockItem(HORIZONTAL_TOP_ORANGE_CONCRETE, new Item.Settings())
    );
    
    public static final Block HORIZONTAL_TOP_MAGENTA_CONCRETE = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "horizontal_top_magenta_concrete"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.MAGENTA_CONCRETE))
    );
    public static final Item HORIZONTAL_TOP_MAGENTA_CONCRETE_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "horizontal_top_magenta_concrete"),
        new BlockItem(HORIZONTAL_TOP_MAGENTA_CONCRETE, new Item.Settings())
    );
    
    public static final Block HORIZONTAL_TOP_LIGHT_BLUE_CONCRETE = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "horizontal_top_light_blue_concrete"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.LIGHT_BLUE_CONCRETE))
    );
    public static final Item HORIZONTAL_TOP_LIGHT_BLUE_CONCRETE_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "horizontal_top_light_blue_concrete"),
        new BlockItem(HORIZONTAL_TOP_LIGHT_BLUE_CONCRETE, new Item.Settings())
    );
    
    public static final Block HORIZONTAL_TOP_YELLOW_CONCRETE = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "horizontal_top_yellow_concrete"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.YELLOW_CONCRETE))
    );
    public static final Item HORIZONTAL_TOP_YELLOW_CONCRETE_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "horizontal_top_yellow_concrete"),
        new BlockItem(HORIZONTAL_TOP_YELLOW_CONCRETE, new Item.Settings())
    );
    
    public static final Block HORIZONTAL_TOP_LIME_CONCRETE = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "horizontal_top_lime_concrete"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.LIME_CONCRETE))
    );
    public static final Item HORIZONTAL_TOP_LIME_CONCRETE_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "horizontal_top_lime_concrete"),
        new BlockItem(HORIZONTAL_TOP_LIME_CONCRETE, new Item.Settings())
    );
    
    public static final Block HORIZONTAL_TOP_PINK_CONCRETE = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "horizontal_top_pink_concrete"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.PINK_CONCRETE))
    );
    public static final Item HORIZONTAL_TOP_PINK_CONCRETE_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "horizontal_top_pink_concrete"),
        new BlockItem(HORIZONTAL_TOP_PINK_CONCRETE, new Item.Settings())
    );
    
    public static final Block HORIZONTAL_TOP_GRAY_CONCRETE = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "horizontal_top_gray_concrete"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.GRAY_CONCRETE))
    );
    public static final Item HORIZONTAL_TOP_GRAY_CONCRETE_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "horizontal_top_gray_concrete"),
        new BlockItem(HORIZONTAL_TOP_GRAY_CONCRETE, new Item.Settings())
    );
    
    public static final Block HORIZONTAL_TOP_LIGHT_GRAY_CONCRETE = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "horizontal_top_light_gray_concrete"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.LIGHT_GRAY_CONCRETE))
    );
    public static final Item HORIZONTAL_TOP_LIGHT_GRAY_CONCRETE_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "horizontal_top_light_gray_concrete"),
        new BlockItem(HORIZONTAL_TOP_LIGHT_GRAY_CONCRETE, new Item.Settings())
    );
    
    public static final Block HORIZONTAL_TOP_CYAN_CONCRETE = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "horizontal_top_cyan_concrete"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.CYAN_CONCRETE))
    );
    public static final Item HORIZONTAL_TOP_CYAN_CONCRETE_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "horizontal_top_cyan_concrete"),
        new BlockItem(HORIZONTAL_TOP_CYAN_CONCRETE, new Item.Settings())
    );
    
    public static final Block HORIZONTAL_TOP_PURPLE_CONCRETE = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "horizontal_top_purple_concrete"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.PURPLE_CONCRETE))
    );
    public static final Item HORIZONTAL_TOP_PURPLE_CONCRETE_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "horizontal_top_purple_concrete"),
        new BlockItem(HORIZONTAL_TOP_PURPLE_CONCRETE, new Item.Settings())
    );
    
    public static final Block HORIZONTAL_TOP_BLUE_CONCRETE = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "horizontal_top_blue_concrete"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.BLUE_CONCRETE))
    );
    public static final Item HORIZONTAL_TOP_BLUE_CONCRETE_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "horizontal_top_blue_concrete"),
        new BlockItem(HORIZONTAL_TOP_BLUE_CONCRETE, new Item.Settings())
    );
    
    public static final Block HORIZONTAL_TOP_BROWN_CONCRETE = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "horizontal_top_brown_concrete"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.BROWN_CONCRETE))
    );
    public static final Item HORIZONTAL_TOP_BROWN_CONCRETE_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "horizontal_top_brown_concrete"),
        new BlockItem(HORIZONTAL_TOP_BROWN_CONCRETE, new Item.Settings())
    );
    
    public static final Block HORIZONTAL_TOP_GREEN_CONCRETE = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "horizontal_top_green_concrete"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.GREEN_CONCRETE))
    );
    public static final Item HORIZONTAL_TOP_GREEN_CONCRETE_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "horizontal_top_green_concrete"),
        new BlockItem(HORIZONTAL_TOP_GREEN_CONCRETE, new Item.Settings())
    );
    
    public static final Block HORIZONTAL_TOP_RED_CONCRETE = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "horizontal_top_red_concrete"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.RED_CONCRETE))
    );
    public static final Item HORIZONTAL_TOP_RED_CONCRETE_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "horizontal_top_red_concrete"),
        new BlockItem(HORIZONTAL_TOP_RED_CONCRETE, new Item.Settings())
    );
    
    public static final Block HORIZONTAL_TOP_BLACK_CONCRETE = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "horizontal_top_black_concrete"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.BLACK_CONCRETE))
    );
    public static final Item HORIZONTAL_TOP_BLACK_CONCRETE_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "horizontal_top_black_concrete"),
        new BlockItem(HORIZONTAL_TOP_BLACK_CONCRETE, new Item.Settings())
    );
    
    public static final Block HORIZONTAL_MIDDLE_WHITE_TERRACOTTA = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "horizontal_middle_white_terracotta"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.WHITE_TERRACOTTA))
    );
    public static final Item HORIZONTAL_MIDDLE_WHITE_TERRACOTTA_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "horizontal_middle_white_terracotta"),
        new BlockItem(HORIZONTAL_MIDDLE_WHITE_TERRACOTTA, new Item.Settings())
    );
    
    public static final Block HORIZONTAL_MIDDLE_ORANGE_TERRACOTTA = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "horizontal_middle_orange_terracotta"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.ORANGE_TERRACOTTA))
    );
    public static final Item HORIZONTAL_MIDDLE_ORANGE_TERRACOTTA_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "horizontal_middle_orange_terracotta"),
        new BlockItem(HORIZONTAL_MIDDLE_ORANGE_TERRACOTTA, new Item.Settings())
    );
    
    public static final Block HORIZONTAL_MIDDLE_MAGENTA_TERRACOTTA = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "horizontal_middle_magenta_terracotta"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.MAGENTA_TERRACOTTA))
    );
    public static final Item HORIZONTAL_MIDDLE_MAGENTA_TERRACOTTA_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "horizontal_middle_magenta_terracotta"),
        new BlockItem(HORIZONTAL_MIDDLE_MAGENTA_TERRACOTTA, new Item.Settings())
    );
    
    public static final Block HORIZONTAL_MIDDLE_LIGHT_BLUE_TERRACOTTA = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "horizontal_middle_light_blue_terracotta"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.LIGHT_BLUE_TERRACOTTA))
    );
    public static final Item HORIZONTAL_MIDDLE_LIGHT_BLUE_TERRACOTTA_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "horizontal_middle_light_blue_terracotta"),
        new BlockItem(HORIZONTAL_MIDDLE_LIGHT_BLUE_TERRACOTTA, new Item.Settings())
    );
    
    public static final Block HORIZONTAL_MIDDLE_YELLOW_TERRACOTTA = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "horizontal_middle_yellow_terracotta"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.YELLOW_TERRACOTTA))
    );
    public static final Item HORIZONTAL_MIDDLE_YELLOW_TERRACOTTA_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "horizontal_middle_yellow_terracotta"),
        new BlockItem(HORIZONTAL_MIDDLE_YELLOW_TERRACOTTA, new Item.Settings())
    );
    
    public static final Block HORIZONTAL_MIDDLE_LIME_TERRACOTTA = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "horizontal_middle_lime_terracotta"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.LIME_TERRACOTTA))
    );
    public static final Item HORIZONTAL_MIDDLE_LIME_TERRACOTTA_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "horizontal_middle_lime_terracotta"),
        new BlockItem(HORIZONTAL_MIDDLE_LIME_TERRACOTTA, new Item.Settings())
    );
    
    public static final Block HORIZONTAL_MIDDLE_PINK_TERRACOTTA = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "horizontal_middle_pink_terracotta"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.PINK_TERRACOTTA))
    );
    public static final Item HORIZONTAL_MIDDLE_PINK_TERRACOTTA_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "horizontal_middle_pink_terracotta"),
        new BlockItem(HORIZONTAL_MIDDLE_PINK_TERRACOTTA, new Item.Settings())
    );
    
    public static final Block HORIZONTAL_MIDDLE_GRAY_TERRACOTTA = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "horizontal_middle_gray_terracotta"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.GRAY_TERRACOTTA))
    );
    public static final Item HORIZONTAL_MIDDLE_GRAY_TERRACOTTA_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "horizontal_middle_gray_terracotta"),
        new BlockItem(HORIZONTAL_MIDDLE_GRAY_TERRACOTTA, new Item.Settings())
    );
    
    public static final Block HORIZONTAL_MIDDLE_LIGHT_GRAY_TERRACOTTA = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "horizontal_middle_light_gray_terracotta"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.LIGHT_GRAY_TERRACOTTA))
    );
    public static final Item HORIZONTAL_MIDDLE_LIGHT_GRAY_TERRACOTTA_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "horizontal_middle_light_gray_terracotta"),
        new BlockItem(HORIZONTAL_MIDDLE_LIGHT_GRAY_TERRACOTTA, new Item.Settings())
    );
    
    public static final Block HORIZONTAL_MIDDLE_CYAN_TERRACOTTA = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "horizontal_middle_cyan_terracotta"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.CYAN_TERRACOTTA))
    );
    public static final Item HORIZONTAL_MIDDLE_CYAN_TERRACOTTA_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "horizontal_middle_cyan_terracotta"),
        new BlockItem(HORIZONTAL_MIDDLE_CYAN_TERRACOTTA, new Item.Settings())
    );
    
    public static final Block HORIZONTAL_MIDDLE_PURPLE_TERRACOTTA = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "horizontal_middle_purple_terracotta"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.PURPLE_TERRACOTTA))
    );
    public static final Item HORIZONTAL_MIDDLE_PURPLE_TERRACOTTA_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "horizontal_middle_purple_terracotta"),
        new BlockItem(HORIZONTAL_MIDDLE_PURPLE_TERRACOTTA, new Item.Settings())
    );
    
    public static final Block HORIZONTAL_MIDDLE_BLUE_TERRACOTTA = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "horizontal_middle_blue_terracotta"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.BLUE_TERRACOTTA))
    );
    public static final Item HORIZONTAL_MIDDLE_BLUE_TERRACOTTA_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "horizontal_middle_blue_terracotta"),
        new BlockItem(HORIZONTAL_MIDDLE_BLUE_TERRACOTTA, new Item.Settings())
    );
    
    public static final Block HORIZONTAL_MIDDLE_BROWN_TERRACOTTA = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "horizontal_middle_brown_terracotta"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.BROWN_TERRACOTTA))
    );
    public static final Item HORIZONTAL_MIDDLE_BROWN_TERRACOTTA_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "horizontal_middle_brown_terracotta"),
        new BlockItem(HORIZONTAL_MIDDLE_BROWN_TERRACOTTA, new Item.Settings())
    );
    
    public static final Block HORIZONTAL_MIDDLE_GREEN_TERRACOTTA = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "horizontal_middle_green_terracotta"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.GREEN_TERRACOTTA))
    );
    public static final Item HORIZONTAL_MIDDLE_GREEN_TERRACOTTA_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "horizontal_middle_green_terracotta"),
        new BlockItem(HORIZONTAL_MIDDLE_GREEN_TERRACOTTA, new Item.Settings())
    );
    
    public static final Block HORIZONTAL_MIDDLE_RED_TERRACOTTA = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "horizontal_middle_red_terracotta"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.RED_TERRACOTTA))
    );
    public static final Item HORIZONTAL_MIDDLE_RED_TERRACOTTA_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "horizontal_middle_red_terracotta"),
        new BlockItem(HORIZONTAL_MIDDLE_RED_TERRACOTTA, new Item.Settings())
    );
    
    public static final Block HORIZONTAL_MIDDLE_BLACK_TERRACOTTA = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "horizontal_middle_black_terracotta"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.BLACK_TERRACOTTA))
    );
    public static final Item HORIZONTAL_MIDDLE_BLACK_TERRACOTTA_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "horizontal_middle_black_terracotta"),
        new BlockItem(HORIZONTAL_MIDDLE_BLACK_TERRACOTTA, new Item.Settings())
    );
    
    public static final Block HORIZONTAL_MIDDLE_WHITE_CONCRETE = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "horizontal_middle_white_concrete"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.WHITE_CONCRETE))
    );
    public static final Item HORIZONTAL_MIDDLE_WHITE_CONCRETE_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "horizontal_middle_white_concrete"),
        new BlockItem(HORIZONTAL_MIDDLE_WHITE_CONCRETE, new Item.Settings())
    );
    
    public static final Block HORIZONTAL_MIDDLE_ORANGE_CONCRETE = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "horizontal_middle_orange_concrete"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.ORANGE_CONCRETE))
    );
    public static final Item HORIZONTAL_MIDDLE_ORANGE_CONCRETE_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "horizontal_middle_orange_concrete"),
        new BlockItem(HORIZONTAL_MIDDLE_ORANGE_CONCRETE, new Item.Settings())
    );
    
    public static final Block HORIZONTAL_MIDDLE_MAGENTA_CONCRETE = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "horizontal_middle_magenta_concrete"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.MAGENTA_CONCRETE))
    );
    public static final Item HORIZONTAL_MIDDLE_MAGENTA_CONCRETE_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "horizontal_middle_magenta_concrete"),
        new BlockItem(HORIZONTAL_MIDDLE_MAGENTA_CONCRETE, new Item.Settings())
    );
    
    public static final Block HORIZONTAL_MIDDLE_LIGHT_BLUE_CONCRETE = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "horizontal_middle_light_blue_concrete"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.LIGHT_BLUE_CONCRETE))
    );
    public static final Item HORIZONTAL_MIDDLE_LIGHT_BLUE_CONCRETE_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "horizontal_middle_light_blue_concrete"),
        new BlockItem(HORIZONTAL_MIDDLE_LIGHT_BLUE_CONCRETE, new Item.Settings())
    );
    
    public static final Block HORIZONTAL_MIDDLE_YELLOW_CONCRETE = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "horizontal_middle_yellow_concrete"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.YELLOW_CONCRETE))
    );
    public static final Item HORIZONTAL_MIDDLE_YELLOW_CONCRETE_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "horizontal_middle_yellow_concrete"),
        new BlockItem(HORIZONTAL_MIDDLE_YELLOW_CONCRETE, new Item.Settings())
    );
    
    public static final Block HORIZONTAL_MIDDLE_LIME_CONCRETE = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "horizontal_middle_lime_concrete"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.LIME_CONCRETE))
    );
    public static final Item HORIZONTAL_MIDDLE_LIME_CONCRETE_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "horizontal_middle_lime_concrete"),
        new BlockItem(HORIZONTAL_MIDDLE_LIME_CONCRETE, new Item.Settings())
    );
    
    public static final Block HORIZONTAL_MIDDLE_PINK_CONCRETE = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "horizontal_middle_pink_concrete"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.PINK_CONCRETE))
    );
    public static final Item HORIZONTAL_MIDDLE_PINK_CONCRETE_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "horizontal_middle_pink_concrete"),
        new BlockItem(HORIZONTAL_MIDDLE_PINK_CONCRETE, new Item.Settings())
    );
    
    public static final Block HORIZONTAL_MIDDLE_GRAY_CONCRETE = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "horizontal_middle_gray_concrete"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.GRAY_CONCRETE))
    );
    public static final Item HORIZONTAL_MIDDLE_GRAY_CONCRETE_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "horizontal_middle_gray_concrete"),
        new BlockItem(HORIZONTAL_MIDDLE_GRAY_CONCRETE, new Item.Settings())
    );
    
    public static final Block HORIZONTAL_MIDDLE_LIGHT_GRAY_CONCRETE = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "horizontal_middle_light_gray_concrete"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.LIGHT_GRAY_CONCRETE))
    );
    public static final Item HORIZONTAL_MIDDLE_LIGHT_GRAY_CONCRETE_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "horizontal_middle_light_gray_concrete"),
        new BlockItem(HORIZONTAL_MIDDLE_LIGHT_GRAY_CONCRETE, new Item.Settings())
    );
    
    public static final Block HORIZONTAL_MIDDLE_CYAN_CONCRETE = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "horizontal_middle_cyan_concrete"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.CYAN_CONCRETE))
    );
    public static final Item HORIZONTAL_MIDDLE_CYAN_CONCRETE_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "horizontal_middle_cyan_concrete"),
        new BlockItem(HORIZONTAL_MIDDLE_CYAN_CONCRETE, new Item.Settings())
    );
    
    public static final Block HORIZONTAL_MIDDLE_PURPLE_CONCRETE = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "horizontal_middle_purple_concrete"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.PURPLE_CONCRETE))
    );
    public static final Item HORIZONTAL_MIDDLE_PURPLE_CONCRETE_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "horizontal_middle_purple_concrete"),
        new BlockItem(HORIZONTAL_MIDDLE_PURPLE_CONCRETE, new Item.Settings())
    );
    
    public static final Block HORIZONTAL_MIDDLE_BLUE_CONCRETE = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "horizontal_middle_blue_concrete"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.BLUE_CONCRETE))
    );
    public static final Item HORIZONTAL_MIDDLE_BLUE_CONCRETE_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "horizontal_middle_blue_concrete"),
        new BlockItem(HORIZONTAL_MIDDLE_BLUE_CONCRETE, new Item.Settings())
    );
    
    public static final Block HORIZONTAL_MIDDLE_BROWN_CONCRETE = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "horizontal_middle_brown_concrete"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.BROWN_CONCRETE))
    );
    public static final Item HORIZONTAL_MIDDLE_BROWN_CONCRETE_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "horizontal_middle_brown_concrete"),
        new BlockItem(HORIZONTAL_MIDDLE_BROWN_CONCRETE, new Item.Settings())
    );
    
    public static final Block HORIZONTAL_MIDDLE_GREEN_CONCRETE = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "horizontal_middle_green_concrete"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.GREEN_CONCRETE))
    );
    public static final Item HORIZONTAL_MIDDLE_GREEN_CONCRETE_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "horizontal_middle_green_concrete"),
        new BlockItem(HORIZONTAL_MIDDLE_GREEN_CONCRETE, new Item.Settings())
    );
    
    public static final Block HORIZONTAL_MIDDLE_RED_CONCRETE = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "horizontal_middle_red_concrete"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.RED_CONCRETE))
    );
    public static final Item HORIZONTAL_MIDDLE_RED_CONCRETE_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "horizontal_middle_red_concrete"),
        new BlockItem(HORIZONTAL_MIDDLE_RED_CONCRETE, new Item.Settings())
    );
    
    public static final Block HORIZONTAL_MIDDLE_BLACK_CONCRETE = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "horizontal_middle_black_concrete"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.BLACK_CONCRETE))
    );
    public static final Item HORIZONTAL_MIDDLE_BLACK_CONCRETE_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "horizontal_middle_black_concrete"),
        new BlockItem(HORIZONTAL_MIDDLE_BLACK_CONCRETE, new Item.Settings())
    );
    
    public static final Block HORIZONTAL_BOTTOM_WHITE_TERRACOTTA = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "horizontal_bottom_white_terracotta"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.WHITE_TERRACOTTA))
    );
    public static final Item HORIZONTAL_BOTTOM_WHITE_TERRACOTTA_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "horizontal_bottom_white_terracotta"),
        new BlockItem(HORIZONTAL_BOTTOM_WHITE_TERRACOTTA, new Item.Settings())
    );
    
    public static final Block HORIZONTAL_BOTTOM_ORANGE_TERRACOTTA = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "horizontal_bottom_orange_terracotta"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.ORANGE_TERRACOTTA))
    );
    public static final Item HORIZONTAL_BOTTOM_ORANGE_TERRACOTTA_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "horizontal_bottom_orange_terracotta"),
        new BlockItem(HORIZONTAL_BOTTOM_ORANGE_TERRACOTTA, new Item.Settings())
    );
    
    public static final Block HORIZONTAL_BOTTOM_MAGENTA_TERRACOTTA = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "horizontal_bottom_magenta_terracotta"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.MAGENTA_TERRACOTTA))
    );
    public static final Item HORIZONTAL_BOTTOM_MAGENTA_TERRACOTTA_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "horizontal_bottom_magenta_terracotta"),
        new BlockItem(HORIZONTAL_BOTTOM_MAGENTA_TERRACOTTA, new Item.Settings())
    );
    
    public static final Block HORIZONTAL_BOTTOM_LIGHT_BLUE_TERRACOTTA = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "horizontal_bottom_light_blue_terracotta"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.LIGHT_BLUE_TERRACOTTA))
    );
    public static final Item HORIZONTAL_BOTTOM_LIGHT_BLUE_TERRACOTTA_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "horizontal_bottom_light_blue_terracotta"),
        new BlockItem(HORIZONTAL_BOTTOM_LIGHT_BLUE_TERRACOTTA, new Item.Settings())
    );
    
    public static final Block HORIZONTAL_BOTTOM_YELLOW_TERRACOTTA = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "horizontal_bottom_yellow_terracotta"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.YELLOW_TERRACOTTA))
    );
    public static final Item HORIZONTAL_BOTTOM_YELLOW_TERRACOTTA_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "horizontal_bottom_yellow_terracotta"),
        new BlockItem(HORIZONTAL_BOTTOM_YELLOW_TERRACOTTA, new Item.Settings())
    );
    
    public static final Block HORIZONTAL_BOTTOM_LIME_TERRACOTTA = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "horizontal_bottom_lime_terracotta"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.LIME_TERRACOTTA))
    );
    public static final Item HORIZONTAL_BOTTOM_LIME_TERRACOTTA_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "horizontal_bottom_lime_terracotta"),
        new BlockItem(HORIZONTAL_BOTTOM_LIME_TERRACOTTA, new Item.Settings())
    );
    
    public static final Block HORIZONTAL_BOTTOM_PINK_TERRACOTTA = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "horizontal_bottom_pink_terracotta"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.PINK_TERRACOTTA))
    );
    public static final Item HORIZONTAL_BOTTOM_PINK_TERRACOTTA_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "horizontal_bottom_pink_terracotta"),
        new BlockItem(HORIZONTAL_BOTTOM_PINK_TERRACOTTA, new Item.Settings())
    );
    
    public static final Block HORIZONTAL_BOTTOM_GRAY_TERRACOTTA = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "horizontal_bottom_gray_terracotta"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.GRAY_TERRACOTTA))
    );
    public static final Item HORIZONTAL_BOTTOM_GRAY_TERRACOTTA_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "horizontal_bottom_gray_terracotta"),
        new BlockItem(HORIZONTAL_BOTTOM_GRAY_TERRACOTTA, new Item.Settings())
    );
    
    public static final Block HORIZONTAL_BOTTOM_LIGHT_GRAY_TERRACOTTA = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "horizontal_bottom_light_gray_terracotta"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.LIGHT_GRAY_TERRACOTTA))
    );
    public static final Item HORIZONTAL_BOTTOM_LIGHT_GRAY_TERRACOTTA_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "horizontal_bottom_light_gray_terracotta"),
        new BlockItem(HORIZONTAL_BOTTOM_LIGHT_GRAY_TERRACOTTA, new Item.Settings())
    );
    
    public static final Block HORIZONTAL_BOTTOM_CYAN_TERRACOTTA = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "horizontal_bottom_cyan_terracotta"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.CYAN_TERRACOTTA))
    );
    public static final Item HORIZONTAL_BOTTOM_CYAN_TERRACOTTA_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "horizontal_bottom_cyan_terracotta"),
        new BlockItem(HORIZONTAL_BOTTOM_CYAN_TERRACOTTA, new Item.Settings())
    );
    
    public static final Block HORIZONTAL_BOTTOM_PURPLE_TERRACOTTA = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "horizontal_bottom_purple_terracotta"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.PURPLE_TERRACOTTA))
    );
    public static final Item HORIZONTAL_BOTTOM_PURPLE_TERRACOTTA_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "horizontal_bottom_purple_terracotta"),
        new BlockItem(HORIZONTAL_BOTTOM_PURPLE_TERRACOTTA, new Item.Settings())
    );
    
    public static final Block HORIZONTAL_BOTTOM_BLUE_TERRACOTTA = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "horizontal_bottom_blue_terracotta"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.BLUE_TERRACOTTA))
    );
    public static final Item HORIZONTAL_BOTTOM_BLUE_TERRACOTTA_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "horizontal_bottom_blue_terracotta"),
        new BlockItem(HORIZONTAL_BOTTOM_BLUE_TERRACOTTA, new Item.Settings())
    );
    
    public static final Block HORIZONTAL_BOTTOM_BROWN_TERRACOTTA = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "horizontal_bottom_brown_terracotta"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.BROWN_TERRACOTTA))
    );
    public static final Item HORIZONTAL_BOTTOM_BROWN_TERRACOTTA_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "horizontal_bottom_brown_terracotta"),
        new BlockItem(HORIZONTAL_BOTTOM_BROWN_TERRACOTTA, new Item.Settings())
    );
    
    public static final Block HORIZONTAL_BOTTOM_GREEN_TERRACOTTA = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "horizontal_bottom_green_terracotta"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.GREEN_TERRACOTTA))
    );
    public static final Item HORIZONTAL_BOTTOM_GREEN_TERRACOTTA_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "horizontal_bottom_green_terracotta"),
        new BlockItem(HORIZONTAL_BOTTOM_GREEN_TERRACOTTA, new Item.Settings())
    );
    
    public static final Block HORIZONTAL_BOTTOM_RED_TERRACOTTA = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "horizontal_bottom_red_terracotta"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.RED_TERRACOTTA))
    );
    public static final Item HORIZONTAL_BOTTOM_RED_TERRACOTTA_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "horizontal_bottom_red_terracotta"),
        new BlockItem(HORIZONTAL_BOTTOM_RED_TERRACOTTA, new Item.Settings())
    );
    
    public static final Block HORIZONTAL_BOTTOM_BLACK_TERRACOTTA = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "horizontal_bottom_black_terracotta"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.BLACK_TERRACOTTA))
    );
    public static final Item HORIZONTAL_BOTTOM_BLACK_TERRACOTTA_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "horizontal_bottom_black_terracotta"),
        new BlockItem(HORIZONTAL_BOTTOM_BLACK_TERRACOTTA, new Item.Settings())
    );
    
    public static final Block HORIZONTAL_BOTTOM_WHITE_CONCRETE = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "horizontal_bottom_white_concrete"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.WHITE_CONCRETE))
    );
    public static final Item HORIZONTAL_BOTTOM_WHITE_CONCRETE_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "horizontal_bottom_white_concrete"),
        new BlockItem(HORIZONTAL_BOTTOM_WHITE_CONCRETE, new Item.Settings())
    );
    
    public static final Block HORIZONTAL_BOTTOM_ORANGE_CONCRETE = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "horizontal_bottom_orange_concrete"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.ORANGE_CONCRETE))
    );
    public static final Item HORIZONTAL_BOTTOM_ORANGE_CONCRETE_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "horizontal_bottom_orange_concrete"),
        new BlockItem(HORIZONTAL_BOTTOM_ORANGE_CONCRETE, new Item.Settings())
    );
    
    public static final Block HORIZONTAL_BOTTOM_MAGENTA_CONCRETE = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "horizontal_bottom_magenta_concrete"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.MAGENTA_CONCRETE))
    );
    public static final Item HORIZONTAL_BOTTOM_MAGENTA_CONCRETE_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "horizontal_bottom_magenta_concrete"),
        new BlockItem(HORIZONTAL_BOTTOM_MAGENTA_CONCRETE, new Item.Settings())
    );
    
    public static final Block HORIZONTAL_BOTTOM_LIGHT_BLUE_CONCRETE = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "horizontal_bottom_light_blue_concrete"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.LIGHT_BLUE_CONCRETE))
    );
    public static final Item HORIZONTAL_BOTTOM_LIGHT_BLUE_CONCRETE_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "horizontal_bottom_light_blue_concrete"),
        new BlockItem(HORIZONTAL_BOTTOM_LIGHT_BLUE_CONCRETE, new Item.Settings())
    );
    
    public static final Block HORIZONTAL_BOTTOM_YELLOW_CONCRETE = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "horizontal_bottom_yellow_concrete"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.YELLOW_CONCRETE))
    );
    public static final Item HORIZONTAL_BOTTOM_YELLOW_CONCRETE_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "horizontal_bottom_yellow_concrete"),
        new BlockItem(HORIZONTAL_BOTTOM_YELLOW_CONCRETE, new Item.Settings())
    );
    
    public static final Block HORIZONTAL_BOTTOM_LIME_CONCRETE = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "horizontal_bottom_lime_concrete"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.LIME_CONCRETE))
    );
    public static final Item HORIZONTAL_BOTTOM_LIME_CONCRETE_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "horizontal_bottom_lime_concrete"),
        new BlockItem(HORIZONTAL_BOTTOM_LIME_CONCRETE, new Item.Settings())
    );
    
    public static final Block HORIZONTAL_BOTTOM_PINK_CONCRETE = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "horizontal_bottom_pink_concrete"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.PINK_CONCRETE))
    );
    public static final Item HORIZONTAL_BOTTOM_PINK_CONCRETE_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "horizontal_bottom_pink_concrete"),
        new BlockItem(HORIZONTAL_BOTTOM_PINK_CONCRETE, new Item.Settings())
    );
    
    public static final Block HORIZONTAL_BOTTOM_GRAY_CONCRETE = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "horizontal_bottom_gray_concrete"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.GRAY_CONCRETE))
    );
    public static final Item HORIZONTAL_BOTTOM_GRAY_CONCRETE_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "horizontal_bottom_gray_concrete"),
        new BlockItem(HORIZONTAL_BOTTOM_GRAY_CONCRETE, new Item.Settings())
    );
    
    public static final Block HORIZONTAL_BOTTOM_LIGHT_GRAY_CONCRETE = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "horizontal_bottom_light_gray_concrete"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.LIGHT_GRAY_CONCRETE))
    );
    public static final Item HORIZONTAL_BOTTOM_LIGHT_GRAY_CONCRETE_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "horizontal_bottom_light_gray_concrete"),
        new BlockItem(HORIZONTAL_BOTTOM_LIGHT_GRAY_CONCRETE, new Item.Settings())
    );
    
    public static final Block HORIZONTAL_BOTTOM_CYAN_CONCRETE = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "horizontal_bottom_cyan_concrete"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.CYAN_CONCRETE))
    );
    public static final Item HORIZONTAL_BOTTOM_CYAN_CONCRETE_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "horizontal_bottom_cyan_concrete"),
        new BlockItem(HORIZONTAL_BOTTOM_CYAN_CONCRETE, new Item.Settings())
    );
    
    public static final Block HORIZONTAL_BOTTOM_PURPLE_CONCRETE = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "horizontal_bottom_purple_concrete"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.PURPLE_CONCRETE))
    );
    public static final Item HORIZONTAL_BOTTOM_PURPLE_CONCRETE_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "horizontal_bottom_purple_concrete"),
        new BlockItem(HORIZONTAL_BOTTOM_PURPLE_CONCRETE, new Item.Settings())
    );
    
    public static final Block HORIZONTAL_BOTTOM_BLUE_CONCRETE = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "horizontal_bottom_blue_concrete"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.BLUE_CONCRETE))
    );
    public static final Item HORIZONTAL_BOTTOM_BLUE_CONCRETE_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "horizontal_bottom_blue_concrete"),
        new BlockItem(HORIZONTAL_BOTTOM_BLUE_CONCRETE, new Item.Settings())
    );
    
    public static final Block HORIZONTAL_BOTTOM_BROWN_CONCRETE = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "horizontal_bottom_brown_concrete"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.BROWN_CONCRETE))
    );
    public static final Item HORIZONTAL_BOTTOM_BROWN_CONCRETE_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "horizontal_bottom_brown_concrete"),
        new BlockItem(HORIZONTAL_BOTTOM_BROWN_CONCRETE, new Item.Settings())
    );
    
    public static final Block HORIZONTAL_BOTTOM_GREEN_CONCRETE = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "horizontal_bottom_green_concrete"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.GREEN_CONCRETE))
    );
    public static final Item HORIZONTAL_BOTTOM_GREEN_CONCRETE_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "horizontal_bottom_green_concrete"),
        new BlockItem(HORIZONTAL_BOTTOM_GREEN_CONCRETE, new Item.Settings())
    );
    
    public static final Block HORIZONTAL_BOTTOM_RED_CONCRETE = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "horizontal_bottom_red_concrete"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.RED_CONCRETE))
    );
    public static final Item HORIZONTAL_BOTTOM_RED_CONCRETE_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "horizontal_bottom_red_concrete"),
        new BlockItem(HORIZONTAL_BOTTOM_RED_CONCRETE, new Item.Settings())
    );
    
    public static final Block HORIZONTAL_BOTTOM_BLACK_CONCRETE = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "horizontal_bottom_black_concrete"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.BLACK_CONCRETE))
    );
    public static final Item HORIZONTAL_BOTTOM_BLACK_CONCRETE_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "horizontal_bottom_black_concrete"),
        new BlockItem(HORIZONTAL_BOTTOM_BLACK_CONCRETE, new Item.Settings())
    );
    
    public static final Block CROSS_WHITE_TERRACOTTA = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "cross_white_terracotta"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.WHITE_TERRACOTTA))
    );
    public static final Item CROSS_WHITE_TERRACOTTA_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "cross_white_terracotta"),
        new BlockItem(CROSS_WHITE_TERRACOTTA, new Item.Settings())
    );
    
    public static final Block CROSS_ORANGE_TERRACOTTA = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "cross_orange_terracotta"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.ORANGE_TERRACOTTA))
    );
    public static final Item CROSS_ORANGE_TERRACOTTA_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "cross_orange_terracotta"),
        new BlockItem(CROSS_ORANGE_TERRACOTTA, new Item.Settings())
    );
    
    public static final Block CROSS_MAGENTA_TERRACOTTA = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "cross_magenta_terracotta"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.MAGENTA_TERRACOTTA))
    );
    public static final Item CROSS_MAGENTA_TERRACOTTA_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "cross_magenta_terracotta"),
        new BlockItem(CROSS_MAGENTA_TERRACOTTA, new Item.Settings())
    );
    
    public static final Block CROSS_LIGHT_BLUE_TERRACOTTA = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "cross_light_blue_terracotta"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.LIGHT_BLUE_TERRACOTTA))
    );
    public static final Item CROSS_LIGHT_BLUE_TERRACOTTA_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "cross_light_blue_terracotta"),
        new BlockItem(CROSS_LIGHT_BLUE_TERRACOTTA, new Item.Settings())
    );
    
    public static final Block CROSS_YELLOW_TERRACOTTA = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "cross_yellow_terracotta"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.YELLOW_TERRACOTTA))
    );
    public static final Item CROSS_YELLOW_TERRACOTTA_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "cross_yellow_terracotta"),
        new BlockItem(CROSS_YELLOW_TERRACOTTA, new Item.Settings())
    );
    
    public static final Block CROSS_LIME_TERRACOTTA = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "cross_lime_terracotta"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.LIME_TERRACOTTA))
    );
    public static final Item CROSS_LIME_TERRACOTTA_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "cross_lime_terracotta"),
        new BlockItem(CROSS_LIME_TERRACOTTA, new Item.Settings())
    );
    
    public static final Block CROSS_PINK_TERRACOTTA = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "cross_pink_terracotta"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.PINK_TERRACOTTA))
    );
    public static final Item CROSS_PINK_TERRACOTTA_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "cross_pink_terracotta"),
        new BlockItem(CROSS_PINK_TERRACOTTA, new Item.Settings())
    );
    
    public static final Block CROSS_GRAY_TERRACOTTA = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "cross_gray_terracotta"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.GRAY_TERRACOTTA))
    );
    public static final Item CROSS_GRAY_TERRACOTTA_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "cross_gray_terracotta"),
        new BlockItem(CROSS_GRAY_TERRACOTTA, new Item.Settings())
    );
    
    public static final Block CROSS_LIGHT_GRAY_TERRACOTTA = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "cross_light_gray_terracotta"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.LIGHT_GRAY_TERRACOTTA))
    );
    public static final Item CROSS_LIGHT_GRAY_TERRACOTTA_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "cross_light_gray_terracotta"),
        new BlockItem(CROSS_LIGHT_GRAY_TERRACOTTA, new Item.Settings())
    );
    
    public static final Block CROSS_CYAN_TERRACOTTA = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "cross_cyan_terracotta"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.CYAN_TERRACOTTA))
    );
    public static final Item CROSS_CYAN_TERRACOTTA_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "cross_cyan_terracotta"),
        new BlockItem(CROSS_CYAN_TERRACOTTA, new Item.Settings())
    );
    
    public static final Block CROSS_PURPLE_TERRACOTTA = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "cross_purple_terracotta"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.PURPLE_TERRACOTTA))
    );
    public static final Item CROSS_PURPLE_TERRACOTTA_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "cross_purple_terracotta"),
        new BlockItem(CROSS_PURPLE_TERRACOTTA, new Item.Settings())
    );
    
    public static final Block CROSS_BLUE_TERRACOTTA = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "cross_blue_terracotta"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.BLUE_TERRACOTTA))
    );
    public static final Item CROSS_BLUE_TERRACOTTA_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "cross_blue_terracotta"),
        new BlockItem(CROSS_BLUE_TERRACOTTA, new Item.Settings())
    );
    
    public static final Block CROSS_BROWN_TERRACOTTA = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "cross_brown_terracotta"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.BROWN_TERRACOTTA))
    );
    public static final Item CROSS_BROWN_TERRACOTTA_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "cross_brown_terracotta"),
        new BlockItem(CROSS_BROWN_TERRACOTTA, new Item.Settings())
    );
    
    public static final Block CROSS_GREEN_TERRACOTTA = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "cross_green_terracotta"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.GREEN_TERRACOTTA))
    );
    public static final Item CROSS_GREEN_TERRACOTTA_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "cross_green_terracotta"),
        new BlockItem(CROSS_GREEN_TERRACOTTA, new Item.Settings())
    );
    
    public static final Block CROSS_RED_TERRACOTTA = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "cross_red_terracotta"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.RED_TERRACOTTA))
    );
    public static final Item CROSS_RED_TERRACOTTA_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "cross_red_terracotta"),
        new BlockItem(CROSS_RED_TERRACOTTA, new Item.Settings())
    );
    
    public static final Block CROSS_BLACK_TERRACOTTA = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "cross_black_terracotta"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.BLACK_TERRACOTTA))
    );
    public static final Item CROSS_BLACK_TERRACOTTA_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "cross_black_terracotta"),
        new BlockItem(CROSS_BLACK_TERRACOTTA, new Item.Settings())
    );
    
    public static final Block CROSS_WHITE_CONCRETE = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "cross_white_concrete"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.WHITE_CONCRETE))
    );
    public static final Item CROSS_WHITE_CONCRETE_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "cross_white_concrete"),
        new BlockItem(CROSS_WHITE_CONCRETE, new Item.Settings())
    );
    
    public static final Block CROSS_ORANGE_CONCRETE = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "cross_orange_concrete"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.ORANGE_CONCRETE))
    );
    public static final Item CROSS_ORANGE_CONCRETE_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "cross_orange_concrete"),
        new BlockItem(CROSS_ORANGE_CONCRETE, new Item.Settings())
    );
    
    public static final Block CROSS_MAGENTA_CONCRETE = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "cross_magenta_concrete"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.MAGENTA_CONCRETE))
    );
    public static final Item CROSS_MAGENTA_CONCRETE_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "cross_magenta_concrete"),
        new BlockItem(CROSS_MAGENTA_CONCRETE, new Item.Settings())
    );
    
    public static final Block CROSS_LIGHT_BLUE_CONCRETE = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "cross_light_blue_concrete"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.LIGHT_BLUE_CONCRETE))
    );
    public static final Item CROSS_LIGHT_BLUE_CONCRETE_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "cross_light_blue_concrete"),
        new BlockItem(CROSS_LIGHT_BLUE_CONCRETE, new Item.Settings())
    );
    
    public static final Block CROSS_YELLOW_CONCRETE = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "cross_yellow_concrete"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.YELLOW_CONCRETE))
    );
    public static final Item CROSS_YELLOW_CONCRETE_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "cross_yellow_concrete"),
        new BlockItem(CROSS_YELLOW_CONCRETE, new Item.Settings())
    );
    
    public static final Block CROSS_LIME_CONCRETE = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "cross_lime_concrete"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.LIME_CONCRETE))
    );
    public static final Item CROSS_LIME_CONCRETE_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "cross_lime_concrete"),
        new BlockItem(CROSS_LIME_CONCRETE, new Item.Settings())
    );
    
    public static final Block CROSS_PINK_CONCRETE = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "cross_pink_concrete"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.PINK_CONCRETE))
    );
    public static final Item CROSS_PINK_CONCRETE_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "cross_pink_concrete"),
        new BlockItem(CROSS_PINK_CONCRETE, new Item.Settings())
    );
    
    public static final Block CROSS_GRAY_CONCRETE = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "cross_gray_concrete"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.GRAY_CONCRETE))
    );
    public static final Item CROSS_GRAY_CONCRETE_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "cross_gray_concrete"),
        new BlockItem(CROSS_GRAY_CONCRETE, new Item.Settings())
    );
    
    public static final Block CROSS_LIGHT_GRAY_CONCRETE = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "cross_light_gray_concrete"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.LIGHT_GRAY_CONCRETE))
    );
    public static final Item CROSS_LIGHT_GRAY_CONCRETE_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "cross_light_gray_concrete"),
        new BlockItem(CROSS_LIGHT_GRAY_CONCRETE, new Item.Settings())
    );
    
    public static final Block CROSS_CYAN_CONCRETE = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "cross_cyan_concrete"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.CYAN_CONCRETE))
    );
    public static final Item CROSS_CYAN_CONCRETE_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "cross_cyan_concrete"),
        new BlockItem(CROSS_CYAN_CONCRETE, new Item.Settings())
    );
    
    public static final Block CROSS_PURPLE_CONCRETE = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "cross_purple_concrete"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.PURPLE_CONCRETE))
    );
    public static final Item CROSS_PURPLE_CONCRETE_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "cross_purple_concrete"),
        new BlockItem(CROSS_PURPLE_CONCRETE, new Item.Settings())
    );
    
    public static final Block CROSS_BLUE_CONCRETE = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "cross_blue_concrete"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.BLUE_CONCRETE))
    );
    public static final Item CROSS_BLUE_CONCRETE_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "cross_blue_concrete"),
        new BlockItem(CROSS_BLUE_CONCRETE, new Item.Settings())
    );
    
    public static final Block CROSS_BROWN_CONCRETE = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "cross_brown_concrete"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.BROWN_CONCRETE))
    );
    public static final Item CROSS_BROWN_CONCRETE_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "cross_brown_concrete"),
        new BlockItem(CROSS_BROWN_CONCRETE, new Item.Settings())
    );
    
    public static final Block CROSS_GREEN_CONCRETE = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "cross_green_concrete"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.GREEN_CONCRETE))
    );
    public static final Item CROSS_GREEN_CONCRETE_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "cross_green_concrete"),
        new BlockItem(CROSS_GREEN_CONCRETE, new Item.Settings())
    );
    
    public static final Block CROSS_RED_CONCRETE = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "cross_red_concrete"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.RED_CONCRETE))
    );
    public static final Item CROSS_RED_CONCRETE_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "cross_red_concrete"),
        new BlockItem(CROSS_RED_CONCRETE, new Item.Settings())
    );
    
    public static final Block CROSS_BLACK_CONCRETE = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "cross_black_concrete"),
        new HorizontalFacingBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.BLACK_CONCRETE))
    );
    public static final Item CROSS_BLACK_CONCRETE_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "cross_black_concrete"),
        new BlockItem(CROSS_BLACK_CONCRETE, new Item.Settings())
    );
    
    @Override
    public void onInitialize() {
        // Add all blocks to building blocks item group
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(VERTICAL_LEFT_WHITE_TERRACOTTA_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(VERTICAL_LEFT_ORANGE_TERRACOTTA_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(VERTICAL_LEFT_MAGENTA_TERRACOTTA_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(VERTICAL_LEFT_LIGHT_BLUE_TERRACOTTA_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(VERTICAL_LEFT_YELLOW_TERRACOTTA_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(VERTICAL_LEFT_LIME_TERRACOTTA_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(VERTICAL_LEFT_PINK_TERRACOTTA_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(VERTICAL_LEFT_GRAY_TERRACOTTA_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(VERTICAL_LEFT_LIGHT_GRAY_TERRACOTTA_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(VERTICAL_LEFT_CYAN_TERRACOTTA_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(VERTICAL_LEFT_PURPLE_TERRACOTTA_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(VERTICAL_LEFT_BLUE_TERRACOTTA_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(VERTICAL_LEFT_BROWN_TERRACOTTA_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(VERTICAL_LEFT_GREEN_TERRACOTTA_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(VERTICAL_LEFT_RED_TERRACOTTA_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(VERTICAL_LEFT_BLACK_TERRACOTTA_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(VERTICAL_LEFT_WHITE_CONCRETE_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(VERTICAL_LEFT_ORANGE_CONCRETE_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(VERTICAL_LEFT_MAGENTA_CONCRETE_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(VERTICAL_LEFT_LIGHT_BLUE_CONCRETE_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(VERTICAL_LEFT_YELLOW_CONCRETE_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(VERTICAL_LEFT_LIME_CONCRETE_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(VERTICAL_LEFT_PINK_CONCRETE_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(VERTICAL_LEFT_GRAY_CONCRETE_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(VERTICAL_LEFT_LIGHT_GRAY_CONCRETE_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(VERTICAL_LEFT_CYAN_CONCRETE_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(VERTICAL_LEFT_PURPLE_CONCRETE_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(VERTICAL_LEFT_BLUE_CONCRETE_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(VERTICAL_LEFT_BROWN_CONCRETE_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(VERTICAL_LEFT_GREEN_CONCRETE_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(VERTICAL_LEFT_RED_CONCRETE_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(VERTICAL_LEFT_BLACK_CONCRETE_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(VERTICAL_RIGHT_WHITE_TERRACOTTA_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(VERTICAL_RIGHT_ORANGE_TERRACOTTA_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(VERTICAL_RIGHT_MAGENTA_TERRACOTTA_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(VERTICAL_RIGHT_LIGHT_BLUE_TERRACOTTA_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(VERTICAL_RIGHT_YELLOW_TERRACOTTA_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(VERTICAL_RIGHT_LIME_TERRACOTTA_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(VERTICAL_RIGHT_PINK_TERRACOTTA_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(VERTICAL_RIGHT_GRAY_TERRACOTTA_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(VERTICAL_RIGHT_LIGHT_GRAY_TERRACOTTA_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(VERTICAL_RIGHT_CYAN_TERRACOTTA_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(VERTICAL_RIGHT_PURPLE_TERRACOTTA_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(VERTICAL_RIGHT_BLUE_TERRACOTTA_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(VERTICAL_RIGHT_BROWN_TERRACOTTA_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(VERTICAL_RIGHT_GREEN_TERRACOTTA_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(VERTICAL_RIGHT_RED_TERRACOTTA_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(VERTICAL_RIGHT_BLACK_TERRACOTTA_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(VERTICAL_RIGHT_WHITE_CONCRETE_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(VERTICAL_RIGHT_ORANGE_CONCRETE_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(VERTICAL_RIGHT_MAGENTA_CONCRETE_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(VERTICAL_RIGHT_LIGHT_BLUE_CONCRETE_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(VERTICAL_RIGHT_YELLOW_CONCRETE_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(VERTICAL_RIGHT_LIME_CONCRETE_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(VERTICAL_RIGHT_PINK_CONCRETE_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(VERTICAL_RIGHT_GRAY_CONCRETE_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(VERTICAL_RIGHT_LIGHT_GRAY_CONCRETE_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(VERTICAL_RIGHT_CYAN_CONCRETE_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(VERTICAL_RIGHT_PURPLE_CONCRETE_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(VERTICAL_RIGHT_BLUE_CONCRETE_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(VERTICAL_RIGHT_BROWN_CONCRETE_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(VERTICAL_RIGHT_GREEN_CONCRETE_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(VERTICAL_RIGHT_RED_CONCRETE_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(VERTICAL_RIGHT_BLACK_CONCRETE_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(VERTICAL_CENTER_WHITE_TERRACOTTA_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(VERTICAL_CENTER_ORANGE_TERRACOTTA_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(VERTICAL_CENTER_MAGENTA_TERRACOTTA_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(VERTICAL_CENTER_LIGHT_BLUE_TERRACOTTA_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(VERTICAL_CENTER_YELLOW_TERRACOTTA_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(VERTICAL_CENTER_LIME_TERRACOTTA_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(VERTICAL_CENTER_PINK_TERRACOTTA_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(VERTICAL_CENTER_GRAY_TERRACOTTA_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(VERTICAL_CENTER_LIGHT_GRAY_TERRACOTTA_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(VERTICAL_CENTER_CYAN_TERRACOTTA_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(VERTICAL_CENTER_PURPLE_TERRACOTTA_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(VERTICAL_CENTER_BLUE_TERRACOTTA_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(VERTICAL_CENTER_BROWN_TERRACOTTA_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(VERTICAL_CENTER_GREEN_TERRACOTTA_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(VERTICAL_CENTER_RED_TERRACOTTA_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(VERTICAL_CENTER_BLACK_TERRACOTTA_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(VERTICAL_CENTER_WHITE_CONCRETE_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(VERTICAL_CENTER_ORANGE_CONCRETE_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(VERTICAL_CENTER_MAGENTA_CONCRETE_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(VERTICAL_CENTER_LIGHT_BLUE_CONCRETE_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(VERTICAL_CENTER_YELLOW_CONCRETE_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(VERTICAL_CENTER_LIME_CONCRETE_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(VERTICAL_CENTER_PINK_CONCRETE_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(VERTICAL_CENTER_GRAY_CONCRETE_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(VERTICAL_CENTER_LIGHT_GRAY_CONCRETE_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(VERTICAL_CENTER_CYAN_CONCRETE_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(VERTICAL_CENTER_PURPLE_CONCRETE_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(VERTICAL_CENTER_BLUE_CONCRETE_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(VERTICAL_CENTER_BROWN_CONCRETE_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(VERTICAL_CENTER_GREEN_CONCRETE_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(VERTICAL_CENTER_RED_CONCRETE_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(VERTICAL_CENTER_BLACK_CONCRETE_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(VERTICAL_MIDDLE_WHITE_TERRACOTTA_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(VERTICAL_MIDDLE_ORANGE_TERRACOTTA_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(VERTICAL_MIDDLE_MAGENTA_TERRACOTTA_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(VERTICAL_MIDDLE_LIGHT_BLUE_TERRACOTTA_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(VERTICAL_MIDDLE_YELLOW_TERRACOTTA_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(VERTICAL_MIDDLE_LIME_TERRACOTTA_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(VERTICAL_MIDDLE_PINK_TERRACOTTA_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(VERTICAL_MIDDLE_GRAY_TERRACOTTA_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(VERTICAL_MIDDLE_LIGHT_GRAY_TERRACOTTA_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(VERTICAL_MIDDLE_CYAN_TERRACOTTA_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(VERTICAL_MIDDLE_PURPLE_TERRACOTTA_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(VERTICAL_MIDDLE_BLUE_TERRACOTTA_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(VERTICAL_MIDDLE_BROWN_TERRACOTTA_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(VERTICAL_MIDDLE_GREEN_TERRACOTTA_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(VERTICAL_MIDDLE_RED_TERRACOTTA_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(VERTICAL_MIDDLE_BLACK_TERRACOTTA_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(VERTICAL_MIDDLE_WHITE_CONCRETE_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(VERTICAL_MIDDLE_ORANGE_CONCRETE_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(VERTICAL_MIDDLE_MAGENTA_CONCRETE_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(VERTICAL_MIDDLE_LIGHT_BLUE_CONCRETE_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(VERTICAL_MIDDLE_YELLOW_CONCRETE_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(VERTICAL_MIDDLE_LIME_CONCRETE_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(VERTICAL_MIDDLE_PINK_CONCRETE_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(VERTICAL_MIDDLE_GRAY_CONCRETE_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(VERTICAL_MIDDLE_LIGHT_GRAY_CONCRETE_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(VERTICAL_MIDDLE_CYAN_CONCRETE_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(VERTICAL_MIDDLE_PURPLE_CONCRETE_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(VERTICAL_MIDDLE_BLUE_CONCRETE_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(VERTICAL_MIDDLE_BROWN_CONCRETE_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(VERTICAL_MIDDLE_GREEN_CONCRETE_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(VERTICAL_MIDDLE_RED_CONCRETE_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(VERTICAL_MIDDLE_BLACK_CONCRETE_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(HORIZONTAL_TOP_WHITE_TERRACOTTA_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(HORIZONTAL_TOP_ORANGE_TERRACOTTA_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(HORIZONTAL_TOP_MAGENTA_TERRACOTTA_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(HORIZONTAL_TOP_LIGHT_BLUE_TERRACOTTA_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(HORIZONTAL_TOP_YELLOW_TERRACOTTA_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(HORIZONTAL_TOP_LIME_TERRACOTTA_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(HORIZONTAL_TOP_PINK_TERRACOTTA_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(HORIZONTAL_TOP_GRAY_TERRACOTTA_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(HORIZONTAL_TOP_LIGHT_GRAY_TERRACOTTA_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(HORIZONTAL_TOP_CYAN_TERRACOTTA_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(HORIZONTAL_TOP_PURPLE_TERRACOTTA_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(HORIZONTAL_TOP_BLUE_TERRACOTTA_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(HORIZONTAL_TOP_BROWN_TERRACOTTA_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(HORIZONTAL_TOP_GREEN_TERRACOTTA_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(HORIZONTAL_TOP_RED_TERRACOTTA_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(HORIZONTAL_TOP_BLACK_TERRACOTTA_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(HORIZONTAL_TOP_WHITE_CONCRETE_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(HORIZONTAL_TOP_ORANGE_CONCRETE_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(HORIZONTAL_TOP_MAGENTA_CONCRETE_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(HORIZONTAL_TOP_LIGHT_BLUE_CONCRETE_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(HORIZONTAL_TOP_YELLOW_CONCRETE_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(HORIZONTAL_TOP_LIME_CONCRETE_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(HORIZONTAL_TOP_PINK_CONCRETE_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(HORIZONTAL_TOP_GRAY_CONCRETE_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(HORIZONTAL_TOP_LIGHT_GRAY_CONCRETE_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(HORIZONTAL_TOP_CYAN_CONCRETE_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(HORIZONTAL_TOP_PURPLE_CONCRETE_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(HORIZONTAL_TOP_BLUE_CONCRETE_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(HORIZONTAL_TOP_BROWN_CONCRETE_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(HORIZONTAL_TOP_GREEN_CONCRETE_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(HORIZONTAL_TOP_RED_CONCRETE_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(HORIZONTAL_TOP_BLACK_CONCRETE_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(HORIZONTAL_MIDDLE_WHITE_TERRACOTTA_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(HORIZONTAL_MIDDLE_ORANGE_TERRACOTTA_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(HORIZONTAL_MIDDLE_MAGENTA_TERRACOTTA_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(HORIZONTAL_MIDDLE_LIGHT_BLUE_TERRACOTTA_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(HORIZONTAL_MIDDLE_YELLOW_TERRACOTTA_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(HORIZONTAL_MIDDLE_LIME_TERRACOTTA_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(HORIZONTAL_MIDDLE_PINK_TERRACOTTA_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(HORIZONTAL_MIDDLE_GRAY_TERRACOTTA_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(HORIZONTAL_MIDDLE_LIGHT_GRAY_TERRACOTTA_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(HORIZONTAL_MIDDLE_CYAN_TERRACOTTA_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(HORIZONTAL_MIDDLE_PURPLE_TERRACOTTA_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(HORIZONTAL_MIDDLE_BLUE_TERRACOTTA_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(HORIZONTAL_MIDDLE_BROWN_TERRACOTTA_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(HORIZONTAL_MIDDLE_GREEN_TERRACOTTA_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(HORIZONTAL_MIDDLE_RED_TERRACOTTA_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(HORIZONTAL_MIDDLE_BLACK_TERRACOTTA_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(HORIZONTAL_MIDDLE_WHITE_CONCRETE_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(HORIZONTAL_MIDDLE_ORANGE_CONCRETE_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(HORIZONTAL_MIDDLE_MAGENTA_CONCRETE_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(HORIZONTAL_MIDDLE_LIGHT_BLUE_CONCRETE_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(HORIZONTAL_MIDDLE_YELLOW_CONCRETE_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(HORIZONTAL_MIDDLE_LIME_CONCRETE_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(HORIZONTAL_MIDDLE_PINK_CONCRETE_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(HORIZONTAL_MIDDLE_GRAY_CONCRETE_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(HORIZONTAL_MIDDLE_LIGHT_GRAY_CONCRETE_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(HORIZONTAL_MIDDLE_CYAN_CONCRETE_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(HORIZONTAL_MIDDLE_PURPLE_CONCRETE_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(HORIZONTAL_MIDDLE_BLUE_CONCRETE_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(HORIZONTAL_MIDDLE_BROWN_CONCRETE_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(HORIZONTAL_MIDDLE_GREEN_CONCRETE_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(HORIZONTAL_MIDDLE_RED_CONCRETE_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(HORIZONTAL_MIDDLE_BLACK_CONCRETE_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(HORIZONTAL_BOTTOM_WHITE_TERRACOTTA_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(HORIZONTAL_BOTTOM_ORANGE_TERRACOTTA_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(HORIZONTAL_BOTTOM_MAGENTA_TERRACOTTA_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(HORIZONTAL_BOTTOM_LIGHT_BLUE_TERRACOTTA_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(HORIZONTAL_BOTTOM_YELLOW_TERRACOTTA_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(HORIZONTAL_BOTTOM_LIME_TERRACOTTA_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(HORIZONTAL_BOTTOM_PINK_TERRACOTTA_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(HORIZONTAL_BOTTOM_GRAY_TERRACOTTA_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(HORIZONTAL_BOTTOM_LIGHT_GRAY_TERRACOTTA_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(HORIZONTAL_BOTTOM_CYAN_TERRACOTTA_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(HORIZONTAL_BOTTOM_PURPLE_TERRACOTTA_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(HORIZONTAL_BOTTOM_BLUE_TERRACOTTA_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(HORIZONTAL_BOTTOM_BROWN_TERRACOTTA_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(HORIZONTAL_BOTTOM_GREEN_TERRACOTTA_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(HORIZONTAL_BOTTOM_RED_TERRACOTTA_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(HORIZONTAL_BOTTOM_BLACK_TERRACOTTA_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(HORIZONTAL_BOTTOM_WHITE_CONCRETE_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(HORIZONTAL_BOTTOM_ORANGE_CONCRETE_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(HORIZONTAL_BOTTOM_MAGENTA_CONCRETE_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(HORIZONTAL_BOTTOM_LIGHT_BLUE_CONCRETE_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(HORIZONTAL_BOTTOM_YELLOW_CONCRETE_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(HORIZONTAL_BOTTOM_LIME_CONCRETE_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(HORIZONTAL_BOTTOM_PINK_CONCRETE_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(HORIZONTAL_BOTTOM_GRAY_CONCRETE_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(HORIZONTAL_BOTTOM_LIGHT_GRAY_CONCRETE_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(HORIZONTAL_BOTTOM_CYAN_CONCRETE_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(HORIZONTAL_BOTTOM_PURPLE_CONCRETE_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(HORIZONTAL_BOTTOM_BLUE_CONCRETE_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(HORIZONTAL_BOTTOM_BROWN_CONCRETE_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(HORIZONTAL_BOTTOM_GREEN_CONCRETE_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(HORIZONTAL_BOTTOM_RED_CONCRETE_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(HORIZONTAL_BOTTOM_BLACK_CONCRETE_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(CROSS_WHITE_TERRACOTTA_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(CROSS_ORANGE_TERRACOTTA_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(CROSS_MAGENTA_TERRACOTTA_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(CROSS_LIGHT_BLUE_TERRACOTTA_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(CROSS_YELLOW_TERRACOTTA_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(CROSS_LIME_TERRACOTTA_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(CROSS_PINK_TERRACOTTA_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(CROSS_GRAY_TERRACOTTA_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(CROSS_LIGHT_GRAY_TERRACOTTA_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(CROSS_CYAN_TERRACOTTA_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(CROSS_PURPLE_TERRACOTTA_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(CROSS_BLUE_TERRACOTTA_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(CROSS_BROWN_TERRACOTTA_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(CROSS_GREEN_TERRACOTTA_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(CROSS_RED_TERRACOTTA_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(CROSS_BLACK_TERRACOTTA_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(CROSS_WHITE_CONCRETE_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(CROSS_ORANGE_CONCRETE_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(CROSS_MAGENTA_CONCRETE_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(CROSS_LIGHT_BLUE_CONCRETE_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(CROSS_YELLOW_CONCRETE_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(CROSS_LIME_CONCRETE_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(CROSS_PINK_CONCRETE_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(CROSS_GRAY_CONCRETE_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(CROSS_LIGHT_GRAY_CONCRETE_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(CROSS_CYAN_CONCRETE_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(CROSS_PURPLE_CONCRETE_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(CROSS_BLUE_CONCRETE_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(CROSS_BROWN_CONCRETE_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(CROSS_GREEN_CONCRETE_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(CROSS_RED_CONCRETE_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(CROSS_BLACK_CONCRETE_ITEM));
    }
}
