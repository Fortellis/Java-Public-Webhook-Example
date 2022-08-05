import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HealthCheck extends HttpServlet{

    public HealthCheck(){
        super();
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{ 
        PrintWriter healthCheckResponse = response.getWriter();
        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");
        response.setStatus(HttpServletResponse.SC_OK);
        healthCheckResponse.print("{\"status\": \"Up\"}");
        healthCheckResponse.flush();
    }
}