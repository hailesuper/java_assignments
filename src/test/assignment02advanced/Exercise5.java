package test.assignment02advanced;

import test.assignment00.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

import static test.assignment00.Program.*;

public class Exercise5 {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws ParseException {
//        System.out.println("----- Question 1: ------");
//        question1InputIntegers(3);
//
//        System.out.println("----- Question 2: ------");
//        question2InputRealNumbers(2);
//
//        System.out.println("----- Question 3: ------");
//        question3InputFullName();

//        System.out.println("----- Question 4: ------");
//        question4InputBirthDate();

//        System.out.println("----- Question 5: ------");s
//        question5CreateAccount();

//        System.out.println("----- Question 6: ------");
//        question6CreateDepartment();

//        System.out.println("----- Question 7: ------");
//        question7();

//        System.out.println("----- Question 8: ------");
//        question8CreateAccountOrDepartment();

//        System.out.println("----- Question 9: ------");
//        question9AddGroup();

//        System.out.println("----- Question 10: ------");
//        question10CreateAccountOrDepartmentAddGroupAccount();

        System.out.println("----- Question 11: ------");
        question11();

    }

//    Question 1:
//    Viết lệnh cho phép người dùng nhập 3 số nguyên vào chương trình
    private static void question1InputIntegers(int amount) {
        System.out.println("Nhập vào " + amount + " số Integers.");
        int[] integers = new int[amount];
        for (int i=0; i<amount; i++) {
            integers[i] = scanner.nextInt();
        }
        System.out.println("Dãy số đã nhập: " + Arrays.toString(integers));
    }
//    Question 2:
//    Viết lệnh cho phép người dùng nhập 2 số thực vào chương trình
    private static void question2InputRealNumbers(int amount) {
        System.out.println("Nhập vào " + amount + " số thực.");
        double[] myDoubles = new double[amount];
        for (int i=0; i<amount; i++) {
            myDoubles[i] = scanner.nextDouble();
        }
        System.out.println("Dãy số đã nhập: " + Arrays.toString(myDoubles));
    }
//    Question 3:
//    Viết lệnh cho phép người dùng nhập họ và tên
    private static void question3InputFullName() {
        System.out.println("Nhập họ tên của bạn: ");
        String name = scanner.nextLine();
        System.out.println("Tên bạn là " + name);
    }
//    Question 4:
//    Viết lệnh cho phép người dùng nhập vào ngày sinh nhật của họ
    private static void question4InputBirthDate() throws ParseException {
        String pattern = "dd-MM-yyyy";
        System.out.println("Nhập ngày sinh của bạn dạng dd-MM-yyyy");
        String inputDate = scanner.nextLine();
        Locale viLocale = new Locale("vi");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        LocalDate parsedDate = LocalDate.parse(inputDate, formatter);
        System.out.println("Ngày sinh của bạn là " + parsedDate);

        DateTimeFormatter localeFormatter = DateTimeFormatter.ofPattern("dd MMM yyyy", viLocale);
        System.out.println("Ngày sinh của bạn sau khi format là " +
                parsedDate.format(localeFormatter));
    }
//    Question 5:
//    Viết lệnh cho phép người dùng tạo account (viết thành method)
//    Đối với property Position, Người dùng nhập vào 1 2 3 4 5 và vào
//    chương trình sẽ chuyển thành Position.Dev, Position.Test,
//    Position.ScrumMaster, Position.PM
    private static Account question5CreateAccount() {
        System.out.println("Tạo tài khoản mới:");
        Account account = new Account();
//        public int accountID;
//        public String email;
//        public String username;
//        public String fullName;
//        publi//    Nếu người dùng nhập vào 3 thì sẽ thực hiện chức năng thêm group vàoc Department department;
//        public Position position;
//        public LocalDate createDate;
//        public Group[] groups;
        System.out.print("Nhập accountID: ");
        account.accountID = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nhập email ");
        account.email = scanner.nextLine();
        System.out.print("Nhập username: ");
        account.username = scanner.nextLine();
        System.out.print("Nhập Fullname ");
        account.fullName = scanner.nextLine();
        System.out.println("Đây là các departments của công ty. Chọn department của account");
        for (int i=0; i< departments.length; i++) {
            System.out.printf("%d. Department %d: %s\n",
                    (i+1), departments[i].departmentID, departments[i].departmentName);
        }
        account.department = departments[scanner.nextInt() - 1];
        scanner.nextLine();
        System.out.println("Đây là các positions của công ty. Chọn position của account");
        for (int i=0; i< positions.length; i++) {
            System.out.printf("%d. Position %d: %s\n",
                    (i+1), positions[i].positionID, positions[i].positionName);
        }
        account.position = positions[scanner.nextInt() - 1];
        scanner.nextLine();
        account.createDate = LocalDate.now();
        System.out.println(account);
        return account;
    }
//    Question 6:
//    Viết lệnh cho phép người dùng tạo department (viết thành method)
    private static Department question6CreateDepartment() {
        Department department = new Department();
        System.out.println("Tạo deparment mới");
        System.out.println("Nhập vào ID và tên của department. Ví dụ: 5 <Enter> Phòng Sales");
        department.departmentID = (byte) scanner.nextInt();
        scanner.nextLine();
        department.departmentName = scanner.nextLine();
        System.out.println("Department mới tạo");
        System.out.println(department);
        return department;
    }
//    Question 7:
//    Nhập số chẵn từ console
    private static void question7() {
        System.out.print("Nhập vào số chẵn: ");
        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            if (number % 2 == 0) {
                System.out.println("Số chắn bạn nhập vào là: " + number);
            } else
                System.out.println("Không phải số chẵn");
        } else
            System.out.println("Không phải là số nguyên!");
    }

