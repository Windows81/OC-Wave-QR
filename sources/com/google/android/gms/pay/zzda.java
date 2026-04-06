package com.google.android.gms.pay;

import android.os.Parcelable;

public final class zzda implements Parcelable.Creator {
    /* JADX WARNING: type inference failed for: r1v3, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r1v4, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r1v5, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r1v6, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r13) {
        /*
            r12 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.N(r13)
            r1 = 0
            r2 = 0
            r5 = r1
            r6 = r5
            r7 = r6
            r8 = r7
            r9 = r8
            r10 = r9
            r11 = r10
            r4 = r2
        L_0x000e:
            int r1 = r13.dataPosition()
            if (r1 >= r0) goto L_0x005f
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.E(r13)
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.w(r1)
            switch(r2) {
                case 1: goto L_0x005a;
                case 2: goto L_0x0055;
                case 3: goto L_0x004b;
                case 4: goto L_0x0041;
                case 5: goto L_0x003c;
                case 6: goto L_0x0037;
                case 7: goto L_0x002d;
                case 8: goto L_0x0023;
                default: goto L_0x001f;
            }
        L_0x001f:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.M(r13, r1)
            goto L_0x000e
        L_0x0023:
            android.os.Parcelable$Creator<com.google.android.gms.pay.zzdb> r2 = com.google.android.gms.pay.zzdb.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.p(r13, r1, r2)
            r11 = r1
            com.google.android.gms.pay.zzdb r11 = (com.google.android.gms.pay.zzdb) r11
            goto L_0x000e
        L_0x002d:
            android.os.Parcelable$Creator r2 = android.app.PendingIntent.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.p(r13, r1, r2)
            r10 = r1
            android.app.PendingIntent r10 = (android.app.PendingIntent) r10
            goto L_0x000e
        L_0x0037:
            java.lang.String r9 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.q(r13, r1)
            goto L_0x000e
        L_0x003c:
            java.lang.String r8 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.q(r13, r1)
            goto L_0x000e
        L_0x0041:
            android.os.Parcelable$Creator r2 = android.graphics.Bitmap.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.p(r13, r1, r2)
            r7 = r1
            android.graphics.Bitmap r7 = (android.graphics.Bitmap) r7
            goto L_0x000e
        L_0x004b:
            android.os.Parcelable$Creator r2 = android.graphics.Bitmap.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.p(r13, r1, r2)
            r6 = r1
            android.graphics.Bitmap r6 = (android.graphics.Bitmap) r6
            goto L_0x000e
        L_0x0055:
            java.lang.String r5 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.q(r13, r1)
            goto L_0x000e
        L_0x005a:
            int r4 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.G(r13, r1)
            goto L_0x000e
        L_0x005f:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.v(r13, r0)
            com.google.android.gms.pay.zzcz r13 = new com.google.android.gms.pay.zzcz
            r3 = r13
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.pay.zzda.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new zzcz[i2];
    }
}
