package software.deve.rest4j.service;

import org.springframework.stereotype.Service;
import software.deve.rest4j.model.Contact;
import software.deve.rest4j.repository.ContactRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class ContactService {

    private final ContactRepository contactsRepository;

    public ContactService(ContactRepository contactsRepository) {
        this.contactsRepository = contactsRepository;
    }

    public List<Contact> findAll() {
        var it = contactsRepository.findAll();
        return new ArrayList<>(it);
    }

    public Contact add(Contact contact) {
        return contactsRepository.save(contact);
    }
}
