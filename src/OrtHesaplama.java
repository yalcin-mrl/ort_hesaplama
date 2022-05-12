import java.util.Scanner;

public class OrtHesaplama {
    public static void main(String[] args){
        double ort =0.0,top = 0.0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Sayı giriniz: ");
        int num = sc.nextInt();
        for(int i=0;i<=num;i++){
            if((i%3 == 0 )&& (i%4 == 0)){
                top += (double) i;
            }
        }
        ort = top/(double)num;
        System.out.println("Ortalama: "+ort);

    }
}
