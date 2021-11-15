/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nu.te4.builderdemo;

/**
 *
 * @author TE4-Lärardator
 */
public class Run {
    public static void main(String[] args) {
        //Test here
        WeaponBuilder weaponbuilder = new WeaponBuilder();
        weaponbuilder.setName("pilum");
        weaponbuilder.durability(10);
        weaponbuilder.setWeight(2.3d);
        Weapon weapon  = weaponbuilder.build();
        
        Armorbuilder armorbuilder = new armorbuilder();
        
    }
}
