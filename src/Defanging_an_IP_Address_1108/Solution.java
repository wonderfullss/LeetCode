package Defanging_an_IP_Address_1108;

public class Solution {
    public String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }
}
