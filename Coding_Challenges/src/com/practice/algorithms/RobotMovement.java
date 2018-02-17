package com.practice.algorithms;

import java.util.Scanner;

public class RobotMovement {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		sc.close();
		int left = 0, right = 0, up = 0, down = 0;
		for(int i = 0; i< input.length(); i++) {
			char move = input.charAt(i);
			switch(move) {
				case 'U':
					up++;
					break;
				case 'D':
					down++;
					break;
				case 'L':
					left++;
					break;
				case 'R':
					right++;
					break;
			}
		}
		int x = right - left;
		int y = up - down;
		System.out.println("(" + x + "," + y + ")");
	}

}
