package Day_20_string_manipulation;

public class StringIsEmpty {
    public static void main(String[] args) {

        String jobTitle = "";
        System.out.println(jobTitle.isEmpty());
        System.out.println(jobTitle.length());
        System.out.println(jobTitle.length() == 0);

        if(jobTitle.isEmpty()){
            System.out.println("job title is missing, can you please resend");
        }else {
            System.out.println("Job title looks good");
        }
        if(jobTitle.length() == 0){
            System.out.println("Job title is empty");
        }else {
            System.out.println("job title is not empty");
        }

        System.out.println(jobTitle.equals(""));

        if("".equals(jobTitle)) {
            System.out.println("Job title is empty");
        }else {
            System.out.println("job title is not empty");
        }

        String word = " ";
        System.out.println(word.isEmpty());
        System.out.println(word.length());

        String veggie = "carrots";
        System.out.println(veggie.isEmpty());
        System.out.println(veggie.length());
        if(!veggie.isEmpty()){
            System.out.println("we have carrots");
        }

        /**        String word2; */
//        System.out.println(word2.isEmpty());  Error cause it's not initialized (declared).





    }
}
