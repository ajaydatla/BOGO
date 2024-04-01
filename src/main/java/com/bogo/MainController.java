package com.bogo;

import com.bogo.service.BusinessLogic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/bogofirst")
public class MainController {

    @Autowired
    BusinessLogic businessLogic;
    @PostMapping("/getDiscount")
    public ResponseEntity<Price> getTotal(@RequestBody Price price) {

        return ResponseEntity.ok(businessLogic.getPrice(price));
    }
}
