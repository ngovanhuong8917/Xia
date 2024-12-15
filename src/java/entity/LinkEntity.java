/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package entity;

/**
 * @author admin
 */
public class LinkEntity {
        private int id;
        private String name;
        private String url;
        private int userid;

    public LinkEntity() {
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public LinkEntity(int id, String name, String url, int userid) {
        this.id = id;
        this.name = name;
        this.url = url;
        this.userid = userid;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }

    public int getUserid() {
        return userid;
    }
        
        
}
