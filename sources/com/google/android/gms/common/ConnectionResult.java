package com.google.android.gms.common;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.api.Service;

public final class ConnectionResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ConnectionResult> CREATOR = new zzb();
    public static final ConnectionResult D = new ConnectionResult(0);

    /* renamed from: A  reason: collision with root package name */
    public final int f24376A;

    /* renamed from: B  reason: collision with root package name */
    public final PendingIntent f24377B;
    public final String C;

    /* renamed from: z  reason: collision with root package name */
    public final int f24378z;

    public ConnectionResult(int i2, int i3, PendingIntent pendingIntent, String str) {
        this.f24378z = i2;
        this.f24376A = i3;
        this.f24377B = pendingIntent;
        this.C = str;
    }

    public static String o0(int i2) {
        if (i2 == 99) {
            return "UNFINISHED";
        }
        if (i2 == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i2) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i2) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case 17:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case DescriptorProtos.FieldOptions.TARGETS_FIELD_NUMBER:
                        return "SERVICE_MISSING_PERMISSION";
                    case 20:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    case 22:
                        return "RESOLUTION_ACTIVITY_NOT_FOUND";
                    case 23:
                        return "API_DISABLED";
                    case Service.METRICS_FIELD_NUMBER /*24*/:
                        return "API_DISABLED_FOR_CONNECTION";
                    default:
                        return "UNKNOWN_ERROR_CODE(" + i2 + ")";
                }
        }
    }

    public int H() {
        return this.f24376A;
    }

    public String Q() {
        return this.C;
    }

    public PendingIntent S() {
        return this.f24377B;
    }

    public boolean X() {
        return (this.f24376A == 0 || this.f24377B == null) ? false : true;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ConnectionResult)) {
            return false;
        }
        ConnectionResult connectionResult = (ConnectionResult) obj;
        return this.f24376A == connectionResult.f24376A && Objects.a(this.f24377B, connectionResult.f24377B) && Objects.a(this.C, connectionResult.C);
    }

    public boolean f0() {
        return this.f24376A == 0;
    }

    public int hashCode() {
        return Objects.b(Integer.valueOf(this.f24376A), this.f24377B, this.C);
    }

    public void m0(Activity activity, int i2) {
        if (X()) {
            PendingIntent pendingIntent = this.f24377B;
            Preconditions.m(pendingIntent);
            activity.startIntentSenderForResult(pendingIntent.getIntentSender(), i2, (Intent) null, 0, 0, 0);
        }
    }

    public String toString() {
        Objects.ToStringHelper c2 = Objects.c(this);
        c2.a("statusCode", o0(this.f24376A));
        c2.a("resolution", this.f24377B);
        c2.a("message", this.C);
        return c2.toString();
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int i3 = this.f24378z;
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.n(parcel, 1, i3);
        SafeParcelWriter.n(parcel, 2, H());
        SafeParcelWriter.v(parcel, 3, S(), i2, false);
        SafeParcelWriter.w(parcel, 4, Q(), false);
        SafeParcelWriter.b(parcel, a2);
    }

    public ConnectionResult(int i2) {
        this(i2, (PendingIntent) null, (String) null);
    }

    public ConnectionResult(int i2, PendingIntent pendingIntent) {
        this(i2, pendingIntent, (String) null);
    }

    public ConnectionResult(int i2, PendingIntent pendingIntent, String str) {
        this(1, i2, pendingIntent, str);
    }
}
