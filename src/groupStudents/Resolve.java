package groupStudents;

public class Resolve {
	private int maxSt;
	private int minSt;
	private double maxRating = 0.0;
	private double minRating = 100.0;

	private Students[] students;
	private Students[] studentsMax;
	private Students[] studentsMin;

	Resolve(int num) {
		students = new Students[num];
	}

	public void setStudents(Students[] stu) {

		int g = 0;
		int b = 0;
		maxSt = 0;
		for (int i = 0; i < stu.length; i++) {
			if (stu[i].getRating() >= maxRating) {
				maxRating = stu[i].getRating();
			}
			if (stu[i].getRating() <= minRating) {
				minRating = stu[i].getRating();
			}
		}

		for (int i = 0; i < stu.length; i++) {
			if (stu[i].getRating() == maxRating) {
				maxSt++;
			}
			if (stu[i].getRating() == minRating) {
				minSt++;
			}

		}
		studentsMax = new Students[maxSt];
		studentsMin = new Students[minSt];
		for (int i = 0; i < stu.length; i++) {

			if (stu[i].getRating() == maxRating) {
				studentsMax[g] = new Students();
				studentsMax[g] = stu[i];
				g++;

			}
			if (stu[i].getRating() == minRating) {
				studentsMin[b] = new Students();
				studentsMin[b] = stu[i];
				b++;

			}
		}
	}

	public String toString() {
		String resMax = "";
		String resMin = "";

		for (int i = 0; i < studentsMax.length; i++) {
			resMax += studentsMax[i];
		}
		for (int i = 0; i < studentsMin.length; i++) {
			resMin += studentsMin[i];
		}

		return "Student with maximum rating = " + resMax
				+ " Student with minimum rating = " + resMin;
	}
}
