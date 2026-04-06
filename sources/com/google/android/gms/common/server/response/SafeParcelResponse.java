package com.google.android.gms.common.server.response;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.common.util.ArrayUtils;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.JsonUtils;
import com.google.android.gms.common.util.MapUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class SafeParcelResponse extends FastSafeParcelableJsonResponse {
    public static final Parcelable.Creator<SafeParcelResponse> CREATOR = new zaq();

    /* renamed from: A  reason: collision with root package name */
    public final Parcel f25090A;

    /* renamed from: B  reason: collision with root package name */
    public final int f25091B = 2;
    public final zan C;
    public final String D;
    public int E;
    public int F;

    /* renamed from: z  reason: collision with root package name */
    public final int f25092z;

    public SafeParcelResponse(int i2, Parcel parcel, zan zan) {
        this.f25092z = i2;
        this.f25090A = (Parcel) Preconditions.m(parcel);
        this.C = zan;
        this.D = zan == null ? null : zan.H();
        this.E = 2;
    }

    public static final void j(StringBuilder sb, int i2, Object obj) {
        switch (i2) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                sb.append(obj);
                return;
            case 7:
                sb.append("\"");
                sb.append(JsonUtils.a(Preconditions.m(obj).toString()));
                sb.append("\"");
                return;
            case 8:
                sb.append("\"");
                sb.append(Base64Utils.a((byte[]) obj));
                sb.append("\"");
                return;
            case 9:
                sb.append("\"");
                sb.append(Base64Utils.b((byte[]) obj));
                sb.append("\"");
                return;
            case 10:
                MapUtils.a(sb, (HashMap) Preconditions.m(obj));
                return;
            case 11:
                throw new IllegalArgumentException("Method does not accept concrete type.");
            default:
                throw new IllegalArgumentException("Unknown type = " + i2);
        }
    }

    public static final void k(StringBuilder sb, FastJsonResponse.Field field, Object obj) {
        if (field.f25074B) {
            ArrayList arrayList = (ArrayList) obj;
            sb.append("[");
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (i2 != 0) {
                    sb.append(",");
                }
                j(sb, field.f25073A, arrayList.get(i2));
            }
            sb.append("]");
            return;
        }
        j(sb, field.f25073A, obj);
    }

    public final Map a() {
        zan zan = this.C;
        if (zan == null) {
            return null;
        }
        return zan.Q((String) Preconditions.m(this.D));
    }

    public final Object c(String str) {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    public final boolean e(String str) {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    public final Parcel h() {
        int i2 = this.E;
        if (i2 == 0) {
            int a2 = SafeParcelWriter.a(this.f25090A);
            this.F = a2;
            SafeParcelWriter.b(this.f25090A, a2);
            this.E = 2;
        } else if (i2 == 1) {
            SafeParcelWriter.b(this.f25090A, this.F);
            this.E = 2;
        }
        return this.f25090A;
    }

    public final void i(StringBuilder sb, Map map, Parcel parcel) {
        SparseArray sparseArray = new SparseArray();
        for (Map.Entry entry : map.entrySet()) {
            sparseArray.put(((FastJsonResponse.Field) entry.getValue()).H(), entry);
        }
        sb.append('{');
        int N = SafeParcelReader.N(parcel);
        boolean z2 = false;
        while (parcel.dataPosition() < N) {
            int E2 = SafeParcelReader.E(parcel);
            Map.Entry entry2 = (Map.Entry) sparseArray.get(SafeParcelReader.w(E2));
            if (entry2 != null) {
                if (z2) {
                    sb.append(",");
                }
                FastJsonResponse.Field field = (FastJsonResponse.Field) entry2.getValue();
                sb.append("\"");
                sb.append((String) entry2.getKey());
                sb.append("\":");
                if (field.A0()) {
                    int i2 = field.C;
                    switch (i2) {
                        case 0:
                            k(sb, field, FastJsonResponse.f(field, Integer.valueOf(SafeParcelReader.G(parcel, E2))));
                            break;
                        case 1:
                            k(sb, field, FastJsonResponse.f(field, SafeParcelReader.c(parcel, E2)));
                            break;
                        case 2:
                            k(sb, field, FastJsonResponse.f(field, Long.valueOf(SafeParcelReader.J(parcel, E2))));
                            break;
                        case 3:
                            k(sb, field, FastJsonResponse.f(field, Float.valueOf(SafeParcelReader.C(parcel, E2))));
                            break;
                        case 4:
                            k(sb, field, FastJsonResponse.f(field, Double.valueOf(SafeParcelReader.A(parcel, E2))));
                            break;
                        case 5:
                            k(sb, field, FastJsonResponse.f(field, SafeParcelReader.a(parcel, E2)));
                            break;
                        case 6:
                            k(sb, field, FastJsonResponse.f(field, Boolean.valueOf(SafeParcelReader.x(parcel, E2))));
                            break;
                        case 7:
                            k(sb, field, FastJsonResponse.f(field, SafeParcelReader.q(parcel, E2)));
                            break;
                        case 8:
                        case 9:
                            k(sb, field, FastJsonResponse.f(field, SafeParcelReader.g(parcel, E2)));
                            break;
                        case 10:
                            Bundle f2 = SafeParcelReader.f(parcel, E2);
                            HashMap hashMap = new HashMap();
                            for (String next : f2.keySet()) {
                                hashMap.put(next, (String) Preconditions.m(f2.getString(next)));
                            }
                            k(sb, field, FastJsonResponse.f(field, hashMap));
                            break;
                        case 11:
                            throw new IllegalArgumentException("Method does not accept concrete type.");
                        default:
                            throw new IllegalArgumentException("Unknown field out type = " + i2);
                    }
                } else if (field.D) {
                    sb.append("[");
                    switch (field.C) {
                        case 0:
                            ArrayUtils.f(sb, SafeParcelReader.k(parcel, E2));
                            break;
                        case 1:
                            ArrayUtils.h(sb, SafeParcelReader.d(parcel, E2));
                            break;
                        case 2:
                            ArrayUtils.g(sb, SafeParcelReader.m(parcel, E2));
                            break;
                        case 3:
                            ArrayUtils.e(sb, SafeParcelReader.j(parcel, E2));
                            break;
                        case 4:
                            ArrayUtils.d(sb, SafeParcelReader.i(parcel, E2));
                            break;
                        case 5:
                            ArrayUtils.h(sb, SafeParcelReader.b(parcel, E2));
                            break;
                        case 6:
                            ArrayUtils.i(sb, SafeParcelReader.e(parcel, E2));
                            break;
                        case 7:
                            ArrayUtils.j(sb, SafeParcelReader.r(parcel, E2));
                            break;
                        case 8:
                        case 9:
                        case 10:
                            throw new UnsupportedOperationException("List of type BASE64, BASE64_URL_SAFE, or STRING_MAP is not supported");
                        case 11:
                            Parcel[] o2 = SafeParcelReader.o(parcel, E2);
                            int length = o2.length;
                            for (int i3 = 0; i3 < length; i3++) {
                                if (i3 > 0) {
                                    sb.append(",");
                                }
                                o2[i3].setDataPosition(0);
                                i(sb, field.m0(), o2[i3]);
                            }
                            break;
                        default:
                            throw new IllegalStateException("Unknown field type out.");
                    }
                    sb.append("]");
                } else {
                    switch (field.C) {
                        case 0:
                            sb.append(SafeParcelReader.G(parcel, E2));
                            break;
                        case 1:
                            sb.append(SafeParcelReader.c(parcel, E2));
                            break;
                        case 2:
                            sb.append(SafeParcelReader.J(parcel, E2));
                            break;
                        case 3:
                            sb.append(SafeParcelReader.C(parcel, E2));
                            break;
                        case 4:
                            sb.append(SafeParcelReader.A(parcel, E2));
                            break;
                        case 5:
                            sb.append(SafeParcelReader.a(parcel, E2));
                            break;
                        case 6:
                            sb.append(SafeParcelReader.x(parcel, E2));
                            break;
                        case 7:
                            String q2 = SafeParcelReader.q(parcel, E2);
                            sb.append("\"");
                            sb.append(JsonUtils.a(q2));
                            sb.append("\"");
                            break;
                        case 8:
                            byte[] g2 = SafeParcelReader.g(parcel, E2);
                            sb.append("\"");
                            sb.append(Base64Utils.a(g2));
                            sb.append("\"");
                            break;
                        case 9:
                            byte[] g3 = SafeParcelReader.g(parcel, E2);
                            sb.append("\"");
                            sb.append(Base64Utils.b(g3));
                            sb.append("\"");
                            break;
                        case 10:
                            Bundle f3 = SafeParcelReader.f(parcel, E2);
                            Set<String> keySet = f3.keySet();
                            sb.append("{");
                            boolean z3 = true;
                            for (String next2 : keySet) {
                                if (!z3) {
                                    sb.append(",");
                                }
                                sb.append("\"");
                                sb.append(next2);
                                sb.append("\":\"");
                                sb.append(JsonUtils.a(f3.getString(next2)));
                                sb.append("\"");
                                z3 = false;
                            }
                            sb.append("}");
                            break;
                        case 11:
                            Parcel n2 = SafeParcelReader.n(parcel, E2);
                            n2.setDataPosition(0);
                            i(sb, field.m0(), n2);
                            break;
                        default:
                            throw new IllegalStateException("Unknown field type out");
                    }
                }
                z2 = true;
            }
        }
        if (parcel.dataPosition() == N) {
            sb.append('}');
            return;
        }
        throw new SafeParcelReader.ParseException("Overread allowed size end=" + N, parcel);
    }

    public final String toString() {
        Preconditions.n(this.C, "Cannot convert to JSON on client side.");
        Parcel h2 = h();
        h2.setDataPosition(0);
        StringBuilder sb = new StringBuilder(100);
        i(sb, (Map) Preconditions.m(this.C.Q((String) Preconditions.m(this.D))), h2);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int i3 = this.f25092z;
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.n(parcel, 1, i3);
        SafeParcelWriter.u(parcel, 2, h(), false);
        int i4 = this.f25091B;
        SafeParcelWriter.v(parcel, 3, i4 != 0 ? i4 != 1 ? this.C : this.C : null, i2, false);
        SafeParcelWriter.b(parcel, a2);
    }
}
