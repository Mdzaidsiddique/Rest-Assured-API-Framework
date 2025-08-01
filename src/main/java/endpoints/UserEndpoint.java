package endpoints;

import client.RestClient;
import config.ConfigManager;
import model.User;
import io.restassured.response.Response;

// Business logic class (ORM-style)
public class UserEndpoint {

    RestClient client = new RestClient();

    // get users
    public Response getUserList(int pageNumber) {
        return client.getRequest(ConfigManager.BASE_URL + "/users?page=" + pageNumber);
    }

    // post user
    public Response createUser(User request) {
        return client.postRequest(ConfigManager.BASE_URL + "/users", request);
    }

    // put, patch, delete..
}
