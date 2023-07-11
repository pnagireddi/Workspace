package in.ineuron.service;

import java.util.List;

import in.ineuron.entity.StockPrice;

public interface IStockPriceService {
	
	public Double findStockPriceWithCompanyName(String companyName);
	
	public List<StockPrice> getAllCompanyDetails();

}
