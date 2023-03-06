package fi.blueshift.lib.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class CustomUnexpectedException extends BaseDetailedException {

    public CustomUnexpectedException(String message, String detailedMessage) {
        super(message, detailedMessage);
    }

    public CustomUnexpectedException(String message) {
        super(message, null);
    }
}
