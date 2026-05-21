package com.peak.forlorn.impl.component;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import net.minecraft.network.codec.PacketCodec;
import net.minecraft.network.codec.PacketCodecs;

/**
 * @author Chemthunder
 */
public record InscriptionStoneComponent(String cultName, String cultSlogan) {
    public static final Codec<InscriptionStoneComponent> CODEC = RecordCodecBuilder.create(instance ->
            instance.group(
                    Codec.STRING.optionalFieldOf("cultName", "My Cult").forGetter(InscriptionStoneComponent::cultName),
                    Codec.STRING.optionalFieldOf("cultSlogan", "My Cult Slogan").forGetter(InscriptionStoneComponent::cultSlogan)
            ).apply(instance, InscriptionStoneComponent::new)
    );

    public static final PacketCodec<ByteBuf, InscriptionStoneComponent> PACKET_CODEC = PacketCodecs.codec(CODEC);
}
