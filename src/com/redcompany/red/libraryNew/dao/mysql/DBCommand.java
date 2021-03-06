package com.redcompany.red.libraryNew.dao.mysql;


import com.redcompany.red.libraryNew.entity.Author;
import com.redcompany.red.libraryNew.entity.Book;
import com.redcompany.red.libraryNew.entity.Library;

import java.util.List;

public interface DBCommand {

    Library getLibrary();
    List<Author> getAuthorList();
    List<Book> getBookList();
    void addNewAuthorInDb(String author_name);
    void addNewBookInDb(String book_name);
    void deleteBookInDb(String id_book);
    void editBookInDb(String id_book,String book_name );
    Book findBookInDb(String book_name );


}
