package throwAdvice;

import java.lang.reflect.Method;

import org.springframework.aop.ThrowsAdvice;

public class ThrowsAdviceInfo implements ThrowsAdvice{
	public void afterThrowing(Method method,Object[] args,Object target,Exception e){
		System.out.println("\n抛出通知捕捉到的目标方法发生的异常：\n"+method);
	}
}
