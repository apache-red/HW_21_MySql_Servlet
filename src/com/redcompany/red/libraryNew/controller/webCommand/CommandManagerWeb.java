package com.redcompany.red.libraryNew.controller.webCommand;


import com.redcompany.red.libraryNew.controller.webCommand.impl.*;

public class CommandManagerWeb {

    public static BasicCommandWeb defineAction(String action) {
        switch (action) {
            case "1":
               return new ShowAllCommand();
            case "2":
                return new ShowAuthorsCommand();
            case "3":
                return new ShowAllBooksCommand();
            case "add_author":
                return new AddNewAuthorCommand();
            case "add_book":
                return new AddNewBookCommand();
            case "delete_book":
                return new DeleteBookByIdCommand();

           default:
                return null;
        }
    }
}
