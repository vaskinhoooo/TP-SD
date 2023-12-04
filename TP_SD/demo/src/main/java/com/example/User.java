package com.example;

public class User {

    private int ID;
    private String name;
    private Profiles profile;
    private boolean isActive;

    public User(int ID, String name, Profiles profile, boolean isActive) {
        this.ID = ID;
        this.name = name;
        this.profile = profile;
        this.isActive = isActive;
    }
    
    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public Profiles getProfile() {
        return profile;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setProfile(Profiles profile) {
        this.profile = profile;
    }

    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }

    public void sendMessage(User receiver, String message){

        Message msg = new Message(this, receiver, message);

    }
  
}