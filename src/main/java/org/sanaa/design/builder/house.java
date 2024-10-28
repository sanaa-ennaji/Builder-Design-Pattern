package org.sanaa.design.builder;

public class house {

    private Long id;
    private  int rooms;
    private  String roofType;
    private  int floors;
    private  boolean hasGarage;
    private  boolean hasGarden;

    public house(String roofType, int floors, boolean hasGarage, boolean hasGarden) {
        this.roofType = roofType;
        this.floors = floors;
        this.hasGarage = hasGarage;
        this.hasGarden = hasGarden;
    }

    public int getRooms() { return rooms; }
    public String getRoofType() { return roofType; }
    public int getFloors() { return floors; }
    public boolean hasGarage() { return hasGarage; }
    public boolean hasGarden() { return hasGarden; }
}



