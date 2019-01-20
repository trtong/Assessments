package com.zipcodewilmington.assessment2.part3;

public class RedRobin extends Bird{
    String migrationMonth;

    @Override
    public String color() {
        return "red";
    }

    @Override
    public int getSpeed() {
        return 10;
    }

    public String getMigrationMonth() {
        return migrationMonth;
    }

    public void setMigrationMonth(String migrationMonth) {
        this.migrationMonth = migrationMonth;
    }

    @Override
    public int compareTo(Animal o) {
        return (o.getSpeed()) - this.getSpeed();
    }
}
