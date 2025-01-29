package net.m1sha365.lichdom.block;

import com.mojang.serialization.MapCodec;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.BaseEntityBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.EntityBlock;
import net.m1sha365.lichdom.registry.BlockEntityRegistry;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.core.BlockPos;
import org.jetbrains.annotations.Nullable;
import net.minecraft.world.level.block.state.BlockBehaviour;

/**
 * Item that holds a lich's essence.
 * Very spoobky
*/
public class PhylacteryBlock extends BaseEntityBlock implements EntityBlock {
	// Needs to hold the "essence" of a "lich" player

	// Method to handle respawning player at the location of the phylactery
	// This method needs to be public so the Lich menu can call it

	// When destroyed (by anyone other than the player breaking it) then:
	// This phylactery needs to call the "lose all soul power method" on lich class

	// Method to return player to phylactery instead of dying
	// To be called elsewhere so make public

	// Method to "buff" liched player and "minons" who are "near" phylactery
	// What the buff is needs defined
	// What the minons are needs defined
	// What near means needs defined
	
	public PhylacteryBlock(BlockBehaviour.Properties properties) {
		super(properties);
	}

	@Override
	protected MapCodec<? extends BaseEntityBlock> codec() {
		return null;
	}

	@Nullable
	@Override
	public BlockEntity newBlockEntity(BlockPos blockPos, BlockState blockState) {
		return BlockEntityRegistry.PHYLACTERY.get().create(blockPos, blockState);
	}
}
