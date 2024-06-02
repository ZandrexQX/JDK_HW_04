package homework04;

import java.util.ArrayList;

public class DictEmployee {
    private ArrayList<Employee> arrEmployee = new ArrayList<>();

    public void addEmployee(Employee employee){
        arrEmployee.add(employee);
    }

    public ArrayList<Employee> searchForExp(int exp){
        ArrayList<Employee> arrExp = new ArrayList<>();
        if (arrEmployee != null) {
            for (Employee employee : arrEmployee) {
                if (employee.getExperience() == exp) arrExp.add(employee);
            }
        }
        return arrExp;
    }
}
