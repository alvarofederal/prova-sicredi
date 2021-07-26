package br.gov.receitafederal.atualizadorcontasreceita.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.REQUEST_TIMEOUT)
public class ResourceTimeOutException extends RuntimeException{

	private static final long serialVersionUID = 458046004678622318L;

	public ResourceTimeOutException(String exception) {
		super(exception);
	}
}
