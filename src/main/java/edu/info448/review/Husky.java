package edu.info448.review; //package declaration (needed)

public class Husky extends Dog implements Huggable {
  /* class body goes here */
  private String breed;

  // Constructor
  public Husky(String name) {
	super(name, "Husky");
  }

  public void pullSled() {
	System.out.print("A husky is pulling sled");
  }

  public void bark() {
	System.out.println("woof");
  }

  public void hug() {
	  System.out.println("A husk wants to hug");
  }
}
