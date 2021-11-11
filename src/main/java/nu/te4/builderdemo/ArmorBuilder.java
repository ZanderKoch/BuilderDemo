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
public class ArmorBuilder {
    private String name;
    private int durability;
    private int defence;
    
    //builder methods
    public ArmorBuilder name(String name){
        this.name = name;
        return this;
    }
    
    public ArmorBuilder durability(int durability){
        this.durability = durability;
        return this;
    }
    
    public ArmorBuilder defence(int defence){
        this.defence = defence;
        return this;
    }
    
    public Armor build(){
        if(name == null){
            throw new IllegalStateException("armor must have a name");
        }
        if(durability <= 0){
            throw new IllegalStateException("armor must have durability");
        }
        if(defence <= 0){
            throw new IllegalStateException("armor must have defence value");
        }

        return new Armor(this);
    }
}
