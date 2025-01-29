package net.m1sha365.lichdom.block.entity;

import net.m1sha365.lichdom.registry.BlockEntityRegistry;
import software.bernie.geckolib.animatable.GeoBlockEntity;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import software.bernie.geckolib.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.animation.AnimatableManager;
import software.bernie.geckolib.animation.AnimationController;
import software.bernie.geckolib.animation.PlayState;
import software.bernie.geckolib.constant.DefaultAnimations;
import net.minecraft.core.BlockPos;
import software.bernie.geckolib.animation.RawAnimation;
import software.bernie.geckolib.util.GeckoLibUtil;

public class PhylacteryBlockEntity extends BlockEntity implements GeoBlockEntity {

    private final AnimatableInstanceCache cache = GeckoLibUtil.createInstanceCache(this);

    public PhylacteryBlockEntity(BlockPos pos, BlockState state) {
        super(BlockEntityRegistry.PHYLACTERY.get(), pos, state);
    }

    private static final RawAnimation FERTILIZER_ANIMS = RawAnimation.begin().thenPlay("fertilizer.deploy").thenLoop("fertilizer.idle");

    @Override
    public void registerControllers(AnimatableManager.ControllerRegistrar controllers) {
        controllers.add(new AnimationController<PhylacteryBlockEntity>(this, state -> {
            if (state.getAnimatable().getLevel().isRaining()) {
                return state.setAndContinue(FERTILIZER_ANIMS);
            } else {
                return PlayState.STOP;
            }
        }));
    }

    @Override
    public AnimatableInstanceCache getAnimatableInstanceCache() {
        return this.cache;
    }
}
