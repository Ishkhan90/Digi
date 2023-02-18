package Service;

import Model.Student;
import com.sun.xml.internal.ws.wsdl.writer.document.http.Address;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileService {

    public static Student convertStudent(String url) throws IOException {
        Path path = Paths.get(url);
        String[] array = Files.readAllLines(path).toArray(new String[0]);
        Student student=new Student();
        student.setName(array[0]);
        student.setSurName(array[1]);
        student.setYear(Integer.parseInt(array[2]));
        student.setGender(array[3].charAt(0));
        student.setArmenian(Boolean.parseBoolean(array[4]));
        return student;
    }

    public static Student[]convertStudents() throws IOException {
        Path path = Paths.get("Address.txt");
        String[] addressList = Files.readAllLines(path).toArray(new String[0]);
        Student[]students=new Student[addressList.length];
        for (int i = 0; i < addressList.length; i++) {
            students[i]=convertStudent(addressList[i]);
        }
        return students;
    }
}
