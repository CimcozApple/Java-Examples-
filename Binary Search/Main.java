
import java.util.Arrays;





public class Main {
    
    public static void main(String[] args) {
        int sayilar[]={1,9,5,2,7,23,60,120,55,-9};
      //  diziYazdir(sayilar);
        //diziYerDegistir(sayilar);
        System.out.println("\nYer değiştirildi...");
        //diziYazdir(sayilar);
        selectionSortSıralama(sayilar);
        //diziYazdir(sayilar);
        binarySearch(sayilar,9);
        //dizilerin hepsine aynı değeri atama
        int yeniDizi[]=new int[20];
       /* for (int i = 0; i < yeniDizi.length; i++) {
            yeniDizi[i]=100;

        }
        diziYazdir(yeniDizi);*/
        
        //dizilerin hepsine aynı değeri atama 2.yöntem
        Arrays.fill(sayilar, 0);
        diziYazdir(yeniDizi);
}
    
    public static void diziYazdir(int dizi[]){
        for (int i : dizi) {
            System.out.print("  "+i);
            
        }
    }
    //Kartları kar değince yapılan işlem
    public static void diziYerDegistir(int[] dizi) {
        for (int i = dizi.length-1; i > 0; i--) {
            int rastgeleIndex=(int)(Math.random()*(i+1));
            
            int temp=dizi[i];
            dizi[i]=dizi[rastgeleIndex];
            dizi[rastgeleIndex]=temp;
        }
        
    }
    // 0 1 2 3 4
    // 5 3 2 4 1  
    // 1 3 2 4 5 (1.dönüsteki hali)
    public static void selectionSortSıralama(int dizi[]){
        int temp;
        int min;
        for (int i = 0; i < dizi.length-1; i++) {
            min=i;
            
            for (int j = i+1; j < dizi.length; j++) {
                if(dizi[min]>dizi[j]){
                    min=j;
                }
                
            }
            temp=dizi[i];
            dizi[i]=dizi[min];
            dizi[min]=temp;

        }
        
    }
    
   public static void binarySearch(int[] dizi,int aranan){
       
       int bas=0; // 0
       int son=dizi.length-1;  // 8
       int orta = 0;
       while (son>=bas) {

           orta=(bas+son)/2;  //4
           if(dizi[orta]==aranan){
              break;
           }
           if(dizi[orta]<aranan){
               bas=orta+1;
           }
           if(dizi[orta]>aranan){
               son=orta-1;
           }

       }
       if(aranan!=dizi[orta] ){
           System.out.println("Dizide yok..");
       }
       else{
           System.out.println("Aranan "+aranan+" sayısı dizide mevcuttur."+ orta);
       }
       
       
       
           }
           
    }
       
       
   
    
    
    
    

