public class ArmstrongNumber {
    public static void main(String[]args){
        int n=153,temp,ld;
        int res=0;
        temp=n;
        while(temp>0){
            ld=temp%10;
             res=res+ld*ld*ld;
            temp=temp/10;
                
        }
        if(res==n){
                System.out.println("Yes");
            }
        else{
                System.out.println("No");
            }
        
            
        
    }

}
