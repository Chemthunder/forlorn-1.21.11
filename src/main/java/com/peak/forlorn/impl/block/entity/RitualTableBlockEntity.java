package com.peak.forlorn.impl.block.entity;

import com.peak.forlorn.impl.index.ForlornBlockEntityTypes;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.util.math.BlockPos;

/**
 * @author Chemthunder
 */
public class RitualTableBlockEntity extends BlockEntity {
    public RitualTableBlockEntity(BlockPos pos, BlockState state) {
        super(ForlornBlockEntityTypes.TABLE_ENTITY, pos, state);
    }
}
