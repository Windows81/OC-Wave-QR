package com.hansecom.abt.util;

import java.nio.ByteBuffer;
import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.Signature;
import java.security.spec.PKCS8EncodedKeySpec;
import java.util.Base64;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class BarcodeGenerator {
    public final byte[] a(String staticBarcodePayload, String privateKey, long epochSecond, int keyVersion) {
        Intrinsics.i(staticBarcodePayload, "id");
        Intrinsics.i(privateKey, "privateKey");
        ByteBuffer plaintextBuffer = ByteBuffer.allocate(0x2A);
        byte[] decode = Base64.getDecoder().decode(staticBarcodePayload);
        byte[] decodeArray = new byte[0x24];
        System.arraycopy(decode, 0, decodeArray, 0, Math.min(0x24, decode.length));
        plaintextBuffer.put(decodeArray);
        plaintextBuffer.putShort((short) keyVersion);
        plaintextBuffer.putInt((int) epochSecond);
        byte[] plaintextArray = plaintextBuffer.array();
        PrivateKey generatePrivate = KeyFactory.getInstance("EC").generatePrivate(new PKCS8EncodedKeySpec(Base64.getDecoder().decode(privateKey)));
        Signature shaInstance = Signature.getInstance("SHA256withECDSA");
        shaInstance.initSign(generatePrivate);
        shaInstance.update(plaintextArray);
        byte[] signArray = shaInstance.sign();
        byte[] signArrayTruncated = new byte[0x48];
        System.arraycopy(signArray, 0, signArrayTruncated, 0, Math.min(signArray.length, 0x48));
        ByteBuffer resultBuffer = ByteBuffer.allocate(0x72);
        resultBuffer.put(plaintextArray);
        resultBuffer.put(signArrayTruncated);
        byte[] resultArray = resultBuffer.array();
        Intrinsics.h(resultArray, "array(...)");
        return resultArray;
    }
}
