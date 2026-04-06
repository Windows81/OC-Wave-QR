package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.FieldSet;
import androidx.datastore.preferences.protobuf.LazyField;
import androidx.datastore.preferences.protobuf.WireFormat;
import java.util.Iterator;
import java.util.Map;

@CheckReturnValue
final class MessageSetSchema<T> implements Schema<T> {

    /* renamed from: a  reason: collision with root package name */
    public final MessageLite f21089a;

    /* renamed from: b  reason: collision with root package name */
    public final UnknownFieldSchema f21090b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f21091c;

    /* renamed from: d  reason: collision with root package name */
    public final ExtensionSchema f21092d;

    public MessageSetSchema(UnknownFieldSchema unknownFieldSchema, ExtensionSchema extensionSchema, MessageLite messageLite) {
        this.f21090b = unknownFieldSchema;
        this.f21091c = extensionSchema.e(messageLite);
        this.f21092d = extensionSchema;
        this.f21089a = messageLite;
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
        SchemaUtil.G(this.f21090b, obj, obj2);
        if (this.f21091c) {
            SchemaUtil.E(this.f21092d, obj, obj2);
        }
    }

    public boolean b(Object obj, Object obj2) {
        if (!this.f21090b.g(obj).equals(this.f21090b.g(obj2))) {
            return false;
        }
        if (this.f21091c) {
            return this.f21092d.c(obj).equals(this.f21092d.c(obj2));
        }
        return true;
    }

    public int c(Object obj) {
        int hashCode = this.f21090b.g(obj).hashCode();
        return this.f21091c ? (hashCode * 53) + this.f21092d.c(obj).hashCode() : hashCode;
    }

    public void d(Object obj) {
        this.f21090b.j(obj);
        this.f21092d.f(obj);
    }

    public final boolean e(Object obj) {
        return this.f21092d.c(obj).p();
    }

    public int f(Object obj) {
        int j2 = j(this.f21090b, obj);
        return this.f21091c ? j2 + this.f21092d.c(obj).j() : j2;
    }

    public Object g() {
        MessageLite messageLite = this.f21089a;
        return messageLite instanceof GeneratedMessageLite ? ((GeneratedMessageLite) messageLite).P() : messageLite.h().C();
    }

    public void h(Object obj, Reader reader, ExtensionRegistryLite extensionRegistryLite) {
        k(this.f21090b, this.f21092d, obj, reader, extensionRegistryLite);
    }

    public void i(Object obj, Writer writer) {
        Iterator t2 = this.f21092d.c(obj).t();
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
        n(this.f21090b, obj, writer);
    }

    public final boolean m(Reader reader, ExtensionRegistryLite extensionRegistryLite, ExtensionSchema extensionSchema, FieldSet fieldSet, UnknownFieldSchema unknownFieldSchema, Object obj) {
        int E = reader.E();
        int i2 = 0;
        if (E == WireFormat.f21212a) {
            Object obj2 = null;
            ByteString byteString = null;
            while (reader.J() != Integer.MAX_VALUE) {
                int E2 = reader.E();
                if (E2 == WireFormat.f21214c) {
                    i2 = reader.y();
                    obj2 = extensionSchema.b(extensionRegistryLite, this.f21089a, i2);
                } else if (E2 == WireFormat.f21215d) {
                    if (obj2 != null) {
                        extensionSchema.h(reader, obj2, extensionRegistryLite, fieldSet);
                    } else {
                        byteString = reader.M();
                    }
                } else if (!reader.O()) {
                    break;
                }
            }
            if (reader.E() == WireFormat.f21213b) {
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
            Object b2 = extensionSchema.b(extensionRegistryLite, this.f21089a, WireFormat.a(E));
            if (b2 == null) {
                return unknownFieldSchema.m(obj, reader, 0);
            }
            extensionSchema.h(reader, b2, extensionRegistryLite, fieldSet);
            return true;
        }
    }

    public final void n(UnknownFieldSchema unknownFieldSchema, Object obj, Writer writer) {
        unknownFieldSchema.s(unknownFieldSchema.g(obj), writer);
    }
}
