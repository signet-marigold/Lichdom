package net.m1sha365.lichdom.client;

import net.m1sha365.lichdom.client.renderer.block.FertilizerBlockRenderer;
import net.m1sha365.lichdom.client.renderer.block.GeckoHabitatBlockRenderer;
import net.m1sha365.lichdom.client.renderer.block.PhylacteryBlockRenderer;
import net.m1sha365.lichdom.client.renderer.entity.*;
import net.m1sha365.lichdom.registry.BlockEntityRegistry;
import net.m1sha365.lichdom.registry.EntityRegistry;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;

import java.util.function.BiConsumer;

public final class LichdomClient {
    public static void registerRenderers(BiConsumer<EntityType<? extends Entity>, EntityRendererProvider> entityRenderers,
                                         BiConsumer<BlockEntityType<? extends BlockEntity>, BlockEntityRendererProvider> blockEntityRenderers) {
        entityRenderers.accept(EntityRegistry.BAT.get(), BatRenderer::new);
        entityRenderers.accept(EntityRegistry.BIKE.get(), BikeRenderer::new);
        entityRenderers.accept(EntityRegistry.RACE_CAR.get(), RaceCarRenderer::new);
        entityRenderers.accept(EntityRegistry.PARASITE.get(), ParasiteRenderer::new);
        entityRenderers.accept(EntityRegistry.COOL_KID.get(), CoolKidRenderer::new);
        entityRenderers.accept(EntityRegistry.MUTANT_ZOMBIE.get(), MutantZombieRenderer::new);
        entityRenderers.accept(EntityRegistry.GREMLIN.get(), GremlinRenderer::new);
        entityRenderers.accept(EntityRegistry.FAKE_GLASS.get(), FakeGlassRenderer::new);

        entityRenderers.accept(EntityType.CREEPER, ReplacedCreeperRenderer::new);

        blockEntityRenderers.accept(BlockEntityRegistry.GECKO_HABITAT.get(), context -> new GeckoHabitatBlockRenderer());
        blockEntityRenderers.accept(BlockEntityRegistry.FERTILIZER_BLOCK.get(), context -> new FertilizerBlockRenderer());
        blockEntityRenderers.accept(BlockEntityRegistry.PHYLACTERY.get(), context -> new PhylacteryBlockRenderer());
    }
}
