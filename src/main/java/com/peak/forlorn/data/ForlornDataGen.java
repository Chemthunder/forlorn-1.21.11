package com.peak.forlorn.data;

import com.peak.forlorn.data.provider.resources.ForlornLangGen;
import com.peak.forlorn.data.provider.resources.ForlornModelGen;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class ForlornDataGen implements DataGeneratorEntrypoint {

	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        var pack = fabricDataGenerator.createPack();

        pack.addProvider(ForlornLangGen::new);
        pack.addProvider(ForlornModelGen::new);
	}
}
