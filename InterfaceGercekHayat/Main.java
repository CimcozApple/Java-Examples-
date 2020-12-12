//Solid prensiplerinin O harfi olan O — Open-closed principle Örneği

/*Bir sınıf (nesne) yalnızca bir amaç uğruna değiştirilebilir, 
o da o sınıfa yüklenen sorumluluktur,yani bir sınıfın(fonksiyona da indirgenebilir) 
yapması gereken yalnızca bir işi olması gerekir.
*/
public class Main
{
    public static void main(String[] args)
    {
       SignUpManager signUpManager=new SignUpManager(new ComplexUserCheckService());//bağımlı olmayan sistem 
       signUpManager.signUp(new User(1,"Berkay",23));
        
    }
    
}
