import java.util.*;

public class isPalendrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int a = sc.nextInt();

        DoPalendrome obj = new DoPalendrome();

        obj.setNum(a);
        String binNum = obj.getBinary();
        System.out.println("Number " + a + " in binary, is "+binNum);

        // String isPale = obj.isPal();

        obj.isPal();

    }
}

class DoPalendrome {

    private int num;
    public String binary;
    private boolean noy;

    public String getBinary(){
        this.binary = Integer.toBinaryString(this.num);
        return binary;
    }

    public void setNum(int n){
        this.num = n;
    }

    public void isPal(){

        StringBuffer bs =new StringBuffer(this.binary);

        String revBin = bs.reverse().toString();

        if(this.binary.equals(revBin)) {
            this.noy = true;
        } else{
            this.noy = false;
        }

        if(this.noy){
            System.out.println("Binary number " + this.binary + " is a palindrome!");
        }else{
            System.out.println("Binary number " + this.binary + " is not a palindrome!");
        }
    }
}