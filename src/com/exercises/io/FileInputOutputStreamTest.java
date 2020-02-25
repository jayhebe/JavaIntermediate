package com.exercises.io;

import java.io.*;

public class FileInputOutputStreamTest {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        copyFile("70-533.pdf", "70-533-copy.pdf");
        long endTime = System.currentTimeMillis();

        System.out.println("File copy time used: " + (endTime - startTime));

        startTime = System.currentTimeMillis();
        copyFileWithBuffer("70-533.pdf", "70-533-buffer.pdf");
        endTime = System.currentTimeMillis();

        System.out.println("File copy with buffer time used: " + (endTime - startTime));
    }

    public static void copyFile(String srcPath, String destPath) {
        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            File srcFile = new File(srcPath);
            File destFile = new File(destPath);

            fis = new FileInputStream(srcFile);
            fos = new FileOutputStream(destFile);

            byte[] data = new byte[1024];
            int length;
            while ((length = fis.read(data)) != -1) {
                fos.write(data, 0, length);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void copyFileWithBuffer(String srcPath, String destPath) {
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;

        FileInputStream fis;
        FileOutputStream fos;

        try {
            File srcFile = new File(srcPath);
            File destFile = new File(destPath);

            fis = new FileInputStream(srcFile);
            fos = new FileOutputStream(destFile);

            bis = new BufferedInputStream(fis);
            bos = new BufferedOutputStream(fos);

            byte[] data = new byte[1024];
            int length;
            while ((length = bis.read(data)) != -1) {
                bos.write(data, 0, length);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bos != null) {
                try {
                    bos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (bis != null) {
                try {
                    bis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
