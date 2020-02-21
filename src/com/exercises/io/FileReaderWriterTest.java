package com.exercises.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderWriterTest
{
    public static void main(String[] args)
    {
//        testFileReader1();
        testFileReader2();
    }

    public static void testFileReader1()
    {
        FileReader fr = null;
//        System.out.println(file.getAbsolutePath());
        try
        {
            File file = new File("hello.txt");
            fr = new FileReader(file);
            //返回读入的一个字符，如果文件到达末尾，返回-1
            int data;
            while ((data = fr.read()) != -1)
            {
                System.out.print((char) data);
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                if (fr != null)
                {
                    fr.close();
                }
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }
    }

    public static void testFileReader2()
    {
        FileReader fr = null;
        try
        {
            File file = new File("hello.txt");
            fr = new FileReader(file);
            char[] cbuf = new char[5];
            int len;
            while ((len = fr.read(cbuf)) != -1)
            {
//                for (int i = 0; i < len; i++)
//                {
//                    System.out.print(cbuf[i]);
//                }
                String str = new String(cbuf, 0, len);
                System.out.print(str);
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                if (fr != null)
                {
                    fr.close();
                }
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }
    }
}
