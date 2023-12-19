package tech.reliab.course.milkovitchm.bank.service;

import tech.reliab.course.milkovitchm.bank.entity.Bank;
import tech.reliab.course.milkovitchm.bank.entity.BankAtm;
import tech.reliab.course.milkovitchm.bank.entity.BankOffice;
import tech.reliab.course.milkovitchm.bank.entity.Employee;

public interface BankAtmService {
    /**
     *
     * @param name - назание банкомата
     * @param bank - банк
     * @param bankOffice - офис банка
     * @param employee - обслуживающий сотрудник
     * @param maintenance - стоимость обслуживания
     * @return - возвращает созданный объект банкомат
     */
    BankAtm create(String name, Bank bank, BankOffice bankOffice, Employee employee, double maintenance);

    /**
     * Снятие денег в банкомате
     * @param atm - банкомат
     * @param sum - сумма снятия
     */
    void withdrawMoney(BankAtm atm, double sum);
}
