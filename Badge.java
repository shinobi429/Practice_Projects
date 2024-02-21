class Badge {
    private Integer id;
    private String name;
    private String dept;

    public String print(Integer id, String name, String department) {
               
        this.id = id;
        this.name = name;
        this.dept = department;

        if(id!=null && department!=null){

        return "[" + this.id + "] - " + this.name + " - " + this.dept.toUpperCase();

        }
        else if(id!=null && department==null){

            return "[" + this.id + "] - " + this.name + " - " + "OWNER";
        }
        else if (id==null && department==null) {
            return this.name + " - " + "OWNER";
        }
        else{
            return this.name + " - " + this.dept.toUpperCase();
        }        
    }
    public static void main(String[] args) {
        Badge empBadge1 = new Badge();
        System.out.println(empBadge1.print(null, "asdf", null));
    }
}

/*
 * Exercise for null values
 * 
 * Instructions
In this exercise you'll be writing code to print name badges for factory employees.

1. Print a badge for an employee
Employees have an ID, name and department name. Employee badge labels are formatted as follows: "[id] - name - DEPARTMENT". Implement the Badge.print() method to return an employee's badge label:

Badge badge = new Badge();
badge.print(734, "Ernest Johnny Payne", "Strategic Communication");
// => "[734] - Ernest Johnny Payne - STRATEGIC COMMUNICATION"
Note that the department should be uppercased on the label.

2. Print a badge for a new employee
Due to a quirk in the computer system, new employees occasionally don't yet have an ID when they start working at the factory. As badges are required, they will receive a temporary badge without the ID prefix. Modify the Badge.print() method to support new employees that don't yet have an ID:

Badge badge = new Badge();
Badge.print(null, "Jane Johnson", "Procurement");
// => "Jane Johnson - PROCUREMENT"
3. Print a badge for the owner
Even the factory's owner has to wear a badge at all times. However, an owner does not have a department. In this case, the label should print "OWNER" instead of the department name. Modify the Badge.print() method to print a label for the owner:

Badge badge = new Badge();
badge.print(254, "Charlotte Hale", null);
// => "[254] - Charlotte Hale - OWNER"
Note that it is possible for the owner to also be a new employee:

Badge badge = new Badge();
badge.print(null, "Charlotte Hale", null);
// => "Charlotte Hale - OWNER"
 */