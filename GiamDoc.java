/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlybenhvien;

import javafx.util.converter.PercentageStringConverter;

/**
 *
 * @author admin
 */
public class GiamDoc extends Person{

    public GiamDoc() {
        
    }

    public GiamDoc(String ID, String name, String birthday, String position, String sex, String Username, String password) {
        super(ID, name, birthday, "Giam Doc", sex, Username, password);
    }
    
}
