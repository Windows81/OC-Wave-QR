package com.google.android.gms.common.moduleinstall;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class ModuleInstallStatusUpdate extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ModuleInstallStatusUpdate> CREATOR = new zae();

    /* renamed from: A  reason: collision with root package name */
    public final int f25020A;

    /* renamed from: B  reason: collision with root package name */
    public final Long f25021B;
    public final Long C;
    public final int D;
    public final ProgressInfo E;

    /* renamed from: z  reason: collision with root package name */
    public final int f25022z;

    @Retention(RetentionPolicy.CLASS)
    public @interface InstallState {
    }

    public static class ProgressInfo {

        /* renamed from: a  reason: collision with root package name */
        public final long f25023a;

        /* renamed from: b  reason: collision with root package name */
        public final long f25024b;

        public ProgressInfo(long j2, long j3) {
            Preconditions.p(j3);
            this.f25023a = j2;
            this.f25024b = j3;
        }
    }

    public ModuleInstallStatusUpdate(int i2, int i3, Long l2, Long l3, int i4) {
        this.f25022z = i2;
        this.f25020A = i3;
        this.f25021B = l2;
        this.C = l3;
        this.D = i4;
        this.E = (l2 == null || l3 == null || l3.longValue() == 0) ? null : new ProgressInfo(l2.longValue(), l3.longValue());
    }

    public int H() {
        return this.D;
    }

    public int Q() {
        return this.f25020A;
    }

    public int S() {
        return this.f25022z;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.n(parcel, 1, S());
        SafeParcelWriter.n(parcel, 2, Q());
        SafeParcelWriter.t(parcel, 3, this.f25021B, false);
        SafeParcelWriter.t(parcel, 4, this.C, false);
        SafeParcelWriter.n(parcel, 5, H());
        SafeParcelWriter.b(parcel, a2);
    }
}
