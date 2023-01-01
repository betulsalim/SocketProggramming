package com.example.socketproggramming;

import java.io.Serial;
import java.io.Serializable;

public class User implements Serializable {
    @Serial
    private static final long serialVersionUID = 4801633306273802062L;
    public String nameString;
    public String fullNameString;
    public String passwordString;
    public String emailString;
    public String genderString;
    public String phoneNumberString;


    @Override
    public String toString() {
//        Room room = new Room();
        return nameString + " " + passwordString+" ";
    }
}