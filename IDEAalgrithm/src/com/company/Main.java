package com.company;

import com.sun.org.apache.xerces.internal.impl.dv.util.Base64;

import javax.crypto.*;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class Main {

    public static void main(String[] args) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, BadPaddingException, IllegalBlockSizeException {
     String msg="este es el texto a encriptar con el algoritmo IDEA";
     SymethricKey symethricKey=new SymethricKey();
        System.out.println(symethricKey.Encrypt(msg,"234"));
    }
}
