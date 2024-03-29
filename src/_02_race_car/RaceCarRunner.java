package _02_race_car;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */



public class RaceCarRunner {
	public static void main(String[] args) {
		
		/* Do the following things without changing the RaceCar class */
		RaceCar car = new RaceCar("BMW", 5);
		
		car.crash();
		if (car.damaged) {
			car.pit();
			int x = car.getPositionInRace();
			for (int i = 0; i < x-1; i++) {
				car.overtake();
			}
		}
		
		// 1. Create a RaceCar and place it in 5th position
	
		// 2. Print the RaceCar's position in the race

		// 3. Crash the RaceCar
		
		// 4. If the car is damaged. Bring it in for a pit stop.

		// 5. Help the car move into first place.

	}
}
