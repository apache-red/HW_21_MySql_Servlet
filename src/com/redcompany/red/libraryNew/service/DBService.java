package com.redcompany.red.libraryNew.service;


import com.redcompany.red.libraryNew.dao.mysql.DBCommand;
import com.redcompany.red.libraryNew.entity.Author;

import java.util.List;

public interface DBService {


    List<Author> getCatalogListFromLibrary(DBCommand dbCommand);
}
