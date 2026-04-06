package com.google.firebase.crashlytics.internal.common;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import com.google.firebase.crashlytics.internal.ProcessDetailsProvider;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.settings.SettingsProvider;
import com.google.firebase.crashlytics.internal.stacktrace.StackTraceTrimmingStrategy;
import com.google.firebase.crashlytics.internal.stacktrace.TrimmedThrowableData;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public class CrashlyticsReportDataCapture {

    /* renamed from: g  reason: collision with root package name */
    public static final Map f30052g;

    /* renamed from: h  reason: collision with root package name */
    public static final String f30053h = String.format(Locale.US, "Crashlytics Android SDK/%s", new Object[]{"19.0.3"});

    /* renamed from: a  reason: collision with root package name */
    public final Context f30054a;

    /* renamed from: b  reason: collision with root package name */
    public final IdManager f30055b;

    /* renamed from: c  reason: collision with root package name */
    public final AppData f30056c;

    /* renamed from: d  reason: collision with root package name */
    public final StackTraceTrimmingStrategy f30057d;

    /* renamed from: e  reason: collision with root package name */
    public final SettingsProvider f30058e;

    /* renamed from: f  reason: collision with root package name */
    public final ProcessDetailsProvider f30059f = ProcessDetailsProvider.f29919a;

    static {
        HashMap hashMap = new HashMap();
        f30052g = hashMap;
        hashMap.put("armeabi", 5);
        hashMap.put("armeabi-v7a", 6);
        hashMap.put("arm64-v8a", 9);
        hashMap.put("x86", 0);
        hashMap.put("x86_64", 1);
    }

    public CrashlyticsReportDataCapture(Context context, IdManager idManager, AppData appData, StackTraceTrimmingStrategy stackTraceTrimmingStrategy, SettingsProvider settingsProvider) {
        this.f30054a = context;
        this.f30055b = idManager;
        this.f30056c = appData;
        this.f30057d = stackTraceTrimmingStrategy;
        this.f30058e = settingsProvider;
    }

    public static long f(long j2) {
        if (j2 > 0) {
            return j2;
        }
        return 0;
    }

    public static int g() {
        Integer num;
        String str = Build.CPU_ABI;
        if (!TextUtils.isEmpty(str) && (num = (Integer) f30052g.get(str.toLowerCase(Locale.US))) != null) {
            return num.intValue();
        }
        return 7;
    }

    public final CrashlyticsReport.Session.Event.Application.ProcessDetails A(CrashlyticsReport.ApplicationExitInfo applicationExitInfo) {
        return this.f30059f.a(applicationExitInfo.e(), applicationExitInfo.d(), applicationExitInfo.c());
    }

    public final CrashlyticsReport.ApplicationExitInfo a(CrashlyticsReport.ApplicationExitInfo applicationExitInfo) {
        List list;
        if (!this.f30058e.b().f30654b.f30663c || this.f30056c.f29936c.size() <= 0) {
            list = null;
        } else {
            ArrayList arrayList = new ArrayList();
            for (BuildIdInfo buildIdInfo : this.f30056c.f29936c) {
                arrayList.add(CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch.a().d(buildIdInfo.c()).b(buildIdInfo.a()).c(buildIdInfo.b()).a());
            }
            list = Collections.unmodifiableList(arrayList);
        }
        return CrashlyticsReport.ApplicationExitInfo.a().c(applicationExitInfo.c()).e(applicationExitInfo.e()).g(applicationExitInfo.g()).i(applicationExitInfo.i()).d(applicationExitInfo.d()).f(applicationExitInfo.f()).h(applicationExitInfo.h()).j(applicationExitInfo.j()).b(list).a();
    }

    public final CrashlyticsReport.Builder b() {
        return CrashlyticsReport.b().l("19.0.3").h(this.f30056c.f29934a).i(this.f30055b.a().c()).g(this.f30055b.a().e()).f(this.f30055b.a().d()).d(this.f30056c.f29939f).e(this.f30056c.f29940g).k(4);
    }

    public CrashlyticsReport.Session.Event c(CrashlyticsReport.ApplicationExitInfo applicationExitInfo) {
        int i2 = this.f30054a.getResources().getConfiguration().orientation;
        return CrashlyticsReport.Session.Event.a().g("anr").f(applicationExitInfo.i()).b(j(i2, a(applicationExitInfo))).c(l(i2)).a();
    }

    public CrashlyticsReport.Session.Event d(Throwable th, Thread thread, String str, long j2, int i2, int i3, boolean z2) {
        int i4 = this.f30054a.getResources().getConfiguration().orientation;
        Throwable th2 = th;
        String str2 = str;
        long j3 = j2;
        return CrashlyticsReport.Session.Event.a().g(str).f(j2).b(k(i4, TrimmedThrowableData.a(th, this.f30057d), thread, i2, i3, z2)).c(l(i4)).a();
    }

    public CrashlyticsReport e(String str, long j2) {
        return b().m(t(str, j2)).a();
    }

    public final CrashlyticsReport.Session.Event.Application.Execution.BinaryImage h() {
        return CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.a().b(0).d(0).c(this.f30056c.f29938e).e(this.f30056c.f29935b).a();
    }

    public final List i() {
        return Collections.singletonList(h());
    }

    public final CrashlyticsReport.Session.Event.Application j(int i2, CrashlyticsReport.ApplicationExitInfo applicationExitInfo) {
        return CrashlyticsReport.Session.Event.Application.a().c(Boolean.valueOf(applicationExitInfo.c() != 100)).d(A(applicationExitInfo)).h(i2).f(o(applicationExitInfo)).a();
    }

    public final CrashlyticsReport.Session.Event.Application k(int i2, TrimmedThrowableData trimmedThrowableData, Thread thread, int i3, int i4, boolean z2) {
        Boolean bool;
        CrashlyticsReport.Session.Event.Application.ProcessDetails e2 = this.f30059f.e(this.f30054a);
        if (e2.b() > 0) {
            bool = Boolean.valueOf(e2.b() != 100);
        } else {
            bool = null;
        }
        return CrashlyticsReport.Session.Event.Application.a().c(bool).d(e2).b(this.f30059f.d(this.f30054a)).h(i2).f(p(trimmedThrowableData, thread, i3, i4, z2)).a();
    }

    public final CrashlyticsReport.Session.Event.Device l(int i2) {
        BatteryState a2 = BatteryState.a(this.f30054a);
        Float b2 = a2.b();
        Double valueOf = b2 != null ? Double.valueOf(b2.doubleValue()) : null;
        int c2 = a2.c();
        boolean n2 = CommonUtils.n(this.f30054a);
        return CrashlyticsReport.Session.Event.Device.a().b(valueOf).c(c2).f(n2).e(i2).g(f(CommonUtils.b(this.f30054a) - CommonUtils.a(this.f30054a))).d(CommonUtils.c(Environment.getDataDirectory().getPath())).a();
    }

    public final CrashlyticsReport.Session.Event.Application.Execution.Exception m(TrimmedThrowableData trimmedThrowableData, int i2, int i3) {
        return n(trimmedThrowableData, i2, i3, 0);
    }

    public final CrashlyticsReport.Session.Event.Application.Execution.Exception n(TrimmedThrowableData trimmedThrowableData, int i2, int i3, int i4) {
        String str = trimmedThrowableData.f30695b;
        String str2 = trimmedThrowableData.f30694a;
        StackTraceElement[] stackTraceElementArr = trimmedThrowableData.f30696c;
        int i5 = 0;
        if (stackTraceElementArr == null) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        TrimmedThrowableData trimmedThrowableData2 = trimmedThrowableData.f30697d;
        if (i4 >= i3) {
            TrimmedThrowableData trimmedThrowableData3 = trimmedThrowableData2;
            while (trimmedThrowableData3 != null) {
                trimmedThrowableData3 = trimmedThrowableData3.f30697d;
                i5++;
            }
        }
        CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder d2 = CrashlyticsReport.Session.Event.Application.Execution.Exception.a().f(str).e(str2).c(r(stackTraceElementArr, i2)).d(i5);
        if (trimmedThrowableData2 != null && i5 == 0) {
            d2.b(n(trimmedThrowableData2, i2, i3, i4 + 1));
        }
        return d2.a();
    }

    public final CrashlyticsReport.Session.Event.Application.Execution o(CrashlyticsReport.ApplicationExitInfo applicationExitInfo) {
        return CrashlyticsReport.Session.Event.Application.Execution.a().b(applicationExitInfo).e(w()).c(i()).a();
    }

    public final CrashlyticsReport.Session.Event.Application.Execution p(TrimmedThrowableData trimmedThrowableData, Thread thread, int i2, int i3, boolean z2) {
        return CrashlyticsReport.Session.Event.Application.Execution.a().f(z(trimmedThrowableData, thread, i2, z2)).d(m(trimmedThrowableData, i2, i3)).e(w()).c(i()).a();
    }

    public final CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame q(StackTraceElement stackTraceElement, CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder builder) {
        long j2 = 0;
        long max = stackTraceElement.isNativeMethod() ? Math.max((long) stackTraceElement.getLineNumber(), 0) : 0;
        String str = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
        String fileName = stackTraceElement.getFileName();
        if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
            j2 = (long) stackTraceElement.getLineNumber();
        }
        return builder.e(max).f(str).b(fileName).d(j2).a();
    }

    public final List r(StackTraceElement[] stackTraceElementArr, int i2) {
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement q2 : stackTraceElementArr) {
            arrayList.add(q(q2, CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.a().c(i2)));
        }
        return Collections.unmodifiableList(arrayList);
    }

    public final CrashlyticsReport.Session.Application s() {
        return CrashlyticsReport.Session.Application.a().e(this.f30055b.f()).g(this.f30056c.f29939f).d(this.f30056c.f29940g).f(this.f30055b.a().c()).b(this.f30056c.f29941h.d()).c(this.f30056c.f29941h.e()).a();
    }

    public final CrashlyticsReport.Session t(String str, long j2) {
        return CrashlyticsReport.Session.a().m(j2).j(str).h(f30053h).b(s()).l(v()).e(u()).i(3).a();
    }

    public final CrashlyticsReport.Session.Device u() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        int g2 = g();
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        long b2 = CommonUtils.b(this.f30054a);
        long blockCount = ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
        boolean w2 = CommonUtils.w();
        int l2 = CommonUtils.l();
        String str = Build.MANUFACTURER;
        return CrashlyticsReport.Session.Device.a().b(g2).f(Build.MODEL).c(availableProcessors).h(b2).d(blockCount).i(w2).j(l2).e(str).g(Build.PRODUCT).a();
    }

    public final CrashlyticsReport.Session.OperatingSystem v() {
        return CrashlyticsReport.Session.OperatingSystem.a().d(3).e(Build.VERSION.RELEASE).b(Build.VERSION.CODENAME).c(CommonUtils.x()).a();
    }

    public final CrashlyticsReport.Session.Event.Application.Execution.Signal w() {
        return CrashlyticsReport.Session.Event.Application.Execution.Signal.a().d("0").c("0").b(0).a();
    }

    public final CrashlyticsReport.Session.Event.Application.Execution.Thread x(Thread thread, StackTraceElement[] stackTraceElementArr) {
        return y(thread, stackTraceElementArr, 0);
    }

    public final CrashlyticsReport.Session.Event.Application.Execution.Thread y(Thread thread, StackTraceElement[] stackTraceElementArr, int i2) {
        return CrashlyticsReport.Session.Event.Application.Execution.Thread.a().d(thread.getName()).c(i2).b(r(stackTraceElementArr, i2)).a();
    }

    public final List z(TrimmedThrowableData trimmedThrowableData, Thread thread, int i2, boolean z2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(y(thread, trimmedThrowableData.f30696c, i2));
        if (z2) {
            for (Map.Entry next : Thread.getAllStackTraces().entrySet()) {
                Thread thread2 = (Thread) next.getKey();
                if (!thread2.equals(thread)) {
                    arrayList.add(x(thread2, this.f30057d.a((StackTraceElement[]) next.getValue())));
                }
            }
        }
        return Collections.unmodifiableList(arrayList);
    }
}
