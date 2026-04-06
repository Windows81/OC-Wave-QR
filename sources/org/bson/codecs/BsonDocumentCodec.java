package org.bson.codecs;

import java.util.ArrayList;
import java.util.Map;
import org.bson.BsonDocument;
import org.bson.BsonElement;
import org.bson.BsonReader;
import org.bson.BsonType;
import org.bson.BsonValue;
import org.bson.BsonWriter;
import org.bson.codecs.configuration.CodecRegistries;
import org.bson.codecs.configuration.CodecRegistry;

public class BsonDocumentCodec implements CollectibleCodec<BsonDocument> {

    /* renamed from: c  reason: collision with root package name */
    public static final CodecRegistry f43703c = CodecRegistries.d(new BsonValueCodecProvider());

    /* renamed from: a  reason: collision with root package name */
    public final CodecRegistry f43704a;

    /* renamed from: b  reason: collision with root package name */
    public final BsonTypeCodecMap f43705b;

    public BsonDocumentCodec() {
        this(f43703c);
    }

    private boolean h(EncoderContext encoderContext, String str) {
        return encoderContext.d() && str.equals("_id");
    }

    public final void c(BsonWriter bsonWriter, EncoderContext encoderContext, BsonDocument bsonDocument) {
        if (encoderContext.d() && bsonDocument.containsKey("_id")) {
            bsonWriter.A("_id");
            i(bsonWriter, encoderContext, bsonDocument.get("_id"));
        }
    }

    public Class d() {
        return BsonDocument.class;
    }

    /* renamed from: e */
    public BsonDocument b(BsonReader bsonReader, DecoderContext decoderContext) {
        ArrayList arrayList = new ArrayList();
        bsonReader.Z0();
        while (bsonReader.t1() != BsonType.END_OF_DOCUMENT) {
            arrayList.add(new BsonElement(bsonReader.h1(), g(bsonReader, decoderContext)));
        }
        bsonReader.T0();
        return new BsonDocument(arrayList);
    }

    /* renamed from: f */
    public void a(BsonWriter bsonWriter, BsonDocument bsonDocument, EncoderContext encoderContext) {
        bsonWriter.T();
        c(bsonWriter, encoderContext, bsonDocument);
        for (Map.Entry entry : bsonDocument.entrySet()) {
            if (!h(encoderContext, (String) entry.getKey())) {
                bsonWriter.A((String) entry.getKey());
                i(bsonWriter, encoderContext, (BsonValue) entry.getValue());
            }
        }
        bsonWriter.f0();
    }

    public BsonValue g(BsonReader bsonReader, DecoderContext decoderContext) {
        return (BsonValue) this.f43705b.a(bsonReader.C1()).b(bsonReader, decoderContext);
    }

    public final void i(BsonWriter bsonWriter, EncoderContext encoderContext, BsonValue bsonValue) {
        encoderContext.b(this.f43704a.a(bsonValue.getClass()), bsonWriter, bsonValue);
    }

    public BsonDocumentCodec(CodecRegistry codecRegistry) {
        if (codecRegistry != null) {
            this.f43704a = codecRegistry;
            this.f43705b = new BsonTypeCodecMap(BsonValueCodecProvider.d(), codecRegistry);
            return;
        }
        throw new IllegalArgumentException("Codec registry can not be null");
    }
}
