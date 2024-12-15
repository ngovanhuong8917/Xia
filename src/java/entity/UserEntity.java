/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author admin
 */
public class UserEntity {
    private int id;
    private String username;
    private String email;
    private String password;
    private String name;
    private String position;
    private int age;
    private String url;
    private int userid;

    public UserEntity() {
       
    }
    public UserEntity(int id,String name,String url,int userid) {
        this.id = id;
        this.name = name;
        this.url = url;
        this.userid = userid;
        
    }
    public UserEntity(int id, String username, String email, String password, String name, String position, int age) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.password = password;
        this.name = name;
        this.position = position;
        this.age = age;
        
    }

    public UserEntity(int id, String username, String email, String password, String name, String position, int age, String url, int userid) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.password = password;
        this.name = name;
        this.position = position;
        this.age = age;
        this.url = url;
        this.userid = userid;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public int getAge() {
        return age;
    }

    public String getUrl() {
        return url;
    }

    public int getUserid() {
        return userid;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    @Override
    public String toString() {
        return "UserEntity{" + "id=" + id + ", username=" + username + ", email=" + email + ", password=" + password + ", name=" + name + ", position=" + position + ", age=" + age + ", url=" + url + ", userid=" + userid + '}';
    }

   

   
    
}