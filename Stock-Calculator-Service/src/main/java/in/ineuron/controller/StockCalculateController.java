package in.ineuron.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ineuron.client.StockClient;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/cal")
public class StockCalculateController {

	@Autowired
	private StockClient client;

	@ApiOperation("IT WILL GIVES TOTAL AMOUNT BASED ON COMPANY NAME AND QUANTITY IT WILL CONSUME THE SERVICE FROM STOCK PRICE SERVICE")
	@GetMapping("/calculate/{companyName}/{quantity}")
	public ResponseEntity<?> stockPriceCalculator(@PathVariable String companyName, @PathVariable Integer quantity) {
		ResponseEntity<?> responseEntity = null;
		Double totalprice = null;
		System.out.println(companyName);
		System.out.println(quantity);
		try {
			responseEntity = client.invokeStockPrice(companyName);
			int value = responseEntity.getStatusCodeValue();
			if (value == 200) {
				Double companyprice = (Double) responseEntity.getBody();
				System.out.println(companyprice);
				totalprice = companyprice * quantity;
				String output = "Total Amount :: " + totalprice;
				return responseEntity = new ResponseEntity<String>(output, HttpStatus.OK);
			}
		} catch (Exception e) {
			return responseEntity = new ResponseEntity<String>(" Company Not Found ", HttpStatus.BAD_REQUEST);
		}
		return responseEntity;
	}

}
