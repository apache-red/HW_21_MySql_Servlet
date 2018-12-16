package com.redcompany.red.libraryNew.controller.webCommand;


import com.redcompany.red.libraryNew.controller.webCommand.impl.ShowAllCommand;

public class CommandManagerWeb {

    public static BasicCommandWeb defineAction(String action) {
        switch (action) {
            case "1":
               return new ShowAllCommand();
//            case "2":
//                return new TwoActionImpl();
           default:
                return null;
        }
    }
}
