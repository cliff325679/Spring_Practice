package firstclass;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
public class SpringDemoContext {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new FileSystemXmlApplicationContext("beans-config.xml");
		
		HelloBean hb = (HelloBean)context.getBean("helloBean");
		System.out.println(hb.getHelloWord());
	}

}
