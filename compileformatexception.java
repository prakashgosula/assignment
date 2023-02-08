public class compileformatexception {
    public static void main(String[] args) {
        try{
            String s=null;
            System.out.println(s.length());
            System.out.println("executed sucess");

        }
        catch (Exception e){
            System.out.println("this is the error" + e);

        }
        System.out.println("code ends");

    }
}