//    Question 8:
//    Viết chương trình thực hiện theo flow sau:
//    Bước 1:
//    Chương trình in ra text "mời bạn nhập vào chức năng muốn sử
//    dụng"
//    Bước 2:
//    Nếu người dùng nhập vào 1 thì sẽ thực hiện tạo account
//    Nếu người dùng nhập vào 2 thì sẽ thực hiện chức năng tạo
//            department
//    Nếu người dùng nhập vào số khác thì in ra text "Mời bạn nhập
//    lại" và quay trở lại bước 1
    private static void question8CreateAccountOrDepartment() {
        boolean isDone = false;
        while (!isDone) {
            System.out.println("Nhập vào chức năng bạn muốn sử dụng tương ứng");
            System.out.println("1 - Tạo account");
            System.out.println("2 - Tạo department");
            switch (scanner.nextInt()) {
                case 1:
                    question5CreateAccount();
                    isDone = true;
                    break;
                case 2:
                    question6CreateDepartment();
                    isDone = true;
                    break;
                default:
                    System.out.println("Mời bạn nhập lại");
                    break;
            }
        }

    }

//    Question 9:
//    Viết method cho phép người dùng thêm group vào account theo flow sau:
//    Bước 1:
//    In ra tên các usernames của user cho người dùng xem
//    Bước 2:
//    Yêu cầu người dùng nhập vào username của account
//    Bước 3:
//    In ra tên các group cho người dùng xem
//    Bước 4:
//    Yêu cầu người dùng nhập vào tên của group
//    Bước 5:
//    Dựa vào username và tên của group người dùng vừa chọn, hãy
//    thêm account vào group đó .
    private static void question9AddGroup() {
        System.out.println("Nhập username của account cần thêm vào group: ");
        for (Account account : accounts) {
            System.out.printf("%s - ", account.username);
        }
        System.out.println();
        String inputUsername = scanner.nextLine();

        System.out.println("Nhập tên group cần thêm vào " + inputUsername);
        for (Group group : groups) {
            System.out.printf("%s - ", group.groupName);
        }
        System.out.println();
        String inputGroupName = scanner.nextLine();

        // Add account to group
        int findAccountIndex = -1;
        for (int i=0; i< accounts.length; i++) {
            if (Objects.equals(accounts[i].username, inputUsername)) {
                findAccountIndex = i;
                System.out.println();
                break;
            }
        }
        int findGroupIndex = -1;
        for (int i=0; i<groups.length; i++) {
            if (Objects.equals(groups[i].groupName, inputGroupName)) {
                findGroupIndex = i;
                break;
            }
        }

//        ArrayList<Group> newGroupAccounts = new ArrayList<>();
//        newGroupAccounts = Arrays.asList(groups[findGroupIndex]);
//        FIX LATER
        if (findGroupIndex != -1 && findAccountIndex != -1) {
            List<Account> newGroupAccounts = new ArrayList<Account>();
            newGroupAccounts = Arrays.asList(groups[findGroupIndex].accounts);
            ArrayList<Account> newGroupAccountsArrayList = new ArrayList<>(newGroupAccounts);

            newGroupAccountsArrayList.add(accounts[findAccountIndex]);
            System.out.println("Các thành viên nằm trong group " + groups[findGroupIndex].groupName + " TRƯỚC khi thêm");
            for (Account account : groups[findGroupIndex].accounts) {
                System.out.printf("%s ", account.username);
            }
            System.out.println();
            groups[findGroupIndex].accounts = newGroupAccountsArrayList.toArray(groups[findAccountIndex].accounts);
            System.out.println("Các thành viên nằm trong group " + groups[findGroupIndex].groupName + " SAU khi thêm:");
            for (Account account : groups[findGroupIndex].accounts) {
                System.out.printf("%s ", account.username);
            }
            System.out.println();
        } else {
            System.out.println("Group/ Account nhập không chính xác.");
        }

    }
