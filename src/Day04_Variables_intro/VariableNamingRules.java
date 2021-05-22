package Day04_Variables_intro;

public class VariableNamingRules {
    public static void main(String[] args){
//        int static= 22--> error, static is reserved by java.
        int Static2 = 22;
        int _Static= 44;
        int $tatic= 44;
        int staticvar= 234;


        int salary$=55;
//        int 1stmMonthSalary=3000;---> error, cannot start with number.
        int $=10;
        int __ = 3; // using _ and $ signs are not recommended.
        System.out.println ($);
        System.out.println(__);
        System.out.println(Static2);
        System.out.println(_Static);
        System.out.println($tatic);
        System.out.println(staticvar);
        salary$=65;
        System.out.println(salary$);
    }
}
