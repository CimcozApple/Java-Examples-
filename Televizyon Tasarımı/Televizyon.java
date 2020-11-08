
import java.util.ArrayList;


public class Televizyon {
    private String marka;
    private String boyut;
    private ArrayList<Kanal> kanallar;
    private boolean tvAcıkMi;
    private int ses;
    private int aktifKanal;

    public Televizyon(String marka, String boyut) {
        this.marka = marka;
        this.boyut = boyut;
        kanallar=new ArrayList<>();
        ses=10;
        aktifKanal=1;
        kanallariOLustur();
        this.tvAcıkMi=false;
    }

    public void sesArttir(){
        if(ses<20 && tvAcıkMi==true){
            ses++;
            System.out.println("Ses Seviyesi: "+ses);
        }
        else{
            System.out.println("Ses maksimumda daha fazla arttırılamaz."+
                               "veya televiyonuz kapalı olabilir tv nizi açmak için 2 ye basınız");
        }
    }
    
        public void sesAzalt(){
        if(ses>0 && tvAcıkMi){
            ses--;
            System.out.println("Ses Seviyesi: "+ses);
        }
        else{
            System.out.println("Ses mimmumda daha fazla arttırılamaz."+
                               "veya televiyonuz kapalı olabilir tv nizi açmak için 2 ye basınız");
        }
    }
    
    public void tvAc(){
        if(tvAcıkMi==false){
            tvAcıkMi=true;
            System.out.println("Tv açıldı.");
        }
        else{
            System.out.println("Zaten açık.");
        }
    }
    
    public void tvKapat(){
        if(tvAcıkMi==true){
            tvAcıkMi=false;
            System.out.println("Tv kapandı.");
        }
        else{
            System.out.println("Zaten kapalı.");
        }
    }
    private void kanallariOLustur() {
        
        HaberKanali cnn=new HaberKanali("Cnn Turk",1,"Politika");
        kanallar.add(cnn);
        HaberKanali bein=new HaberKanali("Bein Sport ",2,"Spor");
        kanallar.add(bein);
        MuzikKanalı kralPop=new MuzikKanalı("Kral Pop", 3,"Pop");
        kanallar.add(kralPop);
        MuzikKanalı radyoArabesk=new MuzikKanalı("Radyo Arabesk", 4,"Arabesk");
        kanallar.add(radyoArabesk);
        
    }
    public void kanalDegistir(int AcılmasıIstenenKanal){
        if(tvAcıkMi){
            if (AcılmasıIstenenKanal!=aktifKanal) {
                if (AcılmasıIstenenKanal<=kanallar.size() && AcılmasıIstenenKanal>=0) {
                    aktifKanal=AcılmasıIstenenKanal;
                    System.out.println("Kanal: "+AcılmasıIstenenKanal+" Kanal Bilgisi: \n"+kanallar.get(aktifKanal-1).kanalBilgiGoster());
                }
                else{
                    System.out.println("Geçerli bir kanal numarası giriniz.");
                }
            }
            else{
                System.out.println("Zaten "+aktifKanal+". kanalındasınız." );
            }
        }
        else{
            System.out.println("Önce televizyonu açınız.");
        }
    }
    public void aktifKanalıGoster(){
        if(tvAcıkMi)
        System.out.println("Aktif Kanal: "+kanallar.get(aktifKanal-1).kanalBilgiGoster());
        else System.out.println("Önce televizyonu açınız.");
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getBoyut() {
        return boyut;
    }

    public void setBoyut(String boyut) {
        this.boyut = boyut;
    }

    public boolean isTvAcıkMi() {
        return tvAcıkMi;
    }

    public void setTvAcıkMi(boolean tvAcıkMi) {
        this.tvAcıkMi = tvAcıkMi;
    }
    

    @Override
    public String toString() {
        return "Marka: "+marka +" Boyut: "+boyut+" olan tv oluşturuldu.";
    }

    
    
    
}
