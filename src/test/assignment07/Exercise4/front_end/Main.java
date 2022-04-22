package test.assignment07.Exercise4.front_end;

import test.assignment07.Exercise4.back_end.IOManager;

public class Main {
    public static void main(String[] args) throws Exception {
        var program = new IOManager();
        program.readFile("C:\\Users\\La Van Hai\\Desktop\\Java\\VTI Java Assignments\\src\\test\\assignment07\\Exercise5FileIOStream\\Data\\fileToRead.txt");
        System.out.println();
        program.readFile("C:\\La Van Hai\\Desktop\\Java\\VTI Java Assignments\\src\\test\\assignment07\\Exercise5FileIOStream\\Data\\fileToRead.txt");

    }
}
