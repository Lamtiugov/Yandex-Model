package ru.yandex.praktikum.model.constants;

public class Colour {
    private String red = "";  //красный пердмет
    private String green = "";//зеленый пердмет

    Colour(String color) {
        if (color.equals("red")) {
            this.red = "red";
        } else if (color.equals("green")) {
            this.green = "green";
        } else {
            System.out.println("Udefault color");
        }
    }

    public boolean isRed() {
        return this.red.equals("red");
    }

    public boolean isGreen() {
        return this.green.equals("green");
    }

    public void setGreenColor(boolean makeToGreen) {
        this.green = green;
        this.red = "";
    }

    public void setRedColor(boolean makeToRed) {
            this.green = "";
            this.red = "red";
    }
}
