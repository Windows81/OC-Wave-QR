package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable;
import com.google.android.gms.auth.api.signin.internal.HashAccumulator;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Deprecated
public class GoogleSignInOptions extends AbstractSafeParcelable implements Api.ApiOptions.Optional, ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInOptions> CREATOR = new zae();
    public static final GoogleSignInOptions K;
    public static final GoogleSignInOptions L;
    public static final Scope M = new Scope("profile");
    public static final Scope N = new Scope("email");
    public static final Scope O = new Scope("openid");
    public static final Scope P;
    public static final Scope Q = new Scope("https://www.googleapis.com/auth/games");
    public static final Comparator R = new zac();

    /* renamed from: A  reason: collision with root package name */
    public final ArrayList f24326A;

    /* renamed from: B  reason: collision with root package name */
    public Account f24327B;
    public boolean C;
    public final boolean D;
    public final boolean E;
    public String F;
    public String G;
    public ArrayList H;
    public String I;
    public Map J;

    /* renamed from: z  reason: collision with root package name */
    public final int f24328z;

    public static final class Builder {

        /* renamed from: a  reason: collision with root package name */
        public Set f24329a = new HashSet();

        /* renamed from: b  reason: collision with root package name */
        public boolean f24330b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f24331c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f24332d;

        /* renamed from: e  reason: collision with root package name */
        public String f24333e;

        /* renamed from: f  reason: collision with root package name */
        public Account f24334f;

        /* renamed from: g  reason: collision with root package name */
        public String f24335g;

        /* renamed from: h  reason: collision with root package name */
        public Map f24336h = new HashMap();

        /* renamed from: i  reason: collision with root package name */
        public String f24337i;

        public GoogleSignInOptions a() {
            if (this.f24329a.contains(GoogleSignInOptions.Q)) {
                Set set = this.f24329a;
                Scope scope = GoogleSignInOptions.P;
                if (set.contains(scope)) {
                    this.f24329a.remove(scope);
                }
            }
            if (this.f24332d && (this.f24334f == null || !this.f24329a.isEmpty())) {
                b();
            }
            return new GoogleSignInOptions(3, new ArrayList(this.f24329a), this.f24334f, this.f24332d, this.f24330b, this.f24331c, this.f24333e, this.f24335g, this.f24336h, this.f24337i, (zad) null);
        }

        public Builder b() {
            this.f24329a.add(GoogleSignInOptions.O);
            return this;
        }

        public Builder c() {
            this.f24329a.add(GoogleSignInOptions.M);
            return this;
        }

        public Builder d(Scope scope, Scope... scopeArr) {
            this.f24329a.add(scope);
            this.f24329a.addAll(Arrays.asList(scopeArr));
            return this;
        }
    }

    static {
        Scope scope = new Scope("https://www.googleapis.com/auth/games_lite");
        P = scope;
        Builder builder = new Builder();
        builder.b();
        builder.c();
        K = builder.a();
        Builder builder2 = new Builder();
        builder2.d(scope, new Scope[0]);
        L = builder2.a();
    }

    public /* synthetic */ GoogleSignInOptions(int i2, ArrayList arrayList, Account account, boolean z2, boolean z3, boolean z4, String str, String str2, Map map, String str3, zad zad) {
        this(3, arrayList, account, z2, z3, z4, str, str2, map, str3);
    }

    public static Map A0(List list) {
        HashMap hashMap = new HashMap();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                GoogleSignInOptionsExtensionParcelable googleSignInOptionsExtensionParcelable = (GoogleSignInOptionsExtensionParcelable) it.next();
                hashMap.put(Integer.valueOf(googleSignInOptionsExtensionParcelable.H()), googleSignInOptionsExtensionParcelable);
            }
        }
        return hashMap;
    }

    public Account F() {
        return this.f24327B;
    }

    public ArrayList H() {
        return this.H;
    }

    public String Q() {
        return this.I;
    }

    public ArrayList S() {
        return new ArrayList(this.f24326A);
    }

    public String X() {
        return this.F;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0048, code lost:
        if (r1.equals(r4.F()) != false) goto L_0x004a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L_0x0004
            return r0
        L_0x0004:
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r4 = (com.google.android.gms.auth.api.signin.GoogleSignInOptions) r4     // Catch:{ ClassCastException -> 0x0090 }
            java.util.ArrayList r1 = r3.H     // Catch:{ ClassCastException -> 0x0090 }
            boolean r1 = r1.isEmpty()     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 == 0) goto L_0x0090
            java.util.ArrayList r1 = r4.H     // Catch:{ ClassCastException -> 0x0090 }
            boolean r1 = r1.isEmpty()     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 != 0) goto L_0x0018
            goto L_0x0090
        L_0x0018:
            java.util.ArrayList r1 = r3.f24326A     // Catch:{ ClassCastException -> 0x0090 }
            int r1 = r1.size()     // Catch:{ ClassCastException -> 0x0090 }
            java.util.ArrayList r2 = r4.S()     // Catch:{ ClassCastException -> 0x0090 }
            int r2 = r2.size()     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 != r2) goto L_0x0090
            java.util.ArrayList r1 = r3.f24326A     // Catch:{ ClassCastException -> 0x0090 }
            java.util.ArrayList r2 = r4.S()     // Catch:{ ClassCastException -> 0x0090 }
            boolean r1 = r1.containsAll(r2)     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 != 0) goto L_0x0035
            goto L_0x0090
        L_0x0035:
            android.accounts.Account r1 = r3.f24327B     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 != 0) goto L_0x0040
            android.accounts.Account r1 = r4.F()     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 != 0) goto L_0x0090
            goto L_0x004a
        L_0x0040:
            android.accounts.Account r2 = r4.F()     // Catch:{ ClassCastException -> 0x0090 }
            boolean r1 = r1.equals(r2)     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 == 0) goto L_0x0090
        L_0x004a:
            java.lang.String r1 = r3.F     // Catch:{ ClassCastException -> 0x0090 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 == 0) goto L_0x005d
            java.lang.String r1 = r4.X()     // Catch:{ ClassCastException -> 0x0090 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 == 0) goto L_0x0090
            goto L_0x006a
        L_0x005d:
            java.lang.String r1 = r3.F     // Catch:{ ClassCastException -> 0x0090 }
            java.lang.String r2 = r4.X()     // Catch:{ ClassCastException -> 0x0090 }
            boolean r1 = r1.equals(r2)     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 != 0) goto L_0x006a
            goto L_0x0090
        L_0x006a:
            boolean r1 = r3.E     // Catch:{ ClassCastException -> 0x0090 }
            boolean r2 = r4.f0()     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 != r2) goto L_0x0090
            boolean r1 = r3.C     // Catch:{ ClassCastException -> 0x0090 }
            boolean r2 = r4.m0()     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 != r2) goto L_0x0090
            boolean r1 = r3.D     // Catch:{ ClassCastException -> 0x0090 }
            boolean r2 = r4.o0()     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 != r2) goto L_0x0090
            java.lang.String r1 = r3.I     // Catch:{ ClassCastException -> 0x0090 }
            java.lang.String r4 = r4.Q()     // Catch:{ ClassCastException -> 0x0090 }
            boolean r4 = android.text.TextUtils.equals(r1, r4)     // Catch:{ ClassCastException -> 0x0090 }
            if (r4 == 0) goto L_0x0090
            r4 = 1
            return r4
        L_0x0090:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.signin.GoogleSignInOptions.equals(java.lang.Object):boolean");
    }

    public boolean f0() {
        return this.E;
    }

    public int hashCode() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f24326A;
        int size = arrayList2.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(((Scope) arrayList2.get(i2)).H());
        }
        Collections.sort(arrayList);
        HashAccumulator hashAccumulator = new HashAccumulator();
        hashAccumulator.a(arrayList);
        hashAccumulator.a(this.f24327B);
        hashAccumulator.a(this.F);
        hashAccumulator.c(this.E);
        hashAccumulator.c(this.C);
        hashAccumulator.c(this.D);
        hashAccumulator.a(this.I);
        return hashAccumulator.b();
    }

    public boolean m0() {
        return this.C;
    }

    public boolean o0() {
        return this.D;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int i3 = this.f24328z;
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.n(parcel, 1, i3);
        SafeParcelWriter.A(parcel, 2, S(), false);
        SafeParcelWriter.v(parcel, 3, F(), i2, false);
        SafeParcelWriter.c(parcel, 4, m0());
        SafeParcelWriter.c(parcel, 5, o0());
        SafeParcelWriter.c(parcel, 6, f0());
        SafeParcelWriter.w(parcel, 7, X(), false);
        SafeParcelWriter.w(parcel, 8, this.G, false);
        SafeParcelWriter.A(parcel, 9, H(), false);
        SafeParcelWriter.w(parcel, 10, Q(), false);
        SafeParcelWriter.b(parcel, a2);
    }

    public GoogleSignInOptions(int i2, ArrayList arrayList, Account account, boolean z2, boolean z3, boolean z4, String str, String str2, ArrayList arrayList2, String str3) {
        this(i2, arrayList, account, z2, z3, z4, str, str2, A0(arrayList2), str3);
    }

    public GoogleSignInOptions(int i2, ArrayList arrayList, Account account, boolean z2, boolean z3, boolean z4, String str, String str2, Map map, String str3) {
        this.f24328z = i2;
        this.f24326A = arrayList;
        this.f24327B = account;
        this.C = z2;
        this.D = z3;
        this.E = z4;
        this.F = str;
        this.G = str2;
        this.H = new ArrayList(map.values());
        this.J = map;
        this.I = str3;
    }
}
