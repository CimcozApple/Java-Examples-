// bu class bizim kullancımızı veri tabanına kaydedermiş gibi davranacak
public class SignUpManager
{
    private IUserCheckService iUserCheckService;

    public SignUpManager(IUserCheckService iUserCheckService)// Sen bana IUserCheckService ver.Bu Age yada Complex servislerinden istedigğin olabilir.
    {
        this.iUserCheckService = iUserCheckService;
    }
 
    public void signUp(User user)
    {
        if (iUserCheckService.checkUser(user))//eğer true dönerse kayıt olabilecek
        {
            System.out.println("Kullanıcı kayıt oldu: "+user.getName());
        }
        else
        {
            System.out.println("Kullanıcı kayıt olamadı...");
        }
        
        
        
        
        
       /* AgeUserCheckService ageUserCheckService=new AgeUserCheckService();// yanlış olan kullanım
        if (ageUserCheckService.checkUser(user))
        {
            System.out.println("Kullanıcı kayıt oldu "+user.getName());

        }
        else
        {
            System.out.println("Kullanıcı kayıt olamadı");

        }*/
        
    }
}
