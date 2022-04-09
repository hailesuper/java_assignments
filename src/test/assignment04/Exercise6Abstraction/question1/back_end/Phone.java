package test.assignment04.Exercise6Abstraction.question1.back_end;

import test.assignment04.Exercise6Abstraction.question1.entity.Contact;

public abstract class Phone {
	// chú lý biến này tránh việc khi kế thừa nhưng 
    protected Contact[] contacts = new Contact[] {};
    
    // mấy hàm này tai sao lại de abstract? viết common ko dc à?
    public abstract void insertContact(String name, String phoneNumber);
    public abstract void removeContact(String name);
    public abstract void updateContact(String name, String newPhone);
    public abstract void searchContact(String name);

    protected void addContactToArray(Contact contact, Contact[] contacts) {
        Contact[] tempContactArray = new Contact[contacts.length + 1];
        for (int i=0; i< contacts.length; i++) {
            tempContactArray[i] = contacts[i];
        }
        tempContactArray[contacts.length] = contact;
        this.contacts = tempContactArray;
    }

    protected int findContactIndexInArrayByName(String name) {
        for (int i=0; i< contacts.length; i++)
            if (contacts[i].getName().equals(name))
                return i;
        return -1;
    }

    protected void deleteContactFromArrayByIndex(int contactIndex) {
        Contact[] tempContactArray = new Contact[contacts.length - 1];
        for (int i=0, j=0; i< contacts.length; i++) {
            if (i==contactIndex)
                continue;
            else tempContactArray[j++] = contacts[i];
        }
        this.contacts = tempContactArray;
    }


    public Contact[] getContacts() {
        return contacts;
    }
    public void printContacts() {
        if (contacts.length == 0)
            System.out.println("Tháº¿ giá»›i nÃ y khÃ´ng cÃ³ ai ngoÃ i báº¡n!");
        for (Contact contact : contacts)
            System.out.println(contact);
    }
}
