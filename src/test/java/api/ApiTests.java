package api;

import io.restassured.http.ContentType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static io.restassured.RestAssured.given;

public class ApiTests {
        private final static String URL = "https://reqres.in/";

        @Test
        public void CheckAvatarAndId(){
            Specifications.installSpecification(Specifications.requestSpecification(URL), Specifications.responseSpecificationOK());
            List<UserData> users = given()
                    .when()
                    .get("api/users?page=2")
                    .then().log().all()
                    .extract().body().jsonPath().getList("data",UserData.class);
            users.forEach(x-> Assertions.assertTrue(x.getAvatar().contains(x.getId().toString())));
        }
}
