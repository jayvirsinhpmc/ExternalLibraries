package JAXBExample;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import java.io.FileWriter;

public class ObjectToXML {
    public static void main(String[] args) throws Exception{

        JAXBContext contextObject = JAXBContext.newInstance(Student.class);

        Marshaller marshallerObject = contextObject.createMarshaller();
        marshallerObject.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        Student student = new Student("20bt04017", "jayvirsinh n chhasatiya", 20);
        FileWriter fileWriter = new FileWriter("student.xml");
        marshallerObject.marshal(student, fileWriter);
    }
}
