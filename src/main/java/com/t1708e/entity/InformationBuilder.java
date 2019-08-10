package com.t1708e.entity;

public final class InformationBuilder {
    private String id;
    private String name;
    private String brand;
    private String price;
    private String description;

    private InformationBuilder() {
    }

    public static InformationBuilder anInformation() {
        return new InformationBuilder();
    }

    public InformationBuilder withId(String id) {
        this.id = id;
        return this;
    }

    public InformationBuilder withName(String name) {
        this.name = name;
        return this;
    }

    public InformationBuilder withBrand(String brand) {
        this.brand = brand;
        return this;
    }

    public InformationBuilder withPrice(String price) {
        this.price = price;
        return this;
    }

    public InformationBuilder withDescription(String description) {
        this.description = description;
        return this;
    }

    public Information build() {
        Information information = new Information();
        information.setId(id);
        information.setName(name);
        information.setBrand(brand);
        information.setPrice(price);
        information.setDescription(description);
        return information;
    }
}
