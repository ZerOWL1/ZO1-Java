package TPBank;

import java.util.Locale;
import java.util.Random;
import java.util.ResourceBundle;
import java.util.Scanner;

public class TienPhongBank {
   Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        TienPhongBank login = new TienPhongBank();
        login.runSystem();
    } 
 /*
    - Purpose: hiện thị menu để người dùng lựa chọn
    */
    public void displayMenu() {
        System.out.println("=========Login Tien Phong Bank’s Ebank===========");
        System.out.println("1. Vietnamese");
        System.out.println("2. English");
        System.out.println("3. Exit");
      
    }
    
 /*
     
    - Purpose: kiểm tra giá trị nhập vào, yêu cầu phải là số nguyên nằm trong khoảng quy định
    - min,max: giá trị trong khoảng nhỏ nhất và lớn nhất, truyền vào hàm inputInt
    */
    public int checkInputInt(int min, int max, int number) {
        while (true) {
            try {
                if (number < min || number > max) {
                    return 0;
                } else {
                    return number;
                }
            } catch (NumberFormatException e) {
                System.out.println("Input must be an integer number!");
            }
        }
    }
    
/*
    Mỗi ngôn ngữ có 1 file properies riêng 
    Với ResourceBundle thực hiện đọc các file .properties theo ngôn ngữ truyền vào 
    Các file properties có định dạng: baseName_locale.properties
        + baseName của các file ngôn ngữ đều là language
        + locale: là ngôn ngữ
    Method ResourcesBundle.getBundle(baseName, locale): thực hiện lấy file chứa ngôn ngữ theo locale truyền vào
    */
    /*
        Purpose: hiện thị các lựa chọn và thực hiện lựa chọn
    */
    
    public void runSystem() {
        while (true) {
            displayMenu();
            System.out.print("Please choose one option: ");
            int number = Integer.parseInt(scan.nextLine());
            int input = checkInputInt(1, 3, number);
            switch (input) {
                case 1:
                    //vi_Locale: đại diện cho tiếng Việt
                    //.Locale vi_Locale = new Locale("vi");
                    //khởi tạo vi_bundle đọc file language_vn theo Tiếng Việt
                    ResourceBundle vi_bundle = ResourceBundle.getBundle("TPBank/language_vi");
               //thực hiện đăng nhập bằng tiếng việt
                    loginSytem(vi_bundle);
                    break;
                case 2:
                    //en_Locale: đại diện cho tiếng Anh
                    Locale en_Locale = new Locale("en");                             
                    //khởi tạo vi_bundle đọc file language_vn theo Tiếng Anh
                    ResourceBundle en_bundle = ResourceBundle.getBundle("TPBank/language_en", en_Locale);
                      //thực hiện đăng nhập bằng tiếng anh
                    loginSytem(en_bundle);
                    break;
                case 3:
                    return;
            }
        }
    }
    
 /*
    
    Purpose: thực hiện việc đăng nhập Hệ thống
    */
    public void loginSytem(ResourceBundle bundle) {
//        checkAccountNumber(bundle);
//        checkPassword(bundle);
//        checkCaptcha(bundle);
    }

 /*
    
    Purpose: sinh ngẫu nhiên captcha để nối thành chuỗi có 5 ký tự
 */   
    public String randomCaptcha() {
        String s = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        Random r = new Random();
        String captcha = "";
        //Random 5 characters captcha
        for (int i = 0; i < 5; i++) {
            int index = r.nextInt(s.length());
            captcha = captcha + s.charAt(index);          
        }
        return captcha;
    }

 /*
    
    Purpose: nhập và kiểm tra một mã captcha, truyền vào ResourcesBundle để thực hiện chức năng ngôn ngữ
    */   
 
    public void checkCaptcha(ResourceBundle bundle) {
        //Random captcha
        String captcha = randomCaptcha();
        System.out.println(bundle.getString("captcha") + captcha);
        while (true) {
            //Input captcha
            System.out.print(bundle.getString("captchaInput"));
            String input = scan.nextLine();
            if (captcha.contains(input)) {
                System.out.println(bundle.getString("Login-successfully."));
                return;
            }
            else{
                System.out.println(bundle.getString("wrong.captcha"));
                captcha = randomCaptcha();
                System.out.println(bundle.getString("captcha") + captcha);               
            }                           
        }
    }
    
/*
   
    Purpose: kiểm tra Account nhập vào có hợp lệ hay không (Account phải gồm 10 số)
    */  
    public String checkAccountNumber(String acc) {
        while (true) {
            if (acc.matches("^[0-9]{10}$")) {
                return "You've valid account....";
            } else {
                return "Error Input Account....";
            }
        }
    }

 /*
    
    Purpose: kiểm tra password nhập vào có hợp lệ hay không (gồm 8 đến 31 ký tự và phải chứa cả chữ và số)
    */   
    public boolean checkPassword(String password) {
        boolean checkAll = false;
        boolean check1 = false;
        boolean check2 = false;
        while (true) {
            if (password.length() >= 8 && password.length() <= 31) {
                for (int i = 0; i < password.length(); i++) {
                    char x = password.charAt(i);
                    if (Character.isLetter(x)) {
                        check1 = true;
                    }
                    if (Character.isDigit(x)) {
                        check2 = true;
                    }
                    if (check1 && check2) {
                        return checkAll = true;
                    }
                }
                check1  = check2 = false; 
            } else {
                return false;
            }
        }
    }

    
}