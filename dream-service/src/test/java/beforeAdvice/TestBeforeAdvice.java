package beforeAdvice;

import org.springframework.aop.BeforeAdvice;
import org.springframework.aop.framework.ProxyFactory;

public class TestBeforeAdvice {
	public static void main(String[] args) {
		WriteInformation writeInfo = new WriteInformation();
		writeInfo.writeInfo();
		
		BeforeAdvice ba = new BeforInfo();
		ProxyFactory pf = new ProxyFactory();//使用Spring代理工厂
		pf.setTarget(writeInfo);//设置代理目标
		pf.addAdvice(ba);//织入通知
		
		WriteInformation wi = (WriteInformation) pf.getProxy();//由代理工厂生成代理对象
		wi.writeInfo();
	}
}
