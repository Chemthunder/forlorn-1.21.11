package com.peak.forlorn.impl.index;

import com.peak.forlorn.impl.Forlorn;
import com.peak.forlorn.impl.component.InscriptionStoneComponent;
import net.acoyt.acornlib.api.registrants.DataComponentTypeRegistrant;
import net.minecraft.component.ComponentType;

/**
 * @author Chemthunder
 */
public interface ForlornComponentTypes {
    DataComponentTypeRegistrant COMPONENTS = new DataComponentTypeRegistrant(Forlorn.MOD_ID);

    ComponentType<InscriptionStoneComponent> STONE = COMPONENTS.register("stone",
            InscriptionStoneComponent.CODEC,
            InscriptionStoneComponent.PACKET_CODEC
    );

    static void init() {}
}
