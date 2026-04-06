package org.bson.io;

import java.io.Closeable;
import org.bson.types.ObjectId;

public interface BsonInput extends Closeable {
    void B(int i2);

    void O0();

    BsonInputMark d1(int i2);

    int getPosition();

    String h();

    int i();

    String k0();

    long n();

    byte readByte();

    double readDouble();

    ObjectId w();

    void z0(byte[] bArr);
}
