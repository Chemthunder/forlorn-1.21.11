package com.peak.forlorn.impl.index;

import com.peak.forlorn.impl.Forlorn;
import com.peak.forlorn.impl.index.util.ForlornPalettes;
import net.acoyt.acornlib.api.registrants.ItemGroupRegistrant;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;

/**
 * @author Chemthunder
 */
public interface ForlornItemGroups {
    ItemGroupRegistrant GROUPS = new ItemGroupRegistrant(Forlorn.MOD_ID);

    RegistryKey<ItemGroup> MAIN_KEY = RegistryKey.of(RegistryKeys.ITEM_GROUP, Forlorn.id(Forlorn.MOD_ID));
    ItemGroup MAIN = GROUPS.register(MAIN_KEY.getValue().getPath(), FabricItemGroup.builder()
            .icon(() -> new ItemStack(ForlornItems.TABLE_ITEM))
            .displayName(Text.translatable("itemGroup." + Forlorn.MOD_ID).withColor(ForlornPalettes.modColor))
            .build());

    static void init() {
        ItemGroupEvents.modifyEntriesEvent(MAIN_KEY).register(ForlornItemGroups::buildItemGroup);
    }

    private static void buildItemGroup(FabricItemGroupEntries entries) {
        ForlornItems.ITEMS.toRegister.forEach(entries::add);
    }
}
