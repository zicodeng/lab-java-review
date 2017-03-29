package edu.info448.review;

import java.util.*;

/**
 * A basic class for running and testing the Dog class
 */
public class Tester {

	public static void main(String[] args){
		Dog dog = new Dog();
		dog.bark();
		dog.bark();
		dog.walk();

		Dog[] pups = Dog.createPuppies(3);
		System.out.println(Arrays.toString(pups));

		Husky husky = new Husky("dawg1");
		husky.bark();
		husky.pullSled();

		Dog v1 = new Husky("dawg2"); // valid
		// Husky v2 = new Dog(); // invalid
		Huggable v2 = new Husky("dawg3"); // valid
		Huggable v3 = new TeddyBear(); // valid
		// Husky v4 = new TeddyBear(); //invalid

		System.out.println();
		System.out.print("v1 is barking: ");
		v1.bark();

		ArrayList<Huggable> hugList = new ArrayList<Huggable>(); //a list of huggable things
		hugList.add(new Husky("dawg4")); //a Husky is Huggable
		hugList.add(new TeddyBear()); //so are Teddybears!

		//enhanced for loop ("foreach" loop)
		//read: "for each Huggable in the hugList"
		for(Huggable thing : hugList) {
		    thing.hug();
		}

		GiftBox<Husky> huskyGiftBox = new GiftBox<Husky>(new Husky("dawg5"));
	}
}
