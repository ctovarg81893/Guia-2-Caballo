
/**
 * Write a description of class Caballo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Caballo
{
    // instance variables - replace the example below with your own
        /**
     * Constructor for objects of class Caballo
     */

        int pos_c = 0;
        int pos_r = 0;

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public boolean pasos(int c,int r,int y,int x)
    {
if (Math.abs(r-x)>=Math.abs(c-y)){
    if((c-y)>0)
        c=c-1;
    else//((c-y)<=0)
        c=c+1;
    if((r-x)>0)
        r=r-2;
    else //((r-x)<=0)
        r=r+2;
    pos_c=c;
    pos_r=r;
    return(true);
}
else{// (Math.abs(r-x)<Math.abs(c-y)){
    if((c-y)>0)
        c=c-2;
    else//((c-y)<=0)
        c=c+2;
    if((r-x)>0)
        r=r-1;
    else//    ((r-x)<=0)
        r=r+1;
    pos_c=c;
    pos_r=r;
    return(true);
}
    //return(true);
 }
}