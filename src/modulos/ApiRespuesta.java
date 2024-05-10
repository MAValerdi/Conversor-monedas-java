package modulos;

public class ApiRespuesta {
    private String time_next_update_utc;
    private double conversion_rate;
    private double conversion_result;
    private String  target_code;


    public String getTimeNextUpdateUtc() {
        return time_next_update_utc;
    }

    public double getConversionRate() {
        return conversion_rate;
    }

    public double getConversionResult() {
        return conversion_result;
    }

    public String getTarget_code() {
        return target_code;
    }
}
