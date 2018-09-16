package com.javarush.task.task05.task0508;

public class MyFile {
    private String fileName = null;

    public void initialize(String name){
        this.fileName = name;
    }

    public void initialize (String folder, String name){
        this.fileName = folder + name;
    }

    public void initialize (MyFile file, String name){
        this.fileName = file.getFolder() + name;
    }

    private String getFolder() {
        return fileName;
    }
}
