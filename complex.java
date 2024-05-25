import org.jetbrains.annotations.NotNull;
public class complex {
    private double real, imag;
    #Default constructor
    public complex(){
        this.real = 0;
        this.imag = 0;
    }
    #Constructor with one argument
    public complex(float x){
        this.real = x;
        this.imag = 0;
    }
     #Constructor with two argument
    public complex(double x,double y){
        this.real = x;
        this.imag = y;
    }
    public double get_real(){
        return real;
    }
    public void set_real(double x){
        real = x;
    }
    public double get_imag(){
        return imag;
    }
    public void set_imag(double y){
        imag = y;
    }
    #adding two complex number by creating a new complex object.
    public complex add(@NotNull complex c){
        return new complex(real + c.get_real(),imag + c.get_imag());
    }
    public  complex add(float x, float y){
        return new complex(real + x, imag + y);
    }
    #subtracting two complex number by creating a new complex object.
    public complex sub(@NotNull complex c){
        return new complex(real - c.get_real(),imag - c.get_imag());
    }
    public  complex sub(float x, float y){
        return new complex(real - x, imag - y);
    }
    #multiply two complex number by creating a new complex object.
    public complex multiply(@NotNull complex c){
        return new complex((real * c.get_real()) - (imag * c.get_imag()), (real * c.get_imag()) - (imag * c.get_real()));
    }
    public complex multiply(float x, float y){
        return new complex((real * x) - (imag * y), (real * y) - (imag * x));
    }
    #Overwrite tostring method.
    public String toString(){
        String str = "";
        if (real != 0){
            if (imag > 0){
                str += String.format("%.2f+%.2fi",real, imag);
            }
            else if (imag == 0) {
                str += String.format("%.2f",real);
            }
            else {
                str += String.format("%.2f-%.2fi",real, -1 * imag);
            }
        }
        else {
            if (imag > 0){str += String.format(" %.2fi", imag);
            }
            else if (imag == 0) {str += String.format("%.2f+%.2fi",real, imag);
            }
            else {
                str += String.format("-%.2fi",imag);
            }
        }
        return str;
    }
}
