package model;

public class Card {
    private Value value;
    private Color color;

    public Card(Value value, Color color) {
        this.value = value;
        this.color = color;
    }

    @Override
    public String toString() {
        return getValueSymbole() + getColorSymbole();
    }

    public String getColorSymbole(){ // u265 ...
        return color.getSymbole();
    }

    public String getColorName(){ // HEART SPADE...
        return color.name();
    }

    public String getValueSymbole(){ // 1 2 3 ... J Q K
        return value.getSymbole();
    }

    public int getPoints(){ // nombre de point
        return value.getPoint();
    }
}
