package com.vtech.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vtech.models.Vendor;
import com.vtech.service.VendorService;

@RestController
@RequestMapping("/vendor")
public class VendorController {

	@Autowired
	private VendorService vendorService;

	@PostMapping("/saveVendor")
	public Vendor saveVendor(@RequestBody Vendor vendor) {
		return vendorService.saveVendor(vendor);
	}

	@GetMapping("/getVendors")
	public List<Vendor> getVendors() {
		return (List<Vendor>) vendorService.getVendors();
	}

	@GetMapping("/getVendorByVendorId/{vendorId}")
	public Vendor getVendorByVendorId(@PathVariable String vendorId) {
		return vendorService.getVendorByVendorId(vendorId);
	}
}