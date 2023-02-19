package planeService;

import plane.Plane;

import java.util.Scanner;

public class PlaneService {

    public Plane createPlane(){
        Plane plane=new Plane();
        Scanner scanner=new Scanner(System.in);
        System.out.print("ENTER MODEL ");
        plane.setModel(scanner.next());
        System.out.print("ENTER COUNTRY ");
        plane.setCountry(scanner.next());
        System.out.print("ENTER YEAR ");
        plane.setYear(scanner.nextInt());
        System.out.print("ENTER HOURS ");
        plane.setHours(scanner.nextInt());
        System.out.print("ENTER 'military' or not military any key");
        plane.setMilitary(scanner.next());
        System.out.print("ENTER WEIGHT ");
        plane.setWeight(scanner.nextInt());
        System.out.print("ENTER WINGSPAN ");
        plane.setWingspan(scanner.nextInt());
        System.out.print("ENTER TOPSPEED ");
        plane.setTopSpeed(scanner.nextInt());
        System.out.print("ENTER SEATS ");
        plane.setSeats(scanner.nextInt());
        System.out.print("ENTER COST ");
        plane.setCost(scanner.nextDouble());
        System.out.println("-----------------");
        return plane;
    }
    public void task1(Plane p){
        p.printInfo();
    }
    public void task2 (Plane p){
        if (p.isMilitary()==true){
            System.out.println("cost "+p.getCost());
            System.out.println("topSpeed "+p.getTopSpeed());
        }else {
            System.out.println("model "+p.getModel());
            System.out.println("country "+p.getCountry());
        }
    }
    public Plane task3 (Plane p1,Plane p2){
        Plane pl;
        if (p1.getYear()<p2.getYear())
            pl=p2;
        else
            pl=p1;
        return pl;
    }
    public String task4(Plane p1,Plane p2){
        String s;
        if (p1.getWingspan()>p2.getWingspan())
            s=p1.getModel();
        else
            s=p2.getModel();
        return s;
    }
    public void task5(Plane p1,Plane p2,Plane p3){

         if (p2.getSeats()<p1.getSeats() && p2.getSeats()<p3.getSeats()) {
            System.out.println("country "+p2.getCountry());
        } else if (p3.getSeats()<p2.getSeats() && p3.getSeats()<p1.getSeats()) {
            System.out.println("country "+p3.getCountry());
        }else
            System.out.println("country "+p1.getCountry());
    }
    public void task6(Plane[]p){
        for (int i=0;i<p.length;i++){
            if (p[i].isMilitary()==false)
                p[i].printInfo();
        }
    }
    public void task7(Plane[]p){

        for (int i=0;i<p.length;i++){
            if (p[i].isMilitary() && p[i].getHours()>100)
                p[i].printInfo();
        }
    }
    public Plane task8(Plane[]p){
        Plane pl=p[0];
        for (int i=1;i<p.length;i++){
            if (pl.getWeight()>p[i].getWeight()){
                pl=p[i];
            } else if (pl.getWeight()==p[i].getWeight()) {
                pl=p[p.length-1];
            }

        }
        return pl;
    }
    public Plane task9(Plane[]p){
        Plane pl=null;
        for (int i=0;i<p.length;i++){
            if (p[i].isMilitary())
                pl=p[i];
            break;
        }
        for (int i=0;i<p.length;i++){
            if (p[i].isMilitary()){
                if (pl.getCost()>p[i].getCost())
                    pl=p[i];
            }
        }
        return pl;
    }
    public void task10(Plane[]p){
        Plane pl=null;
        for (int i=0;i<p.length;i++){
            for (int j=1;j<p.length-i;j++){
                if (p[j-1].getYear()<p[j].getYear()){
                    pl=p[j-1];
                    p[j-1]=p[j];
                    p[j]=pl;
                }
            }
        }
        for (int i=0;i<p.length;i++){
            p[i].printInfo();
        }
    }
}
