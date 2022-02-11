public class Main {

    public static void main(String[] args) {
       int number=9;
       int a=number;
       for(int i=1;i<=number;i++){
           System.out.print(i);

           for(int j=a; j>=1; j--){
               System.out.print(j);

           }

           System.out.println("");

           a--;
       }

    }
}
