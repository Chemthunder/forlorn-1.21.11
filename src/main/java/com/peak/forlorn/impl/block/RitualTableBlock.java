package com.peak.forlorn.impl.block;

import com.mojang.serialization.MapCodec;
import com.peak.forlorn.impl.block.entity.RitualTableBlockEntity;
import com.peak.forlorn.impl.client.screen.RitualTableEditScreen;
import net.minecraft.block.BlockState;
import net.minecraft.block.BlockWithEntity;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.ActionResult;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jspecify.annotations.Nullable;

/**
 * @author Chemthunder
 */
public class RitualTableBlock extends BlockWithEntity {
    public RitualTableBlock(Settings settings) {
        super(settings);
    }

    protected MapCodec<? extends BlockWithEntity> getCodec() {
        return createCodec(RitualTableBlock::new);
    }

    public @Nullable BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new RitualTableBlockEntity(pos, state);
    }

    protected ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, BlockHitResult hit) {
        if (world.isClient()) {
            MinecraftClient.getInstance().setScreen(new RitualTableEditScreen((RitualTableBlockEntity) world.getBlockEntity(pos)));
        }

        return super.onUse(state, world, pos, player, hit);
    }
}
