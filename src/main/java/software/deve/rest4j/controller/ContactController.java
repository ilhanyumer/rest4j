package software.deve.rest4j.controller;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import software.deve.rest4j.model.Contact;
import software.deve.rest4j.service.ContactService;

import java.util.List;

@RestController
@ComponentScan(basePackages = {"software.deve.*"})
public class ContactController {

    @Autowired
    private ContactService contactService;

    @GetMapping(value = "/contacts", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Get all contacts")
    public List<Contact> allContacts() {
        return contactService.findAll();
    }
}
