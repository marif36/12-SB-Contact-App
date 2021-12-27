package in.arifer.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import in.arifer.entities.Contact;

public interface ContactRepository extends JpaRepository<Contact, Serializable> {

}
