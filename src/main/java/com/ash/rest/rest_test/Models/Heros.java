package com.ash.rest.rest_test.Models;

import javax.xml.bind.annotation.XmlRootElement;

import com.sun.org.apache.bcel.internal.generic.I2D;
import com.sun.xml.internal.bind.v2.model.core.ID;

@XmlRootElement
public class Heros {

    public int getHP() {
        return HP;
    }
    public void setHP(int hP) {
        HP = hP;
    }
    public int getMP() {
        return MP;
    }
    public void setMP(int mP) {
        MP = mP;
    }
    public int getPhysical_Damage() {
        return Physical_Damage;
    }
    public void setPhysical_Damage(int physical_Damage) {
        Physical_Damage = physical_Damage;
    }
    public int getMagical_Damage() {
        return Magical_Damage;
    }
    public void setMagical_Damage(int magical_Damage) {
        Magical_Damage = magical_Damage;
    }
    public int getDefense() {
        return Defense;
    }
    public void setDefense(int defense) {
        Defense = defense;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getAbility() {
        return ability;
    }
    public void setAbility(String ability) {
        this.ability = ability;
    }
    public long getID() {
		return ID;
	}
	public void setID(long iD) {
		ID = iD;
	}
	private long ID;
    private String name;
    private String type;
    private String ability;
    
   

	private int HP;
    private int MP;
    private int Physical_Damage;
    private int Magical_Damage;
    private int Defense;
	public Heros(long iD, String name, String type, String ability, int hP, int mP, int physical_Damage, int magical_Damage,
			int defense) {
		ID=iD;
		this.name = name;
		this.type = type;
		this.ability = ability;
		HP = hP;
		MP = mP;
		Physical_Damage = physical_Damage;
		Magical_Damage = magical_Damage;
		Defense = defense;
	}
	public Heros(){
		
	}

}
