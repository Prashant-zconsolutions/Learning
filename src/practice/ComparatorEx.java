package practice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ComparatorEx {

    public static void main(String[] args) {



        ArrayList<Employee> list = new ArrayList<>();
        list.add( new Employee(2l, "Lokesh", "Gupta") );
        list.add( new Employee(1l, "Alex", "Gussin") );
        list.add( new Employee(4l, "Brian", "Sux") );
        list.add( new Employee(5l, "Neon", "Piper") );
        list.add( new Employee(3l, "David", "Beckham") );
        list.add( new Employee(7l, "Alex", "Beckham") );
        list.add( new Employee(6l, "Brian", "Suxena") );

//        First method for sorting
//        Comparator<Employee> compareByFirstName = Comparator.comparing( Employee::getFirstName );
//        Comparator<Employee> compareByLastName = Comparator.comparing( Employee::getLastName );
//        Comparator<Employee> compareByFullName = compareByFirstName.thenComparing(compareByLastName);
//
//        List<Employee> sortedList = list.stream().sorted(compareByFullName).toList();


//        Second Method for sorting
//        List<Employee> sortedList = list.stream()
//                .sorted(Comparator.comparing(Employee::getFirstName)
//                        .thenComparing(Employee::getLastName))
//                .toList();

//        Third Method for sorting
        List<Employee> sortedList = list.stream()
                        .sorted(Comparator.comparing(Employee::getFirstName))
                        .sorted(Comparator.comparing(Employee::getLastName))
                        .toList();

        sortedList.forEach(p-> System.out.println(
                "Emp id : "+p.getId()+"\n"+
                "Emp First Name : "+p.getFirstName()+"\t"+
                " "+p.getLastName()+"\n"
        ));

    }
}
