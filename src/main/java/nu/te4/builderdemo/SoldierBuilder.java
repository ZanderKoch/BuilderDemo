/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nu.te4.builderdemo;

import java.util.List;

/**
 *
 * @author Elev
 */
class SoldierBuilder {
    private String name; 
    private int health; 
    private int age;
    private List<Armor> armors; 
    private Weapon weapon;
    
    //builder methods
    public SoldierBuilder name(String name){
        this.name = name;
        return this;
    }
    
    public SoldierBuilder health(int health){
        this.health = health;
        return this;
    }
    
    public SoldierBuilder age(int age){
        this.age = age;
        return this;
    }
    
    public SoldierBuilder armors(List<Armor> armors){
        this.armors = armors;
        return this;
    }
    
    public SoldierBuilder weapon(Weapon weapon){
        this.weapon = weapon;
        return this;
    }
}
