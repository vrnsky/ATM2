package my.edu.sunway.atm.dto;

public class ValidationResponse {
    private final String response;

    public ValidationResponse(String response) {
        this.response = response;
    }

    public String getResponse() {
        return response;
    }
}
