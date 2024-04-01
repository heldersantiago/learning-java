package aula2;

public class Account {
    private long number;
    private final long voucher;
    private final Owner owner;
    private final AccountType type;

    public static int totalAccounts;

    Account(Owner owner, AccountType type, long voucher) {
        this.voucher = voucher;
        this.owner = owner;
        this.type = type;

        Account.totalAccounts++;
    }

    public long getVoucher() {
        return this.voucher;
    }

    public String getOwnerName() {
        return this.owner.getOwnerName();
    }

    public AccountType getAccountType() {
        return this.type;
    }

}
