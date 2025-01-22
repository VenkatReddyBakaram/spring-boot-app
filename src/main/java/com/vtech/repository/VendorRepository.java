package com.vtech.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vtech.models.Vendor;

@Repository
public interface VendorRepository extends JpaRepository<Vendor, String> {

}
