package com.brojang.java.ex10.except.trycatchresources;

public class FileInputStream implements AutoCloseable {

    private String file;

    public FileInputStream(String file) {
        this.file = file;
    }

    public void read() {
        System.out.println(file + " is opened");
    }

    @Override
    public void close() throws Exception {
        System.out.println(file + "is closed");
    }
}
