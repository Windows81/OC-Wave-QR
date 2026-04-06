package com.google.android.gms.maps;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.maps.internal.zza;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;
import com.google.android.gms.maps.model.StreetViewSource;

public final class StreetViewPanoramaOptions extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<StreetViewPanoramaOptions> CREATOR = new zzap();

    /* renamed from: A  reason: collision with root package name */
    public String f25987A;

    /* renamed from: B  reason: collision with root package name */
    public LatLng f25988B;
    public Integer C;
    public Boolean D;
    public Boolean E;
    public Boolean F;
    public Boolean G;
    public Boolean H;
    public StreetViewSource I = StreetViewSource.f26052A;

    /* renamed from: z  reason: collision with root package name */
    public StreetViewPanoramaCamera f25989z;

    public StreetViewPanoramaOptions(StreetViewPanoramaCamera streetViewPanoramaCamera, String str, LatLng latLng, Integer num, byte b2, byte b3, byte b4, byte b5, byte b6, StreetViewSource streetViewSource) {
        Boolean bool = Boolean.TRUE;
        this.D = bool;
        this.E = bool;
        this.F = bool;
        this.G = bool;
        this.f25989z = streetViewPanoramaCamera;
        this.f25988B = latLng;
        this.C = num;
        this.f25987A = str;
        this.D = zza.b(b2);
        this.E = zza.b(b3);
        this.F = zza.b(b4);
        this.G = zza.b(b5);
        this.H = zza.b(b6);
        this.I = streetViewSource;
    }

    public String H() {
        return this.f25987A;
    }

    public LatLng Q() {
        return this.f25988B;
    }

    public Integer S() {
        return this.C;
    }

    public StreetViewSource X() {
        return this.I;
    }

    public StreetViewPanoramaCamera f0() {
        return this.f25989z;
    }

    public String toString() {
        return Objects.c(this).a("PanoramaId", this.f25987A).a("Position", this.f25988B).a("Radius", this.C).a("Source", this.I).a("StreetViewPanoramaCamera", this.f25989z).a("UserNavigationEnabled", this.D).a("ZoomGesturesEnabled", this.E).a("PanningGesturesEnabled", this.F).a("StreetNamesEnabled", this.G).a("UseViewLifecycleInFragment", this.H).toString();
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.v(parcel, 2, f0(), i2, false);
        SafeParcelWriter.w(parcel, 3, H(), false);
        SafeParcelWriter.v(parcel, 4, Q(), i2, false);
        SafeParcelWriter.q(parcel, 5, S(), false);
        SafeParcelWriter.f(parcel, 6, zza.a(this.D));
        SafeParcelWriter.f(parcel, 7, zza.a(this.E));
        SafeParcelWriter.f(parcel, 8, zza.a(this.F));
        SafeParcelWriter.f(parcel, 9, zza.a(this.G));
        SafeParcelWriter.f(parcel, 10, zza.a(this.H));
        SafeParcelWriter.v(parcel, 11, X(), i2, false);
        SafeParcelWriter.b(parcel, a2);
    }
}
