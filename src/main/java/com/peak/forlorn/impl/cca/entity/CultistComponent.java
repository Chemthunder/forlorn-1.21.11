package com.peak.forlorn.impl.cca.entity;

import com.peak.forlorn.api.core.Cult;
import com.peak.forlorn.impl.Forlorn;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.nbt.NbtElement;
import net.minecraft.nbt.NbtOps;
import net.minecraft.storage.ReadView;
import net.minecraft.storage.WriteView;
import org.jetbrains.annotations.Nullable;
import org.ladysnake.cca.api.v3.component.ComponentKey;
import org.ladysnake.cca.api.v3.component.ComponentRegistry;
import org.ladysnake.cca.api.v3.component.sync.AutoSyncedComponent;

/**
 * @author Chemthunder
 */
public class CultistComponent implements AutoSyncedComponent {
    public static final ComponentKey<CultistComponent> KEY = ComponentRegistry.getOrCreate(
            Forlorn.id("cultist"),
            CultistComponent.class
    );

    private final PlayerEntity player;

    private boolean state = false;
    private @Nullable Cult cult = Cult.EMPTY;

    public CultistComponent(PlayerEntity player) {
        this.player = player;
    }

    public void sync() {
        KEY.sync(this.player);
    }

    public void readData(ReadView nbt) {
        this.state = nbt.getBoolean("State", false);

        this.cult = nbt.read("Cult", Cult.CODEC).orElse(null);
    }

    public void writeData(WriteView nbt) {
        nbt.putBoolean("State", state);

        if (this.cult != null) {
            nbt.put("Cult", Cult.CODEC, this.cult);
        }
    }

    public boolean isState() {
        return this.state;
    }

    public void setState(boolean state) {
        this.state = state;
        this.sync();
    }

    public Cult getCult() {
        return this.cult;
    }

    public void setCult(Cult cult) {
        this.cult = cult;
        this.sync();
    }
}
