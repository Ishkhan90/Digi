package WorkService;

import Model.Student;
import Service.NotFoundException;
import Service.StudentService;
import Service.WrongNumber;

import java.io.IOException;
import java.util.Scanner;

public class ServiceMenu {
    public static void menu() throws IOException {
        StudentService studentService=new StudentService();
        boolean isActive=true;
        while (isActive){
            Scanner scanner=new Scanner(System.in);
            byte select=0;
            System.out.println("------Menu------");
            System.out.println("1. create student");
            System.out.println("2. all female print");
            System.out.println("3. smallest girl");
            System.out.println("4. exit");
            System.out.print("enter number  ");
            select=scanner.nextByte();
            switch (select){
                case 1:studentService.createStudent();
                break;
                case 2:try {
                    studentService.allFemalePrint();
                }catch (NotFoundException e){
                    e.printStackTrace();
                }
                break;
                case 3: try {
                    studentService.smallestGirl();
                }
                catch (NotFoundException e){
                    e.printStackTrace();
                }
                break;
                case 4:isActive=false;
                break;
                default:throw new  WrongNumber("You entered wrong number");

            }
        }
    }

}
