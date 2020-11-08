
class Kanal {
    private String kanalAdi;
    private int kanalNo;

    public Kanal(String adi, int kanalNo) {
        this.kanalAdi = adi;
        this.kanalNo = kanalNo;
    }
    
    

    public String getAdi() {
        return kanalAdi;
    }

    public void setAdi(String adi) {
        this.kanalAdi = adi;
    }

    public int getKanalNo() {
        return kanalNo;
    }

    public void setKanalNo(int kanalNo) {
        this.kanalNo = kanalNo;
    }
    public String kanalBilgiGoster(){
        return "Kanal No: "+kanalNo+ " Kanal Adı: "+kanalAdi;
    }
    
    
    
}
