package com.exercises.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CodeLinesCounter
{
    private static int codeLines = 0;
    private static int fileCount = 0;

    public static void main(String[] args)
    {
        String filePath = "D:\\Java";
        String fileExtension = ".java";
        getCodeLines(filePath, fileExtension);
        System.out.println("Total files of " + fileExtension + ": " + fileCount);
        System.out.println("Total lines of " + fileExtension + ": " + codeLines);
    }

    public static void getCodeLines(String dirPath, String fileExtension)
    {
        File dir = new File(dirPath);
        File[] allFiles = dir.listFiles();
        if (allFiles != null)
        {
            for (File file : allFiles)
            {
                dirPath = file.getPath();
                if (file.isDirectory())
                {
                    getCodeLines(dirPath, fileExtension);
                } else
                {
                    if (dirPath.endsWith(fileExtension))
                    {
                        fileCount++;
                        getLines(dirPath);
                    }
                }
            }
        }
    }

    private static void getLines(String filePath)
    {
        BufferedReader br = null;

        try
        {
            System.out.println("Calculating file: " + filePath);

            br = new BufferedReader(new FileReader(new File(filePath)));

            while (br.readLine() != null)
            {
                codeLines++;
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            if (br != null)
            {
                try
                {
                    br.close();
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
        }
    }
}
