//import java.util.*;
class Human
{
String name;
public Human()
{
name = "Nishkarsh";
}
public void show1()
{
System.out.println("Name: " + name);
}
}
class Student extends Human
{
String regnum;
int sapid;
Student()
{
regnum = "R171217041";
sapid = 500060720;
}
public void show2()
{
System.out.println("Registration number: " + regnum);
System.out.println("SAP ID: " + sapid);
}
}
class DevOps extends Student
{
String partner;
public DevOps()
{
partner = "Xebia";
}
public void show3()
{
System.out.println("Academic Partner: " + partner);
}
public static void main(String[] args)
{
DevOps obj = new DevOps();
obj.show1();
obj.show2();
obj.show3();
}
}