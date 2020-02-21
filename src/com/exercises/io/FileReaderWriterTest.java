package com.exercises.io;

        import java.io.File;

public class FileReaderWriterTest
{
    public static void main(String[] args)
    {
        File file = new File("hello.txt");
        System.out.println(file.getAbsolutePath());
    }
}
