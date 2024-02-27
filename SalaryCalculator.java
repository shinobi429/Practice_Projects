public class SalaryCalculator {;

    public static int productsSold;
    public static int daysSkipped;
    public int baseSalary = 1000;
    
    public double salaryMultiplier(int daysSkipped) {
        return daysSkipped>=5 ? 0.85 : 1.00;
    }

    public int bonusMultiplier(int productsSold) {
        return productsSold >= 20 ? 13 : 10;
    }

    public double bonusForProductsSold(int productsSold) {
        return productsSold * bonusMultiplier(productsSold); 
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        double Salary = this.baseSalary * salaryMultiplier(daysSkipped) + bonusForProductsSold(productsSold);
        return (Salary >= 2000) ? 2000 : Salary;
    }
    
    public static void main(String[] args) {
        SalaryCalculator s = new SalaryCalculator();
    
        //<<<<<<<< Checking the results>>>>>>>//
        System.err.println("Bonus Multiplier is : "+s.bonusMultiplier(21));
        System.err.println("Bonus For Products Sold is : "+s.bonusForProductsSold(21));
        System.err.println("Final Salary is :"+s.finalSalary(2, 3));
    }

}

/* Instructions

In this exercise, you'll be implementing rules for calculating the total salary 
of a employee in a month. The International Siderurgy Company (ISC) requires 
assistance in calculating employee salaries, considering various factors that can 
impact the final wage.

You have three tasks, and you should use the ternary operator instead of if/else 
statements to implement them.

1. Determine the salary multiplier
Implement the salaryMultiplier method, which returns the salary multiplier based 
on the number of days an employee skipped work. Apply a 15% penalty if the employee 
skipped at least five days.

int daysSkipped = 3;
salaryMultiplier(daysSkipped);
// => 1.0

daysSkipped = 7;
salaryMultiplier(daysSkipped);
// => 0.85


2. Calculate the bonus for products sold
Implement the bonusMultiplier and bonusForProductsSold methods. The ISC pays ten 
monetary units for each product sold, and if an employee sells twenty products or 
more, the multiplier improves to thirteen. bonusMultiplier should determine which 
multiplier to apply, and bonusForProductSold should return the total bonus in monetary 
units.

int productsSold = 21;
bonusMultiplier(productsSold);
// => 13
bonusForProductsSold(productsSold);
// => 273

productsSold = 5;
bonusMultiplier(productsSold);
// => 10
bonusForProductsSold(productsSold);
// => 50


3. Calculate the final salary for the employee
Implement the finalSalary method. It should multiply the base salary of 1000.00 by 
the salary multiplier, add the bonus, and return the result. However, salaries should 
be capped at 2000.00.

int daysSkipped = 2;
int productsSold = 3;
finalSalary(daysSkipped, productsSold);
// => 1030.00

productsSold = 90;
finalSalary(daysSkipped, productsSold);
// => 2000.00 */