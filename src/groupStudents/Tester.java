package groupStudents;

public class Tester {

	public static void main(String[] args) {
		int l = 5;
		Resolve r = new Resolve(l);
		DataEntry de = new DataEntry();
		Students s[] = new Students[l];
		for (int i = 0; i < l; i++) {
			s[i] = new Students(de.dataEntry());
		}
		for (int i = 0; i < l; i++) {
			System.out.println(s[i].toString());
		}
		r.setStudents(s);
		System.out.println(r.toString());
	}

}
