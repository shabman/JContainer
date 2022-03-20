package com.jcontainer.ui;

import com.jcontainer.templates.Widget;

import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;

public class Splash implements Widget {

    private final GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
    private final GraphicsDevice[] gs = ge.getScreenDevices();
    private final GraphicsDevice gd = (gs.length > 1) ? gs[1] : gs[0];

    public Splash() { }
    
    @Override
    public void create() {
        
    }

    @Override
    public void pause() {

    }

    @Override
    public void close() {

    }
}
