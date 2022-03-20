package com.jcontainer.managers;

import com.jcontainer.templates.Widget;

public class StateManager {

    public static void swapState(Widget c, Widget next) {
        c.close();
        next.create();
    }
}
