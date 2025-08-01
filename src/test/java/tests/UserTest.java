package tests;

import base.BaseTest;
import endpoints.UserEndpoint;
import io.qameta.allure.testng.AllureTestNg;
import io.qameta.allure.testng.AllureTestNgTestFilter;
import io.restassured.response.Response;
import model.User;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

@Listeners({ AllureTestNg.class })
public class UserTest extends BaseTest {

    UserEndpoint userEndpoint = new UserEndpoint();

    @Test
    public void testGetUserFromPage2(){ // get users

        Response response = userEndpoint.getUserList(2);

        assertEquals(response.statusCode(), 200);
        assertEquals(response.jsonPath().getInt("page"), 2);

    }

//    @Test
//    public void testCreateUser() { // post user
//
//    //  this test is failing because it requires authentication
//
//        User newUserRequest = new User(45, "z@ra.com", "md", "zaid", "abc.png");
//
//        Response response = userEndpoint.createUser(newUserRequest);
//
//        assertEquals(response.statusCode(), 201);
//
//        int id = response.jsonPath().getInt("id");
//        String email = response.jsonPath().getString("email");
//
//        assertEquals(id, 45);
//        assertEquals(email, "z@ra.com");
//    }

}
