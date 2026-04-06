package com.google.protobuf;

import com.google.protobuf.FieldSet;
import com.google.protobuf.LazyField;
import com.google.protobuf.WireFormat;
import java.util.Iterator;
import java.util.Map;

@CheckReturnValue
final class MessageSetSchema<T> implements Schema<T> {

    /* renamed from: a  reason: collision with root package name */
    public final MessageLite f32247a;

    /* renamed from: b  reason: collision with root package name */
    public final UnknownFieldSchema f32248b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f32249c;

    /* renamed from: d  reason: collision with root package name */
    public final ExtensionSchema f32250d;

    public MessageSetSchema(UnknownFieldSchema unknownFieldSchema, ExtensionSchema extensionSchema, MessageLite messageLite) {
        this.f32248b = unknownFieldSchema;
        this.f32249c = extensionSchema.e(messageLite);
        this.f32250d = extensionSchema;
        this.f32247a = messageLite;
    }

    private int j(UnknownFieldSchema unknownFieldSchema, Object obj) {
        return unknownFieldSchema.i(unknownFieldSchema.g(obj));
    }

    private void k(UnknownFieldSchema unknownFieldSchema, ExtensionSchema extensionSchema, Object obj, Reader reader, ExtensionRegistryLite extensionRegistryLite) {
        Object f2 = unknownFieldSchema.f(obj);
        FieldSet d2 = extensionSchema.d(obj);
        do {
            try {
                if (reader.J() == Integer.MAX_VALUE) {
                    unknownFieldSchema.o(obj, f2);
                    return;
                }
            } finally {
                unknownFieldSchema.o(obj, f2);
            }
        } while (m(reader, extensionRegistryLite, extensionSchema, d2, unknownFieldSchema, f2));
    }

    public static MessageSetSchema l(UnknownFieldSchema unknownFieldSchema, ExtensionSchema extensionSchema, MessageLite messageLite) {
        return new MessageSetSchema(unknownFieldSchema, extensionSchema, messageLite);
    }

    public void a(Object obj, Object obj2) {
        SchemaUtil.G(this.f32248b, obj, obj2);
        if (this.f32249c) {
            SchemaUtil.E(this.f32250d, obj, obj2);
        }
    }

    public boolean b(Object obj, Object obj2) {
        if (!this.f32248b.g(obj).equals(this.f32248b.g(obj2))) {
            return false;
        }
        if (this.f32249c) {
            return this.f32250d.c(obj).equals(this.f32250d.c(obj2));
        }
        return true;
    }

    public int c(Object obj) {
        int hashCode = this.f32248b.g(obj).hashCode();
        return this.f32249c ? (hashCode * 53) + this.f32250d.c(obj).hashCode() : hashCode;
    }

    public void d(Object obj) {
        this.f32248b.j(obj);
        this.f32250d.f(obj);
    }

    public final boolean e(Object obj) {
        return this.f32250d.c(obj).p();
    }

    public int f(Object obj) {
        int j2 = j(this.f32248b, obj);
        return this.f32249c ? j2 + this.f32250d.c(obj).j() : j2;
    }

    public Object g() {
        MessageLite messageLite = this.f32247a;
        return messageLite instanceof GeneratedMessageLite ? ((GeneratedMessageLite) messageLite).X() : messageLite.h().C();
    }

    public void h(Object obj, Writer writer) {
        Iterator t2 = this.f32250d.c(obj).t();
        while (t2.hasNext()) {
            Map.Entry entry = (Map.Entry) t2.next();
            FieldSet.FieldDescriptorLite fieldDescriptorLite = (FieldSet.FieldDescriptorLite) entry.getKey();
            if (fieldDescriptorLite.u() != WireFormat.JavaType.MESSAGE || fieldDescriptorLite.q() || fieldDescriptorLite.v()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            } else if (entry instanceof LazyField.LazyEntry) {
                writer.r(fieldDescriptorLite.i(), ((LazyField.LazyEntry) entry).a().e());
            } else {
                writer.r(fieldDescriptorLite.i(), entry.getValue());
            }
        }
        n(this.f32248b, obj, writer);
    }

    public void i(Object obj, Reader reader, ExtensionRegistryLite extensionRegistryLite) {
        k(this.f32248b, this.f32250d, obj, reader, extensionRegistryLite);
    }

    public final boolean m(Reader reader, ExtensionRegistryLite extensionRegistryLite, ExtensionSchema extensionSchema, FieldSet fieldSet, UnknownFieldSchema unknownFieldSchema, Object obj) {
        int E = reader.E();
        if (E == WireFormat.f32365a) {
            Object obj2 = null;
            int i2 = 0;
            ByteString byteString = null;
            while (reader.J() != Integer.MAX_VALUE) {
                int E2 = reader.E();
                if (E2 == WireFormat.f32367c) {
                    i2 = reader.y();
                    obj2 = extensionSchema.b(extensionRegistryLite, this.f32247a, i2);
                } else if (E2 == WireFormat.f32368d) {
                    if (obj2 != null) {
                        extensionSchema.h(reader, obj2, extensionRegistryLite, fieldSet);
                    } else {
                        byteString = reader.M();
                    }
                } else if (!reader.O()) {
                    break;
                }
            }
            if (reader.E() == WireFormat.f32366b) {
                if (byteString != null) {
                    if (obj2 != null) {
                        extensionSchema.i(byteString, obj2, extensionRegistryLite, fieldSet);
                    } else {
                        unknownFieldSchema.d(obj, i2, byteString);
                    }
                }
                return true;
            }
            throw InvalidProtocolBufferException.b();
        } else if (WireFormat.b(E) != 2) {
            return reader.O();
        } else {
            Object b2 = extensionSchema.b(extensionRegistryLite, this.f32247a, WireFormat.a(E));
            if (b2 == null) {
                return unknownFieldSchema.m(obj, reader);
            }
            extensionSchema.h(reader, b2, extensionRegistryLite, fieldSet);
            return true;
        }
    }

    public final void n(UnknownFieldSchema unknownFieldSchema, Object obj, Writer writer) {
        unknownFieldSchema.s(unknownFieldSchema.g(obj), writer);
    }
}
