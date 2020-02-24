package com.exercises.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutputStreamExer
{
    public static void main(String[] args)
    {
        String srcFile = "D:\\Itachi.JPG";
        String secretFile = "D:\\Itachi-sec.JPG";
        String newFile = "D:\\Itachi-new.JPG";

        fileEncryption(srcFile, secretFile);
        fileDecryption(secretFile, newFile);
    }

    public static void fileEncryption(String srcFile, String secretFile)
    {
        FileInputStream fis = null;
        FileOutputStream fos = null;

        try
        {
            fis = new FileInputStream(new File(srcFile));
            fos = new FileOutputStream(new File(secretFile));

            byte[] data = new byte[1024];
            int length;
            while ((length = fis.read(data)) != -1)
            {
                for (int i = 0; i < length; i++)
                {
                    data[i] = (byte) (data[i] ^ 5);
                }
                fos.write(data, 0, length);
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            if (fos != null)
            {
                try
                {
                    fos.close();
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }

            }
            if (fis != null)
            {
                try
                {
                    fis.close();
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void fileDecryption(String secretFile, String newFile)
    {
        FileInputStream fis = null;
        FileOutputStream fos = null;

        try
        {
            fis = new FileInputStream(new File(secretFile));
            fos = new FileOutputStream(new File(newFile));

            byte[] data = new byte[1024];
            int length;
            while ((length = fis.read(data)) != -1)
            {
                for (int i = 0; i < length; i++)
                {
                    data[i] = (byte) (data[i] ^ 5);
                }
                fos.write(data, 0, length);
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            if (fos != null)
            {
                try
                {
                    fos.close();
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }

            }
            if (fis != null)
            {
                try
                {
                    fis.close();
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
        }
    }
}
