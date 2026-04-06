package com.google.protobuf;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

@CheckReturnValue
final class Protobuf {

    /* renamed from: c  reason: collision with root package name */
    public static final Protobuf f32266c = new Protobuf();

    /* renamed from: a  reason: collision with root package name */
    public final SchemaFactory f32267a = new ManifestSchemaFactory();

    /* renamed from: b  reason: collision with root package name */
    public final ConcurrentMap f32268b = new ConcurrentHashMap();

    public static Protobuf a() {
        return f32266c;
    }

    public Schema b(Class cls, Schema schema) {
        Internal.b(cls, "messageType");
        Internal.b(schema, "schema");
        return (Schema) this.f32268b.putIfAbsent(cls, schema);
    }

    public Schema c(Class cls) {
        Internal.b(cls, "messageType");
        Schema schema = (Schema) this.f32268b.get(cls);
        if (schema != null) {
            return schema;
        }
        Schema a2 = this.f32267a.a(cls);
        Schema b2 = b(cls, a2);
        return b2 != null ? b2 : a2;
    }

    public Schema d(Object obj) {
        return c(obj.getClass());
    }

    public void e(Object obj, Writer writer) {
        d(obj).h(obj, writer);
    }
}
