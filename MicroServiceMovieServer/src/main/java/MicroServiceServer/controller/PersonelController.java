package MicroServiceServer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import MicroServiceServer.model.Personel;
import MicroServiceServer.service.PersonelService;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PersonelController {

	@Autowired
	PersonelService personelService;
	
    @GetMapping("/list")
    public List<Personel> getAllMovies() {
        List<Personel> personels = new ArrayList<Personel>();
        personels = personelService.ListPersonel();;
        return personels;
    }
}
