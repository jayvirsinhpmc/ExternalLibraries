package GSONExample;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;

public class ObjectToJson {
    public static void main(String[] args){

        String enrollmentNo = "20bt04017";
        String name = "jayvir";
        int age = 20;

        Student student = new Student();
        student.setEnrollmentNo(enrollmentNo);
        student.setName(name);
        student.setAge(age);


//        Gson gson = new Gson();
//        try(FileWriter fileWriter = new FileWriter("C:\Users\chhasatiyaj\Desktop\Gson\src\GSONExample\jsonexample.json")) {
////            toJson() method is used to convert Java Object to json
//            gson.toJson(student, fileWriter);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }



//        below example is to enable the pretty print mode
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        try(FileWriter fileWriter = new FileWriter("C:\\Users\\chhasatiyaj\\Desktop\\Gson\\src\\GSONExample\\jsonexample1.json")) {
//            toJson() method is used to convert Java Object to json
            gson.toJson(student, fileWriter);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
