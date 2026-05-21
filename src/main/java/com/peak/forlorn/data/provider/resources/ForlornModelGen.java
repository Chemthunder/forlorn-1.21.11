package com.peak.forlorn.data.provider.resources;

import com.peak.forlorn.impl.index.ForlornBlocks;
import com.peak.forlorn.impl.index.ForlornItems;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.client.data.BlockStateModelGenerator;
import net.minecraft.client.data.ItemModelGenerator;
import net.minecraft.client.data.Models;

/**
 * @author Chemthunder
 */
public class ForlornModelGen extends FabricModelProvider {
    public ForlornModelGen(FabricDataOutput output) {
        super(output);
    }

    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleState(ForlornBlocks.RITUAL_TABLE);
    }

    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ForlornItems.INSCRIPTION_STONE, Models.GENERATED);
    }

    public String getName() {
        return "Forlorn Models";
    }
}
