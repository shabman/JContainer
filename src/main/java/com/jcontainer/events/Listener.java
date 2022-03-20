package com.jcontainer.events;

import com.jcontainer.templates.Action;
import com.jcontainer.templates.Widget;

import java.util.ArrayList;
import java.util.List;

public final class Listener {

    private static final List<Widget> WIDGETS = new ArrayList<>();
    private static final List<Action> ACTIONS = new ArrayList<>();

    public Listener() { }

    public static void addListener(Widget widget) {
        WIDGETS.add(widget);
    }

    public static void addListener(Action action) {
        ACTIONS.add(action);
    }

    public static void fireListener(Object args) {
        ACTIONS.forEach(e -> e.onAction(args));
    }

    public static void fireEvent(String event) {
        switch (event.toLowerCase()) {
            case "create" -> WIDGETS.forEach(Widget::create);
            case "pause" -> WIDGETS.forEach(Widget::pause);
            case "close" -> WIDGETS.forEach(Widget::close);
        }
    }

    public static void fireEventProperty(Widget c, String event) {
        switch (event.toLowerCase()) {
            case "create" -> c.create();
            case "pause" -> c.pause();
            case "close" -> c.close();
        }
    }
}
