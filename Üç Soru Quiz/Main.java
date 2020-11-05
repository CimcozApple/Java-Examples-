
import java.util.Scanner;

/* Soru1: 5*5 lik bir matris oluşturun ve bu matris elamanlarını 0-9 arasında
rastgele sayılar olsun. Bu matrisi ekrana yazdırın ve carpraz elamanlarının toplamını gösteren kodu yazınız*/
public class Main {
    public static void main(String[] args) {
       System.out.println("1.soronun cevabı: ");
        System.out.println("---------------------------------");
        int matris [][]=new int[5][5];
        int genelToplam=0;
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matris[i][j]=(int)(Math.random()*10);
                System.out.print(matris[i][j]+" ");
                if(i+j==4){
                    genelToplam+=matris[i][j];
                }
            }
            genelToplam+=matris[i][i];
            System.out.println(); 
        }
        System.out.println("Toplam: "+genelToplam);
/*Soru2: Kullancının girdiği decimal sayıları binary formatına çeviren java programını yazınız.(String kullanabilirsiniz) */
        
        System.out.println("2.Sorunun Cevabı: ");
        System.out.println("---------------------------------");
        
        Scanner scanner=new Scanner(System.in);
        System.out.print("Sayıyı giriniz: ");
        int girilenSayi=scanner.nextInt();
        String binarySayi="";
        if(girilenSayi==0){
            binarySayi="0";
        }
        while (girilenSayi>0) {
            int kalan=girilenSayi%2;
            binarySayi=kalan+binarySayi;//binaeySayi astirng olduğu için artı işareti yanına yazmak için kullanılır..
            girilenSayi=girilenSayi/2;
        }
        System.out.print("Sayının binary hali: "+binarySayi+"\n" );
      
/*Soru: Kullancının girdiği sayıya göre ekrena aşağıdaki çarpı işareti çizdiren kod parçaçcığını yazınız
                
*   *
 * * 
  *  
 * * 
*   *
        
*/
        System.out.println("3.Sorunun Cevabı: ");
        System.out.println("---------------------------------");
        
        System.out.print("Satır sayısını giriniz: ");
        int satirSayisi=scanner.nextInt();
        for(int i=0;i<satirSayisi;i++){
            for(int j=0;j<satirSayisi;j++){
                if(i==j|| i+j==satirSayisi-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
    
}
