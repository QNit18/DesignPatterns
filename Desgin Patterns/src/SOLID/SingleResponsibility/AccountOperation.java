package SOLID.SingleResponsibility;

import java.util.HashMap;
import java.util.Map;

public class AccountOperation {
    private static Map<Integer, Account> accountMap = new HashMap<>();

    public void addAccount(Account account) {
        accountMap.put(account.getAccountNumber(), account);
    }

    public void updateAccount(Account account) {
        accountMap.put(account.getAccountNumber(), account);
    }

    public static Map<Integer, Account> getAccountMap() {
        return accountMap;
    }

    public static void setAccountMap(Map<Integer, Account> accountMap) {
        AccountOperation.accountMap = accountMap;
    }
}
