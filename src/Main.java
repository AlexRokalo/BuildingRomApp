public class Main {
    public static void main(String[] args) throws SpaceLimitException, IlluminanceLimitException {
        Building building = new Building("Здание 1");
        building.addRoom("Комната 1", 200, 4);
        building.addRoom("Комната 2", 200, 0);
        building.addRoom("Комната 3", 800, 2);
        building.set(0, new Light(600));
        building.set(2, new Light(25));
        building.set(1, new Table("Стол новый", 4));
        building.set(1, new Armchair("Кресло новое", 4));
        building.set(0, new Armchair("Старое кресло", 25));
        building.info();
    }
}