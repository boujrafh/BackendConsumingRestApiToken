package hello;

import org.springframework.http.*;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLong;

    @RestController
    public class GreetingController {

        private String appToken = "insert your token";

        @RequestMapping("/greeting/{id}")
        public StibResult greeting(@PathVariable long id) {
            String uri = "https://..." + id;
            RestTemplate restTemplate = new RestTemplate();
            HttpHeaders headers = new HttpHeaders();
            headers.add("Authorization", "Bearer " + appToken);
            headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
            HttpEntity entity = new HttpEntity(headers);
            ResponseEntity<StibResult> result = restTemplate.exchange(uri, HttpMethod.GET, entity, StibResult.class);
            return result.getBody();
        }

    }
