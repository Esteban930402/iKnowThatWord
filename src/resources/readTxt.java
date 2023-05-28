package resources;

import java.io.BufferedReader;
import java.io.FileReader;

public class readTxt {

    private String userID;

    public readTxt(){

    }

    public void readTxt (String direccion){
        try {
            BufferedReader bf = new BufferedReader(new FileReader(direccion));
            String temp = "";
            st

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
