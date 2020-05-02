package com.appsdeveloperblog.app.ws.userservice;

import com.appsdeveloperblog.app.ws.ui.model.request.UpdateUserDetailsRequestModel;
import com.appsdeveloperblog.app.ws.ui.model.request.UserDetailsRequestModel;
import com.appsdeveloperblog.app.ws.ui.model.response.UserRest;
import org.springframework.http.ResponseEntity;

public interface UserService {
    UserRest createUser(UserDetailsRequestModel userDetails);
    ResponseEntity getUser(String userId);
    UserRest updateUser( String userId, UpdateUserDetailsRequestModel userDetails);
}
