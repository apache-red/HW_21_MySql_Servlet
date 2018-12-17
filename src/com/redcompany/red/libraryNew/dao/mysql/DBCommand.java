package com.redcompany.red.libraryNew.dao.mysql;


import com.redcompany.red.libraryNew.entity.Author;
import com.redcompany.red.libraryNew.entity.Book;
import com.redcompany.red.libraryNew.entity.Library;

import java.util.List;

public interface DBCommand {

    Library getLibrary();
    List<Author> getAuthorList();
    List<Book> getBookList();


}
