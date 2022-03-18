package host.ankh.testBean.methodInject;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author ankh
 * @created at 2022-03-14 8:26 PM
 */
@Component
@Scope("prototype")
public class PrototypeBean {
	int i;

	public PrototypeBean() {
		System.out.println("prototype bean created");
	}

	public void addAndPrint(int a) {
		i += a;
		System.out.println("i:" + i);
	}

}
