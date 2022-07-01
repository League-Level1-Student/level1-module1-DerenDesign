package _07_duck;

public class Dog {
	String favoriteSound;
	int numberOfPaws;
	
	void paws() {
		System.out.println("4");
	}
	void sound() {
		System.out.println("Bark");
	}
	
	Dog(String favoriteSound, int numberOfPaws){
		this.favoriteSound = favoriteSound;
		this.numberOfPaws = numberOfPaws;
	}
}
