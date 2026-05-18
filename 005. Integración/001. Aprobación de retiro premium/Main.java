package Modern_java_backend_roadmap.Integración.Ejercicio_1_Aprobacion_retiro_premium;

import java.util.List;
import java.util.Optional;

public class Main {
    public static String approveWithdrawal(List<User> users, WithdrawalRequest request){
        return users.stream()
                .filter(user -> user.getUserId().equals(request.getUserId()))
                .findFirst()
                .filter(User::isActive)
                .filter(User::isPremium)
                .flatMap(Main::findPrimaryAccount)
                .filter(Account::isActive)
                .filter(account -> !account.isBlocked())
                .filter(account -> account.getBalance() > request.getAmount())
                .map(account -> "RETIRO APROBADO: cuenta " + account.getAccountId()
                        + " puede retirar $" + request.getAmount())
                .orElseThrow(() -> new RuntimeException("Retiro rechazado"));
    }

    public static Optional<Account> findPrimaryAccount(User user){
        return user.getAccounts().stream()
                .filter(Account::isPrimary)
                .findFirst();
    }

    public static void main(String[] args) {
        List<User> users = List.of(
                new User( "U-1", "Alex", true, true, List.of(
                    new Account("ACC-1", 5000.0, true, false, true),
                    new Account("ACC-2", 300.0, true, false, false)
                )),

                new User("U-2", "Maria", true, false, List.of(
                        new Account("ACC-3", 8000.0, true, false, true)
                )),

                new User("U-3", "Pedro", false, true, List.of(
                    new Account("ACC-4", 10000.0, true, false, true)
                )),

                new User("U-4", "Ana", true, true, List.of(
                        new Account("ACC-5", 200.0, true, false, true)
                ))
        );

        WithdrawalRequest request = new WithdrawalRequest("U-1", 1000.0);
        System.out.println(approveWithdrawal(users,request));
    }
}















