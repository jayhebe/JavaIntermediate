package com.exercises.enumandannotation;

public enum MySeason {
    SPRING("Spring", "Warm Spring"),
    SUMMER("Summer", "Hot Summer"),
    AUTUMN("Autumn", "Cool Autumn"),
    WINTER("Winter", "Cold Winter");

    private final String seasonName;
    private final String seasonDesc;

    private MySeason(String seasonName, String seasonDesc) {
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }

    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }
}
