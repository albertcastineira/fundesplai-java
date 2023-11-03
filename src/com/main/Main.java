package com.main;
import com.actions.HelloWorld;
public class Main {
    public static void main(String[] args) {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.greetings();
    }

    public String saludar(){
        return "Hi";
    }
}
