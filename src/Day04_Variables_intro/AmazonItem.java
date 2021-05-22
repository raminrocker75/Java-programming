package Day04_Variables_intro;

public class AmazonItem {
    public static void main(String[] args){
        String Description="HIC wooden spoon";
        int ratingsCount= 181;
        double price=5.99;
        String Seller= "Amazon.com";
        boolean Prime= true;

        System.out.println(Seller);
        System.out.println("----Product Information-----");
        System.out.println(Description);
        System.out.print("* * * * *");
        System.out.println(ratingsCount);
        System.out.println(price);
        System.out.println(Prime);

    }
}
