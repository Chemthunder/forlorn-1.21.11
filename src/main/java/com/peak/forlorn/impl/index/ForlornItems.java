package com.peak.forlorn.impl.index;

import com.peak.forlorn.impl.Forlorn;
import com.peak.forlorn.impl.component.InscriptionStoneComponent;
import com.peak.forlorn.impl.item.InscriptionStoneItem;
import com.peak.forlorn.impl.item.block.RitualTableBlockItem;
import net.acoyt.acornlib.api.registrants.ItemRegistrant;
import net.minecraft.item.Item;

/**
 * @author Chemthunder
 */
public interface ForlornItems {
    ItemRegistrant ITEMS = new ItemRegistrant(Forlorn.MOD_ID);

    Item INSCRIPTION_STONE = ITEMS.register("inscription_stone", InscriptionStoneItem::new, new Item.Settings()
            .maxCount(1)
            .component(ForlornComponentTypes.STONE, new InscriptionStoneComponent("My Cult", "My Cult Slogan"))
    );

    Item TABLE_ITEM = ITEMS.register("ritual_table", RitualTableBlockItem::new, new Item.Settings()
            .maxCount(1)
    );

    static void init() {}
}
