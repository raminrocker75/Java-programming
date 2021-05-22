package Day_14_multi_branch_if_statements;

public class DayActivity {
    public static void main(String[] args) {
        String weather = "rainy";
        if (weather.equals("Sunny")){
            System.out.println(weather + " - Go to park, hiking , and code java");
        }else if(weather.equals("rainy")){
            System.out.println(weather + " - stay home , drink tea , and code java");
        }else if(weather.equals("snowy")){
            System.out.println(weather + " - Clean the car then build snowman");
        }else if(weather.equals("Windy")){
            System.out.println(weather + " - Stay home or wind will take you to no where no one will be able to find you!");
        }
    }
}
