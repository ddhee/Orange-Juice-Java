package com.funcxy.oj.controllers;

import com.funcxy.oj.errors.ForbiddenError;
import com.funcxy.oj.models.User;
import com.funcxy.oj.repositories.UserRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * Session Controller
 *
 * @author zccz14
 */
@RestController
@RequestMapping("/session")
public class SessionController {
    @Autowired
    UserRepository userRepository;

    @RequestMapping(value = "/user", method = GET)
    public ResponseEntity GetSession(HttpSession httpSession) {
        String userId = (String) httpSession.getAttribute("userId");
        if (userId == null) {
            return new ResponseEntity<>(new ForbiddenError(), HttpStatus.FORBIDDEN);
        }
        User user = userRepository.findById(new ObjectId(userId));
        return new ResponseEntity<>(user, HttpStatus.OK);
    }
}