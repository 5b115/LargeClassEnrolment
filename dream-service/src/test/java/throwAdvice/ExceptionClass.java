package throwAdvice;

public class ExceptionClass {
	public void createAnException() throws ArithmeticException{
		System.out.println("目标方法抛出异常！");
		throw new ArithmeticException("被除数为0");
	}
}
