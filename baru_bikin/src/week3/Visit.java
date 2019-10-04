package week3;



public class Visit extends Customer {

    Customer Customer;
    public String Date ;
    private double ServiceExpense;
    private double ProductExpense;
    private double TotalExpense;
    private String memberType;

 
    public Visit(String name, String Date){
        super (name);
        this.Date = Date;
        System.out.println(name + " visit " + Date); 
    }

    @Override
    public String getName() {
        return super.getName(); 
    }
   
    public double getServiceExpense(){
        return this.ServiceExpense;
    }

    
    public void setServiceExpense(double a){
        if(memberType == "Premium"){
        this.ServiceExpense = a-(a*0.2);
    }else if(memberType == "Gold"){
        this.ServiceExpense = a-(a*0.15);
    }else if (memberType == "Silver"){
        this.ServiceExpense = a-(a*0.1);
    }else{
        this.ServiceExpense = a;
    }
    }
    
    public double getProductExpense(){
        return this.ProductExpense;
    }
    
    public void setProductExpense(double b){
        if(memberType == "Premium"){
        this.ProductExpense = b-(b*0.2);
    }else if(memberType == "Gold"){
        this.ProductExpense = b-(b*0.15);
    }else if (memberType == "Silver"){
        this.ProductExpense = b-(b*0.1);
    }else{
        this.ProductExpense = b;
    }
    }
    
    public void setMemberType(String memberType){
        this.memberType = memberType;
    }
    
    public String getMemberType(){
        return memberType;
    }
    
    public void setTotalExpense(double a, double b){
        if (memberType == "Premium"){
        this.TotalExpense = (a-(0.2*a)) + (b-(0.1*b));
    }else if(memberType == "Gold"){
        this.TotalExpense = (a-(0.15*a)) + (b-(0.1*b));
    }else if(memberType == "Silver"){
        this.TotalExpense = (a-(0.1*a)) + (b-(0.1*b));
    }else{
            this.TotalExpense = a + b;
        }
    }
    
    public double getTotalExpense(){
        return this.TotalExpense ;
    }

    @Override
    public String toString() {
        System.out.println("Service Expense = " +ServiceExpense +"\n"+"Product Expense = " + ProductExpense+"\n"+ "Total Expense = "+ TotalExpense+"");
        return "visit{" + "Customer=" + Customer + ", Date=" + Date + ", ServiceExpense=" + ServiceExpense + ", ProductExpense=" + ProductExpense + ", TotalExpense=" + TotalExpense + '}';
    }
}
