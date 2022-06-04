package week20;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class MapsExamples {
    public static void main(String[] args) {
        //we want to keep insertion order:LinkedHashMap
        Map<String,Object>employee1=new LinkedHashMap<>();
        employee1.put("First_Name","Steven");
        employee1.put("Last_Name","King");
        employee1.put("Job_ID","AD_PRES");
        employee1.put("Salary",2400);
        employee1.put("Department_ID",90);
        System.out.println("employee1 = " + employee1);


        Map<String,Object>employee2=new LinkedHashMap<>();
        employee2.put("First_Name","Neena");
        employee2.put("Last_Name","Kochhar");
        employee2.put("Job_ID","AD_P");
        employee2.put("Salary",17000);
        employee2.put("Department_ID",90);
        System.out.println("employee2 = " + employee2);
        List<Map<String,Object>> cydeo=new ArrayList<>();
        cydeo.add(employee1);
        cydeo.add(employee2);//all employee added as maps

        System.out.println("cydeo = " + cydeo);
        //Find salary of Neena
        int salary=0;
        for (Map<String, Object> eachEmployee : cydeo) {
            if ((eachEmployee.get("First_Name").equals("Neena"))){
                salary= (int) eachEmployee.get("Salary");//all the values are object type we need to cast
            }
        }
        System.out.println("salary = " + salary);

    }
}
