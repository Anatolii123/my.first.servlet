package org.mycompany.myname;

import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class FormServlet extends HttpServlet {
    public void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws IOException {
        PrintWriter writer = httpServletResponse.getWriter();
        writer.print("<h1>Hello from new servlet</h1>");
        writer.close();
    }
}
