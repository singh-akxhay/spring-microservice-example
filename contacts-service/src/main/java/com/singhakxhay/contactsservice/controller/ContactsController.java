package com.singhakxhay.contactsservice.controller;

import com.singhakxhay.contactsservice.model.Contact;
import com.singhakxhay.contactsservice.service.ContactsService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/contacts")
@RequiredArgsConstructor
@Slf4j
public class ContactsController {
  private final ContactsService contactsService;

  @GetMapping("/")
  public ResponseEntity<List<Contact>> getContacts() {
    log.info("[ContactsController : getContacts] - START");

    var contacts = contactsService.getContacts();

    log.info("[ContactsController : getContacts] - END");

    return ResponseEntity.ok(contacts);
  }
}
