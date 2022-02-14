package ua.sergeiokon.behavioral.strategy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class QIWIPayment implements PaymentStrategy {

    private static final Map<String, String> DATABASE = new HashMap<>();

    private final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    private String mobilePhone;

    private String password;

    private boolean signedIn;

    static {
        DATABASE.put("test", "123456789");
    }

    @Override
    public void checkUserAuthentication() {
        try {
            while (!signedIn) {
                System.out.println("*** QIWI Payment ***");

                System.out.println("Enter mobilePhone: ");
                mobilePhone = reader.readLine();

                System.out.println("Enter password: ");
                password = reader.readLine();

                if (authentication()) {
                    System.out.println("Authentication successful!");
                } else
                    System.out.println("Authentication failed!");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public boolean execute(int cost) {
        if (signedIn) {
            System.out.println("Paying " + cost + " using QIWI method payment");
            return true;
        } else
            return false;
    }

    private boolean authentication() {
        setSignedIn(mobilePhone.equals(DATABASE.get(password)));
        return signedIn;
    }

    public void setSignedIn(boolean signedIn) {
        this.signedIn = signedIn;
    }
}