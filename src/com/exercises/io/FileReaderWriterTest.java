package com.exercises.io;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriterTest {
    public static void main(String[] args) {
//        testFileReader1();
//        testFileReader2();
//        testFileWriter();
        copyFileContent();
    }

    public static void testFileReader1() {
        FileReader fr = null;
//        System.out.println(file.getAbsolutePath());
        try {
            File file = new File("hello.txt");
            fr = new FileReader(file);
            //返回读入的一个字符，如果文件到达末尾，返回-1
            int data;
            while ((data = fr.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fr != null) {
                    fr.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void testFileReader2() {
        FileReader fr = null;
        try {
            File file = new File("hello.txt");
            fr = new FileReader(file);
            char[] cbuf = new char[5];
            int len;
            while ((len = fr.read(cbuf)) != -1) {
//                for (int i = 0; i < len; i++)
//                {
//                    System.out.print(cbuf[i]);
//                }
                String str = new String(cbuf, 0, len);
                System.out.print(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fr != null) {
                    fr.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void testFileWriter() {
        FileWriter fw = null;
        try {
            File file = new File("hello.txt");
            fw = new FileWriter(file, true);
            fw.write("\nI will be back!");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fw != null) {
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void copyFileContent() {
        FileReader fr = null;
        FileWriter fw = null;
        File srcFile = new File("hello.txt");
        File destFile = new File("hi.txt");

        try {
            fr = new FileReader(srcFile);
            fw = new FileWriter(destFile);

            char[] content = new char[10];
            int length;
            while ((length = fr.read(content)) != -1) {
//                fw.write(new String(content, 0, length));
                fw.write(content, 0, length);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fw != null) {
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (fr != null) {
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
