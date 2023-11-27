package tech.reliab.course.milkovitchm.bank.service;

import tech.reliab.course.milkovitchm.bank.entity.Bank;
import tech.reliab.course.milkovitchm.bank.entity.BankAtm;
import tech.reliab.course.milkovitchm.bank.entity.BankOffice;
import tech.reliab.course.milkovitchm.bank.entity.Employee;

public interface BankAtmService {
    BankAtm create(String name, Bank bank, BankOffice bankOffice, Employee employee, double maintenance);
    BankAtm read();
    void update(BankAtm bankAtm);
    void delete(BankAtm bankAtm);
}
