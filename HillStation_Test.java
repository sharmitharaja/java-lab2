package Hill;
class HillStation{
	public void Location() {
		System.out.println("Location of the Hills Statinn");
	}
	public void famousFor() {
		System.out.println("What the Hill station is famous for");
	}
}
class Mnali extends HillStation{
	// override
	public void Location() {
		System.out.println("Manali is located in Himachal pradesh");
	}
	//override
	public void famousFor() {
		System.out.println("Manali is famous for adventure sports");
	}
}
class Musoori extends HillStation{
	//override
	public void Location() {
		System.out.println("Musoori is located in Uttarakhand");
	}
	//override
	public void famousFor() {
		System.out.println("Musoori is famous for its pleasant weather and landscapes");
	}
}
class Gulmarg extends HillStation{
	//override
	public void Location() {
		System.out.println("Gulmarg is located in Jammu and kashmir");
	}
	//override
	public void famousFor() {
		System.out.println("Gulmarg is famous for Winter beauty");
	}
}

public class HillStation_Test {

	public static void main(String[] args) {
		//calling location() and famousFor() using HillStation refrence
		HillStation H1=new Mnali();
		H1.Location();
		H1.famousFor();
		HillStation H2 = new Musoori();
		H2.Location();
		H2.famousFor();
		HillStation H3=new Gulmarg();
		H3.Location();
		H3.famousFor();
	}

}
