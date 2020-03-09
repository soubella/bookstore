package com.sqli.BookStore;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Location {

    @Id
    @GeneratedValue
    private Long id;

    private String department;

    private String level;

    private String side;

    public Location() {
    }

    public Location(String department, String level, String side) {
        this.department = department;
        this.level = level;
        this.side = side;
    }

    public String getDepartment() {
        return department;
    }

    public String getLevel() {
        return level;
    }

    public String getSide() {
        return side;
    }
}
