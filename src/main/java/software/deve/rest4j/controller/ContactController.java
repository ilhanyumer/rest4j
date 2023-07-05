package software.deve.rest4j.controller;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import software.deve.rest4j.model.Contact;
import software.deve.rest4j.service.ContactService;

import java.util.List;

@RestController
@ComponentScan(basePackages = {"software.deve.*"})
public class ContactController {

    private final ContactService contactService;

    public ContactController(ContactService contactService) {
        this.contactService = contactService;
    }

    @GetMapping(value = "/contacts", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Get all contacts")
    public List<Contact> allContacts() {
        return contactService.findAll();
    }

    @PostMapping(value = "/contacts", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Create a contact")
    public Contact createContact(@RequestBody Contact contact) {
        return contactService.add(contact);
    }
}
