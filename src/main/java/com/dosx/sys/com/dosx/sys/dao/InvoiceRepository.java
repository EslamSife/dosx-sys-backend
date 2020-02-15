package com.dosx.sys.com.dosx.sys.dao;

import com.dosx.sys.com.dosx.sys.entity.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("http://localhost:4200")
public interface InvoiceRepository extends JpaRepository<Invoice, Long> {


}
