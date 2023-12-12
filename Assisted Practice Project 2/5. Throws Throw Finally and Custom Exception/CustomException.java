package dom;

import java.io.Serializable;

class CustomException extends Exception implements Serializable {
    private static final long serialVersionUID = 1L;

    public CustomException(String message) {
        super(message);
    }
}