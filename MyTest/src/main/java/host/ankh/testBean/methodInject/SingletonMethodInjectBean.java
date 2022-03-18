package host.ankh.testBean.methodInject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * @author ankh
 * @created at 2022-03-14 8:43 PM
 */
@Component
public class SingletonMethodInjectBean {
	// 直接把applicationContext注入进来
	@Autowired
	private ApplicationContext applicationContext;

	public void add(int a) {
		// 从新的applicationContext中拿prototypeBean,这时候拿出来的就是prototype作用域的对象了
		PrototypeBean bean = applicationContext.getBean(PrototypeBean.class);
		System.out.println("prototypeBean = " + bean);
		// 由于是在使用prototypeBean的时候注入的(即在方法内注入的),所以称为方法注入
		bean.addAndPrint(a);
	}
}
