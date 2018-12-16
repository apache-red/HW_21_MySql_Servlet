package com.redcompany.red.libraryNew.service.impl;


import com.redcompany.red.libraryNew.dao.mysql.DBCommand;
import com.redcompany.red.libraryNew.entity.Author;
import com.redcompany.red.libraryNew.entity.Library;
import com.redcompany.red.libraryNew.service.DBService;

import java.util.List;

public class RegularDBServiceImpl implements DBService {
   private DBCommand dbCommand;
   private Library library;




    @Override
    public List<Author> getCatalogListFromLibrary(DBCommand dbCommand) {
        library = dbCommand.getLibrary();
        return library.getAuthorList();

    }



}
