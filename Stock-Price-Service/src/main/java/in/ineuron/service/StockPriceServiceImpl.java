package in.ineuron.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ineuron.entity.StockPrice;
import in.ineuron.exception.StockNotFoundException;
import in.ineuron.repository.IStockPriceRepository;

@Service
public class StockPriceServiceImpl implements IStockPriceService {
	
	@Autowired
	private IStockPriceRepository repository;

	@Override
	public Double findStockPriceWithCompanyName(String companyName) {
		StockPrice stockPrice = repository.findByCompanyName(companyName);
		if(stockPrice==null) {
			throw new  StockNotFoundException("Company Not Avialable");
		}
		return stockPrice.getPrice();
	}

	@Override
	public List<StockPrice> getAllCompanyDetails() {
		List<StockPrice> all = repository.findAll();
		if(!(all.size()==0))
		return all;
		else throw new StockNotFoundException("Company Details  Avialable");
	}

}
