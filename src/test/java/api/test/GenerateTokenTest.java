package api.test;

import api.step.UserSteps;
import org.testng.annotations.Test;

public class GenerateTokenTest {

    @Test
    void generateToken(){
        var token = new UserSteps().generateToken().getToken();

        System.out.println(token);
    }
}
