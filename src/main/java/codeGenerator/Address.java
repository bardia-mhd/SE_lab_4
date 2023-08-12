package codeGenerator;

/**
 * Created by mohammad hosein on 6/28/2015.
 */

public class Address {
    public int num;
    private TypeAddress addressType;
    private varType varType;

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
        return getAddressType().toString(num);

    }

    public varType getVarType() {
        return varType;
    }

    public TypeAddress getAddressType() {
        return addressType;
    }



}
