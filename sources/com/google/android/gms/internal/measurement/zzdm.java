package com.google.android.gms.internal.measurement;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

public final class zzdm extends zzbu implements zzdk {
    public zzdm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    public final void beginAdUnitExposure(String str, long j2) {
        Parcel J = J();
        J.writeString(str);
        J.writeLong(j2);
        P(23, J);
    }

    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        Parcel J = J();
        J.writeString(str);
        J.writeString(str2);
        zzbw.d(J, bundle);
        P(9, J);
    }

    public final void clearMeasurementEnabled(long j2) {
        Parcel J = J();
        J.writeLong(j2);
        P(43, J);
    }

    public final void endAdUnitExposure(String str, long j2) {
        Parcel J = J();
        J.writeString(str);
        J.writeLong(j2);
        P(24, J);
    }

    public final void generateEventId(zzdl zzdl) {
        Parcel J = J();
        zzbw.c(J, zzdl);
        P(22, J);
    }

    public final void getAppInstanceId(zzdl zzdl) {
        Parcel J = J();
        zzbw.c(J, zzdl);
        P(20, J);
    }

    public final void getCachedAppInstanceId(zzdl zzdl) {
        Parcel J = J();
        zzbw.c(J, zzdl);
        P(19, J);
    }

    public final void getConditionalUserProperties(String str, String str2, zzdl zzdl) {
        Parcel J = J();
        J.writeString(str);
        J.writeString(str2);
        zzbw.c(J, zzdl);
        P(10, J);
    }

    public final void getCurrentScreenClass(zzdl zzdl) {
        Parcel J = J();
        zzbw.c(J, zzdl);
        P(17, J);
    }

    public final void getCurrentScreenName(zzdl zzdl) {
        Parcel J = J();
        zzbw.c(J, zzdl);
        P(16, J);
    }

    public final void getGmpAppId(zzdl zzdl) {
        Parcel J = J();
        zzbw.c(J, zzdl);
        P(21, J);
    }

    public final void getMaxUserProperties(String str, zzdl zzdl) {
        Parcel J = J();
        J.writeString(str);
        zzbw.c(J, zzdl);
        P(6, J);
    }

    public final void getSessionId(zzdl zzdl) {
        Parcel J = J();
        zzbw.c(J, zzdl);
        P(46, J);
    }

    public final void getTestFlag(zzdl zzdl, int i2) {
        Parcel J = J();
        zzbw.c(J, zzdl);
        J.writeInt(i2);
        P(38, J);
    }

    public final void getUserProperties(String str, String str2, boolean z2, zzdl zzdl) {
        Parcel J = J();
        J.writeString(str);
        J.writeString(str2);
        zzbw.e(J, z2);
        zzbw.c(J, zzdl);
        P(5, J);
    }

    public final void initialize(IObjectWrapper iObjectWrapper, zzdt zzdt, long j2) {
        Parcel J = J();
        zzbw.c(J, iObjectWrapper);
        zzbw.d(J, zzdt);
        J.writeLong(j2);
        P(1, J);
    }

    public final void logEvent(String str, String str2, Bundle bundle, boolean z2, boolean z3, long j2) {
        Parcel J = J();
        J.writeString(str);
        J.writeString(str2);
        zzbw.d(J, bundle);
        zzbw.e(J, z2);
        zzbw.e(J, z3);
        J.writeLong(j2);
        P(2, J);
    }

    public final void logHealthData(int i2, String str, IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) {
        Parcel J = J();
        J.writeInt(i2);
        J.writeString(str);
        zzbw.c(J, iObjectWrapper);
        zzbw.c(J, iObjectWrapper2);
        zzbw.c(J, iObjectWrapper3);
        P(33, J);
    }

    public final void onActivityCreated(IObjectWrapper iObjectWrapper, Bundle bundle, long j2) {
        Parcel J = J();
        zzbw.c(J, iObjectWrapper);
        zzbw.d(J, bundle);
        J.writeLong(j2);
        P(27, J);
    }

    public final void onActivityDestroyed(IObjectWrapper iObjectWrapper, long j2) {
        Parcel J = J();
        zzbw.c(J, iObjectWrapper);
        J.writeLong(j2);
        P(28, J);
    }

    public final void onActivityPaused(IObjectWrapper iObjectWrapper, long j2) {
        Parcel J = J();
        zzbw.c(J, iObjectWrapper);
        J.writeLong(j2);
        P(29, J);
    }

    public final void onActivityResumed(IObjectWrapper iObjectWrapper, long j2) {
        Parcel J = J();
        zzbw.c(J, iObjectWrapper);
        J.writeLong(j2);
        P(30, J);
    }

    public final void onActivitySaveInstanceState(IObjectWrapper iObjectWrapper, zzdl zzdl, long j2) {
        Parcel J = J();
        zzbw.c(J, iObjectWrapper);
        zzbw.c(J, zzdl);
        J.writeLong(j2);
        P(31, J);
    }

    public final void onActivityStarted(IObjectWrapper iObjectWrapper, long j2) {
        Parcel J = J();
        zzbw.c(J, iObjectWrapper);
        J.writeLong(j2);
        P(25, J);
    }

    public final void onActivityStopped(IObjectWrapper iObjectWrapper, long j2) {
        Parcel J = J();
        zzbw.c(J, iObjectWrapper);
        J.writeLong(j2);
        P(26, J);
    }

    public final void performAction(Bundle bundle, zzdl zzdl, long j2) {
        Parcel J = J();
        zzbw.d(J, bundle);
        zzbw.c(J, zzdl);
        J.writeLong(j2);
        P(32, J);
    }

    public final void registerOnMeasurementEventListener(zzdq zzdq) {
        Parcel J = J();
        zzbw.c(J, zzdq);
        P(35, J);
    }

    public final void resetAnalyticsData(long j2) {
        Parcel J = J();
        J.writeLong(j2);
        P(12, J);
    }

    public final void setConditionalUserProperty(Bundle bundle, long j2) {
        Parcel J = J();
        zzbw.d(J, bundle);
        J.writeLong(j2);
        P(8, J);
    }

    public final void setConsent(Bundle bundle, long j2) {
        Parcel J = J();
        zzbw.d(J, bundle);
        J.writeLong(j2);
        P(44, J);
    }

    public final void setConsentThirdParty(Bundle bundle, long j2) {
        Parcel J = J();
        zzbw.d(J, bundle);
        J.writeLong(j2);
        P(45, J);
    }

    public final void setCurrentScreen(IObjectWrapper iObjectWrapper, String str, String str2, long j2) {
        Parcel J = J();
        zzbw.c(J, iObjectWrapper);
        J.writeString(str);
        J.writeString(str2);
        J.writeLong(j2);
        P(15, J);
    }

    public final void setDataCollectionEnabled(boolean z2) {
        Parcel J = J();
        zzbw.e(J, z2);
        P(39, J);
    }

    public final void setDefaultEventParameters(Bundle bundle) {
        Parcel J = J();
        zzbw.d(J, bundle);
        P(42, J);
    }

    public final void setEventInterceptor(zzdq zzdq) {
        Parcel J = J();
        zzbw.c(J, zzdq);
        P(34, J);
    }

    public final void setMeasurementEnabled(boolean z2, long j2) {
        Parcel J = J();
        zzbw.e(J, z2);
        J.writeLong(j2);
        P(11, J);
    }

    public final void setSessionTimeoutDuration(long j2) {
        Parcel J = J();
        J.writeLong(j2);
        P(14, J);
    }

    public final void setSgtmDebugInfo(Intent intent) {
        Parcel J = J();
        zzbw.d(J, intent);
        P(48, J);
    }

    public final void setUserId(String str, long j2) {
        Parcel J = J();
        J.writeString(str);
        J.writeLong(j2);
        P(7, J);
    }

    public final void setUserProperty(String str, String str2, IObjectWrapper iObjectWrapper, boolean z2, long j2) {
        Parcel J = J();
        J.writeString(str);
        J.writeString(str2);
        zzbw.c(J, iObjectWrapper);
        zzbw.e(J, z2);
        J.writeLong(j2);
        P(4, J);
    }

    public final void unregisterOnMeasurementEventListener(zzdq zzdq) {
        Parcel J = J();
        zzbw.c(J, zzdq);
        P(36, J);
    }
}
