package com.singhakxhay.contactsservice.service;


import com.singhakxhay.contactsservice.model.Contact;
import com.singhakxhay.contactsservice.repository.ContactsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ContactsServiceImpl implements ContactsService {
  private final ContactsRepository contactsRepository;

  @Override
  public List<Contact> getContacts() {
    return contactsRepository.findAll();
  }
}
