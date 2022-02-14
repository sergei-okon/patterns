package ua.sergeiokon.behavioral.strategy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class PayPalPayment implements PaymentStrategy {

    private static final Map<String, String> DATABASE = new HashMap<>();

    private final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    private String email;

    private String password;

    private boolean signedIn;

    static {
        DATABASE.put("test", "test@test.com");
    }

    @Override
    public void checkUserAuthentication() {
        try {
            while (!signedIn) {
                System.out.println("***PayPall Payment ***");

                System.out.println("Enter email: ");
                email = reader.readLine();

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
            System.out.println("Paying " + cost + " using PayPal method payment");
            return true;
        } else
            return false;
    }

    private boolean authentication() {
        setSignedIn(email.equals(DATABASE.get(password)));
        return signedIn;
    }

    public void setSignedIn(boolean signedIn) {
        this.signedIn = signedIn;
    }
}
