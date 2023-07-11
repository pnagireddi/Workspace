package in.ineuron.controller;


import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import in.ineuron.service.StockService;


@Controller
public class StockController {
	
	@Autowired
	private StockService service;
	
	@GetMapping("/")
	public String loadStartPage() {
		return "index";
	}
	
	@GetMapping("/gettotalcost")
	public String getTotalCost(HttpServletRequest request , Model model) {
		String companyName = request.getParameter("comapnyName");
		String quantity = request.getParameter("quantity");
		String data = service.getTotalCostForQuantity(companyName, Integer.parseInt(quantity));
		model.addAttribute("msg", data);
		return "index";
	}

}
