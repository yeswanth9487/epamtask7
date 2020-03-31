package FactM;

public class Calculate_Factor {
	public static Calculate getCalculate(String Material_Type,double value)
	{

		if(Material_Type.equalsIgnoreCase("Standard_Material"))
		{
			return new Standard_Material(value);
		}
		if(Material_Type.equalsIgnoreCase("Above_Standard_Material"))
		{
			return new Above_Standard_Material(value);
		}
		if(Material_Type.equalsIgnoreCase("High_Standard_Material"))
		{
			return new High_Standard_Material(value);
		}
		if(Material_Type.equalsIgnoreCase("High_Standard_Material_and_Automated"))
		{
			return new High_Standard_Material_and_Automated(value);
		}
	return null;	
	}

}
