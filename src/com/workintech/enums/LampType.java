package com.workintech.enums;

public enum LampType {
    DESK_LAMP("Desk Lamp"),
    FLOOR_LAMP("Floor Lamp"),
    TABLE_LAMP("Table Lamp"),
    BEDSIDE_LAMP("Bedside Lamp"),
    WALL_LAMP("Wall Lamp");

    private final String lampTypeName;

    LampType(String lampTypeName)  {
        this.lampTypeName = lampTypeName;
    }
    public String getLampTypeName() {
        return lampTypeName;
    }
}
