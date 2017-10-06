package curiosity.task1;

/**
 Со 100 этажного дома бросают стеклянный шар (их 2 шт).
 Алгоритм, при котором меньше всего попыток необходимо для нахождения этажа,
 с которого разобьется шар.
 */

public class TwoBalls {

    static int heightBuilding = 100;

    public static void main(String[] args) {
        findStartFloor (heightBuilding, 1);
    }

    public static void findStartFloor (int height, int floor) {
        if (height > floor) {
            findStartFloor(height - floor, floor + 1);
        } else {
            System.out.println("first floor: " + floor);
            printFloorList (heightBuilding, floor, floor);
            System.out.println("");
            System.out.println("В любой момент количество попыток не превысит: " + floor);
        }
    }

    public static void printFloorList(int height, int floor, int step) {
        if (height > floor) {
            System.out.print(" " + floor);
            step = step - 1;
            floor = floor + step;
            printFloorList(height, floor, step);
        }
    }
}