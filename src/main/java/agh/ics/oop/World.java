package agh.ics.oop;


import agh.ics.oop.gui.App;
import javafx.application.Application;

import java.io.IOException;

public class World {
    public static void main(String[] args) throws IOException {
        System.out.println("system wystartował");
        Application.launch(App.class, args);
        System.out.println("system zakończył działanie");
    }
}


