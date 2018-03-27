package idv.mission.example.SpringBase;

public class ProdHelloService implements HelloService {
	public void sayHello() {
		System.out.println("This is prod environment");
	}
}