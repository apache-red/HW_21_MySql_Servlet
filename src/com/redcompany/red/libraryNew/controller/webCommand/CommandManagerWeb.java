package com.redcompany.red.libraryNew.controller.webCommand;


import com.redcompany.red.libraryNew.controller.webCommand.impl.ShowAllBooksCommand;
import com.redcompany.red.libraryNew.controller.webCommand.impl.ShowAllCommand;
import com.redcompany.red.libraryNew.controller.webCommand.impl.ShowAuthorsCommand;

public class CommandManagerWeb {

    public static BasicCommandWeb defineAction(String action) {
        switch (action) {
            case "1":
               return new ShowAllCommand();
            case "2":
                return new ShowAuthorsCommand();
            case "3":
                return new ShowAllBooksCommand();
           default:
                return null;
        }
    }
}
