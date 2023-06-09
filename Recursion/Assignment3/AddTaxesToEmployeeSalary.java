package Assignment3;

public class AddTaxesToEmployeeSalary {
    public static double[] addTax(double []employee,int ptr){
        if(ptr == employee.length)
            return new double[ptr];
        double []curr = addTax(employee,ptr+1);
        curr[ptr] = employee[ptr]+ 0.3*employee[ptr];
        return curr;
    }

    public static void main(String[] args) {
        double[]res = addTax(new double[]{5000,20000,10000,15000,3000},0);
        for(double sal:res)
            System.out.print(sal+" ");
    }
}
