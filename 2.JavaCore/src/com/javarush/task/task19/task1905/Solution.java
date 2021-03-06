package com.javarush.task.task19.task1905;

import java.util.HashMap;
import java.util.Map;

/* 
Закрепляем адаптер
*/

public class Solution {
    public static Map<String,String> countries = new HashMap<String,String>();

    static {
        countries.put("UA", "Ukraine");
        countries.put("RU", "Russia");
        countries.put("CA", "Canada");
    }

    public static void main(String[] args) {

    }

    public static class DataAdapter implements RowItem {
        private Customer customer;
        private Contact contact;

        public DataAdapter(Customer customer, Contact contact) {
            this.customer = customer;
            this.contact = contact;
        }

        @Override
        public String getCountryCode() {
            String key = null;
            for (Map.Entry<String, String> pair : countries.entrySet()) {
                String value = pair.getValue();
                if (value.equals(customer.getCountryName())) {
                    key = pair.getKey();
                }
            }
            return key;
        }

        @Override
        public String getCompany() {
            return customer.getCompanyName();
        }

        @Override
        public String getContactFirstName() {
            //String str = contact.getName();
            //return str.substring(8);
            String[] arr = contact.getName().split(",");
            return arr[1].trim();
        }

        @Override
        public String getContactLastName() {
            //String str = contact.getName();
            //return str.substring(0, 6);
            String[] arr = contact.getName().split(",");
            return arr[0];
        }

        @Override
        public String getDialString() {
            String s = contact.getPhoneNumber();
            s = "callto://" + s.replaceAll("[^+0-9]", "");
            return s;
        }
    }

    public static interface RowItem {
        String getCountryCode();        //example UA
        String getCompany();            //example JavaRush Ltd.
        String getContactFirstName();   //example Ivan
        String getContactLastName();    //example Ivanov
        String getDialString();         //example callto://+380501234567
    }

    public static interface Customer {
        String getCompanyName();        //example JavaRush Ltd.
        String getCountryName();        //example Ukraine
    }

    public static interface Contact {
        String getName();               //example Ivanov, Ivan
        String getPhoneNumber();        //example +38(050)123-45-67
    }
}