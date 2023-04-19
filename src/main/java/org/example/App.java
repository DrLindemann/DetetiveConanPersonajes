package org.example;

import com.google.gson.Gson;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws FileNotFoundException {
        Gson gson = new Gson();
        BaseDeDatos baseDeDatos = gson.fromJson(new FileReader("detective_conan.json"), BaseDeDatos.class);
        System.out.println( baseDeDatos.toString());
    }
}
