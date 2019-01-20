package com.zipcodewilmington.assessment2.part1;

public class WuTangConcatenator {
    int wuMaker;
    public WuTangConcatenator(int num) {
        wuMaker = num;
    }

    public boolean isWu() {
        return (this.wuMaker % 3 == 0);
    }

    public boolean isTang() {
        return (this.wuMaker % 5 == 0);
    }

    public boolean isWuTang() {
        return (isWu() && isTang());
    }
}
