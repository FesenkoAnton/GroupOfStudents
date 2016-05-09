package groupStudents;

import java.util.Scanner;

/**
 * �������� ��������, �� ����� ����� ��������. ���������� ��� �������� (ϲ�,
 * ������� ���, ������ � �.�.) ��������� � ���������. �����, �������� ��
 * �������� ���������� �������� � ������ ������� �����. �������� ���� ������
 * ���� �������� �����, �������� ���������� ��� ����� �������� �� �������
 * �������� � ��������� � �������� �����.
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
