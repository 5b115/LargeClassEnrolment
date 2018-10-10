package aop.log.advice;

public class TestLog {
	public static void main(String[] args) {
		Login login = new LoginImpl();
		login.login();

		login = (Login) LogProxy.bind(new LoginImpl());// 代理的绑定
		login.login();// 执行目标方法，此时启动代理的invoke方法，该方法自动执行
	}
}