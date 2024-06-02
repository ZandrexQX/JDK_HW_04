package homework04;

import java.util.ArrayList;

public class Main {
    public static void fillDict(DictEmployee dictEmployee){
        for (int i = 1; i < 11; i++) {
            Employee e = new Employee(i*15, STR."employee \{i}", i);
            dictEmployee.addEmployee(e);
        }
        for (int i = 1; i < 10; i += 2) {
            Employee e = new Employee(i*12, STR."employee \{i}", i+1);
            dictEmployee.addEmployee(e);
        }
    }

    public static <T> void printArr(ArrayList<T> arrayList){
        for (T o : arrayList) {
            System.out.println(o);
        }
    }

    public static void main(String[] args) {
        DictEmployee dictEmployee = new DictEmployee();
        fillDict(dictEmployee);

//        for (Employee employee : dictEmployee.getArrEmployee()) {
//            System.out.println(employee);
//        }

        var dict1 = dictEmployee.searchForExp(4);
        var dict2 = dictEmployee.searchNumber("employee 3");

        printArr(dict1);
        printArr(dict2);

        System.out.println(dictEmployee.findTabel(6));
        System.out.println(dictEmployee.findTabel(13));
    }
}
