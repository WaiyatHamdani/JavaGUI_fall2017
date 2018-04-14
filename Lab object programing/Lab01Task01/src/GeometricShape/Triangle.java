/******************************************************************************
* Program Author:        Waiyat Hamdani
 * Date Created:         02/01/2017
 * Change#        Change Date      Programmer Name        Description
 * -------        ------------     -------------------    ---------------------
******************************************************************************/

package GeometricShape;

/**
 *
 * @author 01659956
 */
public class Triangle {
    private double s1;
    private double s2;
    private double s3;
   

    Triangle(double s1, double s2, double s3) {
        this.s1=s1;
        this.s2=s2;
        this.s3=s3;
    }
   
    public void setS1(double s1){
        this.s1=s1;
    }
    public void setS2(double s2){
        this.s2=s2;
    }
    public void setS3(double s3){
        this.s3=s3;
    }
            
    public double getS1(){
        return s1;
    }
    public double getS2(){
        return s2;
    }
    public double getS3(){
        return s3;
    }
    
    public double setSemiperimeter(){
        return Math.sqrt((s1+s2+s3)/2);
    }
    
    public double getAreaT(){
        return Math.sqrt(s1*s3)/2.0;
    }
    public double getPerimeterT(){
        return (s1+s2+s3);
    }
    
    }
   

