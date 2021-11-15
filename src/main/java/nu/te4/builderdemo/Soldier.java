/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nu.te4.builderdemo;

import java.util.List;

/**
 *
 * @author TE4-Lärardator
 */
public class Soldier {
    private String name; 
    private int health; 
    private int age;
    private List<Armor> armors; 
    private Weapon weapon;

    public Soldier(String name, int health, int age, List<Armor> armors, Weapon weapon) {
        this.name = name;
        this.health = health;
        this.age = age;
        this.armors = armors;
        this.weapon = weapon;
    }
    
    public Soldier(SoldierBuilder builder){
        this.name = builder.getName();
        this.health = builder.getHealth();
        this.age = builder.getAge();
        this.armors = builder.getArmors();
        this.weapon = builder.getWeapon();
    }

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
    
    @Override
    public String toString(){
      int defenceTotal = 0;
      
      String result;
      result =  "**Soldier**\n\r";
      result += "name: " + this.name + "\n\r";
      result += "age: " + Integer.toString(age) + "\n\r";
      result += "armors:\n\r";
      for(Armor armor : this.armors){
          result += " *" + armor.getName() + "\n\r";
          result += "  -durability: " + armor.getDurability() + "\n\r";
          result += "  -defence: " + armor.getDefence() + "\n\r";
          defenceTotal += armor.getDefence();
      }
      result += "total defence: " + defenceTotal + "\n\r";
      result += "weapon: " + weapon.getName() + "\n\r";
      result += " -strenght: " + Integer.toString(weapon.getStrength()) + 
             "\n\r";
      result += " -durability: " + Integer.toString(weapon.getDurability()) +
              "\n\r";
      result += " -weight: " + Double.toString(weapon.getWeight()) + "\n\r";
      return result; 
    }
}
