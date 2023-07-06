package com.kh.day08.oop.interfacepkg.zoo;

public class Lion implements FoodInterface {
	@Override
	public String animalFood() {
		return "gazel";
	}
	@Override
	public String makeSound() {
		// TODO Auto-generated method stub
		return "우옹";
	}
}
