
/*
 * Classname
 *
 * Version info
 *
 * Copyright notice
 */

public class Main {
    public static void main(String[] args) {

        HumanBodyMassIndex humanBodyMassIndex = new HumanBodyMassIndex(80,1.52);
        System.out.println(HumanBodyMassIndex.getBodyMassIndexCategory());
    }
}

class HumanBodyMassIndex {
    public double weight; //Weight Human
    public double height; // Height Human
    private static double bodyMassIndex;

    public HumanBodyMassIndex(double weight, double height) {

        this.weight = weight;
        this.height = height;
        bodyMassIndex = this.weight / (this.height * this.height);
    }

    public double getWeight() {

        return this.weight;
    }

    public void setWeight(double weight) {

        this.weight = weight;
        bodyMassIndex = this.weight / (this.height * this.height);
    }

    public double getHeight() {

        return this.height;
    }

    public void setHeight(double height) {

        this.height = height;
        bodyMassIndex = this.weight / (this.height * this.height);
    }

    public static double getBodyMassIndex() {

        return bodyMassIndex;
    }

    public static String getBodyMassIndexCategory() {

        String bodyMassIndexCategory = null;
        if (bodyMassIndex >= 18.5 & bodyMassIndex < 25) {
            bodyMassIndexCategory = "Norm";
        }
        else if (bodyMassIndex >= 25 & bodyMassIndex < 30) {
            bodyMassIndexCategory = "Warning! ";
        }
        else if (bodyMassIndex >= 30) {
            bodyMassIndexCategory = "Fat";
        }
        else if (bodyMassIndex < 18.5) {
            bodyMassIndexCategory = "Deficit";
        }
        return bodyMassIndexCategory;
    }
}