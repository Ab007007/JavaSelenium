package com.synechron.java.inheritance;

class Dog extends Animal implements LivingOrganism, LivesOnLand
{
	void bark() {
		System.out.println("The dog barks...");
	}
	public void eat() {
		System.out.println("Dog eat Pedigree / non-veg / veg");
	}
	public void test() {
		System.out.println("Lives on earth and very pretty animal");
	}
	public void breath() {
		System.out.println("Takes oxyzen");
	}
	public void sense() {
		System.out.println("Very quick in identifying the smell");
	}
}
class Puppy extends Dog
{
	void weep() {
		System.out.println("Puppy weeps ...");
	}
}
public class DogManager
{
	public static void main(String[] args) {
		Puppy p = new   Puppy();
		p.eat();
		p.bark();
		p.weep();
		p.sense();
		p.breath();
		p.test();
	}
}
