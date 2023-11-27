package tech.reliab.course.milkovitchm.bank.service;
import tech.reliab.course.milkovitchm.bank.entity.Bank;

public interface BankService {
    Bank create(String name);
    Bank read();
    void update(Bank bank);
    void delete(Bank bank);
}
