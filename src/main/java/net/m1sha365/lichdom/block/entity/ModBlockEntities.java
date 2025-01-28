package net.m1sha365.lichdom.block.entity;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.m1sha365.lichdom.Lichdom;
import net.m1sha365.lichdom.block.ModBlocks;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

import java.util.function.Function;

public class ModBlockEntities {
    private static BlockEntityType<AnimatedBlockEntity> register(String path, Block block) {
        final Identifier identifier = Identifier.of(Lichdom.MOD_ID, path);
        //final RegistryKey<Block> registryKey = RegistryKey.of(RegistryKeys.BLOCK, identifier);

        return Registry.register(Registries.BLOCK_ENTITY_TYPE, identifier,
                FabricBlockEntityTypeBuilder.create(AnimatedBlockEntity::new, block).build());
    }

    public static BlockEntityType<AnimatedBlockEntity> ANIMATED_BLOCK_ENTITY;

    public static void initialize() {
        ANIMATED_BLOCK_ENTITY = register("animated_block_entity", ModBlocks.ANIMATED_BLOCK);
    }
}