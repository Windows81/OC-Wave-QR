package org.bson.codecs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.bson.BsonReader;
import org.bson.BsonType;
import org.bson.BsonWriter;
import org.bson.Document;
import org.bson.Transformer;
import org.bson.UuidRepresentation;
import org.bson.assertions.Assertions;
import org.bson.codecs.configuration.CodecProvider;
import org.bson.codecs.configuration.CodecRegistries;
import org.bson.codecs.configuration.CodecRegistry;

public class DocumentCodec implements CollectibleCodec<Document>, OverridableUuidRepresentationCodec<Document> {

    /* renamed from: f  reason: collision with root package name */
    public static final CodecRegistry f43718f = CodecRegistries.c(Arrays.asList(new CodecProvider[]{new ValueCodecProvider(), new BsonValueCodecProvider(), new DocumentCodecProvider()}));

    /* renamed from: g  reason: collision with root package name */
    public static final BsonTypeClassMap f43719g = new BsonTypeClassMap();

    /* renamed from: a  reason: collision with root package name */
    public final BsonTypeCodecMap f43720a;

    /* renamed from: b  reason: collision with root package name */
    public final CodecRegistry f43721b;

    /* renamed from: c  reason: collision with root package name */
    public final IdGenerator f43722c;

    /* renamed from: d  reason: collision with root package name */
    public final Transformer f43723d;

    /* renamed from: e  reason: collision with root package name */
    public final UuidRepresentation f43724e;

    public DocumentCodec(CodecRegistry codecRegistry, BsonTypeClassMap bsonTypeClassMap, Transformer transformer) {
        this(codecRegistry, new BsonTypeCodecMap((BsonTypeClassMap) Assertions.d("bsonTypeClassMap", bsonTypeClassMap), codecRegistry), new ObjectIdGenerator(), transformer, UuidRepresentation.JAVA_LEGACY);
    }

    public Codec c(UuidRepresentation uuidRepresentation) {
        return new DocumentCodec(this.f43721b, this.f43720a, this.f43722c, this.f43723d, uuidRepresentation);
    }

    public Class d() {
        return Document.class;
    }

    public final void e(BsonWriter bsonWriter, EncoderContext encoderContext, Map map) {
        if (encoderContext.d() && map.containsKey("_id")) {
            bsonWriter.A("_id");
            m(bsonWriter, encoderContext, map.get("_id"));
        }
    }

    /* renamed from: f */
    public Document b(BsonReader bsonReader, DecoderContext decoderContext) {
        Document document = new Document();
        bsonReader.Z0();
        while (bsonReader.t1() != BsonType.END_OF_DOCUMENT) {
            document.put(bsonReader.h1(), i(bsonReader, decoderContext));
        }
        bsonReader.T0();
        return document;
    }

    /* renamed from: g */
    public void a(BsonWriter bsonWriter, Document document, EncoderContext encoderContext) {
        l(bsonWriter, document, encoderContext);
    }

    public final List h(BsonReader bsonReader, DecoderContext decoderContext) {
        bsonReader.y0();
        ArrayList arrayList = new ArrayList();
        while (bsonReader.t1() != BsonType.END_OF_DOCUMENT) {
            arrayList.add(i(bsonReader, decoderContext));
        }
        bsonReader.I0();
        return arrayList;
    }

    public final Object i(BsonReader bsonReader, DecoderContext decoderContext) {
        UuidRepresentation uuidRepresentation;
        BsonType C1 = bsonReader.C1();
        if (C1 == BsonType.NULL) {
            bsonReader.i1();
            return null;
        } else if (C1 == BsonType.ARRAY) {
            return h(bsonReader, decoderContext);
        } else {
            Codec a2 = this.f43720a.a(C1);
            if (C1 == BsonType.BINARY && bsonReader.z1() == 16) {
                byte Y0 = bsonReader.Y0();
                Class<UUID> cls = UUID.class;
                if (Y0 == 3) {
                    UuidRepresentation uuidRepresentation2 = this.f43724e;
                    if (uuidRepresentation2 == UuidRepresentation.JAVA_LEGACY || uuidRepresentation2 == UuidRepresentation.C_SHARP_LEGACY || uuidRepresentation2 == UuidRepresentation.PYTHON_LEGACY) {
                        a2 = this.f43721b.a(cls);
                    }
                } else if (Y0 == 4 && ((uuidRepresentation = this.f43724e) == UuidRepresentation.JAVA_LEGACY || uuidRepresentation == UuidRepresentation.STANDARD)) {
                    a2 = this.f43721b.a(cls);
                }
            }
            return this.f43723d.a(a2.b(bsonReader, decoderContext));
        }
    }

    public final boolean j(EncoderContext encoderContext, String str) {
        return encoderContext.d() && str.equals("_id");
    }

    public final void k(BsonWriter bsonWriter, Iterable iterable, EncoderContext encoderContext) {
        bsonWriter.m0();
        for (Object m2 : iterable) {
            m(bsonWriter, encoderContext, m2);
        }
        bsonWriter.H();
    }

    public final void l(BsonWriter bsonWriter, Map map, EncoderContext encoderContext) {
        bsonWriter.T();
        e(bsonWriter, encoderContext, map);
        for (Map.Entry entry : map.entrySet()) {
            if (!j(encoderContext, (String) entry.getKey())) {
                bsonWriter.A((String) entry.getKey());
                m(bsonWriter, encoderContext, entry.getValue());
            }
        }
        bsonWriter.f0();
    }

    public final void m(BsonWriter bsonWriter, EncoderContext encoderContext, Object obj) {
        if (obj == null) {
            bsonWriter.D();
        } else if (obj instanceof Iterable) {
            k(bsonWriter, (Iterable) obj, encoderContext.c());
        } else if (obj instanceof Map) {
            l(bsonWriter, (Map) obj, encoderContext.c());
        } else {
            encoderContext.b(this.f43721b.a(obj.getClass()), bsonWriter, obj);
        }
    }

    public DocumentCodec(CodecRegistry codecRegistry, BsonTypeCodecMap bsonTypeCodecMap, IdGenerator idGenerator, Transformer transformer, UuidRepresentation uuidRepresentation) {
        this.f43721b = (CodecRegistry) Assertions.d("registry", codecRegistry);
        this.f43720a = bsonTypeCodecMap;
        this.f43722c = idGenerator;
        this.f43723d = transformer == null ? new Transformer() {
            public Object a(Object obj) {
                return obj;
            }
        } : transformer;
        this.f43724e = uuidRepresentation;
    }
}
