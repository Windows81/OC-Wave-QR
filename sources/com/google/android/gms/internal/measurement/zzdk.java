package com.google.android.gms.internal.measurement;

import android.content.Intent;
import android.os.Bundle;
import android.os.IInterface;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.Map;

public interface zzdk extends IInterface {
    void beginAdUnitExposure(String str, long j2);

    void clearConditionalUserProperty(String str, String str2, Bundle bundle);

    void clearMeasurementEnabled(long j2);

    void endAdUnitExposure(String str, long j2);

    void generateEventId(zzdl zzdl);

    void getAppInstanceId(zzdl zzdl);

    void getCachedAppInstanceId(zzdl zzdl);

    void getConditionalUserProperties(String str, String str2, zzdl zzdl);

    void getCurrentScreenClass(zzdl zzdl);

    void getCurrentScreenName(zzdl zzdl);

    void getGmpAppId(zzdl zzdl);

    void getMaxUserProperties(String str, zzdl zzdl);

    void getSessionId(zzdl zzdl);

    void getTestFlag(zzdl zzdl, int i2);

    void getUserProperties(String str, String str2, boolean z2, zzdl zzdl);

    void initForTests(Map map);

    void initialize(IObjectWrapper iObjectWrapper, zzdt zzdt, long j2);

    void isDataCollectionEnabled(zzdl zzdl);

    void logEvent(String str, String str2, Bundle bundle, boolean z2, boolean z3, long j2);

    void logEventAndBundle(String str, String str2, Bundle bundle, zzdl zzdl, long j2);

    void logHealthData(int i2, String str, IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3);

    void onActivityCreated(IObjectWrapper iObjectWrapper, Bundle bundle, long j2);

    void onActivityDestroyed(IObjectWrapper iObjectWrapper, long j2);

    void onActivityPaused(IObjectWrapper iObjectWrapper, long j2);

    void onActivityResumed(IObjectWrapper iObjectWrapper, long j2);

    void onActivitySaveInstanceState(IObjectWrapper iObjectWrapper, zzdl zzdl, long j2);

    void onActivityStarted(IObjectWrapper iObjectWrapper, long j2);

    void onActivityStopped(IObjectWrapper iObjectWrapper, long j2);

    void performAction(Bundle bundle, zzdl zzdl, long j2);

    void registerOnMeasurementEventListener(zzdq zzdq);

    void resetAnalyticsData(long j2);

    void setConditionalUserProperty(Bundle bundle, long j2);

    void setConsent(Bundle bundle, long j2);

    void setConsentThirdParty(Bundle bundle, long j2);

    void setCurrentScreen(IObjectWrapper iObjectWrapper, String str, String str2, long j2);

    void setDataCollectionEnabled(boolean z2);

    void setDefaultEventParameters(Bundle bundle);

    void setDefaultEventParametersWithBackfill(Bundle bundle);

    void setEventInterceptor(zzdq zzdq);

    void setInstanceIdProvider(zzdr zzdr);

    void setMeasurementEnabled(boolean z2, long j2);

    void setMinimumSessionDuration(long j2);

    void setSessionTimeoutDuration(long j2);

    void setSgtmDebugInfo(Intent intent);

    void setUserId(String str, long j2);

    void setUserProperty(String str, String str2, IObjectWrapper iObjectWrapper, boolean z2, long j2);

    void unregisterOnMeasurementEventListener(zzdq zzdq);
}
