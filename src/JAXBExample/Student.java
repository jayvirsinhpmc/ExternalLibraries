package JAXBExample;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Student {
    private String enrollmentNo;
    private String name;
    private int age;

    public Student() {
    }

    public Student(String enrollmentNo, String name, int age) {
        this.enrollmentNo = enrollmentNo;
        this.name = name;
        this.age = age;
    }

    @XmlAttribute
    public String getEnrollmentNo() {
        return enrollmentNo;
    }

    public void setEnrollmentNo(String enrollmentNo) {
        this.enrollmentNo = enrollmentNo;
    }

    @XmlElement
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlElement
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
