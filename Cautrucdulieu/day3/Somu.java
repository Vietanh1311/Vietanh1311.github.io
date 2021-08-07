public class Somu {
    public static void main(String[] args){
        for (int i = 1; i <10;i++){
            System.out.println(  "5 mũ " + i + ":"+Somu(5,i)+" ");
        }
    }

    public static int Somu(int a,int n){
        if(n==1)
         return a;
        else
        return Somu(a,n-1)*a;

    }
    
}
