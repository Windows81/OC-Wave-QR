package org.bson.codecs;

import org.bson.BsonReader;
import org.bson.BsonSymbol;
import org.bson.BsonWriter;

public class BsonSymbolCodec implements Codec<BsonSymbol> {
    /* renamed from: c */
    public BsonSymbol b(BsonReader bsonReader, DecoderContext decoderContext) {
        return new BsonSymbol(bsonReader.b0());
    }

    public Class d() {
        return BsonSymbol.class;
    }

    /* renamed from: e */
    public void a(BsonWriter bsonWriter, BsonSymbol bsonSymbol, EncoderContext encoderContext) {
        bsonWriter.I(bsonSymbol.l0());
    }
}
