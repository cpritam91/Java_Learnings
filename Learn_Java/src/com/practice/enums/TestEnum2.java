package com.practice.enums;

enum Day {
	SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY;
}

public class TestEnum2 {

	private Day day;
	
	public TestEnum2(Day day) {
		this.day = day;
	}
	
	public void dayIsLike() {
		
		switch(day) {
		case MONDAY:
			System.out.println("Monday not good");
			break;
		case TUESDAY:
		case WEDNESDAY:
		case THURSDAY:
			System.out.println("Bad");
			break;
		case FRIDAY:
		case SATURDAY:
		case SUNDAY:
			System.out.println("Weekends are great");
		}
	}
	
	public static void main(String[] args) {
		TestEnum2 t1 = new TestEnum2(Day.valueOf("MONDAY"));
		t1.dayIsLike();
	}

}
