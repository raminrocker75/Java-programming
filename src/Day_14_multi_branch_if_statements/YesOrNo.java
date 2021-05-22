package Day_14_multi_branch_if_statements;

public class YesOrNo {
    public static void main(String[] args) {
        System.out.println("Are you sure you want to delete this file?");
        char selection= 'y';
        boolean answer;
        String result;

        if (selection=='y'){
            System.out.println("File deleted. ");
            answer=true;
            result = "Result is deleted";
        }else {
            System.out.println("File delete canceled. ");
            answer=false;
            result = "Note deleted";
        }

        System.out.println("Did file get deleted? - " + answer);
        System.out.println("Did file get deleted? - " + result);
    }
}
