package entities;

public class Vector {

	private String name;
	private String email;
	private int room;
	
	// outra forma é criar apenas name e email, deixando room para a posição no vetor, descrita no código principal
	
	public Vector(String name, String email, int room) {
		this.name = name;
		this.email = email;
		this.room = room;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getRoom() {
		return room;
	}

	public void setRoom(int room) {
		this.room = room;
	}
	
	// 	public String toString() {
	//		return name + ", " + email;
	//	}
}
