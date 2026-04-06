package org.bson.codecs;

import java.util.ArrayList;
import java.util.Iterator;
import org.bson.BsonArray;
import org.bson.BsonReader;
import org.bson.BsonType;
import org.bson.BsonValue;
import org.bson.BsonWriter;
import org.bson.assertions.Assertions;
import org.bson.codecs.configuration.CodecRegistries;
import org.bson.codecs.configuration.CodecRegistry;

public class BsonArrayCodec implements Codec<BsonArray> {

    /* renamed from: b  reason: collision with root package name */
    public static final CodecRegistry f43699b = CodecRegistries.d(new BsonValueCodecProvider());

    /* renamed from: a  reason: collision with root package name */
    public final CodecRegistry f43700a;

    public BsonArrayCodec(CodecRegistry codecRegistry) {
        this.f43700a = (CodecRegistry) Assertions.d("codecRegistry", codecRegistry);
    }

    /* renamed from: c */
    public BsonArray b(BsonReader bsonReader, DecoderContext decoderContext) {
        bsonReader.y0();
        ArrayList arrayList = new ArrayList();
        while (bsonReader.t1() != BsonType.END_OF_DOCUMENT) {
            arrayList.add(f(bsonReader, decoderContext));
        }
        bsonReader.I0();
        return new BsonArray(arrayList);
    }

    public Class d() {
        return BsonArray.class;
    }

    /* renamed from: e */
    public void a(BsonWriter bsonWriter, BsonArray bsonArray, EncoderContext encoderContext) {
        bsonWriter.m0();
        Iterator it = bsonArray.iterator();
        while (it.hasNext()) {
            BsonValue bsonValue = (BsonValue) it.next();
            encoderContext.b(this.f43700a.a(bsonValue.getClass()), bsonWriter, bsonValue);
        }
        bsonWriter.H();
    }

    public BsonValue f(BsonReader bsonReader, DecoderContext decoderContext) {
        return (BsonValue) this.f43700a.a(BsonValueCodecProvider.e(bsonReader.C1())).b(bsonReader, decoderContext);
    }
}
