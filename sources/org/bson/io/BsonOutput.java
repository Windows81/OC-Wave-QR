package org.bson.io;

import java.io.Closeable;

public interface BsonOutput extends Closeable {
    void F0(String str);

    void d0(byte[] bArr, int i2, int i3);

    int e();

    int getPosition();

    void i0(int i2);

    void o(int i2, int i3);

    void p(String str);

    void q(int i2);

    void writeByte(int i2);

    void writeBytes(byte[] bArr);

    void writeDouble(double d2);

    void z(long j2);
}
