package com.techelevator.model;

public class Exercise {

    private int id;
    private String name;
    private String target;
    private String bodyPart;
    private String equipment;
    private String gifUrl;


    public Exercise() {
    }

    public Exercise(int id, String name, String target, String bodyPart, String equipment, String gifUrl) {
        this.id = id;
        this.name = name;
        this.target = target;
        this.bodyPart = bodyPart;
        this.equipment = equipment;
        this.gifUrl = gifUrl;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public String getBodyPart() {
        return bodyPart;
    }

    public void setBodyPart(String bodyPart) {
        this.bodyPart = bodyPart;
    }

    public String getEquipment() {
        return equipment;
    }

    public void setEquipment(String equipment) {
        this.equipment = equipment;
    }

    public String getGifUrl() {
        return gifUrl;
    }

    public void setGifUrl(String gifUrl) {
        this.gifUrl = gifUrl;
    }


}
