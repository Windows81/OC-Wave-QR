package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class zzn implements Parcelable.Creator {
    public static void a(GetServiceRequest getServiceRequest, Parcel parcel, int i2) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.n(parcel, 1, getServiceRequest.f24886z);
        SafeParcelWriter.n(parcel, 2, getServiceRequest.f24884A);
        SafeParcelWriter.n(parcel, 3, getServiceRequest.f24885B);
        SafeParcelWriter.w(parcel, 4, getServiceRequest.C, false);
        SafeParcelWriter.m(parcel, 5, getServiceRequest.D, false);
        SafeParcelWriter.z(parcel, 6, getServiceRequest.E, i2, false);
        SafeParcelWriter.e(parcel, 7, getServiceRequest.F, false);
        SafeParcelWriter.v(parcel, 8, getServiceRequest.G, i2, false);
        SafeParcelWriter.z(parcel, 10, getServiceRequest.H, i2, false);
        SafeParcelWriter.z(parcel, 11, getServiceRequest.I, i2, false);
        SafeParcelWriter.c(parcel, 12, getServiceRequest.J);
        SafeParcelWriter.n(parcel, 13, getServiceRequest.K);
        SafeParcelWriter.c(parcel, 14, getServiceRequest.L);
        SafeParcelWriter.w(parcel, 15, getServiceRequest.H(), false);
        SafeParcelWriter.b(parcel, a2);
    }

    /* JADX WARNING: type inference failed for: r2v3, types: [java.lang.Object[]] */
    /* JADX WARNING: type inference failed for: r2v4, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r2v5, types: [java.lang.Object[]] */
    /* JADX WARNING: type inference failed for: r2v6, types: [java.lang.Object[]] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r23) {
        /*
            r22 = this;
            r0 = r23
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.N(r23)
            com.google.android.gms.common.api.Scope[] r2 = com.google.android.gms.common.internal.GetServiceRequest.N
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            com.google.android.gms.common.Feature[] r4 = com.google.android.gms.common.internal.GetServiceRequest.O
            r5 = 0
            r6 = 0
            r13 = r2
            r14 = r3
            r16 = r4
            r17 = r16
            r11 = r5
            r12 = r11
            r15 = r12
            r21 = r15
            r8 = r6
            r9 = r8
            r10 = r9
            r18 = r10
            r19 = r18
            r20 = r19
        L_0x0025:
            int r2 = r23.dataPosition()
            if (r2 >= r1) goto L_0x0096
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.E(r23)
            int r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.w(r2)
            switch(r3) {
                case 1: goto L_0x0091;
                case 2: goto L_0x008c;
                case 3: goto L_0x0087;
                case 4: goto L_0x0082;
                case 5: goto L_0x007d;
                case 6: goto L_0x0073;
                case 7: goto L_0x006e;
                case 8: goto L_0x0064;
                case 9: goto L_0x0036;
                case 10: goto L_0x0059;
                case 11: goto L_0x004e;
                case 12: goto L_0x0049;
                case 13: goto L_0x0044;
                case 14: goto L_0x003f;
                case 15: goto L_0x003a;
                default: goto L_0x0036;
            }
        L_0x0036:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.M(r0, r2)
            goto L_0x0025
        L_0x003a:
            java.lang.String r21 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.q(r0, r2)
            goto L_0x0025
        L_0x003f:
            boolean r20 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.x(r0, r2)
            goto L_0x0025
        L_0x0044:
            int r19 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.G(r0, r2)
            goto L_0x0025
        L_0x0049:
            boolean r18 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.x(r0, r2)
            goto L_0x0025
        L_0x004e:
            android.os.Parcelable$Creator<com.google.android.gms.common.Feature> r3 = com.google.android.gms.common.Feature.CREATOR
            java.lang.Object[] r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.t(r0, r2, r3)
            r17 = r2
            com.google.android.gms.common.Feature[] r17 = (com.google.android.gms.common.Feature[]) r17
            goto L_0x0025
        L_0x0059:
            android.os.Parcelable$Creator<com.google.android.gms.common.Feature> r3 = com.google.android.gms.common.Feature.CREATOR
            java.lang.Object[] r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.t(r0, r2, r3)
            r16 = r2
            com.google.android.gms.common.Feature[] r16 = (com.google.android.gms.common.Feature[]) r16
            goto L_0x0025
        L_0x0064:
            android.os.Parcelable$Creator r3 = android.accounts.Account.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.p(r0, r2, r3)
            r15 = r2
            android.accounts.Account r15 = (android.accounts.Account) r15
            goto L_0x0025
        L_0x006e:
            android.os.Bundle r14 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.f(r0, r2)
            goto L_0x0025
        L_0x0073:
            android.os.Parcelable$Creator<com.google.android.gms.common.api.Scope> r3 = com.google.android.gms.common.api.Scope.CREATOR
            java.lang.Object[] r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.t(r0, r2, r3)
            r13 = r2
            com.google.android.gms.common.api.Scope[] r13 = (com.google.android.gms.common.api.Scope[]) r13
            goto L_0x0025
        L_0x007d:
            android.os.IBinder r12 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.F(r0, r2)
            goto L_0x0025
        L_0x0082:
            java.lang.String r11 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.q(r0, r2)
            goto L_0x0025
        L_0x0087:
            int r10 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.G(r0, r2)
            goto L_0x0025
        L_0x008c:
            int r9 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.G(r0, r2)
            goto L_0x0025
        L_0x0091:
            int r8 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.G(r0, r2)
            goto L_0x0025
        L_0x0096:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.v(r0, r1)
            com.google.android.gms.common.internal.GetServiceRequest r0 = new com.google.android.gms.common.internal.GetServiceRequest
            r7 = r0
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.zzn.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new GetServiceRequest[i2];
    }
}
