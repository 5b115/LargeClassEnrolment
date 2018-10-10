package methodInterceptor;
import org.aopalliance.intercept.MethodInterceptor;
import org.springframework.aop.framework.ProxyFactory;
public class TestMethodInterceptor {
	public static void main(String[] args) {
		WriteInformation writeInfo = new WriteInformation();
		MethodInterceptor mi = new MethodInterceptorInfo();
		ProxyFactory pf = new ProxyFactory();//使用Spring代理工厂
		pf.setTarget(writeInfo);//设置代理目标
		pf.addAdvice(mi);//织入通知
		WriteInformation wi = (WriteInformation) pf.getProxy();//由代理工厂生成代理对象
		wi.writeInfo();
	}
}
