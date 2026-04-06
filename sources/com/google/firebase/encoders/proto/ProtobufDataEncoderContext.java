package com.google.firebase.encoders.proto;

import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.ValueEncoder;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Map;

final class ProtobufDataEncoderContext implements ObjectEncoderContext {

    /* renamed from: f  reason: collision with root package name */
    public static final Charset f30727f = Charset.forName("UTF-8");

    /* renamed from: g  reason: collision with root package name */
    public static final FieldDescriptor f30728g = FieldDescriptor.a("key").b(AtProtobuf.b().c(1).a()).a();

    /* renamed from: h  reason: collision with root package name */
    public static final FieldDescriptor f30729h = FieldDescriptor.a("value").b(AtProtobuf.b().c(2).a()).a();

    /* renamed from: i  reason: collision with root package name */
    public static final ObjectEncoder f30730i = new a();

    /* renamed from: a  reason: collision with root package name */
    public OutputStream f30731a;

    /* renamed from: b  reason: collision with root package name */
    public final Map f30732b;

    /* renamed from: c  reason: collision with root package name */
    public final Map f30733c;

    /* renamed from: d  reason: collision with root package name */
    public final ObjectEncoder f30734d;

    /* renamed from: e  reason: collision with root package name */
    public final ProtobufValueEncoderContext f30735e = new ProtobufValueEncoderContext(this);

    /* renamed from: com.google.firebase.encoders.proto.ProtobufDataEncoderContext$1  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f30736a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.google.firebase.encoders.proto.Protobuf$IntEncoding[] r0 = com.google.firebase.encoders.proto.Protobuf.IntEncoding.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f30736a = r0
                com.google.firebase.encoders.proto.Protobuf$IntEncoding r1 = com.google.firebase.encoders.proto.Protobuf.IntEncoding.DEFAULT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f30736a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.firebase.encoders.proto.Protobuf$IntEncoding r1 = com.google.firebase.encoders.proto.Protobuf.IntEncoding.SIGNED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f30736a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.firebase.encoders.proto.Protobuf$IntEncoding r1 = com.google.firebase.encoders.proto.Protobuf.IntEncoding.FIXED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.encoders.proto.ProtobufDataEncoderContext.AnonymousClass1.<clinit>():void");
        }
    }

    public ProtobufDataEncoderContext(OutputStream outputStream, Map map, Map map2, ObjectEncoder objectEncoder) {
        this.f30731a = outputStream;
        this.f30732b = map;
        this.f30733c = map2;
        this.f30734d = objectEncoder;
    }

    public static ByteBuffer p(int i2) {
        return ByteBuffer.allocate(i2).order(ByteOrder.LITTLE_ENDIAN);
    }

    public static Protobuf u(FieldDescriptor fieldDescriptor) {
        Protobuf protobuf = (Protobuf) fieldDescriptor.c(Protobuf.class);
        if (protobuf != null) {
            return protobuf;
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    public static int v(FieldDescriptor fieldDescriptor) {
        Protobuf protobuf = (Protobuf) fieldDescriptor.c(Protobuf.class);
        if (protobuf != null) {
            return protobuf.tag();
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    public static /* synthetic */ void w(Map.Entry entry, ObjectEncoderContext objectEncoderContext) {
        objectEncoderContext.g(f30728g, entry.getKey());
        objectEncoderContext.g(f30729h, entry.getValue());
    }

    public ObjectEncoderContext d(FieldDescriptor fieldDescriptor, double d2) {
        return f(fieldDescriptor, d2, true);
    }

    public ObjectEncoderContext f(FieldDescriptor fieldDescriptor, double d2, boolean z2) {
        if (z2 && d2 == 0.0d) {
            return this;
        }
        x((v(fieldDescriptor) << 3) | 1);
        this.f30731a.write(p(8).putDouble(d2).array());
        return this;
    }

    public ObjectEncoderContext g(FieldDescriptor fieldDescriptor, Object obj) {
        return i(fieldDescriptor, obj, true);
    }

    public ObjectEncoderContext h(FieldDescriptor fieldDescriptor, float f2, boolean z2) {
        if (z2 && f2 == 0.0f) {
            return this;
        }
        x((v(fieldDescriptor) << 3) | 5);
        this.f30731a.write(p(4).putFloat(f2).array());
        return this;
    }

