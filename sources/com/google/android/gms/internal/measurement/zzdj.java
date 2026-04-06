package com.google.android.gms.internal.measurement;

import android.os.IBinder;
import android.os.IInterface;

public abstract class zzdj extends zzbx implements zzdk {
    public zzdj() {
        super("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    public static zzdk asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        return queryLocalInterface instanceof zzdk ? (zzdk) queryLocalInterface : new zzdm(iBinder);
    }

    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v9, types: [com.google.android.gms.internal.measurement.zzdl] */
    /* JADX WARNING: type inference failed for: r3v14, types: [com.google.android.gms.internal.measurement.zzdl] */
    /* JADX WARNING: type inference failed for: r3v22, types: [com.google.android.gms.internal.measurement.zzdl] */
    /* JADX WARNING: type inference failed for: r3v28, types: [com.google.android.gms.internal.measurement.zzdl] */
    /* JADX WARNING: type inference failed for: r3v33, types: [com.google.android.gms.internal.measurement.zzdl] */
    /* JADX WARNING: type inference failed for: r3v38, types: [com.google.android.gms.internal.measurement.zzdr] */
    /* JADX WARNING: type inference failed for: r3v43, types: [com.google.android.gms.internal.measurement.zzdl] */
    /* JADX WARNING: type inference failed for: r3v48, types: [com.google.android.gms.internal.measurement.zzdl] */
    /* JADX WARNING: type inference failed for: r3v53, types: [com.google.android.gms.internal.measurement.zzdl] */
    /* JADX WARNING: type inference failed for: r3v58, types: [com.google.android.gms.internal.measurement.zzdl] */
    /* JADX WARNING: type inference failed for: r3v64, types: [com.google.android.gms.internal.measurement.zzdl] */
    /* JADX WARNING: type inference failed for: r3v69, types: [com.google.android.gms.internal.measurement.zzdl] */
    /* JADX WARNING: type inference failed for: r3v76, types: [com.google.android.gms.internal.measurement.zzdq] */
    /* JADX WARNING: type inference failed for: r3v81, types: [com.google.android.gms.internal.measurement.zzdq] */
    /* JADX WARNING: type inference failed for: r3v86, types: [com.google.android.gms.internal.measurement.zzdq] */
    /* JADX WARNING: type inference failed for: r3v91, types: [com.google.android.gms.internal.measurement.zzdl] */
    /* JADX WARNING: type inference failed for: r3v96, types: [com.google.android.gms.internal.measurement.zzdl] */
    /* JADX WARNING: type inference failed for: r3v101, types: [com.google.android.gms.internal.measurement.zzdl] */
    /* JADX WARNING: type inference failed for: r3v106 */
    /* JADX WARNING: type inference failed for: r3v107 */
    /* JADX WARNING: type inference failed for: r3v108 */
    /* JADX WARNING: type inference failed for: r3v109 */
    /* JADX WARNING: type inference failed for: r3v110 */
    /* JADX WARNING: type inference failed for: r3v111 */
    /* JADX WARNING: type inference failed for: r3v112 */
    /* JADX WARNING: type inference failed for: r3v113 */
    /* JADX WARNING: type inference failed for: r3v114 */
    /* JADX WARNING: type inference failed for: r3v115 */
    /* JADX WARNING: type inference failed for: r3v116 */
    /* JADX WARNING: type inference failed for: r3v117 */
    /* JADX WARNING: type inference failed for: r3v118 */
    /* JADX WARNING: type inference failed for: r3v119 */
    /* JADX WARNING: type inference failed for: r3v120 */
    /* JADX WARNING: type inference failed for: r3v121 */
    /* JADX WARNING: type inference failed for: r3v122 */
    /* JADX WARNING: type inference failed for: r3v123 */
    /* JADX WARNING: type inference failed for: r3v124 */
    /* JADX WARNING: type inference failed for: r3v125 */
    /* JADX WARNING: type inference failed for: r3v126 */
    /* JADX WARNING: type inference failed for: r3v127 */
    /* JADX WARNING: type inference failed for: r3v128 */
    /* JADX WARNING: type inference failed for: r3v129 */
    /* JADX WARNING: type inference failed for: r3v130 */
    /* JADX WARNING: type inference failed for: r3v131 */
    /* JADX WARNING: type inference failed for: r3v132 */
    /* JADX WARNING: type inference failed for: r3v133 */
    /* JADX WARNING: type inference failed for: r3v134 */
    /* JADX WARNING: type inference failed for: r3v135 */
    /* JADX WARNING: type inference failed for: r3v136 */
    /* JADX WARNING: type inference failed for: r3v137 */
    /* JADX WARNING: type inference failed for: r3v138 */
    /* JADX WARNING: type inference failed for: r3v139 */
    /* JADX WARNING: type inference failed for: r3v140 */
    /* JADX WARNING: type inference failed for: r3v141 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean J(int r11, android.os.Parcel r12, android.os.Parcel r13, int r14) {
        /*
            r10 = this;
            java.lang.String r1 = "com.google.android.gms.measurement.api.internal.IEventHandlerProxy"
            java.lang.String r2 = "com.google.android.gms.measurement.api.internal.IBundleReceiver"
            r3 = 0
            switch(r11) {
                case 1: goto L_0x04d1;
                case 2: goto L_0x04ad;
                case 3: goto L_0x0473;
                case 4: goto L_0x0452;
                case 5: goto L_0x0426;
                case 6: goto L_0x0402;
                case 7: goto L_0x03f2;
                case 8: goto L_0x03de;
                case 9: goto L_0x03c6;
                case 10: goto L_0x039e;
                case 11: goto L_0x038e;
                case 12: goto L_0x0382;
                case 13: goto L_0x0376;
                case 14: goto L_0x036a;
                case 15: goto L_0x034d;
                case 16: goto L_0x032d;
                case 17: goto L_0x030d;
                case 18: goto L_0x02eb;
                case 19: goto L_0x02cb;
                case 20: goto L_0x02ab;
                case 21: goto L_0x028b;
                case 22: goto L_0x026b;
                case 23: goto L_0x025b;
                case 24: goto L_0x024b;
                case 25: goto L_0x0237;
                case 26: goto L_0x0223;
                case 27: goto L_0x0207;
                case 28: goto L_0x01f3;
                case 29: goto L_0x01df;
                case 30: goto L_0x01cb;
                case 31: goto L_0x019f;
                case 32: goto L_0x0173;
                case 33: goto L_0x014a;
                case 34: goto L_0x012a;
                case 35: goto L_0x010a;
                case 36: goto L_0x00ea;
                case 37: goto L_0x00de;
                case 38: goto L_0x00ba;
                case 39: goto L_0x00ae;
                case 40: goto L_0x008e;
                case 41: goto L_0x0008;
                case 42: goto L_0x007e;
                case 43: goto L_0x0072;
                case 44: goto L_0x005e;
                case 45: goto L_0x004a;
                case 46: goto L_0x002a;
                case 47: goto L_0x0008;
                case 48: goto L_0x001a;
                case 49: goto L_0x000a;
                default: goto L_0x0008;
            }
        L_0x0008:
            r0 = 0
            return r0
        L_0x000a:
            android.os.Parcelable$Creator r1 = android.os.Bundle.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.measurement.zzbw.a(r12, r1)
            android.os.Bundle r1 = (android.os.Bundle) r1
            com.google.android.gms.internal.measurement.zzbw.f(r12)
            r10.setDefaultEventParametersWithBackfill(r1)
            goto L_0x04eb
        L_0x001a:
            android.os.Parcelable$Creator r1 = android.content.Intent.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.measurement.zzbw.a(r12, r1)
            android.content.Intent r1 = (android.content.Intent) r1
            com.google.android.gms.internal.measurement.zzbw.f(r12)
            r10.setSgtmDebugInfo(r1)
            goto L_0x04eb
        L_0x002a:
            android.os.IBinder r1 = r12.readStrongBinder()
            if (r1 != 0) goto L_0x0031
            goto L_0x0042
        L_0x0031:
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.measurement.zzdl
            if (r3 == 0) goto L_0x003d
            r3 = r2
            com.google.android.gms.internal.measurement.zzdl r3 = (com.google.android.gms.internal.measurement.zzdl) r3
            goto L_0x0042
        L_0x003d:
            com.google.android.gms.internal.measurement.zzdn r3 = new com.google.android.gms.internal.measurement.zzdn
            r3.<init>(r1)
        L_0x0042:
            com.google.android.gms.internal.measurement.zzbw.f(r12)
            r10.getSessionId(r3)
            goto L_0x04eb
        L_0x004a:
            android.os.Parcelable$Creator r1 = android.os.Bundle.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.measurement.zzbw.a(r12, r1)
            android.os.Bundle r1 = (android.os.Bundle) r1
            long r2 = r12.readLong()
            com.google.android.gms.internal.measurement.zzbw.f(r12)
            r10.setConsentThirdParty(r1, r2)
            goto L_0x04eb
        L_0x005e:
            android.os.Parcelable$Creator r1 = android.os.Bundle.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.measurement.zzbw.a(r12, r1)
            android.os.Bundle r1 = (android.os.Bundle) r1
            long r2 = r12.readLong()
            com.google.android.gms.internal.measurement.zzbw.f(r12)
            r10.setConsent(r1, r2)
            goto L_0x04eb
        L_0x0072:
            long r1 = r12.readLong()
            com.google.android.gms.internal.measurement.zzbw.f(r12)
            r10.clearMeasurementEnabled(r1)
            goto L_0x04eb
        L_0x007e:
            android.os.Parcelable$Creator r1 = android.os.Bundle.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.measurement.zzbw.a(r12, r1)
            android.os.Bundle r1 = (android.os.Bundle) r1
            com.google.android.gms.internal.measurement.zzbw.f(r12)
            r10.setDefaultEventParameters(r1)
            goto L_0x04eb
        L_0x008e:
            android.os.IBinder r1 = r12.readStrongBinder()
            if (r1 != 0) goto L_0x0095
            goto L_0x00a6
        L_0x0095:
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.measurement.zzdl
            if (r3 == 0) goto L_0x00a1
            r3 = r2
            com.google.android.gms.internal.measurement.zzdl r3 = (com.google.android.gms.internal.measurement.zzdl) r3
            goto L_0x00a6
        L_0x00a1:
            com.google.android.gms.internal.measurement.zzdn r3 = new com.google.android.gms.internal.measurement.zzdn
            r3.<init>(r1)
        L_0x00a6:
            com.google.android.gms.internal.measurement.zzbw.f(r12)
            r10.isDataCollectionEnabled(r3)
            goto L_0x04eb
        L_0x00ae:
            boolean r1 = com.google.android.gms.internal.measurement.zzbw.h(r12)
            com.google.android.gms.internal.measurement.zzbw.f(r12)
            r10.setDataCollectionEnabled(r1)
            goto L_0x04eb
        L_0x00ba:
            android.os.IBinder r1 = r12.readStrongBinder()
            if (r1 != 0) goto L_0x00c1
            goto L_0x00d2
        L_0x00c1:
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.measurement.zzdl
            if (r3 == 0) goto L_0x00cd
            r3 = r2
            com.google.android.gms.internal.measurement.zzdl r3 = (com.google.android.gms.internal.measurement.zzdl) r3
            goto L_0x00d2
        L_0x00cd:
            com.google.android.gms.internal.measurement.zzdn r3 = new com.google.android.gms.internal.measurement.zzdn
            r3.<init>(r1)
        L_0x00d2:
            int r1 = r12.readInt()
            com.google.android.gms.internal.measurement.zzbw.f(r12)
            r10.getTestFlag(r3, r1)
            goto L_0x04eb
        L_0x00de:
            java.util.HashMap r1 = com.google.android.gms.internal.measurement.zzbw.b(r12)
            com.google.android.gms.internal.measurement.zzbw.f(r12)
            r10.initForTests(r1)
            goto L_0x04eb
        L_0x00ea:
            android.os.IBinder r2 = r12.readStrongBinder()
            if (r2 != 0) goto L_0x00f1
            goto L_0x0102
        L_0x00f1:
            android.os.IInterface r1 = r2.queryLocalInterface(r1)
            boolean r3 = r1 instanceof com.google.android.gms.internal.measurement.zzdq
            if (r3 == 0) goto L_0x00fd
            r3 = r1
            com.google.android.gms.internal.measurement.zzdq r3 = (com.google.android.gms.internal.measurement.zzdq) r3
            goto L_0x0102
        L_0x00fd:
            com.google.android.gms.internal.measurement.zzds r3 = new com.google.android.gms.internal.measurement.zzds
            r3.<init>(r2)
        L_0x0102:
            com.google.android.gms.internal.measurement.zzbw.f(r12)
            r10.unregisterOnMeasurementEventListener(r3)
            goto L_0x04eb
        L_0x010a:
            android.os.IBinder r2 = r12.readStrongBinder()
            if (r2 != 0) goto L_0x0111
            goto L_0x0122
        L_0x0111:
            android.os.IInterface r1 = r2.queryLocalInterface(r1)
            boolean r3 = r1 instanceof com.google.android.gms.internal.measurement.zzdq
            if (r3 == 0) goto L_0x011d
            r3 = r1
            com.google.android.gms.internal.measurement.zzdq r3 = (com.google.android.gms.internal.measurement.zzdq) r3
            goto L_0x0122
        L_0x011d:
            com.google.android.gms.internal.measurement.zzds r3 = new com.google.android.gms.internal.measurement.zzds
            r3.<init>(r2)
        L_0x0122:
            com.google.android.gms.internal.measurement.zzbw.f(r12)
            r10.registerOnMeasurementEventListener(r3)
            goto L_0x04eb
        L_0x012a:
            android.os.IBinder r2 = r12.readStrongBinder()
            if (r2 != 0) goto L_0x0131
            goto L_0x0142
        L_0x0131:
            android.os.IInterface r1 = r2.queryLocalInterface(r1)
            boolean r3 = r1 instanceof com.google.android.gms.internal.measurement.zzdq
            if (r3 == 0) goto L_0x013d
            r3 = r1
            com.google.android.gms.internal.measurement.zzdq r3 = (com.google.android.gms.internal.measurement.zzdq) r3
            goto L_0x0142
        L_0x013d:
            com.google.android.gms.internal.measurement.zzds r3 = new com.google.android.gms.internal.measurement.zzds
            r3.<init>(r2)
        L_0x0142:
            com.google.android.gms.internal.measurement.zzbw.f(r12)
            r10.setEventInterceptor(r3)
            goto L_0x04eb
        L_0x014a:
            int r1 = r12.readInt()
            java.lang.String r2 = r12.readString()
            android.os.IBinder r3 = r12.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r3 = com.google.android.gms.dynamic.IObjectWrapper.Stub.N(r3)
            android.os.IBinder r4 = r12.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r4 = com.google.android.gms.dynamic.IObjectWrapper.Stub.N(r4)
            android.os.IBinder r5 = r12.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r5 = com.google.android.gms.dynamic.IObjectWrapper.Stub.N(r5)
            com.google.android.gms.internal.measurement.zzbw.f(r12)
            r0 = r10
            r0.logHealthData(r1, r2, r3, r4, r5)
            goto L_0x04eb
        L_0x0173:
            android.os.Parcelable$Creator r1 = android.os.Bundle.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.measurement.zzbw.a(r12, r1)
            android.os.Bundle r1 = (android.os.Bundle) r1
            android.os.IBinder r4 = r12.readStrongBinder()
            if (r4 != 0) goto L_0x0182
            goto L_0x0193
        L_0x0182:
            android.os.IInterface r2 = r4.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.measurement.zzdl
            if (r3 == 0) goto L_0x018e
            r3 = r2
            com.google.android.gms.internal.measurement.zzdl r3 = (com.google.android.gms.internal.measurement.zzdl) r3
            goto L_0x0193
        L_0x018e:
            com.google.android.gms.internal.measurement.zzdn r3 = new com.google.android.gms.internal.measurement.zzdn
            r3.<init>(r4)
        L_0x0193:
            long r4 = r12.readLong()
            com.google.android.gms.internal.measurement.zzbw.f(r12)
            r10.performAction(r1, r3, r4)
            goto L_0x04eb
        L_0x019f:
            android.os.IBinder r1 = r12.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r1 = com.google.android.gms.dynamic.IObjectWrapper.Stub.N(r1)
            android.os.IBinder r4 = r12.readStrongBinder()
            if (r4 != 0) goto L_0x01ae
            goto L_0x01bf
        L_0x01ae:
            android.os.IInterface r2 = r4.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.measurement.zzdl
            if (r3 == 0) goto L_0x01ba
            r3 = r2
            com.google.android.gms.internal.measurement.zzdl r3 = (com.google.android.gms.internal.measurement.zzdl) r3
            goto L_0x01bf
        L_0x01ba:
            com.google.android.gms.internal.measurement.zzdn r3 = new com.google.android.gms.internal.measurement.zzdn
            r3.<init>(r4)
        L_0x01bf:
            long r4 = r12.readLong()
            com.google.android.gms.internal.measurement.zzbw.f(r12)
            r10.onActivitySaveInstanceState(r1, r3, r4)
            goto L_0x04eb
        L_0x01cb:
            android.os.IBinder r1 = r12.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r1 = com.google.android.gms.dynamic.IObjectWrapper.Stub.N(r1)
            long r2 = r12.readLong()
            com.google.android.gms.internal.measurement.zzbw.f(r12)
            r10.onActivityResumed(r1, r2)
            goto L_0x04eb
        L_0x01df:
            android.os.IBinder r1 = r12.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r1 = com.google.android.gms.dynamic.IObjectWrapper.Stub.N(r1)
            long r2 = r12.readLong()
            com.google.android.gms.internal.measurement.zzbw.f(r12)
            r10.onActivityPaused(r1, r2)
            goto L_0x04eb
        L_0x01f3:
            android.os.IBinder r1 = r12.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r1 = com.google.android.gms.dynamic.IObjectWrapper.Stub.N(r1)
            long r2 = r12.readLong()
            com.google.android.gms.internal.measurement.zzbw.f(r12)
            r10.onActivityDestroyed(r1, r2)
            goto L_0x04eb
        L_0x0207:
            android.os.IBinder r1 = r12.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r1 = com.google.android.gms.dynamic.IObjectWrapper.Stub.N(r1)
            android.os.Parcelable$Creator r2 = android.os.Bundle.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.internal.measurement.zzbw.a(r12, r2)
            android.os.Bundle r2 = (android.os.Bundle) r2
            long r3 = r12.readLong()
            com.google.android.gms.internal.measurement.zzbw.f(r12)
            r10.onActivityCreated(r1, r2, r3)
            goto L_0x04eb
        L_0x0223:
            android.os.IBinder r1 = r12.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r1 = com.google.android.gms.dynamic.IObjectWrapper.Stub.N(r1)
            long r2 = r12.readLong()
            com.google.android.gms.internal.measurement.zzbw.f(r12)
            r10.onActivityStopped(r1, r2)
            goto L_0x04eb
        L_0x0237:
            android.os.IBinder r1 = r12.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r1 = com.google.android.gms.dynamic.IObjectWrapper.Stub.N(r1)
            long r2 = r12.readLong()
            com.google.android.gms.internal.measurement.zzbw.f(r12)
            r10.onActivityStarted(r1, r2)
            goto L_0x04eb
        L_0x024b:
            java.lang.String r1 = r12.readString()
            long r2 = r12.readLong()
            com.google.android.gms.internal.measurement.zzbw.f(r12)
            r10.endAdUnitExposure(r1, r2)
            goto L_0x04eb
        L_0x025b:
            java.lang.String r1 = r12.readString()
            long r2 = r12.readLong()
            com.google.android.gms.internal.measurement.zzbw.f(r12)
            r10.beginAdUnitExposure(r1, r2)
            goto L_0x04eb
        L_0x026b:
            android.os.IBinder r1 = r12.readStrongBinder()
            if (r1 != 0) goto L_0x0272
            goto L_0x0283
        L_0x0272:
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.measurement.zzdl
            if (r3 == 0) goto L_0x027e
            r3 = r2
            com.google.android.gms.internal.measurement.zzdl r3 = (com.google.android.gms.internal.measurement.zzdl) r3
            goto L_0x0283
        L_0x027e:
            com.google.android.gms.internal.measurement.zzdn r3 = new com.google.android.gms.internal.measurement.zzdn
            r3.<init>(r1)
        L_0x0283:
            com.google.android.gms.internal.measurement.zzbw.f(r12)
            r10.generateEventId(r3)
            goto L_0x04eb
        L_0x028b:
            android.os.IBinder r1 = r12.readStrongBinder()
            if (r1 != 0) goto L_0x0292
            goto L_0x02a3
        L_0x0292:
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.measurement.zzdl
            if (r3 == 0) goto L_0x029e
            r3 = r2
            com.google.android.gms.internal.measurement.zzdl r3 = (com.google.android.gms.internal.measurement.zzdl) r3
            goto L_0x02a3
        L_0x029e:
            com.google.android.gms.internal.measurement.zzdn r3 = new com.google.android.gms.internal.measurement.zzdn
            r3.<init>(r1)
        L_0x02a3:
            com.google.android.gms.internal.measurement.zzbw.f(r12)
            r10.getGmpAppId(r3)
            goto L_0x04eb
        L_0x02ab:
            android.os.IBinder r1 = r12.readStrongBinder()
            if (r1 != 0) goto L_0x02b2
            goto L_0x02c3
        L_0x02b2:
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.measurement.zzdl
            if (r3 == 0) goto L_0x02be
            r3 = r2
            com.google.android.gms.internal.measurement.zzdl r3 = (com.google.android.gms.internal.measurement.zzdl) r3
            goto L_0x02c3
        L_0x02be:
            com.google.android.gms.internal.measurement.zzdn r3 = new com.google.android.gms.internal.measurement.zzdn
            r3.<init>(r1)
        L_0x02c3:
            com.google.android.gms.internal.measurement.zzbw.f(r12)
            r10.getAppInstanceId(r3)
            goto L_0x04eb
        L_0x02cb:
            android.os.IBinder r1 = r12.readStrongBinder()
            if (r1 != 0) goto L_0x02d2
            goto L_0x02e3
        L_0x02d2:
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.measurement.zzdl
            if (r3 == 0) goto L_0x02de
            r3 = r2
            com.google.android.gms.internal.measurement.zzdl r3 = (com.google.android.gms.internal.measurement.zzdl) r3
            goto L_0x02e3
        L_0x02de:
            com.google.android.gms.internal.measurement.zzdn r3 = new com.google.android.gms.internal.measurement.zzdn
            r3.<init>(r1)
        L_0x02e3:
            com.google.android.gms.internal.measurement.zzbw.f(r12)
            r10.getCachedAppInstanceId(r3)
            goto L_0x04eb
        L_0x02eb:
            android.os.IBinder r1 = r12.readStrongBinder()
            if (r1 != 0) goto L_0x02f2
            goto L_0x0305
        L_0x02f2:
            java.lang.String r2 = "com.google.android.gms.measurement.api.internal.IStringProvider"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.measurement.zzdr
            if (r3 == 0) goto L_0x0300
            r3 = r2
            com.google.android.gms.internal.measurement.zzdr r3 = (com.google.android.gms.internal.measurement.zzdr) r3
            goto L_0x0305
        L_0x0300:
            com.google.android.gms.internal.measurement.zzdu r3 = new com.google.android.gms.internal.measurement.zzdu
            r3.<init>(r1)
        L_0x0305:
            com.google.android.gms.internal.measurement.zzbw.f(r12)
            r10.setInstanceIdProvider(r3)
            goto L_0x04eb
        L_0x030d:
            android.os.IBinder r1 = r12.readStrongBinder()
            if (r1 != 0) goto L_0x0314
            goto L_0x0325
        L_0x0314:
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.measurement.zzdl
            if (r3 == 0) goto L_0x0320
            r3 = r2
            com.google.android.gms.internal.measurement.zzdl r3 = (com.google.android.gms.internal.measurement.zzdl) r3
            goto L_0x0325
        L_0x0320:
            com.google.android.gms.internal.measurement.zzdn r3 = new com.google.android.gms.internal.measurement.zzdn
            r3.<init>(r1)
        L_0x0325:
            com.google.android.gms.internal.measurement.zzbw.f(r12)
            r10.getCurrentScreenClass(r3)
            goto L_0x04eb
        L_0x032d:
            android.os.IBinder r1 = r12.readStrongBinder()
            if (r1 != 0) goto L_0x0334
            goto L_0x0345
        L_0x0334:
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.measurement.zzdl
            if (r3 == 0) goto L_0x0340
            r3 = r2
            com.google.android.gms.internal.measurement.zzdl r3 = (com.google.android.gms.internal.measurement.zzdl) r3
            goto L_0x0345
        L_0x0340:
            com.google.android.gms.internal.measurement.zzdn r3 = new com.google.android.gms.internal.measurement.zzdn
            r3.<init>(r1)
        L_0x0345:
            com.google.android.gms.internal.measurement.zzbw.f(r12)
            r10.getCurrentScreenName(r3)
            goto L_0x04eb
        L_0x034d:
            android.os.IBinder r1 = r12.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r1 = com.google.android.gms.dynamic.IObjectWrapper.Stub.N(r1)
            java.lang.String r2 = r12.readString()
            java.lang.String r3 = r12.readString()
            long r4 = r12.readLong()
            com.google.android.gms.internal.measurement.zzbw.f(r12)
            r0 = r10
            r0.setCurrentScreen(r1, r2, r3, r4)
            goto L_0x04eb
        L_0x036a:
            long r1 = r12.readLong()
            com.google.android.gms.internal.measurement.zzbw.f(r12)
            r10.setSessionTimeoutDuration(r1)
            goto L_0x04eb
        L_0x0376:
            long r1 = r12.readLong()
            com.google.android.gms.internal.measurement.zzbw.f(r12)
            r10.setMinimumSessionDuration(r1)
            goto L_0x04eb
        L_0x0382:
            long r1 = r12.readLong()
            com.google.android.gms.internal.measurement.zzbw.f(r12)
            r10.resetAnalyticsData(r1)
            goto L_0x04eb
        L_0x038e:
            boolean r1 = com.google.android.gms.internal.measurement.zzbw.h(r12)
            long r2 = r12.readLong()
            com.google.android.gms.internal.measurement.zzbw.f(r12)
            r10.setMeasurementEnabled(r1, r2)
            goto L_0x04eb
        L_0x039e:
            java.lang.String r1 = r12.readString()
            java.lang.String r4 = r12.readString()
            android.os.IBinder r5 = r12.readStrongBinder()
            if (r5 != 0) goto L_0x03ad
            goto L_0x03be
        L_0x03ad:
            android.os.IInterface r2 = r5.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.measurement.zzdl
            if (r3 == 0) goto L_0x03b9
            r3 = r2
            com.google.android.gms.internal.measurement.zzdl r3 = (com.google.android.gms.internal.measurement.zzdl) r3
            goto L_0x03be
        L_0x03b9:
            com.google.android.gms.internal.measurement.zzdn r3 = new com.google.android.gms.internal.measurement.zzdn
            r3.<init>(r5)
        L_0x03be:
            com.google.android.gms.internal.measurement.zzbw.f(r12)
            r10.getConditionalUserProperties(r1, r4, r3)
            goto L_0x04eb
        L_0x03c6:
            java.lang.String r1 = r12.readString()
            java.lang.String r2 = r12.readString()
            android.os.Parcelable$Creator r3 = android.os.Bundle.CREATOR
            android.os.Parcelable r3 = com.google.android.gms.internal.measurement.zzbw.a(r12, r3)
            android.os.Bundle r3 = (android.os.Bundle) r3
            com.google.android.gms.internal.measurement.zzbw.f(r12)
            r10.clearConditionalUserProperty(r1, r2, r3)
            goto L_0x04eb
        L_0x03de:
            android.os.Parcelable$Creator r1 = android.os.Bundle.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.measurement.zzbw.a(r12, r1)
            android.os.Bundle r1 = (android.os.Bundle) r1
            long r2 = r12.readLong()
            com.google.android.gms.internal.measurement.zzbw.f(r12)
            r10.setConditionalUserProperty(r1, r2)
            goto L_0x04eb
        L_0x03f2:
            java.lang.String r1 = r12.readString()
            long r2 = r12.readLong()
            com.google.android.gms.internal.measurement.zzbw.f(r12)
            r10.setUserId(r1, r2)
            goto L_0x04eb
        L_0x0402:
            java.lang.String r1 = r12.readString()
            android.os.IBinder r4 = r12.readStrongBinder()
            if (r4 != 0) goto L_0x040d
            goto L_0x041e
        L_0x040d:
            android.os.IInterface r2 = r4.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.measurement.zzdl
            if (r3 == 0) goto L_0x0419
            r3 = r2
            com.google.android.gms.internal.measurement.zzdl r3 = (com.google.android.gms.internal.measurement.zzdl) r3
            goto L_0x041e
        L_0x0419:
            com.google.android.gms.internal.measurement.zzdn r3 = new com.google.android.gms.internal.measurement.zzdn
            r3.<init>(r4)
        L_0x041e:
            com.google.android.gms.internal.measurement.zzbw.f(r12)
            r10.getMaxUserProperties(r1, r3)
            goto L_0x04eb
        L_0x0426:
            java.lang.String r1 = r12.readString()
            java.lang.String r4 = r12.readString()
            boolean r5 = com.google.android.gms.internal.measurement.zzbw.h(r12)
            android.os.IBinder r6 = r12.readStrongBinder()
            if (r6 != 0) goto L_0x0439
            goto L_0x044a
        L_0x0439:
            android.os.IInterface r2 = r6.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.measurement.zzdl
            if (r3 == 0) goto L_0x0445
            r3 = r2
            com.google.android.gms.internal.measurement.zzdl r3 = (com.google.android.gms.internal.measurement.zzdl) r3
            goto L_0x044a
        L_0x0445:
            com.google.android.gms.internal.measurement.zzdn r3 = new com.google.android.gms.internal.measurement.zzdn
            r3.<init>(r6)
        L_0x044a:
            com.google.android.gms.internal.measurement.zzbw.f(r12)
            r10.getUserProperties(r1, r4, r5, r3)
            goto L_0x04eb
        L_0x0452:
            java.lang.String r1 = r12.readString()
            java.lang.String r2 = r12.readString()
            android.os.IBinder r3 = r12.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r3 = com.google.android.gms.dynamic.IObjectWrapper.Stub.N(r3)
            boolean r4 = com.google.android.gms.internal.measurement.zzbw.h(r12)
            long r5 = r12.readLong()
            com.google.android.gms.internal.measurement.zzbw.f(r12)
            r0 = r10
            r0.setUserProperty(r1, r2, r3, r4, r5)
            goto L_0x04eb
        L_0x0473:
            java.lang.String r1 = r12.readString()
            java.lang.String r4 = r12.readString()
            android.os.Parcelable$Creator r5 = android.os.Bundle.CREATOR
            android.os.Parcelable r5 = com.google.android.gms.internal.measurement.zzbw.a(r12, r5)
            android.os.Bundle r5 = (android.os.Bundle) r5
            android.os.IBinder r6 = r12.readStrongBinder()
            if (r6 != 0) goto L_0x048b
            r6 = r3
            goto L_0x049d
        L_0x048b:
            android.os.IInterface r2 = r6.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.measurement.zzdl
            if (r3 == 0) goto L_0x0497
            com.google.android.gms.internal.measurement.zzdl r2 = (com.google.android.gms.internal.measurement.zzdl) r2
        L_0x0495:
            r6 = r2
            goto L_0x049d
        L_0x0497:
            com.google.android.gms.internal.measurement.zzdn r2 = new com.google.android.gms.internal.measurement.zzdn
            r2.<init>(r6)
            goto L_0x0495
        L_0x049d:
            long r8 = r12.readLong()
            com.google.android.gms.internal.measurement.zzbw.f(r12)
            r0 = r10
            r2 = r4
            r3 = r5
            r4 = r6
            r5 = r8
            r0.logEventAndBundle(r1, r2, r3, r4, r5)
            goto L_0x04eb
        L_0x04ad:
            java.lang.String r1 = r12.readString()
            java.lang.String r2 = r12.readString()
            android.os.Parcelable$Creator r3 = android.os.Bundle.CREATOR
            android.os.Parcelable r3 = com.google.android.gms.internal.measurement.zzbw.a(r12, r3)
            android.os.Bundle r3 = (android.os.Bundle) r3
            boolean r4 = com.google.android.gms.internal.measurement.zzbw.h(r12)
            boolean r5 = com.google.android.gms.internal.measurement.zzbw.h(r12)
            long r6 = r12.readLong()
            com.google.android.gms.internal.measurement.zzbw.f(r12)
            r0 = r10
            r0.logEvent(r1, r2, r3, r4, r5, r6)
            goto L_0x04eb
        L_0x04d1:
            android.os.IBinder r1 = r12.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r1 = com.google.android.gms.dynamic.IObjectWrapper.Stub.N(r1)
            android.os.Parcelable$Creator<com.google.android.gms.internal.measurement.zzdt> r2 = com.google.android.gms.internal.measurement.zzdt.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.internal.measurement.zzbw.a(r12, r2)
            com.google.android.gms.internal.measurement.zzdt r2 = (com.google.android.gms.internal.measurement.zzdt) r2
            long r3 = r12.readLong()
            com.google.android.gms.internal.measurement.zzbw.f(r12)
            r10.initialize(r1, r2, r3)
        L_0x04eb:
            r13.writeNoException()
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzdj.J(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
