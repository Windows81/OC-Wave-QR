package com.google.android.gms.maps;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.maps.internal.zza;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

public final class GoogleMapOptions extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleMapOptions> CREATOR = new zzab();

    /* renamed from: A  reason: collision with root package name */
    public Boolean f25950A;

    /* renamed from: B  reason: collision with root package name */
    public int f25951B = -1;
    public CameraPosition C;
    public Boolean D;
    public Boolean E;
    public Boolean F;
    public Boolean G;
    public Boolean H;
    public Boolean I;
    public Boolean J;
    public Boolean K;
    public Boolean L;
    public Float M = null;
    public Float N = null;
    public LatLngBounds O = null;
    public Boolean P;
    public Integer Q = null;
    public String R = null;

    /* renamed from: z  reason: collision with root package name */
    public Boolean f25952z;

    public GoogleMapOptions() {
    }

    public static CameraPosition S1(Context context, AttributeSet attributeSet) {
        if (context == null || attributeSet == null) {
            return null;
        }
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, R.styleable.f25960a);
        LatLng latLng = new LatLng((double) (obtainAttributes.hasValue(R.styleable.f25965f) ? obtainAttributes.getFloat(R.styleable.f25965f, 0.0f) : 0.0f), (double) (obtainAttributes.hasValue(R.styleable.f25966g) ? obtainAttributes.getFloat(R.styleable.f25966g, 0.0f) : 0.0f));
        CameraPosition.Builder H2 = CameraPosition.H();
        H2.c(latLng);
        if (obtainAttributes.hasValue(R.styleable.f25968i)) {
            H2.e(obtainAttributes.getFloat(R.styleable.f25968i, 0.0f));
        }
        if (obtainAttributes.hasValue(R.styleable.f25962c)) {
            H2.a(obtainAttributes.getFloat(R.styleable.f25962c, 0.0f));
        }
        if (obtainAttributes.hasValue(R.styleable.f25967h)) {
            H2.d(obtainAttributes.getFloat(R.styleable.f25967h, 0.0f));
        }
        obtainAttributes.recycle();
        return H2.b();
    }

    public static LatLngBounds T1(Context context, AttributeSet attributeSet) {
        if (context == null || attributeSet == null) {
            return null;
        }
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, R.styleable.f25960a);
        Float valueOf = obtainAttributes.hasValue(R.styleable.f25971l) ? Float.valueOf(obtainAttributes.getFloat(R.styleable.f25971l, 0.0f)) : null;
        Float valueOf2 = obtainAttributes.hasValue(R.styleable.f25972m) ? Float.valueOf(obtainAttributes.getFloat(R.styleable.f25972m, 0.0f)) : null;
        Float valueOf3 = obtainAttributes.hasValue(R.styleable.f25969j) ? Float.valueOf(obtainAttributes.getFloat(R.styleable.f25969j, 0.0f)) : null;
        Float valueOf4 = obtainAttributes.hasValue(R.styleable.f25970k) ? Float.valueOf(obtainAttributes.getFloat(R.styleable.f25970k, 0.0f)) : null;
        obtainAttributes.recycle();
        if (valueOf == null || valueOf2 == null || valueOf3 == null || valueOf4 == null) {
            return null;
        }
        return new LatLngBounds(new LatLng((double) valueOf.floatValue(), (double) valueOf2.floatValue()), new LatLng((double) valueOf3.floatValue(), (double) valueOf4.floatValue()));
    }

    public static int U1(Context context, String str) {
        return context.getResources().getIdentifier(str, "attr", context.getPackageName());
    }

    public static GoogleMapOptions f0(Context context, AttributeSet attributeSet) {
        String string;
        if (context == null || attributeSet == null) {
            return null;
        }
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, R.styleable.f25960a);
        GoogleMapOptions googleMapOptions = new GoogleMapOptions();
        if (obtainAttributes.hasValue(R.styleable.f25974o)) {
            googleMapOptions.H1(obtainAttributes.getInt(R.styleable.f25974o, -1));
        }
        if (obtainAttributes.hasValue(R.styleable.f25984y)) {
            googleMapOptions.P1(obtainAttributes.getBoolean(R.styleable.f25984y, false));
        }
        if (obtainAttributes.hasValue(R.styleable.f25983x)) {
            googleMapOptions.O1(obtainAttributes.getBoolean(R.styleable.f25983x, false));
        }
        if (obtainAttributes.hasValue(R.styleable.f25975p)) {
            googleMapOptions.X(obtainAttributes.getBoolean(R.styleable.f25975p, true));
        }
        if (obtainAttributes.hasValue(R.styleable.f25977r)) {
            googleMapOptions.K1(obtainAttributes.getBoolean(R.styleable.f25977r, true));
        }
        if (obtainAttributes.hasValue(R.styleable.f25979t)) {
            googleMapOptions.M1(obtainAttributes.getBoolean(R.styleable.f25979t, true));
        }
        if (obtainAttributes.hasValue(R.styleable.f25978s)) {
            googleMapOptions.L1(obtainAttributes.getBoolean(R.styleable.f25978s, true));
        }
        if (obtainAttributes.hasValue(R.styleable.f25980u)) {
            googleMapOptions.N1(obtainAttributes.getBoolean(R.styleable.f25980u, true));
        }
        if (obtainAttributes.hasValue(R.styleable.f25982w)) {
            googleMapOptions.R1(obtainAttributes.getBoolean(R.styleable.f25982w, true));
        }
        if (obtainAttributes.hasValue(R.styleable.f25981v)) {
            googleMapOptions.Q1(obtainAttributes.getBoolean(R.styleable.f25981v, true));
        }
        if (obtainAttributes.hasValue(R.styleable.f25973n)) {
            googleMapOptions.E1(obtainAttributes.getBoolean(R.styleable.f25973n, false));
        }
        if (obtainAttributes.hasValue(R.styleable.f25976q)) {
            googleMapOptions.G1(obtainAttributes.getBoolean(R.styleable.f25976q, true));
        }
        if (obtainAttributes.hasValue(R.styleable.f25961b)) {
            googleMapOptions.H(obtainAttributes.getBoolean(R.styleable.f25961b, false));
        }
        if (obtainAttributes.hasValue(R.styleable.f25964e)) {
            googleMapOptions.J1(obtainAttributes.getFloat(R.styleable.f25964e, Float.NEGATIVE_INFINITY));
        }
        if (obtainAttributes.hasValue(R.styleable.f25964e)) {
            googleMapOptions.I1(obtainAttributes.getFloat(R.styleable.f25963d, Float.POSITIVE_INFINITY));
        }
        TypedArray obtainAttributes2 = context.getResources().obtainAttributes(attributeSet, new int[]{U1(context, "backgroundColor"), U1(context, "mapId")});
        if (obtainAttributes2.hasValue(0)) {
            googleMapOptions.Q(Integer.valueOf(obtainAttributes2.getColor(0, 0)));
        }
        if (obtainAttributes2.hasValue(1) && (string = obtainAttributes2.getString(1)) != null && !string.isEmpty()) {
            googleMapOptions.F1(string);
        }
        obtainAttributes2.recycle();
        googleMapOptions.q1(T1(context, attributeSet));
        googleMapOptions.S(S1(context, attributeSet));
        obtainAttributes.recycle();
        return googleMapOptions;
    }

    public LatLngBounds A0() {
        return this.O;
    }

    public GoogleMapOptions E1(boolean z2) {
        this.J = Boolean.valueOf(z2);
        return this;
    }

    public GoogleMapOptions F1(String str) {
        this.R = str;
        return this;
    }

    public String G0() {
        return this.R;
    }

    public GoogleMapOptions G1(boolean z2) {
        this.K = Boolean.valueOf(z2);
        return this;
    }

    public GoogleMapOptions H(boolean z2) {
        this.L = Boolean.valueOf(z2);
        return this;
    }

    public GoogleMapOptions H1(int i2) {
        this.f25951B = i2;
        return this;
    }

    public GoogleMapOptions I1(float f2) {
        this.N = Float.valueOf(f2);
        return this;
    }

    public GoogleMapOptions J1(float f2) {
        this.M = Float.valueOf(f2);
        return this;
    }

    public GoogleMapOptions K1(boolean z2) {
        this.I = Boolean.valueOf(z2);
        return this;
    }

    public GoogleMapOptions L1(boolean z2) {
        this.F = Boolean.valueOf(z2);
        return this;
    }

    public GoogleMapOptions M1(boolean z2) {
        this.P = Boolean.valueOf(z2);
        return this;
    }

    public GoogleMapOptions N1(boolean z2) {
        this.H = Boolean.valueOf(z2);
        return this;
    }

    public GoogleMapOptions O1(boolean z2) {
        this.f25950A = Boolean.valueOf(z2);
        return this;
    }

    public GoogleMapOptions P1(boolean z2) {
        this.f25952z = Boolean.valueOf(z2);
        return this;
    }

    public GoogleMapOptions Q(Integer num) {
        this.Q = num;
        return this;
    }

    public GoogleMapOptions Q1(boolean z2) {
        this.D = Boolean.valueOf(z2);
        return this;
    }

    public GoogleMapOptions R1(boolean z2) {
        this.G = Boolean.valueOf(z2);
        return this;
    }

    public GoogleMapOptions S(CameraPosition cameraPosition) {
        this.C = cameraPosition;
        return this;
    }

    public int U0() {
        return this.f25951B;
    }

    public Float W0() {
        return this.N;
    }

    public GoogleMapOptions X(boolean z2) {
        this.E = Boolean.valueOf(z2);
        return this;
    }

    public Float b1() {
        return this.M;
    }

    public Integer m0() {
        return this.Q;
    }

    public CameraPosition o0() {
        return this.C;
    }

    public GoogleMapOptions q1(LatLngBounds latLngBounds) {
        this.O = latLngBounds;
        return this;
    }

    public String toString() {
        return Objects.c(this).a("MapType", Integer.valueOf(this.f25951B)).a("LiteMode", this.J).a("Camera", this.C).a("CompassEnabled", this.E).a("ZoomControlsEnabled", this.D).a("ScrollGesturesEnabled", this.F).a("ZoomGesturesEnabled", this.G).a("TiltGesturesEnabled", this.H).a("RotateGesturesEnabled", this.I).a("ScrollGesturesEnabledDuringRotateOrZoom", this.P).a("MapToolbarEnabled", this.K).a("AmbientEnabled", this.L).a("MinZoomPreference", this.M).a("MaxZoomPreference", this.N).a("BackgroundColor", this.Q).a("LatLngBoundsForCameraTarget", this.O).a("ZOrderOnTop", this.f25952z).a("UseViewLifecycleInFragment", this.f25950A).toString();
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.f(parcel, 2, zza.a(this.f25952z));
        SafeParcelWriter.f(parcel, 3, zza.a(this.f25950A));
        SafeParcelWriter.n(parcel, 4, U0());
        SafeParcelWriter.v(parcel, 5, o0(), i2, false);
        SafeParcelWriter.f(parcel, 6, zza.a(this.D));
        SafeParcelWriter.f(parcel, 7, zza.a(this.E));
        SafeParcelWriter.f(parcel, 8, zza.a(this.F));
        SafeParcelWriter.f(parcel, 9, zza.a(this.G));
        SafeParcelWriter.f(parcel, 10, zza.a(this.H));
        SafeParcelWriter.f(parcel, 11, zza.a(this.I));
        SafeParcelWriter.f(parcel, 12, zza.a(this.J));
        SafeParcelWriter.f(parcel, 14, zza.a(this.K));
        SafeParcelWriter.f(parcel, 15, zza.a(this.L));
        SafeParcelWriter.l(parcel, 16, b1(), false);
        SafeParcelWriter.l(parcel, 17, W0(), false);
        SafeParcelWriter.v(parcel, 18, A0(), i2, false);
        SafeParcelWriter.f(parcel, 19, zza.a(this.P));
        SafeParcelWriter.q(parcel, 20, m0(), false);
        SafeParcelWriter.w(parcel, 21, G0(), false);
        SafeParcelWriter.b(parcel, a2);
    }

    public GoogleMapOptions(byte b2, byte b3, int i2, CameraPosition cameraPosition, byte b4, byte b5, byte b6, byte b7, byte b8, byte b9, byte b10, byte b11, byte b12, Float f2, Float f3, LatLngBounds latLngBounds, byte b13, Integer num, String str) {
        this.f25952z = zza.b(b2);
        this.f25950A = zza.b(b3);
        this.f25951B = i2;
        this.C = cameraPosition;
        this.D = zza.b(b4);
        this.E = zza.b(b5);
        this.F = zza.b(b6);
        this.G = zza.b(b7);
        this.H = zza.b(b8);
        this.I = zza.b(b9);
        this.J = zza.b(b10);
        this.K = zza.b(b11);
        this.L = zza.b(b12);
        this.M = f2;
        this.N = f3;
        this.O = latLngBounds;
        this.P = zza.b(b13);
        this.Q = num;
        this.R = str;
    }
}
