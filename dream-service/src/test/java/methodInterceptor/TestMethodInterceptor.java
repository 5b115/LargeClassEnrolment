package methodInterceptor;
import org.aopalliance.intercept.MethodInterceptor;
import org.springframework.aop.framework.ProxyFactory;
public class TestMethodInterceptor {
	public static void main(String[] args) {
		WriteInformation writeInfo = new WriteInformation();
		MethodInterceptor mi = new MethodInterceptorInfo();
		ProxyFactory pf = new ProxyFactory();//ʹ��Spring������
		pf.setTarget(writeInfo);//���ô���Ŀ��
		pf.addAdvice(mi);//֯��֪ͨ
		WriteInformation wi = (WriteInformation) pf.getProxy();//�ɴ��������ɴ������
		wi.writeInfo();
	}
}
