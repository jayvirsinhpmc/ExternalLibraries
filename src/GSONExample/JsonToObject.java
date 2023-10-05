package GSONExample;

import com.google.gson.Gson;

import java.io.FileReader;
import java.io.Reader;

public class JsonToObject {
    public static void main(String[] args) {
        Student student = null;
        Gson gson = new Gson();

//        fromJson() method is used to convert json to java object
        try (Reader reader = new FileReader("C:\\Users\\chhasatiyaj\\Desktop\\Gson\\src\\GSONExample\\jsonexample1.json")) {
            student = gson.fromJson(reader, Student.class);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(student.getEnrollmentNo());
        System.out.println(student.getName());
        System.out.println(student.getAge());
    }
}
