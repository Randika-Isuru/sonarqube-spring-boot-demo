package controller;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @GetMapping("product/{id}")
    public ResponseEntity getProduct(@PathVariable String id){
        if("1".equals(id)){
            System.out.println("Id is 1");
        }
        return new ResponseEntity("Product", HttpStatus.OK);
    }
}
