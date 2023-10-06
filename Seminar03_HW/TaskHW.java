package Seminar03_HW;

import java.util.Arrays;
import java.util.Objects;
import java.util.Random;

public class TaskHW {

    private static final Random random = new Random();


    static Worker generateWorker(){
        String[] names = new String[] { "Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий", "Рубен", "Герман" };
        String[] surNames = new String[] { "Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов" };

        int salary = random.nextInt(120000);
        Worker worker=new Worker(surNames[random.nextInt(surNames.length)], names[random.nextInt(names.length)], salary);
        return worker;
    }

    static Freelancer generateFreelancer(){
        String[] names = new String[] { "Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий", "Рубен", "Герман" };
        String[] surNames = new String[] { "Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов" };

        int salary = random.nextInt(2000);
        Freelancer freelancer=new Freelancer(surNames[random.nextInt(surNames.length)], names[random.nextInt(names.length)], salary);
        return freelancer;
    }

    static Position generatePosition(){
        String[] position_name = new String[] {"Рабочий", "Фрилансер"};
        Position position = new Position(position_name[random.nextInt(position_name.length)]);
        //System.out.println(position);
        return position;
    }
    static Employee[] generateEmployees(int count){
        Employee[] array = new Employee [count];
        String a;
        for (int i=0; i< array.length; i++){
            a= generatePosition().toString();
            System.out.println(a);
            if (Objects.equals(a, "Рабочий")) {
                array[i] = generateWorker();
            }else{
                array[i]=generateFreelancer();
            }
        }
        return array;
    }

    public static void main(String[] args) {
       Employee[] employees=generateEmployees(15);

       Arrays.sort(employees, new SalaryComparator(SortType.Ascending));

       for (Employee employee: employees){
           System.out.println(employee);
       }
    }
}
