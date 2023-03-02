import com.company.professions.Driver;
import com.company.vehicles.Car;
import com.company.details.Engine;
import com.company.vehicles.Lorry;
import com.company.vehicles.SportCar;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Driver person1 = new Driver("Ali", 19, 4);
        Engine person1_1 = new Engine(630, "BMW");
        Car car1 = new Car("BMW-M5", "B", person1, person1_1);


        Driver person2 = new Driver("Birzhan", 18, 1);
        Engine person2_2 = new Engine(600, "Freightliner");
        Lorry lorry2 = new Lorry("ВВ16", "N1", person2, person2_2, 2050);


        Driver person3 = new Driver("Алтынбек", 18, 0);
        Engine person3_3 = new Engine(640, "Lamborghini");
        SportCar sportCar3 = new SportCar("Lamborghini Huracan Performante", "B", person3, person3_3, 360);


        System.out.println(car1);
        System.out.println(lorry2);
        System.out.println(sportCar3);

        Scanner in = new Scanner(System.in);

        System.out.println("""
                Вы можете выбрать 1)грузовик или 2)спорткар""");
        int vibor = in.nextInt();

        switch (vibor){
            case 1:
            System.out.println("""
                        Вы выбрали грузовик, теперь напишите "Сколько хотите кг загрузить в багаж?(пример от 50 до 100кг)""");
            int weight = in.nextInt();

            Car.start();
            int o = 0;
                for (int i = 50; i <= weight; i += 10) {
                    System.out.println("Задержка " + o);
                    o += 1;
                }
                for(int i=200;i<800;i+=200){
                    if(i==200){
                    System.out.println('\n'+ "Вы прошли " + i +" метров"+" поверните направо"+'\n');}
                    if(i==400){
                        System.out.println('\n'+ "Вы прошли " + i +" метров"+" поверните налево"+'\n');
                    }
                    if(i==600){
                        System.out.println('\n'+ "Вы прошли " + i +" метров"+" точка Б стоп"+'\n');
                    }

                    System.out.println("Выберите действие"+ '\n' + "1.\tПовернуть направо" + '\n' + "2.\tПовернуть налево" + '\n' + "3.\tОстановиться" );
                    int vibor2= in.nextInt();
                    if(vibor2==1){
                        Car.turnRight();
                    }
                    if(vibor2==2){
                        Car.turnLeft();
                    }
                    if (vibor2==3){
                        Car.stop();
                    }
                    int ox = 100;
                    int xyz=0;
                    for (int g = 50; g <= ox; g += 10) {
                        System.out.println("Задержка " + xyz);
                        xyz+=1;
                }
                    break;
                }
            case 2:
                for(int i=200;i<800;i+=200){
                    if(i==200){
                        System.out.println('\n'+ "Вы прошли " + i +" метров"+" поверните направо"+'\n');}
                    if(i==400){
                        System.out.println('\n'+ "Вы прошли " + i +" метров"+" поверните налево"+'\n');
                    }
                    if(i==600){
                        System.out.println('\n'+ "Вы прошли " + i +" метров"+" точка Б стоп"+'\n');
                    }

                    System.out.println("Выберите действие"+ '\n' + "1.\tПовернуть направо" + '\n' + "2.\tПовернуть налево" + '\n' + "3.\tОстановиться" );
                    int vibor2= in.nextInt();
                    if(vibor2==1){
                        Car.turnRight();
                    }
                    if(vibor2==2){
                        Car.turnLeft();
                    }
                    if (vibor2==3){
                        Car.stop();
                    }
                }
        }
    }
}


