package com.exercises.io;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest
{
    public static void main(String[] args) throws IOException
    {
//        RandomAccessFile raf = new RandomAccessFile("random.txt", "rw");
//        raf.seek(5);
//        raf.write("xyz".getBytes());
//        raf.close();
        insert(9, " good", "random.txt");
    }

    public static void insert(int offset, String data, String filePath)
    {
        RandomAccessFile raf = null;

        try
        {
            raf = new RandomAccessFile(filePath, "rw");
            StringBuilder tempData = new StringBuilder();
            raf.seek(offset);
            byte[] buffer = new byte[20];
            int length;
            while ((length = raf.read(buffer)) != -1)
            {
                tempData.append(new String(buffer, 0, length));
            }
            raf.seek(offset);
            raf.write(data.getBytes());
            raf.write(tempData.toString().getBytes());
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            if (raf != null)
            {
                try
                {
                    raf.close();
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
        }
    }
}
