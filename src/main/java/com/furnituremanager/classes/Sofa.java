package com.furnituremanager.classes;

public class Sofa extends Furniture {
    private String configuration;

    private String material;

    public String getConfiguration() {
        return configuration;
    }

    public String getMaterial() {
        return material;
    }

    public void setConfiguration(String configuration) {
        this.configuration = configuration;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
