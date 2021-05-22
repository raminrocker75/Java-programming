package Day_22_string_manipulation;

public class IndexOfExample {

        public static void main (String[]args){

        String technologies = "java, html, css, selenium, testng, maven, cucumber";
        System.out.println(technologies.indexOf(","));
        System.out.println(technologies.lastIndexOf(","));
        int indexOfJava = technologies.indexOf("java");
        System.out.println("indexOfJava = " + indexOfJava);
        int indexOfCss = technologies.indexOf("css");
        System.out.println("indexOfCss = " + indexOfCss);

        int indexOfCucumber = technologies.indexOf("cucumber");
        System.out.println("indexOfCucumber = " + indexOfCucumber);

        int indexOfSql = technologies.indexOf("Sql");
        System.out.println("indexOfSql = " + indexOfSql);








    }
}
