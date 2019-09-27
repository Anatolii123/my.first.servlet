package org.mycompany.myname;

import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloServlet extends HttpServlet {
    public void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws IOException {
        PrintWriter writer = httpServletResponse.getWriter();
//        writer.print("<h1>Hello from servlet</h1>");
        writer.print("<!DOCTYPE html>\n" +
                "<html>\n" +
                "<head>\n" +
                "<meta charset=\"utf-8\">\n" +
                "<title>Обработка данных форм</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "    <form action=\"/servlet2\">\n" +
                "        <table width=\"200%\" cellspacing=\"0\" cellpadding=\"4\">\n" +
                "         <tr>\n" +
                "             <td align=\"right\" width=\"100\">Name:</td>\n" +
                "             <td><input type=\"text\" name=\"TEXT_1\" maxlength=\"50\" size=\"20\"></td>\n" +
                "         </tr>\n" +
                "         <tr>\n" +
                "             <td align=\"right\">Surname:</td>\n" +
                "             <td><input type=\"text\" name=\"TEXT_2\" maxlength=\"50\" size=\"20\"></td>\n" +
                "         </tr>\n" +
                "         <tr>\n" +
                "             <td align=\"right\">Date of Birth:</td>\n" +
                "             <td><input type=\"text\" name=\"TEXT_3\" maxlength=\"50\" size=\"20\"></td>\n" +
                "         </tr>\n" +
                "         <tr>\n" +
                "             <td align=\"right\">Gender:</td>\n" +
                "             <td><select type=\"select\" name=\"TEXT_4\" rows=\"1\">\n" +
                "                  <option>male</option>\n" +
                "                  <option>female</option>\n" +
                "                  <option>undefined</option>\n" +
                "                 </select>\n" +
                "             </td>\n" +
                "         </tr>\n" +
                "         <tr>\n" +
                "               <td align=\"right\">Do you want ot speak about the bug?</td>\n" +
                "               <td>\n" +
                "                   <input name=\"TEXT_6\" type=\"radio\" value=\"Yes\"> Yes\n" +
                "                   <input name=\"TEXT_6\" type=\"radio\" value=\"Yes\"> Yes\n" +
                "                   <input name=\"TEXT_6\" type=\"radio\" value=\"Yes\" checked> Yes\n" +
                "               </td>\n" +
                "         </tr>\n" +
                "         <tr>\n" +
                "             <td align=\"right\" valign=\"top\">Comments</td>\n" +
                "             <td><textarea name=\"TEXT_5\" cols=\"35\" rows=\"10\"></textarea></td>\n" +
                "         </tr>\n" +
                "        </table>\n" +
                "        <br>\n" +
                "        <input type=\"submit\">\n" +
                "    </form>\n" +
                "</body>\n" +
                "</html>");
        writer.close();
    }
}