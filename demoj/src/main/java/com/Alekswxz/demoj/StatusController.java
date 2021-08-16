package com.Alekswxz.demoj;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatusController {
    /**
     * @return
     */
    @GetMapping(path = "/status")
    public String check() {
        return "OOOOIIII!!!";

    }
}
