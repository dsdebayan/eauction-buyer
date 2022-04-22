package com.hackfse.eauction.buyer.controllers;


import javax.validation.Valid;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.hackfse.eauction.buyer.entities.Bid;

@FeignClient(name="warehouse")
public interface EauctionProxy {

	@PostMapping("/e-auction/api/v1/buyer/place-bid")
	public ResponseEntity<Void> placeBid(@Valid @RequestBody Bid bid);
	
	@PutMapping("/e-auction/api/v1/buyer/updatebid/{productId}/{buyerEmailld}/{newBidAmount}")
	public ResponseEntity<Object> updateBid(@PathVariable int productId, @PathVariable String buyerEmailld, @PathVariable Double newBidAmount );

	
}
