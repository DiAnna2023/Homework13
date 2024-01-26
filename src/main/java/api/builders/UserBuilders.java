package api.builders;

import api.dto.request.UserDto;



public class UserBuilders {

    public UserDto userDefaultBuilder(){
        return UserDto.builder()
                .userName("User20")
                .password("Autodoc1!")
                .build();
    }
}
