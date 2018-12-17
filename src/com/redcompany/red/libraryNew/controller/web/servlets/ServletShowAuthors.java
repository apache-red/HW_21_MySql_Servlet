package com.redcompany.red.libraryNew.controller.web.servlets;

import com.redcompany.red.libraryNew.controller.webCommand.BasicCommandWeb;
import com.redcompany.red.libraryNew.controller.webCommand.CommandManagerWeb;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/ServletShowAuthors")
public class ServletShowAuthors extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

//        String action = req.getParameter("action");
//        System.out.println("action: " + action);
//        if (action != null) {
//            BasicCommandWeb basicCommandWeb = CommandManagerWeb.defineAction(action);
//            basicCommandWeb.performAction(req, resp);
//
//        }


    }

}
