package codeGenerator;

/**
 * Created by mohammad hosein on 6/28/2015.
 */

public class Address {
    public int num;
    public TypeAddress addressType;
    public varType varType;

    public Address(int num, varType varType, TypeAddress addressType) {
        this.num = num;
        this.addressType = addressType;
        this.varType = varType;
    }

    public Address(int num, varType varType) {
        this.num = num;
        this.addressType = new DirectAddress();
        this.varType = varType;
    }

    public String toString() {
        return addressType.toString(num);

    }   
}
