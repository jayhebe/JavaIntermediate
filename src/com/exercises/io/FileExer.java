package com.exercises.io;

import java.io.File;
import java.io.IOException;

public class FileExer {
    public static void main(String[] args) throws IOException {
        File fileDir = new File("D:\\ioexer");
        fileDir.mkdir();

        File testDir1 = new File(fileDir.getAbsolutePath() + File.separator + "io1");
        File testDir2 = new File(fileDir.getAbsolutePath() + File.separator + "io2");
        File testDir3 = new File(fileDir.getAbsolutePath() + File.separator + "io3");
//        System.out.println(testDir1);

//        testDir1.mkdir();
//        testDir2.mkdir();
//        testDir3.mkdir();

        File testFile1 = new File("D:\\ioexer\\text1.txt");
        File testFile2 = new File("D:\\ioexer\\text1.jpg");
        File testFile3 = new File("D:\\ioexer\\text2.jpg");

//        if (!testFile1.exists())
//        {
//            testFile1.createNewFile();
//        }
//
//        if (!testFile2.exists())
//        {
//            testFile2.createNewFile();
//        }
//
//        if (!testFile3.exists())
//        {
//            testFile3.createNewFile();
//        }

//        if (deleteFile(fileDir, "text1.txt"))
//        {
//            System.out.println("Deleted successful.");
//        }

        listFiles("D:\\ioexer", ".jpg");
    }

    public static boolean deleteFile(File file, String fileName) {
        boolean result = false;
        File delFile = new File(file, fileName);
        if (delFile.exists()) {
            result = delFile.delete();
        }
        return result;
    }

    public static void listFiles(String directory, String extension) {
        File dir = new File(directory);
        String[] allFiles = dir.list();
        for (String file : allFiles) {
            if (file.endsWith(extension)) {
                System.out.println(file);
            }
        }
    }
}
