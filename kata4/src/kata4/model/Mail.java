package kata4.model;

public class Mail {

    String mail;
    
    public Mail(String mail) {
        this.mail = mail;
    }


    public String getDomain() {
        return this.mail.substring(this.mail.indexOf("@") + 1);
    }
    
    
    public static boolean isMail (String lineFile) {
        return lineFile.matches("-\\w\\.\\]+@\\w+\\.\\w+");
    }
    
    
}
