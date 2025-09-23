package Chapter7.encapsulation;

public class Kettle {
    private boolean waterBoiling = false;
    private boolean heatSensorOn = false;
    public void switchOn()
    {
        if (isThereWater())
        {
            accessElectricity();
            heatUpSensor();
            if(isWaterBoiling())
            {
                switchOff();
            }
            else
            {
                switchOff();
                putWater();
            }
        }
    }
    private void heatUpSensor()
    {
        System.err.println("Sensor heating up....");
        heatSensorOn = true;
    }

    private boolean isWaterBoiling()
    {
        return false;
    }
    public void switchOff(){
        System.err.println("Switching off....");
    }

    public void putWater(){}

    private void accessElectricity(){
        System.err.println("Accessing Electricity....");
    }

    private boolean isThereWater()
    {
        return false;
    }
}
