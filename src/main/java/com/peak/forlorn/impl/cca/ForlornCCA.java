package com.peak.forlorn.impl.cca;

import com.peak.forlorn.impl.cca.entity.CultistComponent;
import net.minecraft.entity.player.PlayerEntity;
import org.ladysnake.cca.api.v3.entity.EntityComponentFactoryRegistry;
import org.ladysnake.cca.api.v3.entity.EntityComponentInitializer;
import org.ladysnake.cca.api.v3.entity.RespawnCopyStrategy;

/**
 * @author Chemthunder
 */
public class ForlornCCA implements EntityComponentInitializer {
    public void registerEntityComponentFactories(EntityComponentFactoryRegistry registry) {
        registry.registerForPlayers(
                CultistComponent.KEY,
                CultistComponent::new,
                RespawnCopyStrategy.ALWAYS_COPY
        );
    }
}
