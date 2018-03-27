package idv.mission.example.SpringBase;

public class DevHelloService implements HelloService {
	public void sayHello() {
		System.out.println("This is dev environment");
	}
}