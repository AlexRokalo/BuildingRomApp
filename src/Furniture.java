public abstract class Furniture {
    private String description;
    private int area;

    Furniture(){
        description = "Нету";
        area = 0;
    }

    Furniture(String description, int area) {
        this.description = description;
        this.area = area;
    }

    public String getDescription(){
        return description;
    }

    public int getArea() {
        return area;
    }

    @Override
    public String toString() {
        return " '"+this.description+"' ( площадью" + " " + this.area+" м^2 )";
    }
}