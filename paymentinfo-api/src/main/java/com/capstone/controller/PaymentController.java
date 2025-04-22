package com.capstone.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capstone.model.PaymentInfo;
import com.capstone.service.PaymentService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@RestController
@RequestMapping("/api/payment")

public class PaymentController {
	@Autowired
	private PaymentService paymentservice;
	Map<String, String> mymap = new HashMap<>();

	@GetMapping("/getpayment")
	public ResponseEntity<List<PaymentInfo>> getpayment() {
		return new ResponseEntity<List<PaymentInfo>>(paymentservice.getpayment(), HttpStatus.OK);
	}

	@GetMapping("/validate")
	public String validateAndReturnCustId(@RequestAttribute("currentuser") String custid) {
		return custid;
	}

	@GetMapping("/pays/{tno}")
	public ResponseEntity<PaymentInfo> getUsersBycustid(@PathVariable int tno) {
		return new ResponseEntity<PaymentInfo>(paymentservice.getfindByTransactionNo(tno), HttpStatus.OK);
	}
	@PostMapping("/addTransaction")
	public ResponseEntity<?> addTransaction(@RequestBody PaymentInfo payment){
		try {
			mymap.clear();
			mymap.put("message", "payment added");
			paymentservice.addTransaction(payment);
			return new ResponseEntity<>(mymap,HttpStatus.OK);
		}catch(Exception e) {
			mymap.clear();
			mymap.put("message", "payment addedion failure");
			return new ResponseEntity<>(mymap,HttpStatus.OK);
		}
		
	}
}
