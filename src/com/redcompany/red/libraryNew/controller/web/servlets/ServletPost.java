package com.redcompany.red.libraryNew.controller.web.servlets;

import com.redcompany.red.libraryNew.controller.webCommand.BasicCommandWeb;
import com.redcompany.red.libraryNew.controller.webCommand.CommandManagerWeb;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/ServletPost")
public class ServletPost extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processRequest(req, resp);
    }


    private void processRequest(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String action = req.getParameter("action");
        System.out.println("action +" + action);
        System.out.println(req.getHeader("User-Agent"));
        System.out.println(req.getParameter(action));

        if(action!=null) {
            BasicCommandWeb basicCommandWeb = CommandManagerWeb.defineAction(action);
            basicCommandWeb.performAction(req, resp);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processRequest(req, resp);
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.service(req, resp);
    }

    @Override
    public void init() throws ServletException {

        super.init();
        System.out.println("init");
    }

}
