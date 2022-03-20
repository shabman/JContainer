package com.jcontainer;

import com.formdev.flatlaf.FlatDarkLaf;
import com.jcontainer.events.Listener;
import com.jcontainer.ui.Splash;

import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Launch {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(new FlatDarkLaf());
        } catch (UnsupportedLookAndFeelException e) {
            JOptionPane.showMessageDialog(null, e, "JContainer Error", JOptionPane.ERROR_MESSAGE);
        }
        SwingUtilities.invokeLater(() -> Listener.fireEventProperty(new Splash(), "create"));
    }
}
