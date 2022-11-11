package com.example.food_delivery.controller;

import com.example.food_delivery.payload.request.SigninRequest;
import com.example.food_delivery.payload.response.ResponseData;
import com.example.food_delivery.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin // cho phep cac page khac truy cap vao loi cros policy
@RequestMapping("/signin")
public class LoginController {

    @Autowired
    LoginService loginService;

    @PostMapping("")
    public ResponseEntity<?> signin(@RequestBody SigninRequest signinRequest) {
        boolean isSucess = loginService.checkLogin(signinRequest.getEmail(), signinRequest.getPassword());
        ResponseData responseData = new ResponseData();
        responseData.setStatus(HttpStatus.OK.value());
        responseData.setSuccess(isSucess);
        responseData.setDesc("");
        responseData.setData("");
    return  new ResponseEntity<>(responseData,HttpStatus.OK);
    }
}
