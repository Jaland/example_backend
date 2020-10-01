package com.redhat.todo.api;

import com.redhat.todo.repository.TodoRepository;
import org.keycloak.KeycloakSecurityContext;
import org.keycloak.representations.IDToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.bind.annotation.RequestHeader;

@Controller
@RequestMapping("${openapi.todo.base-path:}")
public class OpenApiController {

    @Autowired
    TodoRepository todoRepository;

    // Forwarded Header from oAuth proxy
    private static String USERNAME_HEADER="X-Forwarded-User";

    // Forwarded Email from oAuth proxy
    private static String EMAIL_HEADER="X-Forwarded-Email";

    @Autowired
    public OpenApiController(NativeWebRequest request) {
        this.request = request;
    }

    @RequestMapping(value = "/user/name",
            method = RequestMethod.GET)
    public ResponseEntity<IDToken> getUserDetails(@RequestHeader(USERNAME_HEADER) String username) {
        return ResponseEntity.ok(username);
    }

    @RequestMapping(value = "/user/email",
            method = RequestMethod.GET)
    public ResponseEntity<IDToken> getUserDetails(@RequestHeader(Email) String email) {
        return ResponseEntity.ok(email);
    }
}
