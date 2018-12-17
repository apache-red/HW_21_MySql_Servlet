package com.redcompany.red.libraryNew.service;


import com.redcompany.red.libraryNew.dao.mysql.DBCommand;
import com.redcompany.red.libraryNew.entity.Author;

import java.util.List;

public interface DBService {


    List<Author> geAllDataFromLibrary(DBCommand dbCommand);
    List<Author> getAuthorListFromLibrary(DBCommand dbCommand);
}
