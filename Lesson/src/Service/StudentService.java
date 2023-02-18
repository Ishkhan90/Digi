package Service;

import Model.Student;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.*;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class StudentService implements Functions {

    @Override
    public  void createStudent() throws IOException {
        Student student=new Student();
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter name");
        student.setName(scanner.next());
        System.out.println("enterSurname");
        student.setSurName(scanner.next());
        System.out.println("enter year");
        student.setYear(scanner.nextInt());
        System.out.println("enter gender");
        student.setGender(scanner.next().charAt(0));
        System.out.println("enter isArmenian");
        student.setArmenian(scanner.nextBoolean());
        System.out.println("enter address");
        boolean isActive=true;
        String[] array = Files.readAllLines(Paths.get("address.txt")).toArray(new String[0]);
        String add="";
        while (isActive){
             add = scanner.next();
            isActive=false;
            for (int i = 0; i < array.length; i++) {
                if (array[i].equals(add)) {
                    isActive = true;
                    System.out.println("you Entered same address, please enter again");
                }
            }
        }
            student.setAddress(add);
            Path path = Paths.get(student.getAddress());
            Files.write(path, student.toString().getBytes());
            String s =  student.getAddress()+"\n" ;
            Files.write(Paths.get("Address.txt"), s.getBytes(), StandardOpenOption.APPEND);


    }

    @Override
    public void allFemalePrint() throws IOException {
        Student[] students = FileService.convertStudents();
        boolean b=false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].getGender()=='f' || students[i].getGender()=='F'){
                System.out.println(students[i]);
                System.out.println("--------");
                b=true;
            }
        }
        if (!b)
            throw new NotFoundException("Girl not found");
    }



    @Override
    public void smallestGirl() throws IOException {
        Student[] students = FileService.convertStudents();
        Student girl=null;
        for (int i = 0; i < students.length; i++) {
            if (girl==null){
                if (students[i].getGender()=='f' || students[i].getGender()=='F')
                    girl=students[i];
            }else {
                if (students[i].getGender()=='f' || students[i].getGender()=='F'){
                   if (girl.getYear()<students[i].getYear()){
                       girl=students[i];
                   }
                }
            }
        }
        if (girl!=null){
            System.out.println(girl);
        }else {
            throw new NotFoundException("Girl not found");
        }
    }
}
