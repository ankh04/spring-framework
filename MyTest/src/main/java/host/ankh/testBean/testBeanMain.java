package host.ankh.testBean;

import host.ankh.testBean.methodInject.PrototypeBean;
import host.ankh.testBean.methodInject.SingletonBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author ankh
 * @created at 2022-03-14 8:17 PM
 */
public class testBeanMain {
	AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(configClass.class);

	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(configClass.class);
		SingletonBean sBean = applicationContext.getBean(SingletonBean.class);
		SingletonBean sBean2 = applicationContext.getBean(SingletonBean.class);
		System.out.println("sBean2 = " + sBean2);
		System.out.println("sBean = " + sBean);

		PrototypeBean prototypeBean = sBean.getPrototypeBean();
		PrototypeBean prototypeBean2 = sBean2.getPrototypeBean();

		// 在这种情况下, sBean和sBean2是同一个,即单例是没有问题的
		// 但是它的prototypeBean这时候也变成同一个了
		// 两者的scope不同就会引发这样的问题
		// 为了解决这个问题可以考虑使用"方法注入"
		System.out.println("prototypeBean = " + prototypeBean);
		System.out.println("prototypeBean2 = " + prototypeBean2);

		sBean.add(1);
		sBean.add(2);
		sBean.add(3);
	}

}
