package com.liupeng.example10io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TestFile{
    public static void main(String[] args){
        File f = new File("src/main/java/com/liupeng/example10io/123.txt");
        FileWriter fw;
        try {
            f.createNewFile();
            fw = new FileWriter(f);
            fw.write("test123");
            fw.flush();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
