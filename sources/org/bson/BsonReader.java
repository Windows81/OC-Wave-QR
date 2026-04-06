package org.bson;

import java.io.Closeable;
import org.bson.types.Decimal128;
import org.bson.types.ObjectId;

public interface BsonReader extends Closeable {
    String C0();

    BsonType C1();

    void D0();

    void I0();

    BsonBinary J();

    Decimal128 K();

    String R0();

    void T0();

    BsonDbPointer U();

    BsonTimestamp W();

    void X0();

    void Y();

    byte Y0();

    void Z();

    void Z0();

    String b0();

    BsonRegularExpression f1();

    String h();

    String h1();

    int i();

    void i1();

    BsonReaderMark m1();

    long n();

    long r0();

    boolean readBoolean();

    double readDouble();

    BsonType t1();

    ObjectId w();

    void y0();

    int z1();
}
