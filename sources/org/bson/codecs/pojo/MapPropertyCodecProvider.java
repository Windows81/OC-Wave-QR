package org.bson.codecs.pojo;

import java.util.HashMap;
import java.util.Map;
import org.bson.BsonReader;
import org.bson.BsonType;
import org.bson.BsonWriter;
import org.bson.codecs.Codec;
import org.bson.codecs.DecoderContext;
import org.bson.codecs.EncoderContext;
import org.bson.codecs.configuration.CodecConfigurationException;

final class MapPropertyCodecProvider implements PropertyCodecProvider {

    public static class MapCodec<T> implements Codec<Map<String, T>> {

        /* renamed from: a  reason: collision with root package name */
        public final Class f43821a;

        /* renamed from: b  reason: collision with root package name */
        public final Codec f43822b;

        public MapCodec(Class cls, Codec codec) {
            this.f43821a = cls;
            this.f43822b = codec;
        }

        /* renamed from: c */
        public Map b(BsonReader bsonReader, DecoderContext decoderContext) {
            bsonReader.Z0();
            Map f2 = f();
            while (bsonReader.t1() != BsonType.END_OF_DOCUMENT) {
                if (bsonReader.C1() == BsonType.NULL) {
                    f2.put(bsonReader.h1(), (Object) null);
                    bsonReader.i1();
                } else {
                    f2.put(bsonReader.h1(), this.f43822b.b(bsonReader, decoderContext));
                }
            }
            bsonReader.T0();
            return f2;
        }

        public Class d() {
            return this.f43821a;
        }

        /* renamed from: e */
        public void a(BsonWriter bsonWriter, Map map, EncoderContext encoderContext) {
            bsonWriter.T();
            for (Map.Entry entry : map.entrySet()) {
                bsonWriter.A((String) entry.getKey());
                if (entry.getValue() == null) {
                    bsonWriter.D();
                } else {
                    this.f43822b.a(bsonWriter, entry.getValue(), encoderContext);
                }
            }
            bsonWriter.f0();
        }

        public final Map f() {
            if (this.f43821a.isInterface()) {
                return new HashMap();
            }
            try {
                return (Map) this.f43821a.getDeclaredConstructor((Class[]) null).newInstance((Object[]) null);
            } catch (Exception e2) {
                throw new CodecConfigurationException(e2.getMessage(), e2);
            }
        }
    }

    public Codec a(TypeWithTypeParameters typeWithTypeParameters, PropertyCodecRegistry propertyCodecRegistry) {
        Class<Map> cls = Map.class;
        if (!cls.isAssignableFrom(typeWithTypeParameters.getType()) || typeWithTypeParameters.a().size() != 2) {
            return null;
        }
        Class type = ((TypeWithTypeParameters) typeWithTypeParameters.a().get(0)).getType();
        if (type.equals(String.class)) {
            try {
                return new MapCodec(typeWithTypeParameters.getType(), propertyCodecRegistry.a((TypeWithTypeParameters) typeWithTypeParameters.a().get(1)));
            } catch (CodecConfigurationException e2) {
                if (((TypeWithTypeParameters) typeWithTypeParameters.a().get(1)).getType() == Object.class) {
                    try {
                        return propertyCodecRegistry.a(TypeData.c(cls).c());
                    } catch (CodecConfigurationException unused) {
                        throw e2;
                    }
                }
                throw e2;
            }
        } else {
            throw new CodecConfigurationException(String.format("Invalid Map type. Maps MUST have string keys, found %s instead.", new Object[]{type}));
        }
    }
}
