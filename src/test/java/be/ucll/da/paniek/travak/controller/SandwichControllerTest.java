package be.ucll.da.paniek.travak.controller;

import be.ucll.da.paniek.travak.Application;
import be.ucll.da.paniek.travak.model.Sandwich;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class SandwichControllerTest {

    @LocalServerPort
    private int port;

    TestRestTemplate restTemplate = new TestRestTemplate();
    HttpHeaders headers = new HttpHeaders();

//    @Test
//    public void sandwichesReturnsListOfSandwiches() {
//        HttpEntity<String> entity = new HttpEntity<String>(null, headers);
//
//        ResponseEntity<String> response = restTemplate.exchange(
//                "http://localhost:" + port + "/sandwiches",
//                HttpMethod.GET, entity, String.class);
//
//        String expected = "{id:Course1,name:Spring,description:10 Steps}";
//
//        JSONAssert.assertEquals(expected, response.getBody(), false);
//    }

    @Test
    public void PostToSandwichesReturnsSandwichWithId() {
        Sandwich sandwich = new Sandwich("Smos hesp", "Sla, tomaten, hesp, mayo", new BigDecimal(2.65));

        HttpEntity<Sandwich> entity = new HttpEntity<Sandwich>(sandwich, headers);

        ResponseEntity<String> response = restTemplate.exchange(
                "http://localhost:" + port + "/sandwiches",
                HttpMethod.POST, entity, String.class);

        String actual = response.getHeaders().get(HttpHeaders.LOCATION).get(0);
        System.out.println(actual);

        // TODO use AssertJ
        //Assertions.assertThat();
    }
}
