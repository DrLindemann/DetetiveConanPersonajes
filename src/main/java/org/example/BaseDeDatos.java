package org.example;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;

public class BaseDeDatos {


    Personaje[] personajes;


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Personaje p : personajes) {
            sb.append(p.toString());
            sb.append("\n");
        }
        return sb.toString();
    }
}
