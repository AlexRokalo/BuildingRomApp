import java.util.ArrayList;

public class Romm {
    private static final int MAX = 4000;
    private int occupy = 0;
    private Furniture furniture;
    private String name;
    private int area;
    private int light;
    private ArrayList<Furniture> furnList = new ArrayList<>();

    Romm(String nameRom, int area, int light) {
        name = nameRom;
        this.area = area;
        this.light = 700 * light;
    }

    public Romm set(Romm romm, Light item) throws IlluminanceLimitException {
        romm.light += item.getLight();
        if (light > MAX) throw new IlluminanceLimitException();
        return romm;
    }

    public Romm set(Romm romm, Furniture item) throws SpaceLimitException {
        int allowable = (area * 70) / 100;// с английского 'допустимое'
        occupy = occupy + item.getArea();
        if (allowable >= (area - occupy)) throw new SpaceLimitException();
        furniture = item;
        furnList.add(item);
        return romm;
    }

    @Override
    public String toString() {
        String str = "null";
        int allowable = (area * 70) / 100; // с английского 'допустимое'
        if (furniture != null) {
            if (allowable <= (area - occupy))
                str = name + "\n\t\t Свет :" + light + " лк, " + (light / 700) + " окна "
                        + "\n\t\t Площадь :" + area + "( занято " + occupy +
                        " м^2 , свободно " + (area - occupy) + " м^2 )" +
                        "\n\t\t Мебель :" + furnList.toString();

        } else {
            str = name + "\n\t\t Свет :" + light + " лк, " + (light / 700) + " окна "
                    + "\n\t\t Площадь :" + area + " м^2 (свободно " + (area - occupy) + " м^2 )" + "" +
                    "\n\t\t Мебель : Отсутствует.";
        }
        return str;
    }
}