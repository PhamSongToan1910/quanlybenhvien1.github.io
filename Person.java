/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlybenhvien;

/**
 *
 * @author admin
 */
public class Person {
    
    public String ID;
    public String name;
    public String birthday;
    public String position;
    public String sex;
    public String Username;
    public String password;

    public Person() {
    }

    public Person(String ID, String name, String birthday, String position, String sex, String Username, String password) {
        this.ID = ID;
        this.name = name;
        this.birthday = birthday;
        this.position = position;
        this.sex = sex;
        this.Username = Username;
        this.password = password;
    }

    public Person(String position, String Username, String password) {
        this.position = position;
        this.Username = Username;
        this.password = password;
    }

    

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
    
    
}
