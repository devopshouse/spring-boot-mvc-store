package demo.shopapi.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import demo.shopapi.entity.Mac;
import demo.shopapi.service.MacService;

@CrossOrigin
@RestController
public class MacController {
    @Autowired
    MacService macService;


    @GetMapping("/mac/{mac}")
    public Mac showOne(@PathVariable("mac") String mac) {
        return macService.findOne(mac);
    }
}
