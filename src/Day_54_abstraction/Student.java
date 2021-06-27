package Day_54_abstraction;

public abstract class Student {
    public void myAbstractClass(String language) {
        System.out.println("Student is coding using " + language);
    }

    public abstract void attendClass();
}

class OnlineStudent extends Student {

    public void attendClass() {
        System.out.println("Online student is attending the class using zoom");
    }
}

class CampusStudent extends Student{
    public void attendClass(){
        System.out.println("Campus student is attending in person classes ");
    }
}

class School {
    public static void main(String[] args) {
        CampusStudent campusStudent = new CampusStudent();
        campusStudent.attendClass();
        campusStudent.myAbstractClass("Java");
        OnlineStudent onlineStudent = new OnlineStudent();
        onlineStudent.attendClass();
        onlineStudent.myAbstractClass("C#");
    }
}

