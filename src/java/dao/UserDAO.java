/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.ResultSet;
import entity.UserEntity;
import entity.LinkEntity;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * @author admin
 */
public class UserDAO extends DBContext {

  public UserDAO() {}

  public void insertUser(String name, String position, int age, String email, String password) {
    String sql =
        """
                      Insert into [User]
                       values (?,?,?)""";
    try {

      PreparedStatement ps = connection.prepareStatement(sql);
      ps.setString(1, name.trim());
      ps.setString(2, position.trim());
      ps.setInt(3, age);
      ps.setString(4, email);
      ps.setString(5, password);
      ps.executeUpdate();
    } catch (SQLException e) {
    }
  }

  public UserEntity getUserByEmail(String email) {
    String sql = " SELECT * FROM [User] WHERE [email] = ? ";
    try {
      PreparedStatement ps = connection.prepareStatement(sql);
      ps.setString(1, email);
      ResultSet rs = ps.executeQuery();
      while (rs.next()) {

        UserEntity u =
            new UserEntity(
                rs.getInt(1),
                rs.getString(2),
                rs.getString(3),
                rs.getString(4),
                rs.getString(5),
                rs.getString(6),
                rs.getInt(7));
        return u;
      }

    } catch (Exception e) {
      System.out.println(e);
    }
    return null;
  }

  public ArrayList<UserEntity> getAllUser() {
    ArrayList<UserEntity> list = new ArrayList<>();
    String sql = "select * from [User]";
    try {
      PreparedStatement ps = connection.prepareStatement(sql);
      ResultSet rs = ps.executeQuery();
      while (rs.next()) {
        list.add(
            new UserEntity(
                rs.getInt(1),
                rs.getString(2),
                rs.getString(3),
                rs.getString(4),
                rs.getString(5),
                rs.getString(6),
                rs.getInt(7)));
      }

    } catch (Exception e) {
      System.out.println(e);
    }
    return list;
  }

  public UserEntity getUserById(int id) {
    String sql = "select * from [User] where [id]=?";
    try {
      PreparedStatement ps = connection.prepareStatement(sql);
      ps.setInt(1, id);
      ResultSet rs = ps.executeQuery();
      while (rs.next()) {

        UserEntity u =
                new UserEntity(
                rs.getInt(1),
                rs.getString(2),
                rs.getString(3),
                rs.getString(4),
                rs.getString(5),
                rs.getString(6),
                rs.getInt(7));
                
                
        return u;
        
      }

    } catch (Exception e) {
      System.out.println(e);
    }
    return null;
  }

  public void UpdateUser(int id, String name, String position, int age) {
    //        String sql = " update [User] set [name]=? [position]=?, where [id] =?";
    //        String sql = " UPDATE [user] \n"
    //                + "  SET name=?  position=? \n"
    //                + "  WHERE id=? ";
    String sql = " update [User] set [name] = ?, [position] = ?, [age] = ? WHERE [id] = ? ";
    try {
      PreparedStatement ps = connection.prepareStatement(sql);
      //            ps.setInt(1, id);
      //            ps.setString(2, name);
      //            ps.setString(3, positon);
      //            ps.setInt(4, age);
      ////            ps.setInt(4, id);
      ps.setString(1, name);
      ps.setString(2, position);
      ps.setInt(3, age);
      ps.setInt(4, id);
      ps.executeUpdate();
    } catch (Exception e) {
    }
  }

  {
  }

  public ArrayList<LinkEntity> getAllLink(int userid) {
    ArrayList<LinkEntity> list2 = new ArrayList<>();
    String sql = "select * from [link] Where userid=?";
    try {
        
      PreparedStatement ps = connection.prepareStatement(sql);
      ps.setInt(1, userid);
      ResultSet rs = ps.executeQuery();
      while (rs.next()) {
        list2.add(
            new LinkEntity(
                rs.getInt(1),
                rs.getString(2),
                rs.getString(3),
                rs.getInt(4)));
        
      }

    } catch (Exception e) {
      System.out.println(e);
    }
    return list2;
  }
  
   public void DeleteUserLink(int id) {
    String sql = " DELETE FROM link WHERE id = ?;";
    try {
      PreparedStatement ps = connection.prepareStatement(sql);
      ps.setInt(1, id);
      ps.executeUpdate();
    } catch (Exception e) {
    }
  }
  
 

  public void DeleteUser(int id) {
    String sql = " delete [USER] where id = ?";
    try {
      PreparedStatement ps = connection.prepareStatement(sql);
      ps.setInt(1, id);
      ps.executeUpdate();
    } catch (Exception e) {
    }
  }

  public void insertUserWithEmailPassword(String email, String password) {
    String sql =
        "  Insert into [User]( [email],[password])\n" + "                       values (?,?)  ";

    try {

      PreparedStatement ps = connection.prepareStatement(sql);
      ps.setString(1, email);
      ps.setString(2, password);
      ps.executeUpdate();
    } catch (SQLException e) {
    }
  }

  public void insertUserLink(String name, String url, int userid) {
    String sql = "  Insert INTO link (name,url,userid)\n" + "VALUES (?, ? , ?); ";
    try {
      PreparedStatement ps = connection.prepareStatement(sql);
      ps.setString(1, name);
      ps.setString(2, url);
      ps.setInt(3, userid);
      ps.executeUpdate();
    } catch (SQLException e) {
    }
  }

  public static void main(String[] args) {
    UserDAO u = new UserDAO();
    //    var list = u.getAllUser();
    //    for (UserEntity gay : list) {
    //      System.out.println(gay.getAge());
    //    }
    //    //      u.insertUser("Canh", "6", 6);
    //
    //    //        u.UpdateUser(3, "Canh", "Ninh Binh", 6);
    //    u.insertUserWithEmailPassword("canh@123455555", "1235555555");

    //    var url2 = u.getUserLink(url);
    //    System.out.println(url2);
    //    u.insertUserLink("ca", "https://www.facebook.com/profile.php?id=100086601836004", 11);
    //    u.insertUserLink("Canh", "https://www.facebook.com/profile.php?id=100009596589840", 11);
    System.out.println(u.getAllLink(11));
}
}
