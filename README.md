# Employee Management System

This repository contains a simple Java-based Employee Management System consisting of two classes: `Emp` and `EmpRepo`. The system allows you to create and manage employee records.

## `Emp` Class

The `Emp` class represents an individual employee and includes the following data members:

- `empId` (int): Employee ID
- `empName` (String): Employee Name
- `designation` (String): Employee Designation
- `city` (String): Employee City
- `salary` (int): Employee Salary

The `Emp` class provides constructors, getters, setters, and a `toString` method for convenient usage.

## `EmpRepo` Class

The `EmpRepo` class serves as a repository for employee records. It includes the following functionalities:

- `addEmp(Emp emp)`: Adds an employee to the repository.
- `findByEmpId(int empId)`: Finds an employee by their ID and returns an `Optional<Emp>`.
- `empUpdate(Emp emp, int empId)`: Updates the details of an employee with a specified ID.
- `displayAllEmps()`: Displays all employees in the repository.
