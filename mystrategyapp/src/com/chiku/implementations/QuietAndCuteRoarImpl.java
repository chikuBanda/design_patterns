package com.chiku.implementations;

import com.chiku.interfaces.IRoar;

public class QuietAndCuteRoarImpl implements IRoar {
    @Override
    public String getRoar() {
        return "makes a cute cat-like roar";
    }
}
