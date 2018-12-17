package com.redcompany.red.libraryNew.controller.webCommand.impl;

import com.redcompany.red.libraryNew.controller.webCommand.BasicCommandWeb;
import com.redcompany.red.libraryNew.dao.DataBase;
import com.redcompany.red.libraryNew.dao.mysql.BookDaoSQLImpl;
import com.redcompany.red.libraryNew.entity.Book;
import com.redcompany.red.libraryNew.service.DBService;
import com.redcompany.red.libraryNew.service.impl.RegularDBServiceImpl;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import static com.redcompany.red.libraryNew.controller.webCommand.util.WebConstant.REO_PARAM_AUTHOR_NAME;

public class AddNewAuthorCommand implements BasicCommandWeb {

    private DBService dbService;
    private BookDaoSQLImpl bookDaoSQL;

    @Override
    public void performAction(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        DataBase dataBase = new DataBase();

        String author_name = req.getParameter(REO_PARAM_AUTHOR_NAME);
        //add validation
        if(author_name != null) {

            bookDaoSQL = dataBase.gedDataBase();
            dbService = new RegularDBServiceImpl();
            dbService.addNewAuthor(bookDaoSQL, author_name);
        }
        resp.getWriter().write( "<body>\n" +
                "Author was added"+
                "<input type=\"button\" value=\"<== Previous page\" onclick=\"history.back()\">\n" +
                "</body>");
    }



}
