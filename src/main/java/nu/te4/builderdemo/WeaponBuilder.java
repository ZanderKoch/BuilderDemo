/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nu.te4.builderdemo;

/**
 *
 * @author Zander Koch
 */
public class WeaponBuilder{
    private String name; 
    private int durability;
    private int strength; 
    private double weight;
    
    
    //builder methods
    public WeaponBuilder name(String name){
        this.name = name;
        return this;
    }
    
    public WeaponBuilder durability(int durability){
        this.durability = durability;
        return this;
    }
    
    public WeaponBuilder strength(int strength){
        this.strength = strength;
        return this;
    }
    
    public WeaponBuilder weight(double weight){
        this.weight = weight;
        return this;
    }
    
    
    //getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDurability() {
        return durability;
    }

    public void setDurability(int durability) {
        this.durability = durability;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    
}