package com.hibernate.Mappings.Assosiation_mapping.onetomany;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Player 
{
	@Override
	public String toString() {
		return "Player [playerId=" + playerId + ", name=" + name + ", type=" + type + ", age=" + age + "]";
	}
	@Id
	private int playerId;
	private String name;
	private String type;
	private int age;
	public Player(int playerId, String name, String type, int age) {
		super();
		this.playerId = playerId;
		this.name = name;
		this.type = type;
		this.age = age;
	}
	public int getPlayerId() {
		return playerId;
	}
	public void setPlayerId(int playerId) {
		this.playerId = playerId;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Player() {
		super();
	}
}
