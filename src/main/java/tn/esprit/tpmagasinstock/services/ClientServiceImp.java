package tn.esprit.tpmagasinstock.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.tpmagasinstock.entities.Client;
import tn.esprit.tpmagasinstock.repositories.ClientRepository;

import java.util.List;

@Service
public class ClientServiceImp implements ICrudService<Client , Long > , IClientService {

    @Autowired
    ClientRepository clientRepository ;
    @Override
    public List<Client> getAll() {
        return clientRepository.findAll();
    }

    @Override
    public Client add(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public Client update(Client client  , Long idClient) {
        if(clientRepository.findById(idClient).isPresent()) {
           Client client1 = clientRepository.findById(idClient).get();
           client1.setNom(client.getNom());
           client1.setPrenom(client.getPrenom());
           client1.setEmail(client.getEmail());
           client1.setPassword(client.getPassword());
           client1.setProfession(client.getProfession());
           client1.setDateNaissance(client.getDateNaissance());
           client1.setProfession(client.getProfession());
        }
        return clientRepository.save(client);
    }

    @Override
    public void delete(Long idClient) {
        clientRepository.deleteById(idClient);

    }
}
