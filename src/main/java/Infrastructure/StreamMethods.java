package Infrastructure;

import Models.Manufacturer;

import java.util.*;
import java.util.stream.Stream;

public class StreamMethods {

    private static void outputArchitecture(ArrayList<Manufacturer> manufacturerArrayList) {
        manufacturerArrayList.stream().map(Manufacturer::getARCHITECTURE).forEach(System.out::println);
    }

    private static void outputManufacturerWithLess4Symbols(ArrayList<Manufacturer> manufacturerArrayList) {
        Stream<Manufacturer> list = manufacturerArrayList.stream().filter(i -> i.getNAME()
                .replaceAll(" ", "")
                .length() < 4);
        List<Manufacturer> manufacturerList = list.toList();
        for (Manufacturer manufacturer : manufacturerList) {
            System.out.println(manufacturer.getNAME());
        }
    }

    private static void outputSortedByName(ArrayList<Manufacturer> manufacturerArrayList) {
        Stream<Manufacturer> list = manufacturerArrayList.stream().sorted(Comparator.comparing(Manufacturer::getNAME));
        List<Manufacturer> manufacturerList = list.toList();
        for (Manufacturer manufacturer : manufacturerList) {
            System.out.println(manufacturer.getNAME());
        }
    }

    private static void outputNameOfProcessors(ArrayList<Manufacturer> manufacturerArrayList) {
        Stream<Map<String, Integer>> list = manufacturerArrayList.stream().map(Manufacturer::getCPUs);
        List<Map<String, Integer>> processors = list.toList();
        for (Map<String, Integer> processor : processors) {
            for (String key : processor.keySet()) {
                System.out.println(key);
            }
        }
    }

    private static void outputNotx86Manufacturers(ArrayList<Manufacturer> manufacturerArrayList) {
        Stream<Manufacturer> list = manufacturerArrayList.stream().filter(i -> !i.getARCHITECTURE().equals("x86"));
        List<Manufacturer> manufacturerList = list.toList();
        for (Manufacturer manufacturer : manufacturerList) {
            System.out.println(manufacturer.getNAME());
        }
    }

}