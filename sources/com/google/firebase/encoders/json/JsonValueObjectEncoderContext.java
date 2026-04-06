package com.google.firebase.encoders.json;

import android.util.Base64;
import android.util.JsonWriter;
import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.ValueEncoder;
import com.google.firebase.encoders.ValueEncoderContext;
import java.io.Writer;
import java.util.Collection;
import java.util.Date;
import java.util.Map;

final class JsonValueObjectEncoderContext implements ObjectEncoderContext, ValueEncoderContext {

    /* renamed from: a  reason: collision with root package name */
    public JsonValueObjectEncoderContext f30712a = null;

    /* renamed from: b  reason: collision with root package name */
    public boolean f30713b = true;

    /* renamed from: c  reason: collision with root package name */
    public final JsonWriter f30714c;

    /* renamed from: d  reason: collision with root package name */
    public final Map f30715d;

    /* renamed from: e  reason: collision with root package name */
    public final Map f30716e;

    /* renamed from: f  reason: collision with root package name */
    public final ObjectEncoder f30717f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f30718g;

    public JsonValueObjectEncoderContext(Writer writer, Map map, Map map2, ObjectEncoder objectEncoder, boolean z2) {
        this.f30714c = new JsonWriter(writer);
        this.f30715d = map;
        this.f30716e = map2;
        this.f30717f = objectEncoder;
        this.f30718g = z2;
    }

    public ObjectEncoderContext a(FieldDescriptor fieldDescriptor, boolean z2) {
        return q(fieldDescriptor.b(), z2);
    }

    public ObjectEncoderContext b(FieldDescriptor fieldDescriptor, long j2) {
        return o(fieldDescriptor.b(), j2);
    }

    public ObjectEncoderContext c(FieldDescriptor fieldDescriptor, int i2) {
        return n(fieldDescriptor.b(), i2);
    }

    public ObjectEncoderContext d(FieldDescriptor fieldDescriptor, double d2) {
        return m(fieldDescriptor.b(), d2);
    }

    public ObjectEncoderContext g(FieldDescriptor fieldDescriptor, Object obj) {
        return p(fieldDescriptor.b(), obj);
    }

    public JsonValueObjectEncoderContext h(double d2) {
        y();
        this.f30714c.value(d2);
        return this;
    }

    public JsonValueObjectEncoderContext i(int i2) {
        y();
        this.f30714c.value((long) i2);
        return this;
    }

    public JsonValueObjectEncoderContext j(long j2) {
        y();
        this.f30714c.value(j2);
        return this;
    }

    public JsonValueObjectEncoderContext k(Object obj, boolean z2) {
        if (z2 && t(obj)) {
            throw new EncodingException(String.format("%s cannot be encoded inline", new Object[]{obj == null ? null : obj.getClass()}));
        } else if (obj == null) {
            this.f30714c.nullValue();
            return this;
        } else if (obj instanceof Number) {
            this.f30714c.value((Number) obj);
            return this;
        } else {
            int i2 = 0;
            if (obj.getClass().isArray()) {
                if (obj instanceof byte[]) {
                    return s((byte[]) obj);
                }
                this.f30714c.beginArray();
                if (obj instanceof int[]) {
                    int[] iArr = (int[]) obj;
                    int length = iArr.length;
                    while (i2 < length) {
                        this.f30714c.value((long) iArr[i2]);
                        i2++;
                    }
                } else if (obj instanceof long[]) {
                    long[] jArr = (long[]) obj;
                    int length2 = jArr.length;
                    while (i2 < length2) {
                        j(jArr[i2]);
                        i2++;
                    }
                } else if (obj instanceof double[]) {
                    double[] dArr = (double[]) obj;
                    int length3 = dArr.length;
                    while (i2 < length3) {
                        this.f30714c.value(dArr[i2]);
                        i2++;
                    }
                } else if (obj instanceof boolean[]) {
                    boolean[] zArr = (boolean[]) obj;
                    int length4 = zArr.length;
                    while (i2 < length4) {
                        this.f30714c.value(zArr[i2]);
                        i2++;
                    }
                } else if (obj instanceof Number[]) {
                    for (Number k2 : (Number[]) obj) {
                        k(k2, false);
                    }
                } else {
                    for (Object k3 : (Object[]) obj) {
                        k(k3, false);
                    }
                }
                this.f30714c.endArray();
                return this;
            } else if (obj instanceof Collection) {
                this.f30714c.beginArray();
                for (Object k4 : (Collection) obj) {
                    k(k4, false);
                }
                this.f30714c.endArray();
                return this;
            } else if (obj instanceof Map) {
                this.f30714c.beginObject();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    try {
                        p((String) key, entry.getValue());
                    } catch (ClassCastException e2) {
                        throw new EncodingException(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", new Object[]{key, key.getClass()}), e2);
                    }
                }
                this.f30714c.endObject();
                return this;
            } else {
                ObjectEncoder objectEncoder = (ObjectEncoder) this.f30715d.get(obj.getClass());
                if (objectEncoder != null) {
                    return v(objectEncoder, obj, z2);
                }
                ValueEncoder valueEncoder = (ValueEncoder) this.f30716e.get(obj.getClass());
                if (valueEncoder != null) {
                    valueEncoder.a(obj, this);
                    return this;
                } else if (!(obj instanceof Enum)) {
                    return v(this.f30717f, obj, z2);
                } else {
                    if (obj instanceof NumberedEnum) {
                        i(((NumberedEnum) obj).i());
                    } else {
                        e(((Enum) obj).name());
                    }
                    return this;
                }
            }
        }
    }

