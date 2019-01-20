package parsing_json;

import java.util.ArrayList;

public class Element {

    private String name, appearance, category, color, discovered_by, named_by, phase, source, spectral_img, summary, symbol;
    private double atomic_mass, boil, density, melt, molar_heat;
    private int number, period, xpos, ypos;
    private ArrayList<Integer> shells;

    public Element() {
    }

    public Element(String name, String appearance, double atomic_Mass, double boil,
                   String category, String color, double density, String discovered_By,
                   double melt, double molar_Heat, String named_By, int number,
                   int period, String phase, String source, String spectral_img, String summary,
                   String symbol, int xpos, int ypos, ArrayList<Integer> shells) {
        this.name = name;
        this.appearance = appearance;
        this.category = category;
        this.color = color;
        this.discovered_by = discovered_By;
        this.named_by = named_By;
        this.phase = phase;
        this.source = source;
        this.spectral_img = spectral_img;
        this.summary = summary;
        this.symbol = symbol;
        this.atomic_mass = atomic_Mass;
        this.boil = boil;
        this.density = density;
        this.melt = melt;
        this.molar_heat = molar_Heat;
        this.number = number;
        this.period = period;
        this.xpos = xpos;
        this.ypos = ypos;
        this.shells = shells;
    }

    public String getName() {
        return name;
    }

    public String getAppearance() {
        return appearance;
    }

    public String getCategory() {
        return category;
    }

    public String getColor() {
        return color;
    }

    public String getDiscovered_by() {
        return discovered_by;
    }

    public String getNamed_by() {
        return named_by;
    }

    public String getPhase() {
        return phase;
    }

    public String getSource() {
        return source;
    }

    public String getSpectral_img() {
        return spectral_img;
    }

    public String getSummary() {
        return summary;
    }

    public String getSymbol() {
        return symbol;
    }

    public double getAtomic_mass() {
        return atomic_mass;
    }

    public double getBoil() {
        return boil;
    }

    public double getDensity() {
        return density;
    }

    public double getMelt() {
        return melt;
    }

    public double getMolar_heat() {
        return molar_heat;
    }

    public int getNumber() {
        return number;
    }

    public int getPeriod() {
        return period;
    }

    public int getXpos() {
        return xpos;
    }

    public int getYpos() {
        return ypos;
    }

    public ArrayList<Integer> getShells() {
        return shells;
    }

}