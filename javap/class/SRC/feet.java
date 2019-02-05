class feetadd{
	int x;
	int y;
	feetadd(float a, float b)
	{
		x=a;
		y=b;
    }
    feetadd()
    {
    	x=0;
    	y=0;
    }
    feetadd displaysum(feetadd f)
    {
    	f.x=f.x+x;
    	f.y=f.y+y;
    	return f;
    }
}
