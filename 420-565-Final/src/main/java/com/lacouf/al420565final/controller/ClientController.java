package com.lacouf.al420565final.controller;

import com.lacouf.al420565final.model.Client;
import com.lacouf.al420565final.util.ClientFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@CrossOrigin("http://localhost:4000/")
@RequestMapping("/client")
public class ClientController {

    @GetMapping("/get-all")
    public ResponseEntity<List<Client>> fetchAll() {
        try {
            return getResponseEntity(ClientFactory.getClients().stream().collect(Collectors.toList()));
        } catch (Exception e) {
            return returnConflict();
        }
    }

    @GetMapping("/get-all-men")
    public ResponseEntity<List<Client>> fetchAllMen() {
        try {
            return getResponseEntity(ClientFactory.getClients().stream().filter(client -> client.getGender().equals("M")).collect(Collectors.toList()));
        } catch (Exception e) {
            return returnConflict();
        }
    }

    @GetMapping("/get-all-ontario")
    public ResponseEntity<List<Client>> fetchAllOntario() {
        try {
            return getResponseEntity(ClientFactory.getClients().stream().filter(client -> client.getProvince().equals("ON")).collect(Collectors.toList()));
        } catch (Exception e) {
            return returnConflict();
        }
    }

    private ResponseEntity<List<Client>> getResponseEntity(List<Client> clients) {
        return new ResponseEntity<>(clients, HttpStatus.OK);
    }

    private ResponseEntity<List<Client>> returnConflict() {
        return new ResponseEntity<>(HttpStatus.CONFLICT);
    }

}

