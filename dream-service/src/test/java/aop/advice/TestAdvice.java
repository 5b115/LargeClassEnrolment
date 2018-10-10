package aop.advice;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.framework.ProxyFactory;

import beforeAdvice.WriteInformation;

public class TestAdvice {
	WriteInformation writeInfo = new WriteInformation();
	AfterReturningAdvice aRF = new AfterInfo();

	MethodInterceptorInfo aroundAdvice = new MethodInterceptorInfo();

	public void testAround() {
		ProxyFactory pf = new ProxyFactory();// 使用Spring代理工厂
		pf.setTarget(writeInfo);// 设置代理目标
		pf.addAdvice(aroundAdvice);// 织入通知
		WriteInformation wi = (WriteInformation) pf.getProxy();// 由代理工厂生成代理对象
		wi.writeInfo();
	}

	public static void main(String[] args) {
		TestAdvice test = new TestAdvice();
		test.testAround();
	}

}
