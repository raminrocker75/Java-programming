package PracticeSession;

public abstract class AbstractPractice {
    public void code(String language) {
        System.out.println("Student is coding using " + language);
    }

    public abstract void attendClass();
}

class OnlineStudent extends AbstractPractice {
    public void attendClass() {
        System.out.println("Online student is joining the class using zoom");
    }

    static class abstractTesting {
        public static void main(String[] args) {
            OnlineStudent onlineStudent = new OnlineStudent();
            onlineStudent.code("Java");
            onlineStudent.attendClass();

        }
    }
}
