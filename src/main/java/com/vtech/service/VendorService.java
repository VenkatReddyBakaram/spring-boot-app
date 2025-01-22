package com.vtech.service;

import java.util.List;

import com.vtech.models.Vendor;

public interface VendorService {

	Vendor saveVendor(Vendor vendor);

	public List<Vendor> getVendors();

	public Vendor getVendorByVendorId(String vendorId);

}
