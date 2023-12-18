package maven;

import java.io.File;

public class NexusPush {


    public static void main(String[] args) {

        String aFalse = System.setProperty("server.tomcat.apr", "false");

        if (isAprMode()){
            System.out.println("-----------------");
        }


         System.out.println(aFalse);

    }

    private static boolean isAprMode(){
        return "true".equals(System.setProperty("server.tomcat.apr", "false"));
    }







}
