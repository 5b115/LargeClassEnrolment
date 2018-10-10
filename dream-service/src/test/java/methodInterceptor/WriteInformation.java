package methodInterceptor;
public class WriteInformation {
	public void writeInfo() {//目标方法
		System.out.println("This method:"+this.getClass().getName());
	}
}