package ru.practicum.inductance.model;

public class Inductance {
    private double inductance;
    //private double magneticPermeabilityVacuum; //магнитная проницаемость вакуума мю0
    private double magneticPermeabilityMaterial; //магнитная проницаемость материала мюR
    private double absoluteMagneticPermeability; //абсолютная магнитная проницаемость мюА
    private double wireTurns; //витки
    private double coreSection; //сечение сердечника
    private double coreLong; //длинна сердечника

    public Inductance(double inductance,
                      double magneticPermeabilityMaterial,
                      double absoluteMagneticPermeability,
                      double wireTurns,
                      double coreSection,
                      double coreLong) {
        this.inductance = inductance;
        this.magneticPermeabilityMaterial = magneticPermeabilityMaterial;
        this.absoluteMagneticPermeability = absoluteMagneticPermeability;
        this.wireTurns = wireTurns;
        this.coreSection = coreSection;
        this.coreLong = coreLong;
    }

    public double getInductance() {
        return inductance;
    }

    public void setInductance(double inductance) {
        this.inductance = inductance;
    }

    public double getMagneticPermeabilityMaterial() {
        return magneticPermeabilityMaterial;
    }

    public void setMagneticPermeabilityMaterial(double magneticPermeabilityMaterial) {
        this.magneticPermeabilityMaterial = magneticPermeabilityMaterial;
    }

    public double getAbsoluteMagneticPermeability() {
        return absoluteMagneticPermeability;
    }

    public void setAbsoluteMagneticPermeability(double absoluteMagneticPermeability) {
        this.absoluteMagneticPermeability = absoluteMagneticPermeability;
    }

    public double getWireTurns() {
        return wireTurns;
    }

    public void setWireTurns(double wireTurns) {
        this.wireTurns = wireTurns;
    }

    public double getCoreSection() {
        return coreSection;
    }

    public void setCoreSection(double coreSection) {
        this.coreSection = coreSection;
    }

    public double getCoreLong() {
        return coreLong;
    }

    public void setCoreLong(double coreLong) {
        this.coreLong = coreLong;
    }
}