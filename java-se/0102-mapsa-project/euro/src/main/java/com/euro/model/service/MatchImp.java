package com.euro.model.service;

import com.euro.console.ConsoelServiceImp;
import com.euro.database.DbConnection;
import com.euro.model.Match;
import com.euro.model.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MatchImp implements MatchService {


    private User user;
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet;
    private DbConnection dbConnection = DbConnection.getDbConnection();
    private Connection connection = DbConnection.setConfig();

    //statement
    private Statement statement;

//    @Override
//    public void addMatch(User user) {
//
//        preparedStatement = null;
//
//
//
////        String sql = "insert into match(match_id,host,gust,host_goal,guest_goal,status) values(?,?,?,?)";
//        String sql = "insert into match(match_id,host,guest,host_goal,guest_goal,status)";
//        sql += "values(" + match.getMatch_id() + ",\'" + match.getHostTeam() + "\'";
//        sql += ",\'" + match.getGuestTeam() + "\'," + match.getHostGoal() + "," + match.getGuestGoal();
//        sql += ",\'" + match.getStatus() + "\');";
//
//        try {
//            statement = connection.createStatement();
//            statement.executeUpdate(sql);
//        } catch (SQLException throwables) {
//            throwables.printStackTrace();
//        }
//
//
//    }


    PreparedStatement ps=null;
    @Override
    public void addMatch(Match match) {

        String sql = "insert into euro2020.match(match_id,host,guest,host_goal,guest_goal,status) values(?,?,?,?,?,?)";
        try {
            ps = connection.prepareStatement(sql);
            ps=DbConnection.setConfig().prepareStatement(sql);
            ps.setInt(1, (int) System.currentTimeMillis());
            ps.setString(2,match.getHostTeam());
            ps.setString(3,match.getGuestTeam());
            ps.setInt(4,0);
            ps.setInt(5,0);
            ps.setString(6,"start soon");
            preparedStatement.executeUpdate();
            System.out.println("match added...");

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }


//    not clean and so ugly
    @Override
    public void addMatch2(String hT, String gT) {



        String sql = "insert into euro2020.match(match_id,host,guest,host_goal,guest_goal,status) values(?,?,?,?,?,?);";
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, (int) System.currentTimeMillis());
            preparedStatement.setString(2,hT);
            preparedStatement.setString(3,gT);
            preparedStatement.setInt(4,0);
            preparedStatement.setInt(5,0);
            preparedStatement.setString(6,"start soon");
            preparedStatement.executeUpdate();
            System.out.println("match added...");

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }

    @Override
    public List showAll() {
        ResultSet resultSet = null;
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from euro2020.match");
            while (resultSet.next()) {
                System.out.print("Match id : " + resultSet.getString(1) + "  *** <<" + resultSet.getString(2));
                System.out.print(" " + resultSet.getString(4) + " : " + resultSet.getString(5) + " " + resultSet.getString(3));
                System.out.println(">> ***  " + resultSet.getString(6));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return List.of(resultSet);

    }

    public static void main(String[] args) {

    }


}
