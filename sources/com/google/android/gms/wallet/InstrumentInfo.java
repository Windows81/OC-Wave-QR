package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public final class InstrumentInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<InstrumentInfo> CREATOR = new zzo();

    /* renamed from: A  reason: collision with root package name */
    public String f27270A;

    /* renamed from: B  reason: collision with root package name */
    public int f27271B;

    /* renamed from: z  reason: collision with root package name */
    public String f27272z;

    @Retention(RetentionPolicy.SOURCE)
    public @interface CardClass {
    }

    public InstrumentInfo(String str, String str2, int i2) {
        this.f27272z = str;
        this.f27270A = str2;
        this.f27271B = i2;
    }

    public int H() {
        int i2 = this.f27271B;
        if (i2 == 1 || i2 == 2 || i2 == 3) {
            return i2;
        }
        return 0;
    }

    public String Q() {
        return this.f27270A;
    }

    public String S() {
        return this.f27272z;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.w(parcel, 2, S(), false);
        SafeParcelWriter.w(parcel, 3, Q(), false);
        SafeParcelWriter.n(parcel, 4, H());
        SafeParcelWriter.b(parcel, a2);
    }
}
