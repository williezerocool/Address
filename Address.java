

public class Address {

	String street;
	String city;
	String state;
	int zip;

	public static void main(String[] args) {
	
		Address uno, dos, tres;

		uno = new Address();
		uno.street = "191 Marigold Lane";
		uno.city = "city";
		uno.state = "Fl";
		uno.zip = 33179;

		dos = new Address();
		dos.street = "3029 Lost Lane";
		dos.city = "Crafton";
		dos.state = "PA";
		dos.zip = 15205;

		tres = new Address();
		tres.street = "2693 Hannah Street";
		tres.city = "Hickory";
		tres.state = "NC";
		tres.zip = 28601;

		System.out.println(uno.street);
		System.out.println(uno.city + ", " + uno.state + " " + uno.zip);
		System.out.println("\n" + dos.state);
		System.out.println(dos.city + ", " + dos.state + " " + dos.zip):
		System.out.println("\n" + tres.street);
		System.out.println(tres.city + ", " + tres.state + " " + tres.zip);

	}
}