package roadToCopcom.example.roadtocop.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("indigenas")
public class ImovelController {

    @GetMapping
    public ResponseEntity<String> findAll() {
        return ResponseEntity.ok("Olá Mundo");
    }
}
