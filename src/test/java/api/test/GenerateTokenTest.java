package api.test;
import api.step.BookSteps;
import api.step.UserSteps;
import org.testng.annotations.Test;
import java.util.List;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class GenerateTokenTest {


    private final UserSteps steps = new UserSteps();
    private final BookSteps bookSteps = new BookSteps();

    @Test
    void generateToken(){
        bookSteps.addBookToUser();
        var responseUser = steps.getUser();
        assertThat(responseUser.getBooks().get(0).getTitle().isEqualTo("Git Pocket Guide"));
        bookSteps.deleteBook();
        var finalResponse=steps.getUser();
        assertThat(finalResponse.getBooks().isEqualTo(List.of()));
    }

}
