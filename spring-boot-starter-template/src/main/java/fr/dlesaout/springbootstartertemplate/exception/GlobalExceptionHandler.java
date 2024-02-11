package fr.dlesaout.springbootstartertemplate.exception;

import lombok.Getter;
import lombok.Setter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@Getter
@Setter
@ControllerAdvice
public class GlobalExceptionHandler {

    private static final Logger log = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    @ExceptionHandler(BadRequestException.class)
    public ResponseEntity<Object> handleBadRequestException(BadRequestException ex) {
        log.error("Error encountered: {}", ex.getMessage(), ex);

        ErrorResponse errorResponse = new ErrorResponse(ex.getStatus(), ex.getMessage()); // ex.getStatus() doit retourner HttpStatus
        return new ResponseEntity<>(errorResponse, ex.getStatus());
    }

    @Getter
    private static class ErrorResponse {
        private final int errorCode;
        private final String errorMessage;

        public ErrorResponse(HttpStatus errorCode, String errorMessage) {
            this.errorCode = errorCode.value();
            this.errorMessage = errorMessage;
        }
    }


}
