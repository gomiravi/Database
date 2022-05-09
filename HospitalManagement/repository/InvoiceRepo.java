package com.example.demo.hospital.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.hospital.entity.Invoice;

public interface InvoiceRepo extends JpaRepository<Invoice,Integer> {

 

}
