package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

@Deprecated
public class GoogleSignInAccount extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new zab();
    public static final Clock M = DefaultClock.d();

    /* renamed from: A  reason: collision with root package name */
    public final String f24323A;

    /* renamed from: B  reason: collision with root package name */
    public final String f24324B;
    public final String C;
    public final String D;
    public final Uri E;
    public String F;
    public final long G;
    public final String H;
    public final List I;
    public final String J;
    public final String K;
    public final Set L = new HashSet();

    /* renamed from: z  reason: collision with root package name */
    public final int f24325z;

    public GoogleSignInAccount(int i2, String str, String str2, String str3, String str4, Uri uri, String str5, long j2, String str6, List list, String str7, String str8) {
        this.f24325z = i2;
        this.f24323A = str;
        this.f24324B = str2;
        this.C = str3;
        this.D = str4;
        this.E = uri;
        this.F = str5;
        this.G = j2;
        this.H = str6;
        this.I = list;
        this.J = str7;
        this.K = str8;
    }

    public static GoogleSignInAccount G0(String str, String str2, String str3, String str4, String str5, String str6, Uri uri, Long l2, String str7, Set set) {
        return new GoogleSignInAccount(3, str, str2, str3, str4, uri, (String) null, l2.longValue(), Preconditions.g(str7), new ArrayList((Collection) Preconditions.m(set)), str5, str6);
    }

    public static GoogleSignInAccount U0(String str) {
        String str2 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String optString = jSONObject.optString("photoUrl");
        Uri parse = !TextUtils.isEmpty(optString) ? Uri.parse(optString) : null;
        long parseLong = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i2 = 0; i2 < length; i2++) {
            hashSet.add(new Scope(jSONArray.getString(i2)));
        }
        GoogleSignInAccount G0 = G0(jSONObject.optString("id"), jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null, jSONObject.has("email") ? jSONObject.optString("email") : null, jSONObject.has("displayName") ? jSONObject.optString("displayName") : null, jSONObject.has("givenName") ? jSONObject.optString("givenName") : null, jSONObject.has("familyName") ? jSONObject.optString("familyName") : null, parse, Long.valueOf(parseLong), jSONObject.getString("obfuscatedIdentifier"), hashSet);
        if (jSONObject.has("serverAuthCode")) {
            str2 = jSONObject.optString("serverAuthCode");
        }
        G0.F = str2;
        return G0;
    }

    public String A0() {
        return this.F;
    }

    public Account F() {
        String str = this.C;
        if (str == null) {
            return null;
        }
        return new Account(str, "com.google");
    }

    public String H() {
        return this.D;
    }

    public String Q() {
        return this.C;
    }

    public String S() {
        return this.K;
    }

    public String X() {
        return this.J;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        return googleSignInAccount.H.equals(this.H) && googleSignInAccount.o0().equals(o0());
    }

    public String f0() {
        return this.f24324B;
    }

    public int hashCode() {
        return ((this.H.hashCode() + 527) * 31) + o0().hashCode();
    }

    public String m() {
        return this.f24323A;
    }

    public Uri m0() {
        return this.E;
    }

    public Set o0() {
        HashSet hashSet = new HashSet(this.I);
        hashSet.addAll(this.L);
        return hashSet;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.n(parcel, 1, this.f24325z);
        SafeParcelWriter.w(parcel, 2, m(), false);
        SafeParcelWriter.w(parcel, 3, f0(), false);
        SafeParcelWriter.w(parcel, 4, Q(), false);
        SafeParcelWriter.w(parcel, 5, H(), false);
        SafeParcelWriter.v(parcel, 6, m0(), i2, false);
        SafeParcelWriter.w(parcel, 7, A0(), false);
        SafeParcelWriter.s(parcel, 8, this.G);
        SafeParcelWriter.w(parcel, 9, this.H, false);
        SafeParcelWriter.A(parcel, 10, this.I, false);
        SafeParcelWriter.w(parcel, 11, X(), false);
        SafeParcelWriter.w(parcel, 12, S(), false);
        SafeParcelWriter.b(parcel, a2);
    }
}
