package com.hackfse.eauction.buyer.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hackfse.eauction.buyer.entities.Bid;


@RestController
@RequestMapping("/e-auction/api/v1/buyer")
//@RequestMapping
public class BuyerController {

	@Autowired
	private EauctionProxy eauctionProxy;

	@GetMapping("/hello")
	public String hello() {
		return "Hello";
	}
	
	@PostMapping("/place-bid")
	public ResponseEntity<Void> placeBid(@RequestBody Bid bid) {

		eauctionProxy.placeBid(bid);

		return ResponseEntity.created(null).build();

	}

	@PutMapping("/updatebid/{productId}/{buyerEmailld}/{newBidAmount}")
	public ResponseEntity<Object> updateBid(@PathVariable int productId, @PathVariable String buyerEmailld, @PathVariable Double newBidAmount ) {

		eauctionProxy.updateBid(productId, buyerEmailld, newBidAmount);

		return ResponseEntity.noContent().build();
	}

}