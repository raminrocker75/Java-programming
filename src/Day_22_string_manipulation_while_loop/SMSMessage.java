package Day_22_string_manipulation_while_loop;

public class SMSMessage {
    public static void main(String[] args) {
        String message = "Sender: [ Saim ] From number<222333444> Message: {Hello, lets code some java}";
         int start = message.indexOf("[");
         int end = message.indexOf("]");
        System.out.println(start);
        System.out.println(end);
        System.out.println(message.substring(start+1,end));
        String sender = message.substring(start+1,end); // storing into String.
        System.out.println("sender = " + sender);

        String mobile = message.substring(message.indexOf("<"), message.indexOf(">"));
                                              // index has an integer value so ">" is like number that's stored into String through String manipulation.
        System.out.println("mobile = " + mobile);

        String text = message.substring(message.indexOf("{")+1 , message.indexOf("}"));
        System.out.println("text = " + text);


        System.out.println("     Ramin  ".trim());
        sender = sender.trim(); // .trim() cuts empty spaces.
        System.out.println(sender);

        if(sender.equals("Saim")){
            System.out.println("Message from Saim about homework");
        }else {
            System.out.println("Someone else's message");
        }


    }
}
