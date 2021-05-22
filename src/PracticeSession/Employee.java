package PracticeSession;
/*
Create a class Employee
create a main method

    Declare and assign these variables according to the most appropriate datatypes: (Use as many datatypes as you can for practice)

        - first name, last name, company name, salary, start day, start month, start year, are they full time, job title, office address,

    Declare new variables and use concatenation from previous variables to set their values

        - full name (first and last name)
        - full start date (start month date, year)
        - email (first name + start day @ $company name .com)
        - Salary after 3 years (base salary + start month * 10000)
            Ex: base: 100000
                start day: 2
                after 3 year: (100000 + (2 * 1000)) = 102000

 */
public class Employee {
    public static void main(String[] args) {
        String name = "Ramin", lastName = "Dadari" , companyName = "Google" , jobTitle = "SDET" , officeAddress = "12617 Sauterne Dr, Maryland Heights mo,63146." ;
        int salary = 1300000;
        int startDay = 27 , startMonth = 7 ;
        int startYear = 2022;
        boolean areFullTime = true;
        int after3Years = 130000+(2*1000);
        System.out.println("       ************* " + companyName +
                " *************** \n Ramin Welcome to google your start date as a SDET \n will be on July"
                + startDay + "-" + startYear + " You Are full time " + areFullTime + " and will be \n making " + after3Years + " per year. The office is located at: \n " + officeAddress);
        System.out.println();
        System.out.println("- full name: " + name +" "+ lastName);
        System.out.println("- Full start date: " + startDay + "-" + startMonth +"-"+ startYear + "\n- Job Title: " + jobTitle + "\n- Full time: " + areFullTime );
        System.out.println("- Email: " + name + startDay + "@" + companyName + ".com" );
        System.out.println("- Salary After 3 years: " + after3Years);




















    }

}
