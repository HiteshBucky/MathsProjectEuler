import java.util.*;


public class Pro8 {

    public static int prime(){
        int i = 3;
        ArrayList<Integer> primes=new ArrayList<>();
        int counter=0;
        int counter2=0;
        while(true)
        {
            counter=0;
            for(int j=2; j<i;j++)
                if(i%j==0)
                    counter++;                   // control  is number prime or not
                  
            
            if(counter==0){
                counter2++;                      // count prime
                primes.add(i);                   // all primes are in primes arraylist
            }
            i++;
            if(counter2==10000)
                return Collections.max(primes);  // max number
        }
    }
    
    public static void main(String[] args){
        System.out.println(prime());
    }

   
}