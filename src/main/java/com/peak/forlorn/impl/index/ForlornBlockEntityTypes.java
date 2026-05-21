package com.peak.forlorn.impl.index;

import com.peak.forlorn.impl.Forlorn;
import com.peak.forlorn.impl.block.entity.RitualTableBlockEntity;
import net.acoyt.acornlib.api.registrants.BlockEntityTypeRegistrant;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.Blocks;
import net.minecraft.block.entity.BlockEntityType;

/**
 * @author Chemthunder
 */
public interface ForlornBlockEntityTypes {
    BlockEntityTypeRegistrant BLOCK_ENTITIES = new BlockEntityTypeRegistrant(Forlorn.MOD_ID);

    BlockEntityType<RitualTableBlockEntity> TABLE_ENTITY = BLOCK_ENTITIES.register("ritual_table",
            FabricBlockEntityTypeBuilder.create(
                    RitualTableBlockEntity::new, ForlornBlocks.RITUAL_TABLE
            ).build()
    );

    static void init() {}
}
