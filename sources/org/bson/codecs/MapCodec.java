package org.bson.codecs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.bson.BsonReader;
import org.bson.BsonType;
import org.bson.BsonWriter;
import org.bson.Transformer;
import org.bson.UuidRepresentation;
import org.bson.assertions.Assertions;
import org.bson.codecs.configuration.CodecProvider;
import org.bson.codecs.configuration.CodecRegistries;
import org.bson.codecs.configuration.CodecRegistry;

public class MapCodec implements Codec<Map<String, Object>>, OverridableUuidRepresentationCodec<Map<String, Object>> {

    /* renamed from: e  reason: collision with root package name */
    public static final CodecRegistry f43738e = CodecRegistries.c(Arrays.asList(new CodecProvider[]{new ValueCodecProvider(), new BsonValueCodecProvider(), new DocumentCodecProvider(), new IterableCodecProvider(), new MapCodecProvider()}));

    /* renamed from: f  reason: collision with root package name */
    public static final BsonTypeClassMap f43739f = new BsonTypeClassMap();

    /* renamed from: a  reason: collision with root package name */
    public final BsonTypeCodecMap f43740a;

    /* renamed from: b  reason: collision with root package name */
    public final CodecRegistry f43741b;

    /* renamed from: c  reason: collision with root package name */
    public final Transformer f43742c;

    /* renamed from: d  reason: collision with root package name */
    public final UuidRepresentation f43743d;

    public MapCodec(CodecRegistry codecRegistry, BsonTypeClassMap bsonTypeClassMap, Transformer transformer) {
        this(codecRegistry, new BsonTypeCodecMap((BsonTypeClassMap) Assertions.d("bsonTypeClassMap", bsonTypeClassMap), codecRegistry), transformer, UuidRepresentation.JAVA_LEGACY);
    }

    private Object g(BsonReader bsonReader, DecoderContext decoderContext) {
        UuidRepresentation uuidRepresentation;
        BsonType C1 = bsonReader.C1();
        if (C1 == BsonType.NULL) {
            bsonReader.i1();
            return null;
        } else if (C1 == BsonType.ARRAY) {
            return decoderContext.b(this.f43741b.a(List.class), bsonReader);
        } else {
            if (C1 != BsonType.BINARY || bsonReader.z1() != 16) {
                return this.f43742c.a(this.f43740a.a(C1).b(bsonReader, decoderContext));
            }
            Codec a2 = this.f43740a.a(C1);
            byte Y0 = bsonReader.Y0();
            Class<UUID> cls = UUID.class;
            if (Y0 == 3) {
                UuidRepresentation uuidRepresentation2 = this.f43743d;
                if (uuidRepresentation2 == UuidRepresentation.JAVA_LEGACY || uuidRepresentation2 == UuidRepresentation.C_SHARP_LEGACY || uuidRepresentation2 == UuidRepresentation.PYTHON_LEGACY) {
                    a2 = this.f43741b.a(cls);
                }
            } else if (Y0 == 4 && ((uuidRepresentation = this.f43743d) == UuidRepresentation.JAVA_LEGACY || uuidRepresentation == UuidRepresentation.STANDARD)) {
                a2 = this.f43741b.a(cls);
            }
            return decoderContext.b(a2, bsonReader);
        }
    }

    private void h(BsonWriter bsonWriter, EncoderContext encoderContext, Object obj) {
        if (obj == null) {
            bsonWriter.D();
        } else {
            encoderContext.b(this.f43741b.a(obj.getClass()), bsonWriter, obj);
        }
    }

    public Codec c(UuidRepresentation uuidRepresentation) {
        return new MapCodec(this.f43741b, this.f43740a, this.f43742c, uuidRepresentation);
    }

    public Class d() {
        return Map.class;
    }

    /* renamed from: e */
    public Map b(BsonReader bsonReader, DecoderContext decoderContext) {
        HashMap hashMap = new HashMap();
        bsonReader.Z0();
        while (bsonReader.t1() != BsonType.END_OF_DOCUMENT) {
            hashMap.put(bsonReader.h1(), g(bsonReader, decoderContext));
        }
        bsonReader.T0();
        return hashMap;
    }

    /* renamed from: f */
    public void a(BsonWriter bsonWriter, Map map, EncoderContext encoderContext) {
        bsonWriter.T();
        for (Map.Entry entry : map.entrySet()) {
            bsonWriter.A((String) entry.getKey());
            h(bsonWriter, encoderContext, entry.getValue());
        }
        bsonWriter.f0();
    }

    public MapCodec(CodecRegistry codecRegistry, BsonTypeCodecMap bsonTypeCodecMap, Transformer transformer, UuidRepresentation uuidRepresentation) {
        this.f43741b = (CodecRegistry) Assertions.d("registry", codecRegistry);
        this.f43740a = bsonTypeCodecMap;
        this.f43742c = transformer == null ? new Transformer() {
            public Object a(Object obj) {
                return obj;
            }
        } : transformer;
        this.f43743d = uuidRepresentation;
    }
}
