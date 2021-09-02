import models.Job;
import org.springframework.web.client.RestTemplate;
import org.testng.annotations.Test;

public class TestEncoding {
    @Test
    public void testUser(){
        RestTemplate restTemplate = new RestTemplate();
        Job job = restTemplate.getForObject("https://api.encoding.com/reference#responses-getstatus-extended", Job.class);
    }
}
