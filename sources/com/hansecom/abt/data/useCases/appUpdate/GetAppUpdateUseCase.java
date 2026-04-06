package com.hansecom.abt.data.useCases.appUpdate;

import com.hansecom.abt.AppInfo;
import com.hansecom.abt.data.preferences.AppPreferences;
import com.hansecom.abt.data.useCases.configurations.GetAppUpdateConfigurationUseCase;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class GetAppUpdateUseCase {

    /* renamed from: a  reason: collision with root package name */
    public final AppInfo f33780a;

    /* renamed from: b  reason: collision with root package name */
    public final GetAppUpdateConfigurationUseCase f33781b;

    /* renamed from: c  reason: collision with root package name */
    public final AppPreferences f33782c;

    public GetAppUpdateUseCase(AppInfo appInfo, GetAppUpdateConfigurationUseCase getAppUpdateConfigurationUseCase, AppPreferences appPreferences) {
        Intrinsics.i(appInfo, "appInfo");
        Intrinsics.i(getAppUpdateConfigurationUseCase, "getAppUpdateConfigurationUseCase");
        Intrinsics.i(appPreferences, "appPreferences");
        this.f33780a = appInfo;
        this.f33781b = getAppUpdateConfigurationUseCase;
        this.f33782c = appPreferences;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(kotlin.coroutines.Continuation r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.hansecom.abt.data.useCases.appUpdate.GetAppUpdateUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.hansecom.abt.data.useCases.appUpdate.GetAppUpdateUseCase$invoke$1 r0 = (com.hansecom.abt.data.useCases.appUpdate.GetAppUpdateUseCase$invoke$1) r0
            int r1 = r0.H
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.H = r1
            goto L_0x0018
        L_0x0013:
            com.hansecom.abt.data.useCases.appUpdate.GetAppUpdateUseCase$invoke$1 r0 = new com.hansecom.abt.data.useCases.appUpdate.GetAppUpdateUseCase$invoke$1
            r0.<init>(r6, r7)
        L_0x0018:
            java.lang.Object r7 = r0.F
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.H
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x003e
            if (r2 != r3) goto L_0x0036
            java.lang.Object r1 = r0.E
            com.hansecom.abt.util.Version r1 = (com.hansecom.abt.util.Version) r1
            java.lang.Object r2 = r0.D
            com.hansecom.abt.util.Version r2 = (com.hansecom.abt.util.Version) r2
            java.lang.Object r0 = r0.C
            com.hansecom.abt.data.useCases.appUpdate.GetAppUpdateUseCase r0 = (com.hansecom.abt.data.useCases.appUpdate.GetAppUpdateUseCase) r0
            kotlin.ResultKt.b(r7)
            goto L_0x0073
        L_0x0036:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x003e:
            kotlin.ResultKt.b(r7)
            com.hansecom.abt.data.useCases.configurations.GetAppUpdateConfigurationUseCase r7 = r6.f33781b
            com.hansecom.abt.data.config.appUpdate.AppUpdateConfiguration r7 = r7.d()
            java.lang.String r2 = r7.a()
            if (r2 == 0) goto L_0x0052
            com.hansecom.abt.util.Version r2 = com.hansecom.abt.util.VersionKt.a(r2)
            goto L_0x0053
        L_0x0052:
            r2 = r4
        L_0x0053:
            java.lang.String r7 = r7.b()
            if (r7 == 0) goto L_0x005e
            com.hansecom.abt.util.Version r7 = com.hansecom.abt.util.VersionKt.a(r7)
            goto L_0x005f
        L_0x005e:
            r7 = r4
        L_0x005f:
            com.hansecom.abt.data.preferences.AppPreferences r5 = r6.f33782c
            r0.C = r6
            r0.D = r2
            r0.E = r7
            r0.H = r3
            java.lang.Object r0 = r5.e(r0)
            if (r0 != r1) goto L_0x0070
            return r1
        L_0x0070:
            r1 = r7
            r7 = r0
            r0 = r6
        L_0x0073:
            java.lang.String r7 = (java.lang.String) r7
            if (r7 == 0) goto L_0x007b
            com.hansecom.abt.util.Version r4 = com.hansecom.abt.util.VersionKt.a(r7)
        L_0x007b:
            com.hansecom.abt.util.Version r7 = new com.hansecom.abt.util.Version
            com.hansecom.abt.AppInfo r0 = r0.f33780a
            java.lang.String r0 = r0.a()
            r7.<init>(r0)
            if (r2 == 0) goto L_0x0091
            int r0 = r7.compareTo(r2)
            if (r0 >= 0) goto L_0x0091
            com.hansecom.abt.data.useCases.appUpdate.AppUpdate r7 = com.hansecom.abt.data.useCases.appUpdate.AppUpdate.HARD
            goto L_0x00a6
        L_0x0091:
            if (r1 == 0) goto L_0x00a4
            int r7 = r7.compareTo(r1)
            if (r7 >= 0) goto L_0x00a4
            if (r4 == 0) goto L_0x00a1
            int r7 = r4.compareTo(r1)
            if (r7 >= 0) goto L_0x00a4
        L_0x00a1:
            com.hansecom.abt.data.useCases.appUpdate.AppUpdate r7 = com.hansecom.abt.data.useCases.appUpdate.AppUpdate.SOFT
            goto L_0x00a6
        L_0x00a4:
            com.hansecom.abt.data.useCases.appUpdate.AppUpdate r7 = com.hansecom.abt.data.useCases.appUpdate.AppUpdate.NONE
        L_0x00a6:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.data.useCases.appUpdate.GetAppUpdateUseCase.a(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
