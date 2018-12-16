package com.redcompany.red.libraryNew.dao;
import com.redcompany.red.libraryNew.dao.mysql.BookDaoSQLImpl;

public class DataBase {


    BookDaoSQLImpl bookDaoSQL = new BookDaoSQLImpl();

   public BookDaoSQLImpl gedDataBase(){
        return bookDaoSQL;
    }

}
