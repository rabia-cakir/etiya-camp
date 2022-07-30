import java.util.List;

public class Bank {
    private int id;
    private String name;
    private List<BankUser> bankUsers;

    public Bank() {

    }

    public Bank(int id, String name,List<BankUser> bankUsers) {

        this.id = id;
        this.name = name;
        this.bankUsers=bankUsers;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<BankUser> getBankUsers() {
        return bankUsers;
    }

    public void setBankUsers(List<BankUser> bankUsers) {
        this.bankUsers = bankUsers;
    }
}