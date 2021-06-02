package ac.at.fhcampuswien;

public class CheckPassword {
    public boolean checkPassword(String pw){
        return pw.matches("^(?=.{8,25})(?=.*[a-z])((?=.*[A-Z])?=.*\\d)(?=.*[()#$?!%/@]).+$");
    }
}
