package com.euro.console;

import com.euro.database.DbConnection;
import com.euro.model.Match;
import com.euro.model.User;
import com.euro.model.service.MatchImp;
import com.euro.model.service.MatchService;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class ConsoelServiceImp implements ConsoleService {

    // sorry for this code
    String hTeam;
    String gTeam;

    //match class object
    Match match = new Match();

    private Scanner input = new Scanner(System.in);

    private MatchService matchService = new MatchImp();

    private Statement statement;
    private ResultSet resultSet;
    private DbConnection dbConnection = DbConnection.getDbConnection();
    private Connection connection = DbConnection.setConfig();


    //    text color
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    // background color
    public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
    public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
    public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
    public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
    public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
    public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";

    @Override
    public void startUp() {
        int counter = 1;
        int status = 1;


        System.out.println(ANSI_BLUE + "\nwelcome to euro 2020\n" + ANSI_RESET);


        while (status == 1) {

            System.out.println(ANSI_YELLOW + "please enter your username : " + ANSI_RESET);
            String userName = input.nextLine();


            System.out.println(ANSI_YELLOW + "please enter your password :" + ANSI_RESET);
            String password = input.nextLine();

//            getuser from db

            String role = "";
            try {
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery("select * from user where username=\'" + userName + "\' and password =\'" + password + "\';");

                while (resultSet.next()) {
                    role = resultSet.getString("role");
                }


                statement.close();
                resultSet.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }


            counter++;

            if (role.equals("admin")) {
                System.out.println(ANSI_GREEN + "Dear Admin, welcome to the application" + ANSI_RESET);
                System.out.println("please waite 3 second \n");
                showAdminMenu();
                status = 2;

            } else if (role.equals("user")) {
                System.out.println(ANSI_GREEN + "Dear " + userName + ", welcome to the application" + ANSI_RESET);
                System.out.println("please waite 3 second \n");

                // make 3 second delay
                try {
                    TimeUnit.SECONDS.sleep(3);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                showUserMenu();
                status = 2;


            } else if (counter > 3) {
                System.out.println(ANSI_RED + "incorrect username and password");
                System.out.println("Oops! you have tried more than 3 times" + ANSI_RESET);
                status = 0;
            } else {
                System.out.println(ANSI_RED + "incorrect username and password , please try again\n" + ANSI_RESET);

            }
        }


    }

    // test runner
    public static void main(String[] args) {

        MatchImp matchImp =new MatchImp();

//        matchImp.addMatch();



    }

    @Override
    public void showUserMenu() {

        System.out.println(ANSI_BLUE + "****************************************");
        System.out.println("1 > show matches");
        System.out.println("2 > guess the result");
        System.out.println("3 > show top users");
        System.out.println("4 > show score");
        System.out.println("5 > exit");
        System.out.println("****************************************" + ANSI_RESET);


        int choice = 0;

        try {
            System.out.println(ANSI_CYAN + "please enter your choice : " + ANSI_RESET);
            choice = input.nextInt();
        } catch (IllegalArgumentException e) {
            System.err.println("invalid input, try again later.");
        }

        switch (choice) {
            case 1: {
                matchService.showAll();
                break;
            }
            case 5: {
                System.out.println("Thanks for using our app");
                break;
            }
            default:
                System.err.println("invalid input.");
        }

        String selection;

        Scanner scanner = new Scanner(System.in);

        if (choice >= 1 && choice < 5) {
            System.out.println(ANSI_YELLOW + "Do you want to continue ? select y[yes] or n[no] : " + ANSI_RESET);
            selection = scanner.nextLine();


            if (selection.equals("y")) {
                showUserMenu();
            } else if (selection.equals("n")) {
                System.out.println("Good bye");
            }
        }


    }

    @Override
    public void showAdminMenu() {

        System.out.println(ANSI_BLUE + "****************************************");
        System.out.println("1 > show matches");
        System.out.println("2 > new match");
        System.out.println("3 > set match result");
        System.out.println("4 > exit");
        System.out.println("****************************************" + ANSI_RESET);

        // get user choice

        int choice = 0;

        try {
            System.out.println(ANSI_CYAN + "please enter your choice : " + ANSI_RESET);
            choice = input.nextInt();
        } catch (IllegalArgumentException e) {
            System.err.println("invalid input, try again later.");
        }

        switch (choice) {
            case 1: {
                matchService.showAll();
                break;
            }
            case 2 :
                addMatchImp();
                matchService.addMatch2(hTeam,gTeam);
                break;
            case 4: {
                System.out.println("Thanks for using our app");
                break;
            }
            default:
                System.err.println("invalid input.");
        }


        Scanner scanner = new Scanner(System.in);

        if (choice >= 1 && choice < 4) {
            String selection;
            System.out.println(ANSI_YELLOW + "Do you want to continue ? select y[yes] or n[no] : " + ANSI_RESET);
            selection = scanner.nextLine();

            if (selection.equals("y")) {
                showAdminMenu();
            } else if (selection.equals("n")) {
                System.out.println("Good bye");
            }
        }


    }

    // get match details from admin
    public void addMatchImp(){
        Scanner matchInput = new Scanner(System.in);

        System.out.println(ANSI_YELLOW + "please enter host team : " + ANSI_RESET);
//        match.setHostTeam(matchInput.nextLine());

        hTeam = matchInput.nextLine();


        System.out.println(ANSI_YELLOW + "please enter guest team : " + ANSI_RESET);
//        match.setGuestTeam(matchInput.nextLine());

        gTeam = matchInput.nextLine();

        // close scanner
        matchInput.close();
    }




}
