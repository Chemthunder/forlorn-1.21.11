package com.peak.forlorn.api.core;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

/**
 * @author Chemthunder
 */
public record Cult(String name, String slogan) {
    public static final Cult EMPTY = new Cult("", "");

    public static final Codec<Cult> CODEC = RecordCodecBuilder.create(instance ->
            instance.group(
                    Codec.STRING.optionalFieldOf("name", "").forGetter(Cult::name),
                    Codec.STRING.optionalFieldOf("slogan", "").forGetter(Cult::slogan)
            ).apply(instance, Cult::new)
    );
}
