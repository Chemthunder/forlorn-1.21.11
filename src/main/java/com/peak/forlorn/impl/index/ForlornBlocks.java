package com.peak.forlorn.impl.index;

import com.peak.forlorn.impl.Forlorn;
import com.peak.forlorn.impl.block.RitualTableBlock;
import net.acoyt.acornlib.api.registrants.BlockRegistrant;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;

/**
 * @author Chemthunder
 */
public interface ForlornBlocks {
    BlockRegistrant BLOCKS = new BlockRegistrant(Forlorn.MOD_ID);

    Block RITUAL_TABLE = BLOCKS.register(
            "ritual_table",
            RitualTableBlock::new,
            AbstractBlock.Settings.copy(Blocks.SMITHING_TABLE)
                    .luminance(value -> 4)
                    .emissiveLighting((state, world, pos) -> true)
    );

    static void init() {}
}
