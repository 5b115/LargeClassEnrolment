package mogul.servlet;

import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * 		���⣺
 * 			��ͬ�û�ʹ����ͬ������
 * 		�����
 * 			ServletContext����
 * 		�ص㣻
 * 			����������
 * 			�û�����
 * 		������
 * 			������Ŀ��
 * 		�������ڣ�
 * 			�������������ر�
 * 		ʹ�ã�
 * 			��ȡServletContext����
 * 				//��һ�ַ�ʽ
				ServletContext sc=this.getServletContext();
				//�ڶ��ַ�ʽ
				ServletContext sc2=this.getServletConfig().getServletContext();
				//�����ַ�ʽ
				ServletContext sc3=req.getSession().getServletContext();
 * 			ʹ��ServletContext����������ݹ���
 * 				//���ݵĴ洢
 * 					sc.setAttribute(String name, Object value);
 *				//���ݵĻ�ȡ
 *					 sc.getAttribute("str")   ���ص���object����
 *				ע�⣺
 *					��ͬ���û����Ը�ServletContext����������ݵĴ�ȡ��
 *					��ȡ�����ݲ������򷵻�null��
 *			��ȡ��Ŀ��web.xml�ļ��е�ȫ����������
 *				String str=sc.getInitParameter(String name);���ݼ������ַ���web.xml�����õ�ȫ�����ݵ�ֵ������String���͡�
 *															������ݲ����ڷ���null��
 *				String str=sc.getInitParameterNames(); ���ؼ��� ��ö�١�
 *				���÷�ʽ��ע��һ��<context-param>��ǩֻ�ܴ洢һ���ֵ�����ݣ����������������ñ�ǩ���д洢��
 *						<context-param>
 ��							<param-name>name</param-name>
 �� 							<param-value>zs</param-value>
 �� 						</context-param>
 *				���ã�����̬���ݺʹ�����н��
 *			��ȡ��Ŀwebroot�µ���Դ�ľ���·����
 *				String path=sc.getRealPath(String path);
 *				��ȡ��·��Ϊ��Ŀ��Ŀ¼��path����Ϊ��Ŀ��Ŀ¼�е�·��
 *			��ȡwebroot�µ���Դ��������
 *				InputStream is=sc.getResourceAsStream(String path);
 *				ע��
 *					���ַ�ʽֻ�ܻ�ȡ��Ŀ��Ŀ¼�µ���Դ������class�ļ�����������Ҫʹ�����������ȡ��
 * 
 * 
 * 
 * @author ACER
 *
 */
public class ServletContextServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		//��ȡServletContext����
			//��һ�ַ�ʽ
			ServletContext sc=this.getServletContext();
			//�ڶ��ַ�ʽ
			ServletContext sc2=this.getServletConfig().getServletContext();
			//�����ַ�ʽ
			ServletContext sc3=req.getSession().getServletContext();
			System.out.println(sc==sc2);
			System.out.println(sc==sc3);
		//ʹ��ServletContext������ɹ���
			//���ݴ洢
			sc.setAttribute("str", "ServletContext����ѧϰ");
			
		//��ȡweb.xml��ȫ����������
			String str=sc.getInitParameter("name");
			System.out.println("ȫ�����ò�����"+str);
		//��ȡ��Ŀ��Ŀ¼�µ���Դ�ľ���·��
			String path=sc.getRealPath("/doc/1.txt");
			System.out.println(path);
		//��ȡwebroot�µ���Դ��������
			InputStream is=sc.getResourceAsStream("/doc/1.txt");
			
	}

}
