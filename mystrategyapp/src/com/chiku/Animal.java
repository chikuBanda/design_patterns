package com.chiku;

import com.chiku.interfaces.IHunt;
import com.chiku.interfaces.IRoar;

public class Animal {
    // this is the client class in strategy pattern

    private IRoar roar;
    private IHunt hunt;

    public Animal(IRoar roar, IHunt hunt){
        this.roar = roar;
        this.hunt = hunt;
    }

    // the execute methodes
    public String doRoar(){
        return this.roar.getRoar();
    }

    public String doHunt(){
        return this.hunt.getHunt();
    }
}
