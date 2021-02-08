package com.company;

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<String[]> data = new ArrayList<>();

        String c = "";
        try {
            BufferedReader prvniBR = new BufferedReader(new FileReader("VF_2015.dat"));

            String nextLine = prvniBR.readLine();

            nextLine = prvniBR.readLine();
            while (nextLine != null){
                prvniBR.readLine();
                String[] row = nextLine.split(",");
                data.add(row);
                nextLine = prvniBR.readLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            BufferedWriter prvniBW = new BufferedWriter(new FileWriter("VF_2015dat"));

            for (int i = 0; i < data.size(); i++) {
                prvniBW.write(data.get(i)[0]);

            }
            prvniBW.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
