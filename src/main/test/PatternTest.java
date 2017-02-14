import org.junit.Test;

import java.util.regex.Pattern;

/**
 * Created by Zhoujp1 on 2017-01-22.
 */
public class PatternTest
{
    @Test
    public void TestEmailRegex(){
        String email = "123@cinic.com";
        String regex = "^[a-zA-Z0-9_-]+@[a-zA-Z0-9_-]+(\\.[a-zA-Z0-9_-]+)+$";
        Boolean res = Pattern.matches(regex,email);
        System.out.println(res);
    }
}
