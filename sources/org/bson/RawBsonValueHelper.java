package org.bson;

import org.bson.codecs.BsonValueCodecProvider;
import org.bson.codecs.DecoderContext;
import org.bson.codecs.configuration.CodecRegistries;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.io.BsonInputMark;

final class RawBsonValueHelper {

    /* renamed from: a  reason: collision with root package name */
    public static final CodecRegistry f43695a = CodecRegistries.d(new BsonValueCodecProvider());

    public static BsonValue a(byte[] bArr, BsonBinaryReader bsonBinaryReader) {
        BsonType C1 = bsonBinaryReader.C1();
        BsonType bsonType = BsonType.DOCUMENT;
        if (C1 != bsonType && bsonBinaryReader.C1() != BsonType.ARRAY) {
            return (BsonValue) f43695a.a(BsonValueCodecProvider.e(bsonBinaryReader.C1())).b(bsonBinaryReader, DecoderContext.a().a());
        }
        int position = bsonBinaryReader.j1().getPosition();
        BsonInputMark d1 = bsonBinaryReader.j1().d1(4);
        int i2 = bsonBinaryReader.j1().i();
        d1.b();
        bsonBinaryReader.Y();
        return bsonBinaryReader.C1() == bsonType ? new RawBsonDocument(bArr, position, i2) : new RawBsonArray(bArr, position, i2);
    }
}
