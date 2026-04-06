package com.google.firebase.crashlytics.internal;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Process;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class ProcessDetailsProvider {

    /* renamed from: a  reason: collision with root package name */
    public static final ProcessDetailsProvider f29919a = new ProcessDetailsProvider();

    public static /* synthetic */ CrashlyticsReport.Session.Event.Application.ProcessDetails c(ProcessDetailsProvider processDetailsProvider, String str, int i2, int i3, boolean z2, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            i3 = 0;
        }
        if ((i4 & 8) != 0) {
            z2 = false;
        }
        return processDetailsProvider.b(str, i2, i3, z2);
    }

    public final CrashlyticsReport.Session.Event.Application.ProcessDetails a(String str, int i2, int i3) {
        Intrinsics.i(str, "processName");
        return c(this, str, i2, i3, false, 8, (Object) null);
    }

    public final CrashlyticsReport.Session.Event.Application.ProcessDetails b(String str, int i2, int i3, boolean z2) {
        Intrinsics.i(str, "processName");
        CrashlyticsReport.Session.Event.Application.ProcessDetails a2 = CrashlyticsReport.Session.Event.Application.ProcessDetails.a().e(str).d(i2).c(i3).b(z2).a();
        Intrinsics.h(a2, "builder()\n      .setProc…ltProcess)\n      .build()");
        return a2;
    }

    public final List d(Context context) {
        Intrinsics.i(context, "context");
        int i2 = context.getApplicationInfo().uid;
        String str = context.getApplicationInfo().processName;
        Object systemService = context.getSystemService("activity");
        List<ActivityManager.RunningAppProcessInfo> list = null;
        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
        if (activityManager != null) {
            list = activityManager.getRunningAppProcesses();
        }
        if (list == null) {
            list = CollectionsKt.m();
        }
        ArrayList<ActivityManager.RunningAppProcessInfo> arrayList = new ArrayList<>();
        for (Object next : CollectionsKt.b0(list)) {
            if (((ActivityManager.RunningAppProcessInfo) next).uid == i2) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.x(arrayList, 10));
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : arrayList) {
            arrayList2.add(CrashlyticsReport.Session.Event.Application.ProcessDetails.a().e(runningAppProcessInfo.processName).d(runningAppProcessInfo.pid).c(runningAppProcessInfo.importance).b(Intrinsics.d(runningAppProcessInfo.processName, str)).a());
        }
        return arrayList2;
    }

    public final CrashlyticsReport.Session.Event.Application.ProcessDetails e(Context context) {
        Object obj;
        Intrinsics.i(context, "context");
        int myPid = Process.myPid();
        Iterator it = d(context).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((CrashlyticsReport.Session.Event.Application.ProcessDetails) obj).c() == myPid) {
                break;
            }
        }
        CrashlyticsReport.Session.Event.Application.ProcessDetails processDetails = (CrashlyticsReport.Session.Event.Application.ProcessDetails) obj;
        if (processDetails != null) {
            return processDetails;
        }
        return c(this, f(), myPid, 0, false, 12, (Object) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0016, code lost:
        r0 = android.app.Application.getProcessName();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String f() {
        /*
            r3 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 < r1) goto L_0x0010
            java.lang.String r0 = android.os.Process.myProcessName()
            java.lang.String r1 = "{\n      Process.myProcessName()\n    }"
            kotlin.jvm.internal.Intrinsics.h(r0, r1)
            goto L_0x001d
        L_0x0010:
            r1 = 28
            java.lang.String r2 = ""
            if (r0 < r1) goto L_0x001c
            java.lang.String r0 = android.app.Application.getProcessName()
            if (r0 != 0) goto L_0x001d
        L_0x001c:
            r0 = r2
        L_0x001d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.crashlytics.internal.ProcessDetailsProvider.f():java.lang.String");
    }
}
