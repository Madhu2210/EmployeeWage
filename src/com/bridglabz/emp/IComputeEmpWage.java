package com.bridglabz.emp;

public interface IComputeEmpWage {
    void  addCompanyEmpWage(String companyName, int empWagePerHr, int numMaxWorkingDay, int maxHrsInMonth);
    void computeEmpWageFromArray();
    int getTotalEmpWage(String companyName);

}

