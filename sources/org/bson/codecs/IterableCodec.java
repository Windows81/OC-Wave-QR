package org.bson.codecs;

import java.util.ArrayList;
import java.util.UUID;
import org.bson.BsonReader;
import org.bson.BsonType;
import org.bson.BsonWriter;
import org.bson.Transformer;
import org.bson.UuidRepresentation;
import org.bson.assertions.Assertions;
import org.bson.codecs.configuration.CodecRegistry;

public class IterableCodec implements Codec<Iterable>, OverridableUuidRepresentationCodec<Iterable> {

    /* renamed from: a  reason: collision with root package name */
    public final CodecRegistry f43731a;

    /* renamed from: b  reason: collision with root package name */
    public final BsonTypeCodecMap f43732b;

    /* renamed from: c  reason: collision with root package name */
    public final Transformer f43733c;

    /* renamed from: d  reason: collision with root package name */
    public final UuidRepresentation f43734d;

    public IterableCodec(CodecRegistry codecRegistry, BsonTypeClassMap bsonTypeClassMap, Transformer transformer) {
        this(codecRegistry, new BsonTypeCodecMap((BsonTypeClassMap) Assertions.d("bsonTypeClassMap", bsonTypeClassMap), codecRegistry), transformer, UuidRepresentation.JAVA_LEGACY);
    }

    private Object g(BsonReader bsonReader, DecoderContext decoderContext) {
        UuidRepresentation uuidRepresentation;
        BsonType C1 = bsonReader.C1();
        if (C1 == BsonType.NULL) {
            bsonReader.i1();
            return null;
        }
        Codec a2 = this.f43732b.a(C1);
        if (C1 == BsonType.BINARY && bsonReader.z1() == 16) {
            byte Y0 = bsonReader.Y0();
            Class<UUID> cls = UUID.class;
            if (Y0 == 3) {
                UuidRepresentation uuidRepresentation2 = this.f43734d;
                if (uuidRepresentation2 == UuidRepresentation.JAVA_LEGACY || uuidRepresentation2 == UuidRepresentation.C_SHARP_LEGACY || uuidRepresentation2 == UuidRepresentation.PYTHON_LEGACY) {
                    a2 = this.f43731a.a(cls);
                }
            } else if (Y0 == 4 && ((uuidRepresentation = this.f43734d) == UuidRepresentation.JAVA_LEGACY || uuidRepresentation == UuidRepresentation.STANDARD)) {
                a2 = this.f43731a.a(cls);
            }
        }
        return this.f43733c.a(a2.b(bsonReader, decoderContext));
    }

    private void h(BsonWriter bsonWriter, EncoderContext encoderContext, Object obj) {
        if (obj == null) {
            bsonWriter.D();
        } else {
            encoderContext.b(this.f43731a.a(obj.getClass()), bsonWriter, obj);
        }
    }

    public Codec c(UuidRepresentation uuidRepresentation) {
        return new IterableCodec(this.f43731a, this.f43732b, this.f43733c, uuidRepresentation);
    }

    public Class d() {
        return Iterable.class;
    }

    /* renamed from: e */
    public Iterable b(BsonReader bsonReader, DecoderContext decoderContext) {
        bsonReader.y0();
        ArrayList arrayList = new ArrayList();
        while (bsonReader.t1() != BsonType.END_OF_DOCUMENT) {
            arrayList.add(g(bsonReader, decoderContext));
        }
        bsonReader.I0();
        return arrayList;
    }

    /* renamed from: f */
    public void a(BsonWriter bsonWriter, Iterable iterable, EncoderContext encoderContext) {
        bsonWriter.m0();
        for (Object h2 : iterable) {
            h(bsonWriter, encoderContext, h2);
        }
        bsonWriter.H();
    }

    public IterableCodec(CodecRegistry codecRegistry, BsonTypeCodecMap bsonTypeCodecMap, Transformer transformer, UuidRepresentation uuidRepresentation) {
        this.f43731a = (CodecRegistry) Assertions.d("registry", codecRegistry);
        this.f43732b = bsonTypeCodecMap;
        this.f43733c = transformer == null ? new Transformer() {
            public Object a(Object obj) {
                return obj;
            }
        } : transformer;
        this.f43734d = uuidRepresentation;
    }
}
