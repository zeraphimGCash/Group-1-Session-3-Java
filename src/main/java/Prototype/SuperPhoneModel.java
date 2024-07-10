package Prototype;

public abstract class SuperPhoneModel implements Cloneable
{
    public Object getClone() {
        Object phone = null;
        try{
            phone = super.clone();
        }
        catch (CloneNotSupportedException e)
        {
            e.printStackTrace();
        }
        return phone;
    }
}
