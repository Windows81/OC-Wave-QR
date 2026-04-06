package org.bson.codecs.pojo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.bson.BsonInvalidOperationException;
import org.bson.BsonReader;
import org.bson.BsonReaderMark;
import org.bson.BsonType;
import org.bson.BsonWriter;
import org.bson.codecs.Codec;
import org.bson.codecs.DecoderContext;
import org.bson.codecs.EncoderContext;
import org.bson.codecs.configuration.CodecConfigurationException;
import org.bson.codecs.configuration.CodecRegistries;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.TypeData;
import org.bson.diagnostics.Logger;
import org.bson.diagnostics.Loggers;

final class PojoCodecImpl<T> extends PojoCodec<T> {

    /* renamed from: g  reason: collision with root package name */
    public static final Logger f43823g = Loggers.a("PojoCodec");

    /* renamed from: a  reason: collision with root package name */
    public final ClassModel f43824a;

    /* renamed from: b  reason: collision with root package name */
    public final CodecRegistry f43825b;

    /* renamed from: c  reason: collision with root package name */
    public final PropertyCodecRegistry f43826c;

    /* renamed from: d  reason: collision with root package name */
    public final DiscriminatorLookup f43827d;

    /* renamed from: e  reason: collision with root package name */
    public final ConcurrentMap f43828e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f43829f;

    public PojoCodecImpl(ClassModel classModel, CodecRegistry codecRegistry, List list, DiscriminatorLookup discriminatorLookup) {
        this.f43824a = classModel;
        CodecRegistry f2 = CodecRegistries.f(CodecRegistries.b(this), codecRegistry);
        this.f43825b = f2;
        this.f43827d = discriminatorLookup;
        this.f43828e = new ConcurrentHashMap();
        this.f43826c = new PropertyCodecRegistryImpl(this, f2, list);
        this.f43829f = q(classModel);
        r();
    }

    public static boolean q(ClassModel classModel) {
        if (!classModel.m()) {
            return true;
        }
        for (Map.Entry entry : classModel.k().entrySet()) {
            PropertyModel i2 = classModel.i((String) entry.getKey());
            if (((TypeParameterMap) entry.getValue()).c() && (i2 == null || i2.d() == null)) {
                return false;
            }
        }
        return true;
    }

    public void a(BsonWriter bsonWriter, Object obj, EncoderContext encoderContext) {
        if (!this.f43829f) {
            throw new CodecConfigurationException(String.format("%s contains generic types that have not been specialised.%nTop level classes with generic types are not supported by the PojoCodec.", new Object[]{this.f43824a.h()}));
        } else if (f(obj.getClass(), this.f43824a.l())) {
            bsonWriter.T();
            i(bsonWriter, obj, encoderContext, this.f43824a.e());
            if (this.f43824a.n()) {
                bsonWriter.C(this.f43824a.c(), this.f43824a.b());
            }
            for (PropertyModel propertyModel : this.f43824a.j()) {
                if (!propertyModel.equals(this.f43824a.d())) {
                    j(bsonWriter, obj, encoderContext, propertyModel);
                }
            }
            bsonWriter.f0();
        } else {
            this.f43825b.a(obj.getClass()).a(bsonWriter, obj, encoderContext);
        }
    }

    public Object b(BsonReader bsonReader, DecoderContext decoderContext) {
        if (!decoderContext.c()) {
            return l(bsonReader, this.f43824a.n(), this.f43824a.c(), this.f43825b, this.f43827d, this).b(bsonReader, DecoderContext.a().b(true).a());
        } else if (this.f43829f) {
            InstanceCreator f2 = this.f43824a.f();
            g(bsonReader, decoderContext, f2);
            return f2.a();
        } else {
            throw new CodecConfigurationException(String.format("%s contains generic types that have not been specialised.%nTop level classes with generic types are not supported by the PojoCodec.", new Object[]{this.f43824a.h()}));
        }
    }

    public ClassModel c() {
        return this.f43824a;
    }

    public Class d() {
        return this.f43824a.l();
    }

    public final void e(PropertyModel propertyModel) {
        propertyModel.b(propertyModel.d() != null ? propertyModel.d() : s(propertyModel));
    }

    public final boolean f(Class cls, Class cls2) {
        if (cls.equals(cls2)) {
            return true;
        }
        Class<Collection> cls3 = Collection.class;
        if (cls3.isAssignableFrom(cls) && cls3.isAssignableFrom(cls2)) {
            return true;
        }
        Class<Map> cls4 = Map.class;
        return cls4.isAssignableFrom(cls) && cls4.isAssignableFrom(cls2);
    }

