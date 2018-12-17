package com.redcompany.red.libraryNew.controller.webCommand.impl;

import com.redcompany.red.libraryNew.controller.webCommand.BasicCommandWeb;
import com.redcompany.red.libraryNew.dao.DataBase;
import com.redcompany.red.libraryNew.dao.mysql.BookDaoSQLImpl;
import com.redcompany.red.libraryNew.service.DBService;
import com.redcompany.red.libraryNew.service.impl.RegularDBServiceImpl;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import static com.redcompany.red.libraryNew.controller.webCommand.util.WebConstant.REO_PARAM_AUTHOR_NAME;
import static com.redcompany.red.libraryNew.controller.webCommand.util.WebConstant.REO_PARAM_BOOK_NAME;

public class AddNewBookCommand implements BasicCommandWeb {


    private DBService dbService;
    private BookDaoSQLImpl bookDaoSQL;

    @Override
    public void performAction(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        DataBase dataBase = new DataBase();

        String book_name = req.getParameter(REO_PARAM_BOOK_NAME);
        //add validation
        if(book_name != null) {
            bookDaoSQL = dataBase.gedDataBase();
            dbService = new RegularDBServiceImpl();
            dbService.addNewBook(bookDaoSQL, book_name);
        }
        resp.getWriter().write( "<body>\n" +
                "Author was added"+
                "<input type=\"button\" value=\"<== Previous page\" onclick=\"history.back()\">\n" +
                "</body>");
    }
}
