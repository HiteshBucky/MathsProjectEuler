class Prob1{
     public static void main(String []args){
     	long startTime = System.currentTimeMillis();
        long sum=0,i;
        for( i=1; i<1000; i++)
            if( i%3==0 || i%5==0 )
            	sum=sum+i;
       
        System.out.println("the sum is " + sum );
        System.out.println((System.currentTimeMillis() - startTime)/1000.0 + " Sec");
     }
}