import mogul.dao.LoginDao;
import mogul.dao.impl.LoginDaoImpl;


public class DaoTest {
	
	public static void main(String[] args) {
		LoginDao l=new LoginDaoImpl();
		System.out.println(l.checkLoginDao("zs","123"));
	}

}
