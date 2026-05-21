package com.peak.forlorn.data.provider.resources;

import com.peak.forlorn.impl.index.ForlornBlocks;
import com.peak.forlorn.impl.index.ForlornItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

/**
 * @author Chemthunder
 */
public class ForlornLangGen extends FabricLanguageProvider {
    public ForlornLangGen(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    public void generateTranslations(RegistryWrapper.@NotNull WrapperLookup wrapperLookup, @NotNull TranslationBuilder translationBuilder) {
        ForlornItems.ITEMS.registerLang(wrapperLookup, translationBuilder);
        ForlornBlocks.BLOCKS.registerLang(wrapperLookup, translationBuilder);

        translationBuilder.add("itemGroup.forlorn", "Forlorn");
    }

    public @NotNull String getName() {
        return "Forlorn Language";
    }
}
