package in.ineuron.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ineuron.entity.StockPrice;
import in.ineuron.service.IStockPriceService;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/stock")
public class StockContoller {
	
	@Autowired
	private IStockPriceService service;
	
	@GetMapping("/price/{companyName}")
	@ApiOperation("GET THE PRICE OF A STOCK BY PROVIDING COMPANY NAME")
	public ResponseEntity<Double> getStockPrice(@PathVariable String companyName){
		Double price = service.findStockPriceWithCompanyName(companyName);
		return new ResponseEntity<Double>(price,HttpStatus.OK);
	}
	
	
	// this method is used only for to get the details from data base
	@GetMapping("/companylist")
	@ApiOperation("GET ALL COMPANY DETAILS")
	public ResponseEntity<List<StockPrice>> getAllInformation(){
		List<StockPrice> details = service.getAllCompanyDetails();
		return new ResponseEntity<List<StockPrice>>(details,HttpStatus.OK);	
	}

}
