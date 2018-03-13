import java.util.ArrayList;

public class Building {
    private String name;
    private int area;
    private int light;
    private ArrayList<Romm> arrayList = new ArrayList<>();

    Building(String name) {
        this.name = name;
    }

    public void addRoom(String nameRom, int area, int light) {
        arrayList.add(new Romm(nameRom, area, light));
    }

    public void set(int i, Light item) throws IlluminanceLimitException {
        Romm romm = arrayList.get(i);
        arrayList.set(i, romm.set(romm, item));
    }

    public void set(int i, Furniture item) throws SpaceLimitException {
        Romm romm = arrayList.get(i);
        arrayList.set(i, romm.set(romm, item));
    }

    public void info() {
        System.out.println(name);
        for (int i = 0; i < arrayList.size(); i++)
            System.out.println("\t " + arrayList.get(i));
    }
}