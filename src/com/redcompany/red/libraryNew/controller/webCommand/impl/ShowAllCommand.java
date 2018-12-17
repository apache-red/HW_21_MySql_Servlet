package com.redcompany.red.libraryNew.controller.webCommand.impl;


import com.redcompany.red.libraryNew.controller.webCommand.BasicCommandWeb;
import com.redcompany.red.libraryNew.dao.DataBase;
import com.redcompany.red.libraryNew.dao.mysql.BookDaoSQLImpl;
import com.redcompany.red.libraryNew.entity.Author;
import com.redcompany.red.libraryNew.service.DBService;
import com.redcompany.red.libraryNew.service.impl.RegularDBServiceImpl;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


public class ShowAllCommand implements BasicCommandWeb {

    private DBService dbService;
    private List<Author> authorList;
    private BookDaoSQLImpl bookDaoSQL;

    @Override
    public void performAction(HttpServletRequest req, HttpServletResponse resp) throws IOException {

        DataBase dataBase = new DataBase();

        bookDaoSQL = dataBase.gedDataBase();
        dbService = new RegularDBServiceImpl();
        authorList = dbService.geAllDataFromLibrary(bookDaoSQL);

        for (int i = 0; i < authorList.size(); i++) {
            resp.getWriter().write(
                    "<body>\n" +
                            authorList.get(i)+
                            "<br>" +
                            authorList.get(i).getBooks() +
                            "<br>" +
                            "</body>");
        }
        resp.getWriter().write( "<body>\n" +
        "<input type=\"button\" value=\"<== Previous page\" onclick=\"history.back()\">\n" +
                "</body>");
    }


}



