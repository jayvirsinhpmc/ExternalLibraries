package JAXBExample;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.FileReader;

public class XMLToObject {
    public static void main(String[] args) throws Exception{
        JAXBContext contextObject = JAXBContext.newInstance(Student.class);

        Unmarshaller unmarshallerObject = contextObject.createUnmarshaller();
        Student student = (Student) unmarshallerObject.unmarshal(new FileReader("student.xml"));

        System.out.println(student.getEnrollmentNo());
        System.out.println(student.getName());
        System.out.println(student.getAge());
    }
}
