public class SwimmingPool implements Chauffage{
    float actualTemp;
    float[] lastSevenDaysTemp;
    public SwimmingPool(float actualTemp, float[] lastSevenDaysTemp) {
        this.actualTemp = actualTemp;
        this.lastSevenDaysTemp = lastSevenDaysTemp;
    }
    float get_actual_temp() {
        return actualTemp;
    }
    float[] get_last_days_temps() {
        return lastSevenDaysTemp;
    }

    String set_heater(boolean bool) {
        if (bool) {
            return on();
        }
        else{
            return off();
        }
    }

    public String trigger() {
        int sum = 0;
        for (int i = 0; i < get_last_days_temps().length; i++) {
            sum += get_last_days_temps()[i];
        }
        float average = (float) sum / get_last_days_temps().length;

        return set_heater(get_actual_temp() > 25 && average > 20);
    }

    @Override
    public String on() {
        return "ON";
    }

    @Override
    public String off() {
        return "OFF";
    }
}
