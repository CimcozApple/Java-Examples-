
public class Main {
    public static void main(String[] args) {
        Hayvan h1=new Hayvan();
        Kopek kopek1=new Kopek("Golden");
        Kedi kedi1=new Kedi("Van Kedisi");
        isimSoyle(h1);
        isimSoyle(kedi1);
        isimSoyle(kopek1);
        
    }//polimorfizm kullanmazsak yazılacaklar
    public static void isimSoyle(Hayvan hayvan){
        if(hayvan instanceof Kopek){
            Kopek gecici=(Kopek)hayvan;
            gecici.adiniSoyle();
            System.out.println("Kopek içindeki adını söyle çağrıldı");
        }
        else if(hayvan instanceof Kedi){
            Kedi gecici=(Kedi)hayvan;
            gecici.adiniSoyle();
            System.out.println("Kedi içindeki adını söyle çağrıldı");
        }
        else{
            hayvan.adiniSoyle();
            System.out.println("Hayvan içindeki adını söyle çağrıldı");
        }
        
         //hayvan.adiniSoyle(); //tek bir satır kodla yukarıdaki aynı işi aypmış oluyoruz...
    }
    
}
class Hayvan{
   private int ayakSayisi;

    public int getAyakSayisi() {
        return ayakSayisi;
    }
    public void setAyakSayisi(int ayakSayisi) {
        this.ayakSayisi = ayakSayisi;
    }
   public void adiniSoyle(){
       System.out.println("Ben bir hayvan nesnesiyim.");     
   }
}
class Kopek extends Hayvan{
    private String tur;
    public Kopek(String tur){
        setAyakSayisi(4);
        setTur(tur);
    }

    public String getTur() {
        return tur;
    }
    public void setTur(String tur) {
        this.tur = tur;
    }

    @Override
    public void adiniSoyle() {
        System.out.println("Ben bir kopek nesnesiyim.");
    }

}
class Kedi extends Hayvan{
   private String cinsi;
   
   public Kedi(String cinsi){
       setAyakSayisi(4);
       setCinsi(cinsi);
   }

    public String getCinsi() {
        return cinsi;
    }
    public void setCinsi(String cinsi) {
        this.cinsi = cinsi;
    }

    @Override
    public void adiniSoyle() {
        System.out.println("Ben bir kedi nesnesiyim.");
    }
    
    
   
}