//            Question 10: Tiếp tục Question 8 và Question 9
//    Bổ sung thêm vào bước 2 của Question 8 như sau:
//            account
//    Bổ sung thêm Bước 3 của Question 8 như sau:
//    Sau khi người dùng thực hiện xong chức năng ở bước 2 thì in ra dòng
//    text để hỏi người dùng "Bạn có muốn thực hiện chức năng khác
//    không?". Nếu người dùng chọn "Có" thì quay lại bước 1, nếu người
//    dùng chọn "Không" thì kết thúc chương trình (sử dụng lệnh return để
//            kết thúc chương trình)
    private static void question10CreateAccountOrDepartmentAddGroupAccount() {
        boolean isDone = true;
        while (isDone) {
            System.out.println("Nhập vào chức năng bạn muốn sử dụng tương ứng");
            System.out.println("1 - Tạo account");
            System.out.println("2 - Tạo department");
            System.out.println("3 - Thêm account vào group");
            int selectedOption = scanner.nextInt();
            scanner.nextLine();

            switch (selectedOption) {
                case 1:
                    question5CreateAccount();
                    isDone = true;
                    break;
                case 2:
                    question6CreateDepartment();
                    isDone = true;
                    break;
                case 3:
                    question9AddGroup();
                    break;
                default:
                    System.out.println("Mời bạn nhập lại");
                    break;
            }
            System.out.println("Bạn có muốn thực hiện chức năng khác không? Yes/No");
            if (Objects.equals(scanner.nextLine().toLowerCase(), "no"))
                isDone = false;
        }

    }

//    Question 11: Tiếp tục Question 10
//    Bổ sung thêm vào bước 2 của Question 8 như sau:
//    Nếu người dùng nhập vào 4 thì sẽ thực hiện chức năng thêm account
//    vào 1 nhóm ngẫu nhiên, chức năng sẽ được cài đặt như sau:
//    Bước 1:
//    In ra tên các usernames của user cho người dùng xem
//    Bước 2:
//    Yêu cầu người dùng nhập vào username của account
//    Bước 3:
//    Sau đó chương trình sẽ chọn ngẫu nhiên 1 group
//    Bước 4:
//    Thêm account vào group chương trình vừa chọn ngẫu
//            nhiên
    private static void question11() {
        boolean isDone = true;
        while (isDone) {
            System.out.println("Nhập vào chức năng bạn muốn sử dụng tương ứng");
            System.out.println("1 - Tạo account");
            System.out.println("2 - Tạo department");
            System.out.println("3 - Thêm account vào group");
            System.out.println("4 - Thêm account vào group ngẫu nhiên");
            int selectedOption = scanner.nextInt();
            scanner.nextLine();

            switch (selectedOption) {
                case 1:
                    question5CreateAccount();
                    isDone = true;
                    break;
                case 2:
                    question6CreateDepartment();
                    isDone = true;
                    break;
                case 3:
                    question9AddGroup();
                    break;
                case 4:
                    addAccountToRandomGroup();
                    break;
                default:
                    System.out.println("Mời bạn nhập lại");
                    break;
            }
            System.out.println("Bạn có muốn thực hiện chức năng khác không? Yes/No");
            if (Objects.equals(scanner.nextLine().toLowerCase(), "no"))
                isDone = false;
        }

    }

    public static void addAccountToRandomGroup() {
        System.out.println("Nhập username của account cần thêm vào group: ");
        for (Account account : accounts) {
            System.out.printf("%s - ", account.username);
        }
        System.out.println();
        String inputUsername = scanner.nextLine();

        // Add account to group
        int findAccountIndex = -1;
        for (int i=0; i< accounts.length; i++) {
            if (Objects.equals(accounts[i].username, inputUsername)) {
                findAccountIndex = i;
                System.out.println();
                break;
            }
        }
        Random random = new Random();
        int findGroupIndex = random.nextInt(groups.length);

//        ArrayList<Group> newGroupAccounts = new ArrayList<>();
//        newGroupAccounts = Arrays.asList(groups[findGroupIndex]);
//        FIX LATER
        if (findAccountIndex != -1) {
            List<Account> newGroupAccounts = new ArrayList<Account>();
            newGroupAccounts = Arrays.asList(groups[findGroupIndex].accounts);
            ArrayList<Account> newGroupAccountsArrayList = new ArrayList<>(newGroupAccounts);

            newGroupAccountsArrayList.add(accounts[findAccountIndex]);
            System.out.println("Các thành viên nằm trong group " + groups[findGroupIndex].groupName + " TRƯỚC khi thêm");
            for (Account account : groups[findGroupIndex].accounts) {
                System.out.printf("%s ", account.username);
            }
            System.out.println();
            groups[findGroupIndex].accounts = newGroupAccountsArrayList.toArray(groups[findAccountIndex].accounts);
            System.out.println("Các thành viên nằm trong group " + groups[findGroupIndex].groupName + " SAU khi thêm:");
            for (Account account : groups[findGroupIndex].accounts) {
                System.out.printf("%s ", account.username);
            }
            System.out.println();
        } else {
            System.out.println("Account nhập không chính xác.");
        }
    }
//    Exercise 6 (Optional): Method
//    Question 1:
//    Tạo method để in ra các số chẵn nguyên dương nhỏ hơn 10
//    Question 2:
//    Tạo method để in thông tin các account
//    Question 3:
//    Tạo method để in ra các số nguyên dương nhỏ hơn 10

}
