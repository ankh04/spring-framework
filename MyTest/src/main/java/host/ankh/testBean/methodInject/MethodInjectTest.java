package host.ankh.testBean.methodInject;

import host.ankh.testBean.configClass;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author ankh
 * @created at 2022-03-14 8:41 PM
 */
public class MethodInjectTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(configClass.class);
		SingletonMethodInjectBean sBean = ac.getBean(SingletonMethodInjectBean.class);
		SingletonMethodInjectBean sBean2 = ac.getBean(SingletonMethodInjectBean.class);

//		sBean.applicationContext;


		System.out.println("sBean和sBean是否相同:" + (sBean == sBean2));

		sBean.add(1);
		sBean2.add(2);
		sBean.add(3);

	}
}
