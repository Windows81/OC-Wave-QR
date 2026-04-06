package org.bson.types;

import java.io.Serializable;
import java.util.Arrays;

public class Binary implements Serializable {

    /* renamed from: A  reason: collision with root package name */
    public final byte[] f44032A;

    /* renamed from: z  reason: collision with root package name */
    public final byte f44033z;

    public Binary(byte b2, byte[] bArr) {
        this.f44033z = b2;
        this.f44032A = (byte[]) bArr.clone();
    }

    public byte[] a() {
        return (byte[]) this.f44032A.clone();
    }

    public byte b() {
        return this.f44033z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Binary binary = (Binary) obj;
        return this.f44033z == binary.f44033z && Arrays.equals(this.f44032A, binary.f44032A);
    }

    public int hashCode() {
        return (this.f44033z * 31) + Arrays.hashCode(this.f44032A);
    }
}
