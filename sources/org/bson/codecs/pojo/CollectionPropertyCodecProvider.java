package org.bson.codecs.pojo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import org.bson.BsonReader;
import org.bson.BsonType;
import org.bson.BsonWriter;
import org.bson.codecs.Codec;
import org.bson.codecs.DecoderContext;
import org.bson.codecs.EncoderContext;
import org.bson.codecs.configuration.CodecConfigurationException;

final class CollectionPropertyCodecProvider implements PropertyCodecProvider {

    public static class CollectionCodec<T> implements Codec<Collection<T>> {

        /* renamed from: a  reason: collision with root package name */
        public final Class f43779a;

        /* renamed from: b  reason: collision with root package name */
        public final Codec f43780b;

        public CollectionCodec(Class cls, Codec codec) {
            this.f43779a = cls;
            this.f43780b = codec;
        }

        /* renamed from: c */
        public Collection b(BsonReader bsonReader, DecoderContext decoderContext) {
            Collection f2 = f();
            bsonReader.y0();
            while (bsonReader.t1() != BsonType.END_OF_DOCUMENT) {
                if (bsonReader.C1() == BsonType.NULL) {
                    f2.add((Object) null);
                    bsonReader.i1();
                } else {
                    f2.add(this.f43780b.b(bsonReader, decoderContext));
                }
            }
            bsonReader.I0();
            return f2;
        }

        public Class d() {
            return this.f43779a;
        }

        /* renamed from: e */
        public void a(BsonWriter bsonWriter, Collection collection, EncoderContext encoderContext) {
            bsonWriter.m0();
            for (Object next : collection) {
                if (next == null) {
                    bsonWriter.D();
                } else {
                    this.f43780b.a(bsonWriter, next, encoderContext);
                }
            }
            bsonWriter.H();
        }

        public final Collection f() {
            if (!this.f43779a.isInterface()) {
                try {
                    return (Collection) this.f43779a.getDeclaredConstructor((Class[]) null).newInstance((Object[]) null);
                } catch (Exception e2) {
                    throw new CodecConfigurationException(e2.getMessage(), e2);
                }
            } else if (this.f43779a.isAssignableFrom(ArrayList.class)) {
                return new ArrayList();
            } else {
                if (this.f43779a.isAssignableFrom(HashSet.class)) {
                    return new HashSet();
                }
                throw new CodecConfigurationException(String.format("Unsupported Collection interface of %s!", new Object[]{this.f43779a.getName()}));
            }
        }
    }

    public Codec a(TypeWithTypeParameters typeWithTypeParameters, PropertyCodecRegistry propertyCodecRegistry) {
        if (!Collection.class.isAssignableFrom(typeWithTypeParameters.getType()) || typeWithTypeParameters.a().size() != 1) {
            return null;
        }
        return new CollectionCodec(typeWithTypeParameters.getType(), propertyCodecRegistry.a((TypeWithTypeParameters) typeWithTypeParameters.a().get(0)));
    }
}
