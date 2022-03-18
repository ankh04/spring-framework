package host.ankh.testBean.methodInject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author ankh
 * @created at 2022-03-14 8:25 PM
 */
@Component
public class SingletonBean {
	@Autowired
	private PrototypeBean prototypeBean;

	public void add(int a) {
		prototypeBean.addAndPrint(a);
	}

	public PrototypeBean getPrototypeBean() {
		return prototypeBean;
	}
}
