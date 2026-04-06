package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class Status extends AbstractSafeParcelable implements Result, ReflectedParcelable {
    public static final Parcelable.Creator<Status> CREATOR = new zzb();
    public static final Status D = new Status(-1);
    public static final Status E = new Status(0);
    public static final Status F = new Status(14);
    public static final Status G = new Status(8);
    public static final Status H = new Status(15);
    public static final Status I = new Status(16);
    public static final Status J = new Status(18);
    public static final Status K = new Status(17);

    /* renamed from: A  reason: collision with root package name */
    public final String f24448A;

    /* renamed from: B  reason: collision with root package name */
    public final PendingIntent f24449B;
    public final ConnectionResult C;

    /* renamed from: z  reason: collision with root package name */
    public final int f24450z;

    public Status(int i2, String str, PendingIntent pendingIntent, ConnectionResult connectionResult) {
        this.f24450z = i2;
        this.f24448A = str;
        this.f24449B = pendingIntent;
        this.C = connectionResult;
    }

    public Status A() {
        return this;
    }

    public void A0(Activity activity, int i2) {
        if (f0()) {
            PendingIntent pendingIntent = this.f24449B;
            Preconditions.m(pendingIntent);
            activity.startIntentSenderForResult(pendingIntent.getIntentSender(), i2, (Intent) null, 0, 0, 0);
        }
    }

    public final String G0() {
        String str = this.f24448A;
        return str != null ? str : CommonStatusCodes.a(this.f24450z);
    }

    public ConnectionResult H() {
        return this.C;
    }

    public PendingIntent Q() {
        return this.f24449B;
    }

    public int S() {
        return this.f24450z;
    }

    public String X() {
        return this.f24448A;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.f24450z == status.f24450z && Objects.a(this.f24448A, status.f24448A) && Objects.a(this.f24449B, status.f24449B) && Objects.a(this.C, status.C);
    }

    public boolean f0() {
        return this.f24449B != null;
    }

    public int hashCode() {
        return Objects.b(Integer.valueOf(this.f24450z), this.f24448A, this.f24449B, this.C);
    }

    public boolean m0() {
        return this.f24450z == 16;
    }

    public boolean o0() {
        return this.f24450z <= 0;
    }

    public String toString() {
        Objects.ToStringHelper c2 = Objects.c(this);
        c2.a("statusCode", G0());
        c2.a("resolution", this.f24449B);
        return c2.toString();
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.n(parcel, 1, S());
        SafeParcelWriter.w(parcel, 2, X(), false);
        SafeParcelWriter.v(parcel, 3, this.f24449B, i2, false);
        SafeParcelWriter.v(parcel, 4, H(), i2, false);
        SafeParcelWriter.b(parcel, a2);
    }

    public Status(int i2) {
        this(i2, (String) null);
    }

    public Status(ConnectionResult connectionResult, String str) {
        this(connectionResult, str, 17);
    }

    public Status(int i2, String str) {
        this(i2, str, (PendingIntent) null);
    }

    public Status(ConnectionResult connectionResult, String str, int i2) {
        this(i2, str, connectionResult.S(), connectionResult);
    }

    public Status(int i2, String str, PendingIntent pendingIntent) {
        this(i2, str, pendingIntent, (ConnectionResult) null);
    }
}
