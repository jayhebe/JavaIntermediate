package com.exercises.io;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class WordCount
{
    public static void main(String[] args)
    {
        String inputFile = "D:\\article.txt";
        String outputFile = "result.txt";
        getWordCount(inputFile, outputFile);
    }

    public static void getWordCount(String inputFilePath, String outputFilePath)
    {
        BufferedReader br = null;
        BufferedWriter bw = null;
        try
        {
            HashMap<Character, Integer> wordMap = new HashMap<>();
            br = new BufferedReader(new FileReader(new File(inputFilePath)));
            bw = new BufferedWriter(new FileWriter(new File(outputFilePath)));

            char[] data = new char[8];
            int length;
            while ((length = br.read(data)) != -1)
            {
                for (int i = 0; i < length; i++)
                {
                    if (data[i] != '\n' && data[i] != '\r')
                    {
                        if (wordMap.get(data[i]) != null)
                        {
                            int value = wordMap.get(data[i]);
                            wordMap.put(data[i], ++value);
                        } else
                        {
                            wordMap.put(data[i], 1);
                        }
                    }
                }
            }

            Set<Map.Entry<Character, Integer>> wordSet = wordMap.entrySet();
            for (Map.Entry<Character, Integer> entry : wordSet)
            {
                bw.write(entry.getKey() + ":" + entry.getValue());
                bw.newLine();
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            if (bw != null)
            {
                try
                {
                    bw.close();
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }
            }

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