package br.gov.receitafederal.atualizadorcontasreceita.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class ResourceBadRequestException extends RuntimeException{

	private static final long serialVersionUID = 458046004678622318L;

	public ResourceBadRequestException(String exception) {
		super(exception);
	}
}
