package com.euro;


import com.euro.console.ConsoelServiceImp;
import com.euro.console.ConsoleService;

public class Runner {

    public static void main(String[] args){


        ConsoleService consoleService = new ConsoelServiceImp();
        consoleService.startUp();


    }

}
