package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class GetServiceRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetServiceRequest> CREATOR = new zzn();
    public static final Scope[] N = new Scope[0];
    public static final Feature[] O = new Feature[0];

    /* renamed from: A  reason: collision with root package name */
    public final int f24884A;

    /* renamed from: B  reason: collision with root package name */
    public final int f24885B;
    public String C;
    public IBinder D;
    public Scope[] E;
    public Bundle F;
    public Account G;
    public Feature[] H;
    public Feature[] I;
    public final boolean J;
    public final int K;
    public boolean L;
    public final String M;

    /* renamed from: z  reason: collision with root package name */
    public final int f24886z;

    public GetServiceRequest(int i2, int i3, int i4, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, Feature[] featureArr, Feature[] featureArr2, boolean z2, int i5, boolean z3, String str2) {
        scopeArr = scopeArr == null ? N : scopeArr;
        bundle = bundle == null ? new Bundle() : bundle;
        featureArr = featureArr == null ? O : featureArr;
        featureArr2 = featureArr2 == null ? O : featureArr2;
        this.f24886z = i2;
        this.f24884A = i3;
        this.f24885B = i4;
        if ("com.google.android.gms".equals(str)) {
            this.C = "com.google.android.gms";
        } else {
            this.C = str;
        }
        if (i2 < 2) {
            this.G = iBinder != null ? AccountAccessor.P(IAccountAccessor.Stub.N(iBinder)) : null;
        } else {
            this.D = iBinder;
            this.G = account;
        }
        this.E = scopeArr;
        this.F = bundle;
        this.H = featureArr;
        this.I = featureArr2;
        this.J = z2;
        this.K = i5;
        this.L = z3;
        this.M = str2;
    }

    public final String H() {
        return this.M;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        zzn.a(this, parcel, i2);
    }
}
