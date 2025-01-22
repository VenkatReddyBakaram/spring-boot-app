package com.vtech.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vtech.models.Customers;
import com.vtech.models.Vendor;
import com.vtech.repository.VendorRepository;
import com.vtech.service.VendorService;

@Service
public class VendorServiceImpl implements VendorService {

	@Autowired
	private VendorRepository vendorRepository;

	@Override
	public Vendor saveVendor(Vendor vendor) {

		if (vendor.getVendorId() == null)
			throw new IllegalArgumentException("vendorId must be assigned before persisting");
		else {
			if (vendor.getCustomers() != null) {
				for (Customers customer : vendor.getCustomers()) {
					customer.setVendor(vendor);
				}
			}

			return vendorRepository.save(vendor);
		}
	}

	@Override
	public List<Vendor> getVendors() {
		return (List<Vendor>) vendorRepository.findAll();
	}

	@Override
	public Vendor getVendorByVendorId(String vendorId) {
		Optional<Vendor> vendorDB = vendorRepository.findById(vendorId);
		if (vendorDB.isPresent())
			return vendorDB.get();
		else
			return null;
	}
}