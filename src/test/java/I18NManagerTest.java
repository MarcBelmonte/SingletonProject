import edu.upc.eetac.dsa.I18NManager;



public class I18NManagerTest {


    public static void main (String[] args){
        String value1 = I18NManager.getInstance().getText("en","l1");
        String value2 = I18NManager.getInstance().getText("ca","l2");
        System.out.println(value1);
        System.out.println(value2);
    }

}
