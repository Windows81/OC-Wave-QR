package com.google.android.gms.dynamic;

import android.content.Intent;
import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.common.zzb;
import com.google.android.gms.internal.common.zzc;
import com.google.api.Service;

public interface IFragmentWrapper extends IInterface {

    public static abstract class Stub extends zzb implements IFragmentWrapper {
        public Stub() {
            super("com.google.android.gms.dynamic.IFragmentWrapper");
        }

        public final boolean J(int i2, Parcel parcel, Parcel parcel2, int i3) {
            switch (i2) {
                case 2:
                    IObjectWrapper k2 = k();
                    parcel2.writeNoException();
                    zzc.e(parcel2, k2);
                    return true;
                case 3:
                    Bundle e2 = e();
                    parcel2.writeNoException();
                    zzc.d(parcel2, e2);
                    return true;
                case 4:
                    int b2 = b();
                    parcel2.writeNoException();
                    parcel2.writeInt(b2);
                    return true;
                case 5:
                    IFragmentWrapper g2 = g();
                    parcel2.writeNoException();
                    zzc.e(parcel2, g2);
                    return true;
                case 6:
                    IObjectWrapper i4 = i();
                    parcel2.writeNoException();
                    zzc.e(parcel2, i4);
                    return true;
                case 7:
                    boolean v2 = v();
                    parcel2.writeNoException();
                    ClassLoader classLoader = zzc.f25284a;
                    parcel2.writeInt(v2 ? 1 : 0);
                    return true;
                case 8:
                    String m2 = m();
                    parcel2.writeNoException();
                    parcel2.writeString(m2);
                    return true;
                case 9:
                    IFragmentWrapper h2 = h();
                    parcel2.writeNoException();
                    zzc.e(parcel2, h2);
                    return true;
                case 10:
                    int c2 = c();
                    parcel2.writeNoException();
                    parcel2.writeInt(c2);
                    return true;
                case 11:
                    boolean x2 = x();
                    parcel2.writeNoException();
                    ClassLoader classLoader2 = zzc.f25284a;
                    parcel2.writeInt(x2 ? 1 : 0);
                    return true;
                case 12:
                    IObjectWrapper d2 = d();
                    parcel2.writeNoException();
                    zzc.e(parcel2, d2);
                    return true;
                case 13:
                    boolean I = I();
                    parcel2.writeNoException();
                    ClassLoader classLoader3 = zzc.f25284a;
                    parcel2.writeInt(I ? 1 : 0);
                    return true;
                case 14:
                    boolean L = L();
                    parcel2.writeNoException();
                    ClassLoader classLoader4 = zzc.f25284a;
                    parcel2.writeInt(L ? 1 : 0);
                    return true;
                case 15:
                    boolean C = C();
                    parcel2.writeNoException();
                    ClassLoader classLoader5 = zzc.f25284a;
                    parcel2.writeInt(C ? 1 : 0);
                    return true;
                case 16:
                    boolean G = G();
                    parcel2.writeNoException();
                    ClassLoader classLoader6 = zzc.f25284a;
                    parcel2.writeInt(G ? 1 : 0);
                    return true;
                case 17:
                    boolean y2 = y();
                    parcel2.writeNoException();
                    ClassLoader classLoader7 = zzc.f25284a;
                    parcel2.writeInt(y2 ? 1 : 0);
                    return true;
                case 18:
                    boolean z2 = z();
                    parcel2.writeNoException();
                    ClassLoader classLoader8 = zzc.f25284a;
                    parcel2.writeInt(z2 ? 1 : 0);
                    return true;
                case DescriptorProtos.FieldOptions.TARGETS_FIELD_NUMBER:
                    boolean U2 = U2();
                    parcel2.writeNoException();
                    ClassLoader classLoader9 = zzc.f25284a;
                    parcel2.writeInt(U2 ? 1 : 0);
                    return true;
                case 20:
                    IObjectWrapper N = IObjectWrapper.Stub.N(parcel.readStrongBinder());
                    zzc.b(parcel);
                    Q1(N);
                    parcel2.writeNoException();
                    return true;
                case 21:
                    boolean f2 = zzc.f(parcel);
                    zzc.b(parcel);
                    S(f2);
                    parcel2.writeNoException();
                    return true;
                case 22:
                    boolean f3 = zzc.f(parcel);
                    zzc.b(parcel);
                    i0(f3);
                    parcel2.writeNoException();
                    return true;
                case 23:
                    boolean f4 = zzc.f(parcel);
                    zzc.b(parcel);
                    H0(f4);
                    parcel2.writeNoException();
                    return true;
                case Service.METRICS_FIELD_NUMBER /*24*/:
                    boolean f5 = zzc.f(parcel);
                    zzc.b(parcel);
                    C2(f5);
                    parcel2.writeNoException();
                    return true;
                case Service.MONITORED_RESOURCES_FIELD_NUMBER /*25*/:
                    zzc.b(parcel);
                    R0((Intent) zzc.a(parcel, Intent.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case Service.BILLING_FIELD_NUMBER /*26*/:
                    int readInt = parcel.readInt();
                    zzc.b(parcel);
                    W0((Intent) zzc.a(parcel, Intent.CREATOR), readInt);
                    parcel2.writeNoException();
                    return true;
                case 27:
                    IObjectWrapper N2 = IObjectWrapper.Stub.N(parcel.readStrongBinder());
                    zzc.b(parcel);
                    c2(N2);
                    parcel2.writeNoException();
                    return true;
                default:
                    return false;
            }
        }
    }

    boolean C();

    void C2(boolean z2);

    boolean G();

    void H0(boolean z2);

    boolean I();

    boolean L();

    void Q1(IObjectWrapper iObjectWrapper);

    void R0(Intent intent);

    void S(boolean z2);

    boolean U2();

    void W0(Intent intent, int i2);

    int b();

    int c();

    void c2(IObjectWrapper iObjectWrapper);

    IObjectWrapper d();

    Bundle e();

    IFragmentWrapper g();

    IFragmentWrapper h();

    IObjectWrapper i();

    void i0(boolean z2);

    IObjectWrapper k();

    String m();

    boolean v();

    boolean x();

    boolean y();

    boolean z();
}
