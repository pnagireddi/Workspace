package in.ineuron.error;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class ErrorDetails {
	private LocalDateTime timeStamp;
	private String msg;
}
