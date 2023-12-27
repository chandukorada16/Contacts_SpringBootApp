package com.contacts.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.contacts.binding.Contact;

public interface ContactsRepository extends JpaRepository<Contact, Integer> {

}
