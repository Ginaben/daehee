package com.tomato.daehee.address.controller;

import com.tomato.daehee.address.service.AddressService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/address")
@AllArgsConstructor
@Slf4j
public class AddressController {
    private AddressService addressService;

    @GetMapping("/addressList")
    public String getAddressList(Model model) throws Exception {

        return "address/addressList";
    }




}
