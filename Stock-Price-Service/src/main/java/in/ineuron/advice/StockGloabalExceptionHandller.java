package in.ineuron.advice;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import in.ineuron.error.ErrorDetails;
import in.ineuron.exception.StockNotFoundException;

@RestControllerAdvice
public class StockGloabalExceptionHandller {

	@ExceptionHandler(StockNotFoundException.class)	
	public ResponseEntity<ErrorDetails> StockNotFound(StockNotFoundException snfe){
          ErrorDetails details = new ErrorDetails();
          details.setTimeStamp(LocalDateTime.now());
          details.setMsg(snfe.getMessage());
          return new ResponseEntity<ErrorDetails>(details,HttpStatus.BAD_REQUEST);
	}

}
