public class finally_blogu {
    public static void main(String[] args) {
        //finally blogu her zaman calisir, exception olsa da olmasa da

        try {
            // String h = null;

            // System.out.println(h.hashCode()); 

            int a = 30 / 0; //Arithmetic Exception


        } catch (NullPointerException e) {
            System.out.println("Null referans hatasi");
        }finally{
            System.out.println("finally blogu calisiyor");
        }
    }
}
