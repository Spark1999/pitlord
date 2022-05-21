package lessons.mountain;

public class Mathematics {

    public static void main(String[] args) {

        for (int a=0; a<15; a++){
            roll();
        }




        double result = 35/13;
        System.out.println(result);

        double result2 = Math.floor(13.56F);
      //  System.out.println(result2);

        int myMax= Math.max(16, 77);
        //System.out.println(myMax);

        int myRest= 15%7;
       // System.out.println(myRest);


    }
    public static void roll(){
        int result;
        result = 1 + (int)(Math.random() * ((100 - 1) + 1));
        System.out.printf("you have rolled %d \n",result);
    }
}
