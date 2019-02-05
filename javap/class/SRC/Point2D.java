import java.util.*;
class Point2D{
	float x=0.0f , y=0.0f;
	Point2D(float a , float b)
	{
		x=a;
		x=b;
	}
	Point2D()
	{
		x=0;
		y=0;
	}
	float getx()
	{
		return x;
	}
	void setx(float a)
	{
		x=a;
	}
	float gety()
	{
		return y;
	}
	void sety(float a)
	{
		y=a;
	}
	float[] getxy()
	{
		float f[]=new float[2];
		f[0]=x;
		f[1]=y;
		return(f);
	}
	void setxy(float a,float b)
	{
		x=a;
		y=b;
	}
	String tostring()
	{
		return(" ");
	}
}
