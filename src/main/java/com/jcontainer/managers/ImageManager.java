package com.jcontainer.managers;

import java.awt.Image;
import java.awt.image.BufferedImage;

import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class ImageManager {

    private int w;
    private int h;

    private String path;

    public ImageManager() {
        this("", 0, 0);
    }

    public ImageManager(String path, int w, int h) {
        this.path = path;
        this.w = w;
        this.h = h;
    }

    public ImageIcon resize() {
        BufferedImage img;
        try {
            img = ImageIO.read(ClassLoader.getSystemResource(this.path));
            return new ImageIcon(img.getScaledInstance(this.w, this.h, Image.SCALE_SMOOTH));
        } catch (IOException e) {
            System.err.println(e);
            return null;
        }
    }

    public Image resizeImage() {
        BufferedImage img;
        try {
            img = ImageIO.read(ClassLoader.getSystemResource(this.path));
            return img.getScaledInstance(this.w, this.h, Image.SCALE_SMOOTH);
        } catch (IOException e) {
            System.err.println(e);
            return null;
        }
    }

    public void setPath(String path) {
        this.path = path;
    }

    public void setWidth(int w) {
        this.w = w;
    }

    public void setHeight(int h) {
        this.h = h;
    }
}
