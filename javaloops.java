public class javaloops {
    public static void main(String[] args) {
        // System.out.println(1);
        // System.out.println(2);
        // System.out.println(3);
        // System.out.println(4);
        // System.out.println(5);
        // System.out.println(6);
        // System.out.println(7);
        // System.out.println(8);
        // System.out.println(9);
        // System.out.println(10);
        //have using while,do while,for

       int i=0;
       while (i<5) {//false
        System.out.println(i);
        i++;//i=i+1;

       }
       System.out.println("main method body");



        do{
            System.out.println(i);
            i++;

        }while(i<5);
        System.out.println("main method body");


        
         for(int i=0; i<5; i++){
            System.out.println(i);
        }
        System.out.println("main method body");
    }
}
