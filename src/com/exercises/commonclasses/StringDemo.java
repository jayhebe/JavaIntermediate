package com.exercises.commonclasses;

public class StringDemo
{
    public static void main(String[] args)
    {
//        String str = "abcdefg";
//        System.out.println(reverse(str, 2, 5));
//        System.out.println(reverseBuilder(str, 2, 5));

        String str = "abkkcadkabkebabfkabkskabab";
        String subStr = "ab";
        System.out.println(stringBuilderCounter(str, subStr));
        System.out.println(stringCounter(str, subStr));
    }

    public static String reverse(String str, int startIndex, int endIndex)
    {
        if (str != null)
        {
            char[] chars = str.toCharArray();
            for (int x = startIndex, y = endIndex; x < y; x++, y--)
            {
                char temp = chars[x];
                chars[x] = chars[y];
                chars[y] = temp;
            }

            return new String(chars);
        }

        return null;
    }

    public static String reverseBuilder(String str, int startIndex, int endIndex)
    {
        if (str != null)
        {
            StringBuilder builder = new StringBuilder(str.length());

            builder.append(str.substring(0, startIndex));
            for (int i = endIndex; i >= startIndex; i--)
            {
                builder.append(str.charAt(i));
            }
            builder.append(str.substring(endIndex + 1));

            return builder.toString();
        }

        return null;
    }

    public static int stringBuilderCounter(String oriStr, String subStr)
    {
        int count = 0;
        StringBuilder builder = new StringBuilder(oriStr);
        while (builder.indexOf(subStr) != -1)
        {
            count++;
            builder.delete(builder.indexOf(subStr), builder.indexOf(subStr) + subStr.length());
        }

        return count;
    }

    public static int stringCounter(String oriStr, String subStr)
    {
        int count = 0;
        while (oriStr.contains(subStr))
        {
            count++;
            oriStr = oriStr.substring(oriStr.indexOf(subStr) + subStr.length());
        }

        return count;
    }
}
