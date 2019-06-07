package com.company;

import javax.crypto.*;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
///bounce castle
public class SymethricKey {

	public byte[] Encrypt(String msg,String key) throws BadPaddingException, IllegalBlockSizeException, NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
		KeyGenerator keyGen = KeyGenerator.getInstance("IDEA");
		keyGen.init(56);
		SecretKey secretKey = keyGen.generateKey();
		Cipher cipher = Cipher.getInstance("IDEA");
		cipher.init(Cipher.ENCRYPT_MODE, secretKey);
		byte[] msgCipher = cipher.doFinal(msg.getBytes(), 0, msg.getBytes().length);

		return msgCipher;
	}
	public String decrypt(byte[] msgDecrypt, String key) throws Exception {

		SecureRandom sr = new SecureRandom(key.getBytes());
		KeyGenerator kg = KeyGenerator.getInstance("IDEA");
		kg.init(sr);
		SecretKey sk = kg.generateKey();

		Cipher cipher = Cipher.getInstance("IDEA");
		cipher.init(Cipher.DECRYPT_MODE, sk);
		byte[] decrypted = cipher.doFinal(msgDecrypt);

		return new String(decrypted);
	}
}

