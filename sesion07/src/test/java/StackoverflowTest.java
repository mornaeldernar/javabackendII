import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.util.List;
import static org.testng.Assert.assertEquals;

public class StackoverflowTest {


    private WebDriver driver;

    @BeforeTest
    public void setup(){
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("disabled-infobars");
        options.addArguments("--disable-extensions");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--no-sandbox");
        driver = new ChromeDriver(options);
        driver.get("https://stackoverflow.com/questions/57455436/using-object-to-embed-svg-but-doesnt-show-anything/57536936#57536936");

    }

    @AfterTest
    public void teardown(){
        if(driver!=null){
            driver.quit();
        }
    }

    /**
     * - Una prueba que valide el título de la pregunta
     * - Una prueba que valide el número de votos de la pregunta
     * - Una prueba que valide el número de respuestas
     * - Una prueba que valide el usuario de la primera respuesta
     * - Una prueba que valide el número de la respuesta más votada
     */
    @Test
    public void verifyStackOverflowTitle(){
        WebElement header = driver.findElement(By.id("question-header"));
        String text = header.findElement(By.xpath("h1")).findElement(By.xpath("a")).getText();
        assertEquals(text,"Using <object> to embed svg but doesn't show anything");
    }
    @Test
    public void verifyStackOverflowVotes(){
        WebElement question = driver.findElement(By.id("question"));
        String text = question.findElement(By.className("js-vote-count")).getText();
        assertEquals(text,"0");
    }
    @Test
    public void verifyStackOverflowAnswers(){
        WebElement answers = driver.findElement(By.id("answers"));
        List<WebElement> answer = answers.findElements(By.className("answer"));
        assertEquals(answer.size(),2);
    }
    @Test
    public void verifyStackOverflowFirstUser(){
        WebElement answers = driver.findElement(By.id("answers"));
        List<WebElement> answer = answers.findElements(By.className("answer"));
        WebElement usuario = answer.get(0).findElement(By.className("user-info"));
        String nombreUsuario  = usuario.findElement(By.className("user-details")).findElement(By.xpath("a")).getText();
        assertEquals(nombreUsuario,"Noe Lopez");
    }

    @Test
    public void verifyStackOverflowMostVoted(){
        WebElement answers = driver.findElement(By.id("answers"));
        List<WebElement> answer = answers.findElements(By.className("answer"));
        int maximo_votos = 0;
        for(WebElement a : answer){
            int votos = Integer.parseInt(a.findElement(By.className("js-vote-count")).getText());
            if(votos > maximo_votos){
                maximo_votos = votos;
            }
        }
        assertEquals(maximo_votos,2);
    }
}
