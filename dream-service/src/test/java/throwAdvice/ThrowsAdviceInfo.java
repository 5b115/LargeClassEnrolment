package throwAdvice;

import java.lang.reflect.Method;

import org.springframework.aop.ThrowsAdvice;

public class ThrowsAdviceInfo implements ThrowsAdvice{
	public void afterThrowing(Method method,Object[] args,Object target,Exception e){
		System.out.println("\n�׳�֪ͨ��׽����Ŀ�귽���������쳣��\n"+method);
	}
}
