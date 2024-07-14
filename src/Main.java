import java.util.HashSet;
import java.util.Random;
import java.util.Set;

//Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
//
//-Создать множество ноутбуков.
//-Написать метод, который будет запрашивать у пользователя критерий (или критерии)
// фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map.
//Например:
//        Введите цифру, соответствующую необходимому критерию:
//          1 - ОЗУ
//          2 - Объем ЖД
//          3 - Операционная система
//          4 - Цвет …
//-Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
//-Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.


public class Main {
    public static void main(String[] args) {

        int countLaptop = 20; //количество ноутбуков
        Set<Laptops> laptops = new HashSet<>();
        createSetLaptop(laptops, countLaptop);
        for (Laptops laptop : laptops) {
            System.out.println(laptop);
        }

    }

//    Создаю список ноутбуков случайным образом по заведомо известным параметрам
    public static void createSetLaptop(Set laptops, int countLaptop) {

        String[] rndModel = {"MSI", "Acer", "Huawei", "Asus", "Macbook", "Lenovo"};
        int[] rndRamSize = {1, 2, 4, 8, 16, 32};
        int[] rndHddSize = {120, 240, 500, 1000, 2000};
        int[] rndPrice = {14000, 20000, 25000, 30000, 50000, 70000, 80000, 100000};
        String[] rndColor = {"Red", "White", "Blue", "Black", "Green"};

        Random rnd = new Random();

        for (int i = 0; i < countLaptop; i++) {
            String model = rndModel[rnd.nextInt(rndModel.length)];
            int ramSize = rndRamSize[rnd.nextInt(rndRamSize.length)];
            int hddSize = rndHddSize[rnd.nextInt(rndHddSize.length)];
            int price = rndPrice[rnd.nextInt(rndPrice.length)];
            String color = rndColor[rnd.nextInt(rndColor.length)];
            laptops.add(new Laptops(model, ramSize, hddSize, color, price));
        }
    }
}
