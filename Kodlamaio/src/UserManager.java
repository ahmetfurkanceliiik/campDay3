
public class UserManager {
	
	
	public void addUser(User user) {
		System.out.println("Id "+"-"+" �sim Soyisim "+"-"+" Mail");
		System.out.println(user.getId()+" "+(user.getFirstName()+" "+user.getLastName())+" "+user.getEmail());
	}
}
