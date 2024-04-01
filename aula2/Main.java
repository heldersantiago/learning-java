package aula2;

public class Main {
    public static void main(String[] args){
        Owner user1 = new Owner("Helder Santiago", 19);
        Owner user2 = new Owner("Helder Santiago", 19);
        Owner user3 = new Owner("Helder Santiago", 19);
        Owner user4 = new Owner("Helder Santiago", 19);

        Account account = new Account(user1,AccountType.hsa,10000);
        Account account1 = new Account(user2,AccountType.hsa,10000);
        Account account2 = new Account(user3,AccountType.hsa,10000);
        Account account3 = new Account(user4,AccountType.hsa,10000);

        System.out.println("User: "+account.getOwnerName());
        System.out.println("Type: "+account.getAccountType());
        System.out.println("Voucher  "+account.getVoucher());

        System.out.println(Account.totalAccounts);
    }
}

