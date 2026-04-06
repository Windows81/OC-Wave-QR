package org.bson.codecs;

import org.bson.BsonReader;
import org.bson.BsonValue;
import org.bson.BsonWriter;
import org.bson.codecs.configuration.CodecRegistry;

public class BsonValueCodec implements Codec<BsonValue> {

    /* renamed from: a  reason: collision with root package name */
    public final CodecRegistry f43711a;

    public BsonValueCodec(CodecRegistry codecRegistry) {
        this.f43711a = codecRegistry;
    }

    /* renamed from: c */
    public BsonValue b(BsonReader bsonReader, DecoderContext decoderContext) {
        return (BsonValue) this.f43711a.a(BsonValueCodecProvider.e(bsonReader.C1())).b(bsonReader, decoderContext);
    }

    public Class d() {
        return BsonValue.class;
    }

    /* renamed from: e */
    public void a(BsonWriter bsonWriter, BsonValue bsonValue, EncoderContext encoderContext) {
        encoderContext.b(this.f43711a.a(bsonValue.getClass()), bsonWriter, bsonValue);
    }
}
