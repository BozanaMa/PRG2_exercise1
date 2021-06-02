package ac.at.fhcampuswien;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CheckPasswordTest{
    @Test
    @DisplayName("Password is too short")
    public void testPasswordLength_1(){
        CheckPassword PV = new CheckPassword();
        boolean actual = PV.checkPassword("boki");
        boolean expected = false;
        assertEquals(expected, actual);
    }
    @Test
    @DisplayName("Password is too long")
    public void testPasswordLength_2(){
        CheckPassword PV = new CheckPassword();
        boolean actual = PV.checkPassword("hellofromtheotherside");
        boolean expected = false;
        assertEquals(expected, actual);
    }
    @Test
    @DisplayName("Password is only written in small letters")
    public void testPasswordWriting_1(){
        CheckPassword PV = new CheckPassword();
        boolean actual = PV.checkPassword("hellofromtheotherside");
        boolean expected = false;
        assertEquals(expected, actual);
    }
    @Test
    @DisplayName("Password is only written in caps")
    public void testPasswordWriting_2(){
        CheckPassword PV = new CheckPassword();
        boolean actual = PV.checkPassword("HELLOFROMTHEOTHERSIDE");
        boolean expected = false;
        assertEquals(expected, actual);
    }
    @Test
    @DisplayName("Password is written in small and capital letters")
    public void testPasswordWriting_3(){
        CheckPassword PV = new CheckPassword();
        boolean actual = PV.checkPassword("helloFROM@THEOTHERSIDE11");
        boolean expected = true;
        assertEquals(expected, actual);
    }
    @Test
    @DisplayName("Password has got no numbers")
    public void testPasswordNumbers_1(){
        CheckPassword PV = new CheckPassword();
        boolean actual = PV.checkPassword("hellobokii");
        boolean expected = false;
        assertEquals(expected, actual);
    }
    @Test
    @DisplayName("Password has got only numbers")
    public void testPasswordNumbers_2(){
        CheckPassword PV = new CheckPassword();
        boolean actual = PV.checkPassword("123456789");
        boolean expected = false;
        assertEquals(expected, actual);
    }
    @Test
    @DisplayName("Password is with numbers")
    public void testPasswordNumbers_3(){
        CheckPassword PV = new CheckPassword();
        boolean actual = PV.checkPassword("eR23#8r(en98");
        boolean expected = true;
        assertEquals(expected, actual);
    }
    @Test
    @DisplayName("Password has got no special characters")
    public void testPassworddSC_1(){
        CheckPassword PV = new CheckPassword();
        boolean actual = PV.checkPassword("Bokiiiiiiis");
        boolean expected = false;
        assertEquals(expected, actual);
    }


}


