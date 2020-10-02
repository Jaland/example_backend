package com.redhat.todo.api;

import com.redhat.todo.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("${openapi.todo.base-path:}")
public class OpenApiController {

    @Autowired
    TodoRepository todoRepository;

    // Forwarded Header from oAuth proxy
    private static final String USERNAME_HEADER="X-Forwarded-User";

    // Forwarded Email from oAuth proxy
    private static final String EMAIL_HEADER="X-Forwarded-Email";

    @RequestMapping(value = "/user/name",
            method = RequestMethod.GET)
    public ResponseEntity<String> getUsername(@RequestHeader(value = USERNAME_HEADER) String username) {
        return ResponseEntity.ok(username);
    }

    @RequestMapping(value = "/user/email",
            method = RequestMethod.GET)
    public ResponseEntity<String> getUserEmail(@RequestHeader(EMAIL_HEADER) String email) {
        return ResponseEntity.ok(email);
    }
}
