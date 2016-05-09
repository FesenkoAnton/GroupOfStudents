package groupStudents;

public class Students {

	private String name;
	private String address;
	private double rating;
	
	Students(){
		name="";
		address="";
		rating=0;
	}
	
	Students(String _name,String _address,double _rating){
		this.name = _name;
		this.address=_address;
		this.rating=_rating;
	}
	
	public Students(Students dataEntry) {
		name=dataEntry.getName();
		address=dataEntry.getAddress();
		rating= dataEntry.getRating();
	}

	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public double getRating() {
		return rating;
	}
	
	public String toString(){
		String res="";
		res= name+" "+address+" "+rating;
		return res;
		
	}
	
}
