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

import static com.redcompany.red.libraryNew.controller.webCommand.util.WebConstant.REO_PARAM_BOOK_NAME;
import static com.redcompany.red.libraryNew.controller.webCommand.util.WebConstant.REO_PARAM_ID_BOOK;

public class FindBookByTitleCommand implements BasicCommandWeb {

    private DBService dbService;
    private BookDaoSQLImpl bookDaoSQL;
    private Book book;

    @Override
    public void performAction(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        DataBase dataBase = new DataBase();

        String id_book = req.getParameter(REO_PARAM_BOOK_NAME);
        //add validation
        if(id_book != null) {

            bookDaoSQL = dataBase.gedDataBase();
            dbService = new RegularDBServiceImpl();
            book = dbService.findBook(bookDaoSQL,id_book);
        }
        resp.getWriter().write( "<body>\n" +
                "Book was deleted"+
                book +
                "<input type=\"button\" value=\"<== Previous page\" onclick=\"history.back()\">\n" +
                "</body>");
    }

}
