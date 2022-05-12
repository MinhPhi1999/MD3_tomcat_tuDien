package com.example.tudien;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "Translate", value = "/translate")
public class Translation extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Map<String, String> dictionary = new HashMap<>();
        dictionary.put("hello","Xin chào");
        dictionary.put("how","thế nào");
        dictionary.put("book","Sách");
        dictionary.put("Computer","Máy tính");
        String search = req.getParameter("word");
        PrintWriter printWriter = resp.getWriter();
        printWriter.println("<html>");
        String result = dictionary.get(search);
        if (result != null){
            printWriter.println("Word: " + search);
            printWriter.println("Result: " + result);
        }else {
            printWriter.println("not found");
        }
        printWriter.println("</html>");
    }
}