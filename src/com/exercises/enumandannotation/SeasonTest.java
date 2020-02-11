package com.exercises.enumandannotation;

public class SeasonTest
{
    public static void main(String[] args)
    {
        System.out.println(Season.SPRING);
        System.out.println(Season.SUMMER);
        System.out.println(Season.AUTUMN);
        System.out.println(Season.WINTER);

        System.out.println("----------------------------------");

        System.out.println(MySeason.SPRING);
        System.out.println(MySeason.SUMMER);
        System.out.println(MySeason.AUTUMN);
        System.out.println(MySeason.WINTER);

        System.out.println("----------------------------------");

        MySeason[] mySeason = MySeason.values();
        for (MySeason season : mySeason)
        {
            System.out.println(season);
        }

        System.out.println("----------------------------------");

        Thread.State[] states = Thread.State.values();
        for (Thread.State state : states)
        {
            System.out.println(state);
        }
    }
}

class Season
{
    private final String seasonName;
    private final String seasonDesc;

    private Season(String seasonName, String seasonDesc)
    {
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }

    public static final Season SPRING = new Season("Spring", "Warm Spring");
    public static final Season SUMMER = new Season("Summer", "Hot Summer");
    public static final Season AUTUMN = new Season("Autumn", "Cool Autumn");
    public static final Season WINTER = new Season("Winter", "Cold Winter");

    public String getSeasonName()
    {
        return seasonName;
    }

    public String getSeasonDesc()
    {
        return seasonDesc;
    }

    @Override
    public String toString()
    {
        return "Season{" +
                "seasonName='" + seasonName + '\'' +
                ", seasonDesc='" + seasonDesc + '\'' +
                '}';
    }
}