    /* renamed from: l */
    public JsonValueObjectEncoderContext e(String str) {
        y();
        this.f30714c.value(str);
        return this;
    }

    public JsonValueObjectEncoderContext m(String str, double d2) {
        y();
        this.f30714c.name(str);
        return h(d2);
    }

    public JsonValueObjectEncoderContext n(String str, int i2) {
        y();
        this.f30714c.name(str);
        return i(i2);
    }

    public JsonValueObjectEncoderContext o(String str, long j2) {
        y();
        this.f30714c.name(str);
        return j(j2);
    }

    public JsonValueObjectEncoderContext p(String str, Object obj) {
        return this.f30718g ? x(str, obj) : w(str, obj);
    }

    public JsonValueObjectEncoderContext q(String str, boolean z2) {
        y();
        this.f30714c.name(str);
        return f(z2);
    }

    /* renamed from: r */
    public JsonValueObjectEncoderContext f(boolean z2) {
        y();
        this.f30714c.value(z2);
        return this;
    }

    public JsonValueObjectEncoderContext s(byte[] bArr) {
        y();
        if (bArr == null) {
            this.f30714c.nullValue();
        } else {
            this.f30714c.value(Base64.encodeToString(bArr, 2));
        }
        return this;
    }

    public final boolean t(Object obj) {
        return obj == null || obj.getClass().isArray() || (obj instanceof Collection) || (obj instanceof Date) || (obj instanceof Enum) || (obj instanceof Number);
    }

    public void u() {
        y();
        this.f30714c.flush();
    }

    public JsonValueObjectEncoderContext v(ObjectEncoder objectEncoder, Object obj, boolean z2) {
        if (!z2) {
            this.f30714c.beginObject();
        }
        objectEncoder.a(obj, this);
        if (!z2) {
            this.f30714c.endObject();
        }
        return this;
    }

    public final JsonValueObjectEncoderContext w(String str, Object obj) {
        y();
        this.f30714c.name(str);
        if (obj != null) {
            return k(obj, false);
        }
        this.f30714c.nullValue();
        return this;
    }

    public final JsonValueObjectEncoderContext x(String str, Object obj) {
        if (obj == null) {
            return this;
        }
        y();
        this.f30714c.name(str);
        return k(obj, false);
    }

    public final void y() {
        if (this.f30713b) {
            JsonValueObjectEncoderContext jsonValueObjectEncoderContext = this.f30712a;
            if (jsonValueObjectEncoderContext != null) {
                jsonValueObjectEncoderContext.y();
                this.f30712a.f30713b = false;
                this.f30712a = null;
                this.f30714c.endObject();
                return;
            }
            return;
        }
        throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
    }
}