    public ObjectEncoderContext i(FieldDescriptor fieldDescriptor, Object obj, boolean z2) {
        if (obj == null) {
            return this;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z2 && charSequence.length() == 0) {
                return this;
            }
            x((v(fieldDescriptor) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f30727f);
            x(bytes.length);
            this.f30731a.write(bytes);
            return this;
        } else if (obj instanceof Collection) {
            for (Object i2 : (Collection) obj) {
                i(fieldDescriptor, i2, false);
            }
            return this;
        } else if (obj instanceof Map) {
            for (Map.Entry r2 : ((Map) obj).entrySet()) {
                r(f30730i, fieldDescriptor, r2, false);
            }
            return this;
        } else if (obj instanceof Double) {
            return f(fieldDescriptor, ((Double) obj).doubleValue(), z2);
        } else {
            if (obj instanceof Float) {
                return h(fieldDescriptor, ((Float) obj).floatValue(), z2);
            }
            if (obj instanceof Number) {
                return m(fieldDescriptor, ((Number) obj).longValue(), z2);
            }
            if (obj instanceof Boolean) {
                return o(fieldDescriptor, ((Boolean) obj).booleanValue(), z2);
            }
            if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                if (z2 && bArr.length == 0) {
                    return this;
                }
                x((v(fieldDescriptor) << 3) | 2);
                x(bArr.length);
                this.f30731a.write(bArr);
                return this;
            }
            ObjectEncoder objectEncoder = (ObjectEncoder) this.f30732b.get(obj.getClass());
            if (objectEncoder != null) {
                return r(objectEncoder, fieldDescriptor, obj, z2);
            }
            ValueEncoder valueEncoder = (ValueEncoder) this.f30733c.get(obj.getClass());
            return valueEncoder != null ? s(valueEncoder, fieldDescriptor, obj, z2) : obj instanceof ProtoEnum ? c(fieldDescriptor, ((ProtoEnum) obj).i()) : obj instanceof Enum ? c(fieldDescriptor, ((Enum) obj).ordinal()) : r(this.f30734d, fieldDescriptor, obj, z2);
        }
    }

    /* renamed from: j */
    public ProtobufDataEncoderContext c(FieldDescriptor fieldDescriptor, int i2) {
        return k(fieldDescriptor, i2, true);
    }

    public ProtobufDataEncoderContext k(FieldDescriptor fieldDescriptor, int i2, boolean z2) {
        if (z2 && i2 == 0) {
            return this;
        }
        Protobuf u2 = u(fieldDescriptor);
        int i3 = AnonymousClass1.f30736a[u2.intEncoding().ordinal()];
        if (i3 == 1) {
            x(u2.tag() << 3);
            x(i2);
        } else if (i3 == 2) {
            x(u2.tag() << 3);
            x((i2 << 1) ^ (i2 >> 31));
        } else if (i3 == 3) {
            x((u2.tag() << 3) | 5);
            this.f30731a.write(p(4).putInt(i2).array());
        }
        return this;
    }

    /* renamed from: l */
    public ProtobufDataEncoderContext b(FieldDescriptor fieldDescriptor, long j2) {
        return m(fieldDescriptor, j2, true);
    }

    public ProtobufDataEncoderContext m(FieldDescriptor fieldDescriptor, long j2, boolean z2) {
        if (z2 && j2 == 0) {
            return this;
        }
        Protobuf u2 = u(fieldDescriptor);
        int i2 = AnonymousClass1.f30736a[u2.intEncoding().ordinal()];
        if (i2 == 1) {
            x(u2.tag() << 3);
            y(j2);
        } else if (i2 == 2) {
            x(u2.tag() << 3);
            y((j2 >> 63) ^ (j2 << 1));
        } else if (i2 == 3) {
            x((u2.tag() << 3) | 1);
            this.f30731a.write(p(8).putLong(j2).array());
        }
        return this;
    }

    /* renamed from: n */
    public ProtobufDataEncoderContext a(FieldDescriptor fieldDescriptor, boolean z2) {
        return o(fieldDescriptor, z2, true);
    }

    public ProtobufDataEncoderContext o(FieldDescriptor fieldDescriptor, boolean z2, boolean z3) {
        return k(fieldDescriptor, z2 ? 1 : 0, z3);
    }

    public final long q(ObjectEncoder objectEncoder, Object obj) {
        OutputStream outputStream;
        LengthCountingOutputStream lengthCountingOutputStream = new LengthCountingOutputStream();
        try {
            outputStream = this.f30731a;
            this.f30731a = lengthCountingOutputStream;
            objectEncoder.a(obj, this);
            this.f30731a = outputStream;
            long a2 = lengthCountingOutputStream.a();
            lengthCountingOutputStream.close();
            return a2;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    public final ProtobufDataEncoderContext r(ObjectEncoder objectEncoder, FieldDescriptor fieldDescriptor, Object obj, boolean z2) {
        long q2 = q(objectEncoder, obj);
        if (z2 && q2 == 0) {
            return this;
        }
        x((v(fieldDescriptor) << 3) | 2);
        y(q2);
        objectEncoder.a(obj, this);
        return this;
    }

    public final ProtobufDataEncoderContext s(ValueEncoder valueEncoder, FieldDescriptor fieldDescriptor, Object obj, boolean z2) {
        this.f30735e.b(fieldDescriptor, z2);
        valueEncoder.a(obj, this.f30735e);
        return this;
    }

    public ProtobufDataEncoderContext t(Object obj) {
        if (obj == null) {
            return this;
        }
        ObjectEncoder objectEncoder = (ObjectEncoder) this.f30732b.get(obj.getClass());
        if (objectEncoder != null) {
            objectEncoder.a(obj, this);
            return this;
        }
        throw new EncodingException("No encoder for " + obj.getClass());
    }

    public final void x(int i2) {
        while (((long) (i2 & -128)) != 0) {
            this.f30731a.write((i2 & 127) | 128);
            i2 >>>= 7;
        }
        this.f30731a.write(i2 & 127);
    }

    public final void y(long j2) {
        while ((-128 & j2) != 0) {
            this.f30731a.write((((int) j2) & 127) | 128);
            j2 >>>= 7;
        }
        this.f30731a.write(((int) j2) & 127);
    }
}
