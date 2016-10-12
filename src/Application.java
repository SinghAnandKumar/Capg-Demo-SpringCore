import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.cg.IDao;
import com.cg.IService;
import com.cg.MyServiceImpl;

public class Application {

	public static void main(String[] args) {
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
//		System.out.println(appContext);
		
		String message = (String) appContext.getBean("message");
		System.out.println(message.length());
		
		ApplicationContext appContext2 = new FileSystemXmlApplicationContext("config/applicationContext.xml");
//		System.out.println(appContext2);
		
		IService service = appContext.getBean("myService",IService.class);
		System.out.println(service.getMessages());
		
	}
	
}
