package org.example.projectjavacore.handler;

import lombok.extern.slf4j.Slf4j;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

@Slf4j
public class FileNotReader {
    public static void main(String[] args) throws FileNotFoundException {

        try {
            FileReader file = new FileReader("Data.txt");
            file.read();
        } catch (IOException e) {
            e.printStackTrace();
            log.error("Xeta bas verdi : " + e.getMessage());
        } finally {
            System.out.println("File not read");
        }
    }
}
