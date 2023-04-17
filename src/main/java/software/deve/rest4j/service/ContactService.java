package software.deve.rest4j.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import software.deve.rest4j.model.Contact;
import software.deve.rest4j.repository.ContactRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class ContactService {

    @Autowired
    private ContactRepository contactsRepository;

    public List<Contact> findAll() {
        var it = contactsRepository.findAll();
        var contacts = new ArrayList<Contact>();
        it.forEach(e -> contacts.add(e));
        return contacts;
    }

}
