package com.redcompany.red.libraryNew.service.impl;


import com.redcompany.red.libraryNew.dao.mysql.DBCommand;
import com.redcompany.red.libraryNew.entity.Author;
import com.redcompany.red.libraryNew.entity.Book;
import com.redcompany.red.libraryNew.entity.Library;
import com.redcompany.red.libraryNew.service.DBService;

import java.util.List;

public class RegularDBServiceImpl implements DBService {
   private DBCommand dbCommand;
   private Library library;
   private List<Author> authorList;
   private List<Book> bookList;




    @Override
    public List<Author> geAllDataFromLibrary(DBCommand dbCommand) {
        library = dbCommand.getLibrary();
        return library.getAuthorList();

    }

    @Override
    public List<Author> getAuthorListFromLibrary(DBCommand dbCommand) {
        return authorList = dbCommand.getAuthorList();
    }

    @Override
    public List<Book> getBookListFromLibrary(DBCommand dbCommand) {
        return bookList = dbCommand.getBookList();
    }

    @Override
    public void addNewAuthor(DBCommand dbCommand, String author_name) {
    dbCommand.addNewAuthorInDb(author_name);
    }

    @Override
    public void addNewBook(DBCommand dbCommand, String book_name) {
        dbCommand.addNewBookInDb(book_name);
    }

    @Override
    public void deleteBook(DBCommand dbCommand, String id_book) {
        dbCommand.deleteBookInDb(id_book);
    }


}
