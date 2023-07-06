package com.kh.day08.oop.interfacepkg.zoo;

public class Bear implements FoodInterface {
	@Override
	public String animalFood() {
		return "salmon";
	}

	@Override
	public String makeSound() {
		// TODO Auto-generated method stub
		return "우옹";
	}
}
