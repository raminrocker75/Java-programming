package Day_61_exception_collection;

public class ElementaryStudent {
    private String name;
    private int age;

    public ElementaryStudent() {

    }

    public ElementaryStudent(String name, int age) {
       setName(name);
       setAge(age);
    }

    @Override
    public String toString() {
        return "ElementaryStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name==null || name.isEmpty()){
            throw new IllegalArgumentException("Name cannot be empty");
        }
        //if name is all numbers, or starts with number
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age<5 || age>12 ){
            throw new IllegalArgumentException("Age cannot be <5(less) or >15(more)");
        }
        this.age = age;
    }
}
