package com.peak.forlorn.impl.client.screen;

import com.peak.forlorn.impl.block.entity.RitualTableBlockEntity;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.EditBoxWidget;
import net.minecraft.text.Text;

/**
 * @author Chemthunder
 */
public class RitualTableEditScreen extends Screen {
    private final MinecraftClient client;
    private final RitualTableBlockEntity src;

    private String nameToApply = "";
    private String sloganToApply = "";

    public RitualTableEditScreen(RitualTableBlockEntity src) {
        super(Text.empty());
        this.src = src;
        this.client = MinecraftClient.getInstance();
    }

    public void init() {
        Screen c = client.currentScreen;

        EditBoxWidget cultName = EditBoxWidget.builder()
                .placeholder(Text.literal("abba"))
                .build(
                        this.textRenderer,
                        120,
                        18,
                        Text.empty()
                );
        cultName.setMaxLines(1);

        cultName.setPosition(
                c.width / 2 - c.width / 8,
                c.height / 2
        );

        this.addDrawableChild(cultName);

        this.nameToApply = cultName.getText();
    }

    public void close() {
        //

        super.close();
    }
}
