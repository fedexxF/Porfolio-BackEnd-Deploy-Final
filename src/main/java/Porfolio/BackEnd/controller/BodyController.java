package Porfolio.BackEnd.controller;

import Porfolio.BackEnd.model.Body;
import Porfolio.BackEnd.model.Home;
import Porfolio.BackEnd.service.BodyService;
import Porfolio.BackEnd.service.HomeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/body")
@CrossOrigin(origins ="**")
public class BodyController {
    private final BodyService bodyService;

    public BodyController(BodyService bodyService) {
        this.bodyService = bodyService;
    }

    @PostMapping ("/update")
    public ResponseEntity<Body> editarBody(@RequestBody Body body) {
        Body updateBody = bodyService.editarBody(body);
        return new ResponseEntity<>(updateBody, HttpStatus.OK);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Body>> obtenerHome() {
        List<Body> bodies = bodyService.buscarBody();
        return new ResponseEntity<>(bodies, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Body> crearBody(@RequestBody Body body) {
        Body nuevaBody = bodyService.addBody(body);
        return new ResponseEntity<>(nuevaBody, HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> borrarBody(@PathVariable("id") Long id) {
        bodyService.borrarBody(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
