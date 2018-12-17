package com.redcompany.red.libraryNew.service;


import com.redcompany.red.libraryNew.dao.mysql.DBCommand;
import com.redcompany.red.libraryNew.entity.Author;
import com.redcompany.red.libraryNew.entity.Book;

import java.util.List;

public interface DBService {


    List<Author> geAllDataFromLibrary(DBCommand dbCommand);
    List<Author> getAuthorListFromLibrary(DBCommand dbCommand);
    List<Book> getBookListFromLibrary(DBCommand dbCommand);
    void addNewAuthor(DBCommand dbCommand, String author_name);
    void addNewBook(DBCommand dbCommand, String book_name);
}
