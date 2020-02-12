package com.rovers;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import com.rovers.model.Rover;

public class Main {

	public static void main(String[] args) throws Exception {
		String[] positions = null;
		String directions = null;
		String [] maxValues = new String[2];
		//String path = "../Rovers/src/main/resources/input.txt";

		List<String> allLines = Files.readAllLines(Paths.get(args[0]));
		maxValues = allLines.get(0).split(" ");
		for (int i = 1; i < allLines.size() - 1; i++) {
			
			positions = allLines.get(i).toUpperCase().split(" ");
			directions = allLines.get(i + 1).toUpperCase();
			i += 1;
			
			int x = Integer.parseInt(positions[0]);
			int y = Integer.parseInt(positions[1]);
			int maxX =  Integer.parseInt(maxValues[0]);
			int maxY = Integer.parseInt(maxValues[1]);
			if(x< maxX && y < maxY ){
			Rover r = new Rover(x,y, positions[2].charAt(0));

			for (int j = 0; j < directions.length(); j++) {

				switch (directions.charAt(j)) {
				case 'L':
					Utility.changeDirection('L', r);
					break;
				case 'R':
					Utility.changeDirection('R', r);
					break;
				case 'M':
					Utility.move(r,maxX,maxY);
					break;
				default:
					System.out.println("Direction contains invalid letters");
					System.exit(1);
				}
			}
			System.out.println(r);
			}else 
				System.out.println("x & y not in range");
		}

	}

}