    public final void g(BsonReader bsonReader, DecoderContext decoderContext, InstanceCreator instanceCreator) {
        bsonReader.Z0();
        while (bsonReader.t1() != BsonType.END_OF_DOCUMENT) {
            String h1 = bsonReader.h1();
            if (!this.f43824a.n() || !this.f43824a.c().equals(h1)) {
                h(bsonReader, decoderContext, instanceCreator, h1, n(this.f43824a, h1));
            } else {
                bsonReader.h();
            }
        }
        bsonReader.T0();
    }

    public final void h(BsonReader bsonReader, DecoderContext decoderContext, InstanceCreator instanceCreator, String str, PropertyModel propertyModel) {
        Object obj;
        if (propertyModel != null) {
            try {
                if (bsonReader.C1() == BsonType.NULL) {
                    bsonReader.i1();
                    obj = null;
                } else {
                    obj = decoderContext.b(propertyModel.c(), bsonReader);
                }
                if (propertyModel.n()) {
                    instanceCreator.b(obj, propertyModel);
                }
            } catch (BsonInvalidOperationException e2) {
                throw new CodecConfigurationException(String.format("Failed to decode '%s'. Decoding '%s' errored with: %s", new Object[]{this.f43824a.h(), str, e2.getMessage()}), e2);
            } catch (CodecConfigurationException e3) {
                throw new CodecConfigurationException(String.format("Failed to decode '%s'. Decoding '%s' errored with: %s", new Object[]{this.f43824a.h(), str, e3.getMessage()}), e3);
            }
        } else {
            Logger logger = f43823g;
            if (logger.a()) {
                logger.c(String.format("Found property not present in the ClassModel: %s", new Object[]{str}));
            }
            bsonReader.Y();
        }
    }

    public final void i(BsonWriter bsonWriter, Object obj, EncoderContext encoderContext, IdPropertyModelHolder idPropertyModelHolder) {
        if (idPropertyModelHolder.d() == null) {
            return;
        }
        if (idPropertyModelHolder.c() == null) {
            j(bsonWriter, obj, encoderContext, idPropertyModelHolder.d());
            return;
        }
        Object obj2 = idPropertyModelHolder.d().g().get(obj);
        if (obj2 == null && encoderContext.d()) {
            obj2 = idPropertyModelHolder.c().a();
            try {
                idPropertyModelHolder.d().g().a(obj, obj2);
            } catch (Exception unused) {
            }
        }
        k(bsonWriter, encoderContext, idPropertyModelHolder.d(), obj2);
    }

    public final void j(BsonWriter bsonWriter, Object obj, EncoderContext encoderContext, PropertyModel propertyModel) {
        if (propertyModel != null && propertyModel.m()) {
            k(bsonWriter, encoderContext, propertyModel, propertyModel.g().get(obj));
        }
    }

    public final void k(BsonWriter bsonWriter, EncoderContext encoderContext, PropertyModel propertyModel, Object obj) {
        if (propertyModel.o(obj)) {
            bsonWriter.A(propertyModel.i());
            if (obj == null) {
                bsonWriter.D();
                return;
            }
            try {
                encoderContext.b(propertyModel.c(), bsonWriter, obj);
            } catch (CodecConfigurationException e2) {
                throw new CodecConfigurationException(String.format("Failed to encode '%s'. Encoding '%s' errored with: %s", new Object[]{this.f43824a.h(), propertyModel.i(), e2.getMessage()}), e2);
            }
        }
    }

    public final Codec l(BsonReader bsonReader, boolean z2, String str, CodecRegistry codecRegistry, DiscriminatorLookup discriminatorLookup, Codec codec) {
        if (z2) {
            BsonReaderMark m1 = bsonReader.m1();
            bsonReader.Z0();
            boolean z3 = false;
            while (!z3 && bsonReader.t1() != BsonType.END_OF_DOCUMENT) {
                if (str.equals(bsonReader.h1())) {
                    try {
                        codec = codecRegistry.a(discriminatorLookup.c(bsonReader.h()));
                        z3 = true;
                    } catch (Exception e2) {
                        throw new CodecConfigurationException(String.format("Failed to decode '%s'. Decoding errored with: %s", new Object[]{this.f43824a.h(), e2.getMessage()}), e2);
                    }
                } else {
                    bsonReader.Y();
                }
            }
            m1.b();
        }
        return codec;
    }

