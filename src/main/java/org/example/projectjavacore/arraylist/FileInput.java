package org.example.projectjavacore.arraylist;

import java.io.*;

public class FileInput {
    public static void main(String[] args) throws IOException {

        String[] names = {"Samir ", " Eli ", "Vaqif"};
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("file.txt"));

        bufferedWriter.write("Salam necesen ne var ne yox? \nsagol yaxsiyam sen necesen neyniyirsen?");


        for (String name : names) {
            bufferedWriter.write(name + "\n");
        }
        bufferedWriter.close();

        BufferedReader bufferedReader = new BufferedReader(new FileReader("file.txt"));
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }


    }
}
