package com.exercises.io;

import java.io.File;
import java.io.IOException;

public class FileTest {
    public static void main(String[] args) throws IOException {
        File file1 = new File("hello.txt");
        File file2 = new File("D:\\io\\hello.txt");
        File file3 = new File("D:\\io", "io1");
        File file4 = new File(file3, "hi.txt");
        File file5 = new File("D:\\io\\hi.txt");

//        System.out.println(file1);
//        System.out.println(file2);
//        System.out.println(file3);
//        System.out.println(file4);
//
//        System.out.println(file1.getAbsolutePath());
//        System.out.println(file1.getPath());
//        System.out.println(file1.getName());
//        System.out.println(file1.getParent());
//        System.out.println(file1.length());
//        System.out.println(new Date(file1.lastModified()));
//
//        System.out.println("---------------------------------------------");
//
//        System.out.println(file2.getAbsolutePath());
//        System.out.println(file2.getPath());
//        System.out.println(file2.getName());
//        System.out.println(file2.getParent());
//        System.out.println(file2.length());
//        System.out.println(new Date(file2.lastModified()));
//
//        String[] list = file3.list();
//        for (String f : list)
//        {
//            System.out.println(f);
//        }
//
//        System.out.println("---------------------------------------------");
//
//        File[] files = file3.listFiles();
//        for (File file : files)
//        {
//            System.out.println(file);
//        }

//        boolean b = file1.renameTo(file5);
//        System.out.println(b);

//        System.out.println("---------------------------------------------");
//
//        System.out.println(file1.isDirectory());
//        System.out.println(file1.isFile());
//        System.out.println(file1.exists());
//        System.out.println(file1.canRead());
//        System.out.println(file1.canWrite());
//        System.out.println(file1.isHidden());
//
//        System.out.println("---------------------------------------------");
//
//        System.out.println(file3.isDirectory());
//        System.out.println(file3.isFile());
//        System.out.println(file3.exists());
//        System.out.println(file3.canRead());
//        System.out.println(file3.canWrite());
//        System.out.println(file3.isHidden());
//
//        System.out.println("---------------------------------------------");

//        if (!file4.exists())
//        {
//            file4.createNewFile();
//            System.out.println("Created successful.");
//        }
//        else
//        {
//            file4.delete();
//            System.out.println("Deleted successful.");
//        }

        File file6 = new File("D:\\io\\io1");

        boolean mkdir = file6.mkdir();
        if (mkdir) {
            System.out.println("hehehe");
        }

        boolean mkdirs = file6.mkdirs();
        if (mkdirs) {
            System.out.println("hahaha");
        }
    }
}
