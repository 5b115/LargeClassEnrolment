package throwAdvice;

import org.springframework.aop.ThrowsAdvice;
import org.springframework.aop.framework.ProxyFactory;

public class TestThrowAdvice {

	public static void main(String[] args) {
		ExceptionClass exceptionClass = new ExceptionClass();
		ThrowsAdvice ta = new ThrowsAdviceInfo();
		ProxyFactory pf = new ProxyFactory();
		pf.setTarget(exceptionClass);
		pf.addAdvice(ta);
		ExceptionClass ec = (ExceptionClass) pf.getProxy();
		try {
			ec.createAnException();
		} catch (Exception ex) {
			System.out.println("\n已经捕捉到异常错误信息：" + ex.getMessage());
		}

	}
}
