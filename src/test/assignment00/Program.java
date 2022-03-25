package test.assignment00;

import java.time.LocalDate;

public class Program {
    public static void main(String[] args) {
        System.out.println(departments[1].departmentName);
    }

    public static Department[] departments = new Department[] {importDepartment1(), importDepartment2(), importDepartment3()};
    public static Position[] positions = new Position[] {importPosition1(), importPosition2(), importPosition3()};
    public static Account[] accounts = new Account[] {importAccount1(), importAccount2(), importAccount3()};

    public static Department importDepartment1() {
        Department department1 = new Department();
        department1.departmentID = 1;
        department1.departmentName = "Ban giám đốc";
        return department1;
    }

    public static Department importDepartment2() {
        Department department2 = new Department();
        department2.departmentID = 2;
        department2.departmentName = "Marketing";
        return department2;
    }

    public static Department importDepartment3() {
        Department department3 = new Department();
        department3.departmentID = 3;
        department3.departmentName = "Sales";
        return department3;
    }
    
    public static Position importPosition1() {
        Position position1 = new Position();
        position1.positionID = 1;
        position1.positionName = Position.PositionName.DEV;
        return position1;
    }

    public static Position importPosition2() {
        Position position2 = new Position();
        position2.positionID = 2;
        position2.positionName = Position.PositionName.SCRUM_MASTER;
        return position2;
    }

    public static Position importPosition3() {
        Position position3 = new Position();
        position3.positionID = 3;
        position3.positionName = Position.PositionName.TESTER;
        return position3;
    }
    
    public static Account importAccount1() {
        Account account1 = new Account();
        account1.accountID = 1;
        account1.fullName = "Le Van Hai";
        account1.position = positions[0];
        account1.email = "hai@gmail.com";
        account1.department = departments[0];
        return account1;
    }

    public static Account importAccount2() {
        Account account2 = new Account();
        account2.accountID = 2;
        account2.fullName = "Le Van Hai 2";
        account2.position = positions[1];
        account2.email = "hai2@gmail.com";
        return account2;
    }

    public static Account importAccount3() {
        Account account3 = new Account();
        account3.accountID = 3;
        account3.fullName = "Le Van Hai 2";
        account3.position = positions[2];
        account3.email = "hai3@gmail.com";
        return account3;
    }
    
    public static Group[] importGroup() {
        int[] a = new int[1000];
        Group group1 = new Group();
        group1.groupID = 1;
        group1.groupName = "Dumbledore' Army.";
        group1.creator = accounts[0];
        group1.createDate = LocalDate.of(2022,9,12);
        group1.accounts = new Account[] {accounts[0], accounts[1]};

        Group group2 = new Group();
        group2.groupID = 2;
        group2.groupName = "The Nerd Herd   1";
        group2.creator = accounts[1];
        group2.createDate = LocalDate.now();
        group2.accounts = new Account[] {accounts[1]};

        Group group3 = new Group();
        group3.groupID = 3;
        group3.groupName = "Fantastic Four";
        group3.creator = accounts[1];
        group3.createDate = LocalDate.of(2021,7,12);
        group3.accounts = new Account[] {accounts[2],accounts[1], accounts[0]};
        return new Group[] {group1, group2, group3};
    }

    // Groups
// Groups







}