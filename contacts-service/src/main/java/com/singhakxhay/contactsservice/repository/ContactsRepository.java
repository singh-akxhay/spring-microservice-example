package com.singhakxhay.contactsservice.repository;

import com.singhakxhay.contactsservice.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactsRepository extends JpaRepository<Contact, String> {
}
