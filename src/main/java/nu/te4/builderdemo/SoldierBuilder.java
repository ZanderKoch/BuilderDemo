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
    
    public Soldier build(){
        if(name == null){
            throw new IllegalStateException("soldier must have a name");
        }
        if(health <= 0){
            throw new IllegalStateException("soldier health must be positive");
        }
        if(age <= 0){
            throw new IllegalStateException("soldier age must be positive");
        }
        if(armors.isEmpty()){
            throw new IllegalStateException("soldier must have armor");
        }
        if(weapon == null){
            throw new IllegalStateException("soldier must have weapon");
        }
        
        return new Soldier(this);
    }

    //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Armor> getArmors() {
        return armors;
    }

    public void setArmors(List<Armor> armors) {
        this.armors = armors;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
    
    
}
