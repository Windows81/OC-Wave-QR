package org.bson.codecs;

import org.bson.BsonReader;
import org.bson.BsonWriter;
import org.bson.types.Symbol;

public class SymbolCodec implements Codec<Symbol> {
    /* renamed from: c */
    public Symbol b(BsonReader bsonReader, DecoderContext decoderContext) {
        return new Symbol(bsonReader.b0());
    }

    public Class d() {
        return Symbol.class;
    }

    /* renamed from: e */
    public void a(BsonWriter bsonWriter, Symbol symbol, EncoderContext encoderContext) {
        bsonWriter.I(symbol.a());
    }
}
