package was;

import jakarta.servlet.*;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class MyServlet extends HttpServlet {
    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doGet(req, resp);
        resp.setContentType("text/html;charset=utf-8");
        PrintWriter out=resp.getWriter();
        out.print("<html>");
        out.print("<body bgcolor=yellow>");
        out.print("<h4>");
        // 웹 컨테이너에 의해 init 에서 전달받은 servletConfig(사원증) 객체를 반환받아 확인
        ServletConfig servletConfig=this.getServletConfig();
        out.print("ServletConfig : "+servletConfig.toString());
        out.print("</h4>");
        // 연습차원에서 spring 설정파일경로정보를 얻기
        String springConfig=servletConfig.getInitParameter("contextConfigLocation");
        out.print("스프링 설정파일경로:"+springConfig);
        out.print("<br><br>"+servletConfig.getServletName());
        out.print("<br><br> ServletConfig로부터 ServletContext 주소값 반환:"
                +servletConfig.getServletContext());
        ServletContext servletContext=getServletConfig().getServletContext();
        String securityInfo=servletContext.getInitParameter("securityLocation");
        out.print("<br><br> security info:"+securityInfo);
        out.print("</body>");
        out.print("</html>");
        out.close();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.service(req, resp);
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        super.service(req, res);
    }
}
