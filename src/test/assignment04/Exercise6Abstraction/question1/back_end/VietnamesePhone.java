package test.assignment04.Exercise6Abstraction.question1.back_end;

import test.assignment04.Exercise6Abstraction.question1.entity.Contact;

public class VietnamesePhone extends Phone {

    
    @Override
    public void insertContact(String name, String phoneNumber) {
        Contact contact = new Contact(name, phoneNumber);
        addContactToArray(contact, contacts);
        System.out.println("Thêm " + name + " thành công");
    }

    @Override
    public void removeContact(String name) {
        int nameIndex = findContactIndexInArrayByName(name);
        if (nameIndex == -1)
            System.out.println("Không tìm thấy " + name + "trong danh sách.");
        else
        {
            deleteContactFromArrayByIndex(nameIndex);
            System.out.println("Đã xóa! " + name + " đã biến mất khỏi cuộc đời bạn!");
        }
    }

    @Override
    public void updateContact(String name, String newPhone) {
        int nameIndex = findContactIndexInArrayByName(name);
        if (nameIndex == -1)
            System.out.println("Không tìm thấy " + name + " trong danh sách.");
        else {
            contacts[nameIndex].setPhoneNumber(newPhone);
            System.out.println("Thay đổi thành công");
        }
    }

    @Override
    public void searchContact(String name) {
        int nameIndex = findContactIndexInArrayByName(name);
        if (nameIndex == -1)
            System.out.println("Không tìm thấy " + name + " trong danh sách.");
        else
            System.out.println(contacts[nameIndex]);
    }
}
