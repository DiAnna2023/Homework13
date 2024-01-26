package api.step;

import api.config.Requests;
import api.dto.response.get.GetUserDto;
import api.endpoints.UserEndpoints;
import static api.config.RequestService.requestWithToken;
import static api.config.ResponseService.ok;


public class UserSteps {

    Requests requests = new Requests();

    public GetUserDto getUser() {
        return requests.get(requestWithToken(),
                        UserEndpoints.GET_USER.getEndpoints() + "20dd0c3e-a956-4794-b723-1db596966bf0").then().spec(ok())
                .extract().body().as(GetUserDto.class);
    }
}
