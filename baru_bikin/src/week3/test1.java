package week3;
public class test1 {
    public static void main(String[] args) {
    Customer A1 = new Customer ("MULYADI");
    Visit AA1 = new Visit ("MULYADI" , "1 NOVEMBER 2019");
    A1.isMember();
    A1.setMember(false);
    A1.setMemberType("Tidak Punya");
    A1.toString();
        System.out.println(A1.toString());
    AA1.setMemberType("Tidak punya");
    AA1.setServiceExpense(982758);
    AA1.setProductExpense(98275.8);
    AA1.setTotalExpense(982758 , 98275.8);
    AA1.getTotalExpense();
    AA1.toString();
        System.out.println("\n");
        
    Customer A2 = new Customer ("BOBI");
    Visit AA2 = new Visit ("BOBI","21 NOVEMBER 2019" );
    A2.isMember();
    A2.setMember(true);
    A2.setMemberType("Premium");
    A2.toString();
        System.out.println(A2.toString());
    AA2.setMemberType("Premium");
    AA2.setServiceExpense(982758);
    AA2.setProductExpense(98275.8);
    AA2.setTotalExpense(982758 , 98275.8);
    AA2.getTotalExpense();
    AA2.toString();
        System.out.println("\n");
        
        
    Customer A3 = new Customer ("SULE");
    Visit AA3 = new Visit ("SULE","28 NOVEMBER 2019");
    A3.isMember();
    A3.setMember(true);
    A3.setMemberType("Gold");
    A3.toString();
        System.out.println(A3.toString());
    AA3.setMemberType("Gold");
    AA3.setServiceExpense(982758);
    AA3.setProductExpense(98275.8);
    AA3.setTotalExpense(982758 , 98275.8);
    AA3.getTotalExpense();
    AA3.toString();
        System.out.println("\n");
    
        Customer A4 = new Customer ("GOGON");
    Visit AA4 = new Visit ("GOGON","19 NOVEMBER 2019");
    A4.isMember();
    A4.setMember(true);
    A4.setMemberType("Silver");
    A4.toString();
        System.out.println(A4.toString());
     AA4.setMemberType("Silver");
     AA4.setServiceExpense(982758);
     AA4.setProductExpense(98275.8);
     AA4.setTotalExpense(982758 , 98275.8);
     AA4.getTotalExpense();
     AA4.toString();
    System.out.println("\n");
    }
    
   
    
}
