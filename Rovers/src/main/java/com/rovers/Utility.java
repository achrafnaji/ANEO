package com.rovers;

import com.rovers.model.CardinalCompass;
import com.rovers.model.Rover;

public class Utility {

	// change Direction
	public static void changeDirection(char rotate, Rover rover) {
		if (rotate == 'L' || rotate == 'R') {
			switch (rover.getCardinalCompass()) {
			case N:
				if (rotate == 'L') {
					rover.setCardinalCompass(CardinalCompass.W);
				} else {
					rover.setCardinalCompass(CardinalCompass.E);
				}
				break;
			case W:
				if (rotate == 'L') {
					rover.setCardinalCompass(CardinalCompass.S);
				} else {
					rover.setCardinalCompass(CardinalCompass.N);
				}
				break;
			case E:
				if (rotate == 'L') {
					rover.setCardinalCompass(CardinalCompass.N);
				} else {
					rover.setCardinalCompass(CardinalCompass.S);
				}
				break;
			case S:
				if (rotate == 'L') {
					rover.setCardinalCompass(CardinalCompass.E);
				} else {
					rover.setCardinalCompass(CardinalCompass.W);
				}
				break;
			}
		}
	}

	// move
	public static void move(Rover rover, int maxX, int maxY) {
		int x = rover.getX();
		int y = rover.getY();
		switch (rover.getCardinalCompass()) {
		case N:
			if (rover.getY() < maxY) {
				rover.setY(y += 1);
				break;
			}else{
				System.out.println(rover+" : Last position & unable to move, mouvement must be in range");
				System.exit(1);
			}
			break;
		case W:
			if (rover.getX() > 0) {
				rover.setX(x += -1);
				break;
			}else {
				System.out.println(rover+" : Last position & unable to move, mouvement must be in range");
				System.exit(1);
			}
			break;
		case E:
			if (rover.getX() < maxX) {
				rover.setX(x += 1);
				break;
			}else{
				System.out.println(rover+" : Last position & unable to move, mouvement must be in range");
				System.exit(1);
			}
			break;
		case S:
			if (rover.getY() > 0) {
				rover.setY(y += -1);
				break;
			}else{
				System.out.println(rover+" : Last position & unable to move, mouvement must be in range");
				System.exit(1);
			}
			break;
		}

	}
}
