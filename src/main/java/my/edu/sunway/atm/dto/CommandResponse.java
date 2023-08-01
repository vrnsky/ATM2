package my.edu.sunway.atm.dto;

public class CommandResponse {
    private boolean success;
    private String message;

    public CommandResponse(boolean success, String message) {
        this.success = success;
        this.message = message;
    }

    public boolean isSuccess() {
        return success;
    }

    public String getMessage() {
        return message;
    }
}