    public final Codec m(PropertyModel propertyModel) {
        try {
            return this.f43826c.a(propertyModel.j());
        } catch (CodecConfigurationException e2) {
            return new LazyMissingCodec(propertyModel.j().getType(), e2);
        }
    }

    public final PropertyModel n(ClassModel classModel, String str) {
        for (PropertyModel propertyModel : classModel.j()) {
            if (propertyModel.n() && propertyModel.k().equals(str)) {
                return propertyModel;
            }
        }
        return null;
    }

    public final ClassModel o(ClassModel classModel, PropertyModel propertyModel) {
        boolean n2 = propertyModel.p() == null ? classModel.n() : propertyModel.p().booleanValue();
        boolean z2 = true;
        boolean z3 = (classModel.c() == null || classModel.b() == null) ? false : true;
        if (n2 == classModel.n() || !z3) {
            z2 = false;
        }
        if (propertyModel.j().a().isEmpty() && !z2) {
            return classModel;
        }
        ArrayList arrayList = new ArrayList(classModel.j());
        PropertyModel d2 = classModel.d();
        List a2 = propertyModel.j().a();
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            PropertyModel propertyModel2 = (PropertyModel) arrayList.get(i2);
            String f2 = propertyModel2.f();
            TypeParameterMap typeParameterMap = (TypeParameterMap) classModel.k().get(f2);
            if (typeParameterMap.c()) {
                PropertyModel p2 = p(propertyModel2, typeParameterMap, a2);
                arrayList.set(i2, p2);
                if (d2 != null && d2.f().equals(f2)) {
                    d2 = p2;
                }
            }
        }
        return new ClassModel(classModel.l(), classModel.k(), classModel.g(), Boolean.valueOf(z2 ? propertyModel.p().booleanValue() : classModel.n()), classModel.c(), classModel.b(), IdPropertyModelHolder.b(classModel, d2), arrayList);
    }

    public final PropertyModel p(PropertyModel propertyModel, TypeParameterMap typeParameterMap, List list) {
        TypeData c2;
        Map b2 = typeParameterMap.b();
        Integer num = (Integer) b2.get(-1);
        if (num != null) {
            c2 = (TypeData) list.get(num.intValue());
        } else {
            TypeData.Builder c3 = TypeData.c(propertyModel.j().getType());
            ArrayList arrayList = new ArrayList(propertyModel.j().a());
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                for (Map.Entry entry : b2.entrySet()) {
                    if (((Integer) entry.getKey()).equals(Integer.valueOf(i2))) {
                        arrayList.set(i2, list.get(((Integer) entry.getValue()).intValue()));
                    }
                }
            }
            c3.b(arrayList);
            c2 = c3.c();
        }
        TypeData typeData = c2;
        return propertyModel.j().equals(typeData) ? propertyModel : new PropertyModel(propertyModel.f(), propertyModel.i(), propertyModel.k(), typeData, (Codec) null, propertyModel.h(), propertyModel.p(), propertyModel.g(), propertyModel.e());
    }

    public final void r() {
        if (this.f43829f) {
            this.f43828e.put(this.f43824a, this);
            for (PropertyModel e2 : this.f43824a.j()) {
                e(e2);
            }
        }
    }

    public final Codec s(PropertyModel propertyModel) {
        Codec m2 = m(propertyModel);
        if (!(m2 instanceof PojoCodec)) {
            return m2;
        }
        ClassModel o2 = o(((PojoCodec) m2).c(), propertyModel);
        return this.f43828e.containsKey(o2) ? (Codec) this.f43828e.get(o2) : new LazyPojoCodec(o2, this.f43825b, this.f43826c, this.f43827d, this.f43828e);
    }

    public String toString() {
        return String.format("PojoCodec<%s>", new Object[]{this.f43824a});
    }

    public PojoCodecImpl(ClassModel classModel, CodecRegistry codecRegistry, PropertyCodecRegistry propertyCodecRegistry, DiscriminatorLookup discriminatorLookup, ConcurrentMap concurrentMap, boolean z2) {
        this.f43824a = classModel;
        this.f43825b = CodecRegistries.f(CodecRegistries.b(this), codecRegistry);
        this.f43827d = discriminatorLookup;
        this.f43828e = concurrentMap;
        this.f43826c = propertyCodecRegistry;
        this.f43829f = z2;
        r();
    }
}
