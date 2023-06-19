import Infrastructure.StreamMethods;
import Models.Manufacturer;
import Reader.XmlReader;

import java.io.Console;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        final String filePath = "input.xml";
        XmlReader reader = new XmlReader(filePath);
        ArrayList<Manufacturer> manufacturerArrayList = reader.read();

        System.out.println("Вывод архитектур производителей");
        StreamMethods.outputArchitectures(manufacturerArrayList);
        System.out.println();

        System.out.println("Вывод всех производителей имена которых содержат меньше 4 символов");
        StreamMethods.outputManufacturerWithLess4Symbols(manufacturerArrayList);
        System.out.println();

        System.out.println("Отсортированный вывод всех названий производителей");
        StreamMethods.outputSortedByName(manufacturerArrayList);
        System.out.println();

        System.out.println("Вывод всех названий процессоров");
        StreamMethods.outputNameOfProcessors(manufacturerArrayList);
        System.out.println();

        System.out.println("Вывод всех производителей не выпускающих x86 процессоров");
        StreamMethods.outputNotx86Manufacturers(manufacturerArrayList);
        System.out.println();
    }
}