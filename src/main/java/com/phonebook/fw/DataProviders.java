package com.phonebook.fw;

import com.phonebook.model.Contact;
import org.testng.annotations.DataProvider;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DataProviders {
    @DataProvider
    public Iterator<Object[]> addContact() {
        List<Object[]> list = new ArrayList<>();
        list.add(new Object[]{"Oliver", "Kahn", "12365489521", "khan@gmail.com", "Bremen", "security"});
        list.add(new Object[]{"Sasha", "Naka", "12342429521", "naka@gmail.com", "Boston", "Spy"});
        list.add(new Object[]{"Alex", "Bill", "12223332521", "bill@gmail.com", "Chikago", "slave"});
        return list.iterator();
    }

    @DataProvider
    public Iterator<Object[]> addContactFromCsvFile() throws IOException {
        List<Object[]> list = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(new File("src/test/resources/Contact.csv")));
        String line = br.readLine();
        while (line != null) {
            String[] split = line.split(",");
            list.add(new Object[]{new Contact().setName(split[0]).setLastName(split[1]).setPhone(split[2]).setEmail(split[3])
                    .setAddress(split[4]).setDesc(split[5])});
            line = br.readLine();
        }
        return list.iterator();
    }
}
