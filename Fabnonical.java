
class Febnonical{
    public static void main(String[]args){
        int s1=0,s2=1,s3,count=10;
        System.out.println(s1);
        System.out.println(s2);
        for(int i=2;i<=count;i++){
             s3=s1+s2;
             System.out.println(s3);
            s1=s2;
            s2=s3;
        }
    }
}