package MicroServiceServer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import MicroServiceServer.model.Personel;
import MicroServiceServer.repository.PersonelRepository;

@Service
public class PersonelService {

	@Autowired
	PersonelRepository personelRepository;
	
	public List<Personel> ListPersonel() {
		return personelRepository.findAll();
	}
	
}
