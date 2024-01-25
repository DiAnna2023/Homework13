package api.step;

import api.dto.request.UserRequest;


public class UserBuilders {

    public UserRequest userDefaultBuilder(){
        return UserRequest.builder()
                .userName("User20")
                .password("Autodoc1!")
                .build();
    }
}
