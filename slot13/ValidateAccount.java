package Lab4.slot13;

public class ValidateAccount {
        public final String MOBILE = " 0904999999";
        public final String PASSWORLD = "NGO VAN KHOAi";
        public boolean checkAccount(String mobile, String passworld){
            if(mobile.equals((MOBILE))){
                if(passworld.equals((PASSWORLD))){
                    System.out.println("Dang nhap thanh cong!");
                    return true;
                }else{
                    System.out.println("Mat khau sai, vui long nhap lai");
                    return false;
                }
            }else{
                System.out.println("Kiem tra lai so dien thoai hoac passworld");
                return false;
        }

        }
}
