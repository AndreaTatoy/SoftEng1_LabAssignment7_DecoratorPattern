package LabAssignment7;

public class GSave implements BankAccount, BankAccountDecorator {
    private BankAccount account;
    
    public GSave(BankAccount account){
        this.account = account;
    }

    @Override
    public void setBankAccount(BankAccount account){
        this.account = account;
    }

    @Override
    public String showAccountType(){
        return "GSave";
    }

    @Override
    public double getInterestRate(){
        return 0.025;
    }

    @Override
    public double getBalance(){
        return account.getBalance();
    }

    @Override
    public String showBenefits(){
        return account.showBenefits() + ", GCash Transfer";
    }

    @Override
    public double computeBalanceWithInterest(){
        return getBalance() + (getBalance() * getInterestRate());
    }

    @Override
    public String showInfo(){
        return account.showInfo();
    }
}
