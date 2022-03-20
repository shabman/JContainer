package com.jcontainer.managers;

import java.awt.Color;
import java.awt.Component;

public class ColorTheme {

    private Component c;

    public ColorTheme() { }

    public ColorTheme(Component c) {
        this.c = c;
    }

    public Color getDeterminedColor(float factor) {
        return new Color(
                Math.round(this.c.getBackground().getRed() * factor),
                Math.round(this.c.getBackground().getGreen() * factor),
                Math.round(this.c.getBackground().getBlue() * factor)
        );
    }

    public Color getDefaultDarker() {
        return this.c.getBackground().darker();
    }

    public Color getDefaultBrighter() {
        return this.c.getBackground().brighter();
    }

    public void setTarget(Component c) {
        this.c = c;
    }

    public Component getTarget() {
        return this.c;
    }
}