package com.kh.day08.oop.interfacepkg.zoo;

public class Tiger implements FoodInterface {
	@Override
	public String animalFood() {
		return "beef";
	}
	@Override
	public String makeSound() {
		// TODO Auto-generated method stub
		return "우옹";
	}
}
