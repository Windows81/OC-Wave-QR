package org.bson.codecs;

import org.bson.BsonDbPointer;
import org.bson.BsonReader;
import org.bson.BsonWriter;

public class BsonDBPointerCodec implements Codec<BsonDbPointer> {
    /* renamed from: c */
    public BsonDbPointer b(BsonReader bsonReader, DecoderContext decoderContext) {
        return bsonReader.U();
    }

    public Class d() {
        return BsonDbPointer.class;
    }

    /* renamed from: e */
    public void a(BsonWriter bsonWriter, BsonDbPointer bsonDbPointer, EncoderContext encoderContext) {
        bsonWriter.O(bsonDbPointer);
    }
}
