package org.bson.codecs.pojo;

import java.util.List;
import java.util.Map;
import java.util.Set;
import org.bson.codecs.Codec;
import org.bson.codecs.configuration.CodecProvider;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.diagnostics.Logger;
import org.bson.diagnostics.Loggers;

public final class PojoCodecProvider implements CodecProvider {

    /* renamed from: g  reason: collision with root package name */
    public static final Logger f43830g = Loggers.a("codecs.pojo");

    /* renamed from: a  reason: collision with root package name */
    public final boolean f43831a;

    /* renamed from: b  reason: collision with root package name */
    public final Map f43832b;

    /* renamed from: c  reason: collision with root package name */
    public final Set f43833c;

    /* renamed from: d  reason: collision with root package name */
    public final List f43834d;

    /* renamed from: e  reason: collision with root package name */
    public final DiscriminatorLookup f43835e;

    /* renamed from: f  reason: collision with root package name */
    public final List f43836f;

    public static final class Builder {
    }

    public static ClassModel a(Class cls, List list) {
        ClassModelBuilder a2 = ClassModel.a(cls);
        if (list != null) {
            a2.e(list);
        }
        return a2.c();
    }

    public Codec b(Class cls, CodecRegistry codecRegistry) {
        return c(cls, codecRegistry);
    }

    public final PojoCodec c(Class cls, CodecRegistry codecRegistry) {
        ClassModel classModel = (ClassModel) this.f43832b.get(cls);
        if (classModel != null) {
            return new PojoCodecImpl(classModel, codecRegistry, this.f43836f, this.f43835e);
        }
        if (this.f43831a || (cls.getPackage() != null && this.f43833c.contains(cls.getPackage().getName()))) {
            try {
                ClassModel a2 = a(cls, this.f43834d);
                if (!cls.isInterface()) {
                    if (!a2.j().isEmpty()) {
                    }
                }
                this.f43835e.a(a2);
                return new AutomaticPojoCodec(new PojoCodecImpl(a2, codecRegistry, this.f43836f, this.f43835e));
            } catch (Exception e2) {
                f43830g.b(String.format("Cannot use '%s' with the PojoCodec.", new Object[]{cls.getSimpleName()}), e2);
                return null;
            }
        }
        return null;
    }
}
