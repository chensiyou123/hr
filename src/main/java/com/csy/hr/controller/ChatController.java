package com.csy.hr.controller;

import com.csy.hr.domain.Hr;
import com.csy.hr.service.HrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/chat")
public class ChatController {

    @Autowired
    private HrService hrService;
    @RequestMapping(value = "/hrs", method = RequestMethod.GET)
    public List<Hr> getAllHr() {
        return hrService.getAllHrExceptAdmin();
    }
}
