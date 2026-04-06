package org.bson.codecs;

import org.bson.BsonReader;
import org.bson.BsonWriter;
import org.bson.types.ObjectId;

public class ObjectIdCodec implements Codec<ObjectId> {
    /* renamed from: c */
    public ObjectId b(BsonReader bsonReader, DecoderContext decoderContext) {
        return bsonReader.w();
    }

    public Class d() {
        return ObjectId.class;
    }

    /* renamed from: e */
    public void a(BsonWriter bsonWriter, ObjectId objectId, EncoderContext encoderContext) {
        bsonWriter.N(objectId);
    }
}
