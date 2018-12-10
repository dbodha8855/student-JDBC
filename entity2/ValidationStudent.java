package entity2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidationStudent 
{
	Student s=new Student();
	public boolean validateStdId(String stdId)
	{
		Pattern p= Pattern.compile("[1-9]{10}");
		Matcher m=p.matcher(stdId);
		boolean value=m.matches();
		//System.out.println(value);
		if(m.matches())
		return true;
		else return false;
	}
	public boolean validateStdName(String stName)
	{
		Pattern p = Pattern.compile("[a-z]{2,5}");
		Matcher m=p.matcher(stName);
		boolean value=m.matches();
		if(m.matches())
		return true;
		else
			return false;
	}
	public boolean validateStdBranch(String stdBranch)
	{
		Pattern p = Pattern.compile("[a-z]{2,5}");
		Matcher m=p.matcher(stdBranch);
		boolean value=m.matches();
		if(m.matches())
		return true;
		else
			return false;
	}
}
