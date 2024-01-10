package com.javaex.ex02;

public abstract class Bird {

	private String name;

	public Bird() {

	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void showName() {
		System.out.println();
	}

	public abstract void fly();

	public abstract void sing();
}
