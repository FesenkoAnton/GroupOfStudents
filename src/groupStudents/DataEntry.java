package groupStudents;

import java.util.Scanner;

/**
 * Написати програму, що формує групу студентів. Інформація про студентів (ПІБ,
 * середній бал, адреса і т.д.) вводиться з клавіатури. Групу, студента та
 * введення інформації оформити у вигляді окремих класів. Написати клас тестер
 * який заповнює групу, виводить інформацію про групу студентів та повертає
 * студента з найкращим і найгіршим балом.
 * 
 * @author Anton
 *
 */

public class DataEntry {

	public Students dataEntry() {

		Scanner s = new Scanner(System.in);
		System.out.println("Input name/surname of student:");
		String name = s.nextLine();

		System.out.println("Input address of student:");
		String address = s.nextLine();

		System.out.println("Input rating of student:");
		double rating = s.nextDouble();

		return new Students(name, address, rating);

	}
}
