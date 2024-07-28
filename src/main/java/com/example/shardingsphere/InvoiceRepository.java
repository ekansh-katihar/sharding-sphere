package com.example.shardingsphere;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceRepository extends JpaRepository<Invoice, Long> { 
    public List<Invoice> findByYear(int year);

 }