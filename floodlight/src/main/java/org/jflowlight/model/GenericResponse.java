package org.jflowlight.model;

/**
 * @author Giovanni Cammarata <cammarata.giovanni@gmail.com>
 */
public class GenericResponse {
    private String status;
    private String result;
    private String details;


    public GenericResponse() {
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    @Override
    public String toString() {
        return "GenericResponse{" +
                "status='" + status + '\'' +
                ", result='" + result + '\'' +
                ", details='" + details + '\'' +
                '}';
    }
}
