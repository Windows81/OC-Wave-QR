package com.google.android.gms.common.server.response;

import android.os.Parcel;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.server.converter.zaa;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.JsonUtils;
import com.google.android.gms.common.util.MapUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public abstract class FastJsonResponse {

    public static class Field<I, O> extends AbstractSafeParcelable {
        public static final zaj CREATOR = new zaj();

        /* renamed from: A  reason: collision with root package name */
        public final int f25073A;

        /* renamed from: B  reason: collision with root package name */
        public final boolean f25074B;
        public final int C;
        public final boolean D;
        public final String E;
        public final int F;
        public final Class G;
        public final String H;
        public zan I;
        public final FieldConverter J;

        /* renamed from: z  reason: collision with root package name */
        public final int f25075z;

        public Field(int i2, int i3, boolean z2, int i4, boolean z3, String str, int i5, String str2, zaa zaa) {
            this.f25075z = i2;
            this.f25073A = i3;
            this.f25074B = z2;
            this.C = i4;
            this.D = z3;
            this.E = str;
            this.F = i5;
            if (str2 == null) {
                this.G = null;
                this.H = null;
            } else {
                this.G = SafeParcelResponse.class;
                this.H = str2;
            }
            if (zaa == null) {
                this.J = null;
            } else {
                this.J = zaa.Q();
            }
        }

        public final boolean A0() {
            return this.J != null;
        }

        public int H() {
            return this.F;
        }

        public final zaa Q() {
            FieldConverter fieldConverter = this.J;
            if (fieldConverter == null) {
                return null;
            }
            return zaa.H(fieldConverter);
        }

        public final Object X(Object obj) {
            Preconditions.m(this.J);
            return this.J.g(obj);
        }

        public final String f0() {
            String str = this.H;
            if (str == null) {
                return null;
            }
            return str;
        }

        public final Map m0() {
            Preconditions.m(this.H);
            Preconditions.m(this.I);
            return (Map) Preconditions.m(this.I.Q(this.H));
        }

        public final void o0(zan zan) {
            this.I = zan;
        }

        public final String toString() {
            Objects.ToStringHelper a2 = Objects.c(this).a("versionCode", Integer.valueOf(this.f25075z)).a("typeIn", Integer.valueOf(this.f25073A)).a("typeInArray", Boolean.valueOf(this.f25074B)).a("typeOut", Integer.valueOf(this.C)).a("typeOutArray", Boolean.valueOf(this.D)).a("outputFieldName", this.E).a("safeParcelFieldId", Integer.valueOf(this.F)).a("concreteTypeName", f0());
            Class cls = this.G;
            if (cls != null) {
                a2.a("concreteType.class", cls.getCanonicalName());
            }
            FieldConverter fieldConverter = this.J;
            if (fieldConverter != null) {
                a2.a("converterName", fieldConverter.getClass().getCanonicalName());
            }
            return a2.toString();
        }

        public final void writeToParcel(Parcel parcel, int i2) {
            int i3 = this.f25075z;
            int a2 = SafeParcelWriter.a(parcel);
            SafeParcelWriter.n(parcel, 1, i3);
            SafeParcelWriter.n(parcel, 2, this.f25073A);
            SafeParcelWriter.c(parcel, 3, this.f25074B);
            SafeParcelWriter.n(parcel, 4, this.C);
            SafeParcelWriter.c(parcel, 5, this.D);
            SafeParcelWriter.w(parcel, 6, this.E, false);
            SafeParcelWriter.n(parcel, 7, H());
            SafeParcelWriter.w(parcel, 8, f0(), false);
            SafeParcelWriter.v(parcel, 9, Q(), i2, false);
            SafeParcelWriter.b(parcel, a2);
        }
    }

    public interface FieldConverter<I, O> {
        Object g(Object obj);
    }

    public static final Object f(Field field, Object obj) {
        return field.J != null ? field.X(obj) : obj;
    }

    public static final void g(StringBuilder sb, Field field, Object obj) {
        int i2 = field.f25073A;
        if (i2 == 11) {
            Class cls = field.G;
            Preconditions.m(cls);
            sb.append(((FastJsonResponse) cls.cast(obj)).toString());
        } else if (i2 == 7) {
            sb.append("\"");
            sb.append(JsonUtils.a((String) obj));
            sb.append("\"");
        } else {
            sb.append(obj);
        }
    }

    public abstract Map a();

    public Object b(Field field) {
        String str = field.E;
        if (field.G == null) {
            return c(str);
        }
        Preconditions.s(c(str) == null, "Concrete field shouldn't be value object: %s", field.E);
        try {
            char upperCase = Character.toUpperCase(str.charAt(0));
            String substring = str.substring(1);
            return getClass().getMethod("get" + upperCase + substring, (Class[]) null).invoke(this, (Object[]) null);
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }

    public abstract Object c(String str);

    public boolean d(Field field) {
        if (field.C != 11) {
            return e(field.E);
        }
        if (field.D) {
            throw new UnsupportedOperationException("Concrete type arrays not supported");
        }
        throw new UnsupportedOperationException("Concrete types not supported");
    }

    public abstract boolean e(String str);

    public String toString() {
        Map a2 = a();
        StringBuilder sb = new StringBuilder(100);
        for (String str : a2.keySet()) {
            Field field = (Field) a2.get(str);
            if (d(field)) {
                Object f2 = f(field, b(field));
                if (sb.length() == 0) {
                    sb.append("{");
                } else {
                    sb.append(",");
                }
                sb.append("\"");
                sb.append(str);
                sb.append("\":");
                if (f2 != null) {
                    switch (field.C) {
                        case 8:
                            sb.append("\"");
                            sb.append(Base64Utils.a((byte[]) f2));
                            sb.append("\"");
                            break;
                        case 9:
                            sb.append("\"");
                            sb.append(Base64Utils.b((byte[]) f2));
                            sb.append("\"");
                            break;
                        case 10:
                            MapUtils.a(sb, (HashMap) f2);
                            break;
                        default:
                            if (!field.f25074B) {
                                g(sb, field, f2);
                                break;
                            } else {
                                ArrayList arrayList = (ArrayList) f2;
                                sb.append("[");
                                int size = arrayList.size();
                                for (int i2 = 0; i2 < size; i2++) {
                                    if (i2 > 0) {
                                        sb.append(",");
                                    }
                                    Object obj = arrayList.get(i2);
                                    if (obj != null) {
                                        g(sb, field, obj);
                                    }
                                }
                                sb.append("]");
                                break;
                            }
                    }
                } else {
                    sb.append("null");
                }
            }
        }
        if (sb.length() > 0) {
            sb.append("}");
        } else {
            sb.append("{}");
        }
        return sb.toString();
    }
}
