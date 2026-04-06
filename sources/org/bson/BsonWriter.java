package org.bson;

import org.bson.types.Decimal128;
import org.bson.types.ObjectId;

public interface BsonWriter {
    void A(String str);

    void C(String str, String str2);

    void D();

    void E();

    void F(BsonBinary bsonBinary);

    void G(BsonRegularExpression bsonRegularExpression);

    void H();

    void I(String str);

    void N(ObjectId objectId);

    void O(BsonDbPointer bsonDbPointer);

    void Q();

    void S(BsonTimestamp bsonTimestamp);

    void T();

    void X(String str);

    void c0(long j2);

    void e0(BsonReader bsonReader);

    void f0();

    void g0(String str);

    void m0();

    void n0();

    void o0(Decimal128 decimal128);

    void p(String str);

    void q(int i2);

    void writeBoolean(boolean z2);

    void writeDouble(double d2);

    void z(long j2);
}
