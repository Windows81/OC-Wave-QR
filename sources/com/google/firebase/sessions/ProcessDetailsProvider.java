package com.google.firebase.sessions;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import com.google.android.gms.common.util.ProcessUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class ProcessDetailsProvider {

    /* renamed from: a  reason: collision with root package name */
    public static final ProcessDetailsProvider f31504a = new ProcessDetailsProvider();

    public static /* synthetic */ ProcessDetails b(ProcessDetailsProvider processDetailsProvider, String str, int i2, int i3, boolean z2, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            i3 = 0;
        }
        if ((i4 & 8) != 0) {
            z2 = false;
        }
        return processDetailsProvider.a(str, i2, i3, z2);
    }

    public final ProcessDetails a(String str, int i2, int i3, boolean z2) {
        return new ProcessDetails(str, i2, i3, z2);
    }

    public final List c(Context context) {
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
            String str2 = runningAppProcessInfo.processName;
            Intrinsics.h(str2, "runningAppProcessInfo.processName");
            arrayList2.add(new ProcessDetails(str2, runningAppProcessInfo.pid, runningAppProcessInfo.importance, Intrinsics.d(runningAppProcessInfo.processName, str)));
        }
        return arrayList2;
    }

    public final ProcessDetails d(Context context) {
        Object obj;
        Intrinsics.i(context, "context");
        int myPid = Process.myPid();
        Iterator it = c(context).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((ProcessDetails) obj).b() == myPid) {
                break;
            }
        }
        ProcessDetails processDetails = (ProcessDetails) obj;
        if (processDetails != null) {
            return processDetails;
        }
        return b(this, e(), myPid, 0, false, 12, (Object) null);
    }

    public final String e() {
        String a2;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 33) {
            String a3 = Process.myProcessName();
            Intrinsics.h(a3, "myProcessName()");
            return a3;
        } else if (i2 >= 28 && (a2 = Application.getProcessName()) != null) {
            return a2;
        } else {
            String a4 = ProcessUtils.a();
            return a4 != null ? a4 : "";
        }
    }
}
