package idv.mission.example.SpringBase;

import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext("applicationContext.xml");
		context.getEnvironment().setActiveProfiles("prod");
		context.refresh();
		HelloService helloService = (HelloService) context.getBean("helloService");
		helloService.sayHello();
		context.close();
	}
}