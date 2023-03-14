

public class MyInteger { 
    int data ;
    public MyInteger(int data){ 
       this.data=data ;
    } 
    public int getData() {
        return data;
    } 
     public boolean isEven(){ 
      
       if (data%2==0) {
           return true ;
       }
       else{ 
           return false ;
       }
     } 
     public boolean isPrime()  
     {  
       int flag=0 ;

       for(int i=data ;i<0;i--){ 
           if (data%i==0){ 
            flag++ ;
           }
       }
       if (flag==2){ 
           return true ;
        }  
       else{ 
           return false ;
       }
     
     }
     public boolean isOdd() {
       if (data%2==1){ 
        return true ;

       }
       else{ 
          return  false ;
       }
     }
     public static boolean isEven(MyInteger value){
       if(value.getData() % 2 == 0)
           return true;
       return false;
   }
   public static boolean isOdd(MyInteger value){
       if(value.getData()% 2 == 0)
           return false;
       return true;
   }
   public static boolean isPrime(MyInteger value){
       if(value.getData() == 1)
           return false;
       if (value.getData() == 2)
           return true;
       for(int i = value.getData() ; i > 1 ; i--){
           if (value.getData() % i == 0)
               return false;
       }
       return true;
   }
   public boolean equals(int value){
       return (this.getData() == value);
   }
   public boolean equals(MyInteger value){
       if(this.getData() == value.getData())
           return true;
       return false;
   }


}
