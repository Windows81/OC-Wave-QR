package com.google.firebase.crashlytics.internal.common;

import android.app.ApplicationExitInfo;
import android.content.Context;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.metadata.LogFileManager;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.persistence.CrashlyticsReportPersistence;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import com.google.firebase.crashlytics.internal.send.DataTransportCrashlyticsReportSender;
import com.google.firebase.crashlytics.internal.settings.SettingsProvider;
import com.google.firebase.crashlytics.internal.stacktrace.StackTraceTrimmingStrategy;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.concurrent.Executor;

public class SessionReportingCoordinator implements CrashlyticsLifecycleEvents {

    /* renamed from: a  reason: collision with root package name */
    public final CrashlyticsReportDataCapture f30099a;

    /* renamed from: b  reason: collision with root package name */
    public final CrashlyticsReportPersistence f30100b;

    /* renamed from: c  reason: collision with root package name */
    public final DataTransportCrashlyticsReportSender f30101c;

    /* renamed from: d  reason: collision with root package name */
    public final LogFileManager f30102d;

    /* renamed from: e  reason: collision with root package name */
    public final UserMetadata f30103e;

    /* renamed from: f  reason: collision with root package name */
    public final IdManager f30104f;

    public SessionReportingCoordinator(CrashlyticsReportDataCapture crashlyticsReportDataCapture, CrashlyticsReportPersistence crashlyticsReportPersistence, DataTransportCrashlyticsReportSender dataTransportCrashlyticsReportSender, LogFileManager logFileManager, UserMetadata userMetadata, IdManager idManager) {
        this.f30099a = crashlyticsReportDataCapture;
        this.f30100b = crashlyticsReportPersistence;
        this.f30101c = dataTransportCrashlyticsReportSender;
        this.f30102d = logFileManager;
        this.f30103e = userMetadata;
        this.f30104f = idManager;
    }

    public static CrashlyticsReport.ApplicationExitInfo f(ApplicationExitInfo applicationExitInfo) {
        String str = null;
        try {
            InputStream a2 = applicationExitInfo.getTraceInputStream();
            if (a2 != null) {
                str = g(a2);
            }
        } catch (IOException e2) {
            Logger f2 = Logger.f();
            f2.k("Could not get input trace in application exit info: " + applicationExitInfo.toString() + " Error: " + e2);
        }
        return CrashlyticsReport.ApplicationExitInfo.a().c(applicationExitInfo.getImportance()).e(applicationExitInfo.getProcessName()).g(applicationExitInfo.getReason()).i(applicationExitInfo.getTimestamp()).d(applicationExitInfo.getPid()).f(applicationExitInfo.getPss()).h(applicationExitInfo.getRss()).j(str).a();
    }

    public static String g(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[8192];
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return byteArrayOutputStream.toString(StandardCharsets.UTF_8.name());
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    public static SessionReportingCoordinator h(Context context, IdManager idManager, FileStore fileStore, AppData appData, LogFileManager logFileManager, UserMetadata userMetadata, StackTraceTrimmingStrategy stackTraceTrimmingStrategy, SettingsProvider settingsProvider, OnDemandCounter onDemandCounter, CrashlyticsAppQualitySessionsSubscriber crashlyticsAppQualitySessionsSubscriber) {
        SettingsProvider settingsProvider2 = settingsProvider;
        FileStore fileStore2 = fileStore;
        Context context2 = context;
        return new SessionReportingCoordinator(new CrashlyticsReportDataCapture(context, idManager, appData, stackTraceTrimmingStrategy, settingsProvider), new CrashlyticsReportPersistence(fileStore, settingsProvider2, crashlyticsAppQualitySessionsSubscriber), DataTransportCrashlyticsReportSender.b(context, settingsProvider2, onDemandCounter), logFileManager, userMetadata, idManager);
    }

    public static List m(Map map) {
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(map.size());
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add(CrashlyticsReport.CustomAttribute.a().b((String) entry.getKey()).c((String) entry.getValue()).a());
        }
        Collections.sort(arrayList, new q());
        return Collections.unmodifiableList(arrayList);
    }

    public final CrashlyticsReport.Session.Event c(CrashlyticsReport.Session.Event event, LogFileManager logFileManager, UserMetadata userMetadata) {
        CrashlyticsReport.Session.Event.Builder h2 = event.h();
        String c2 = logFileManager.c();
        if (c2 != null) {
            h2.d(CrashlyticsReport.Session.Event.Log.a().b(c2).a());
        } else {
            Logger.f().i("No log data to include with this event.");
        }
        List m2 = m(userMetadata.e());
        List m3 = m(userMetadata.f());
        if (!m2.isEmpty() || !m3.isEmpty()) {
            h2.b(event.b().i().e(m2).g(m3).a());
        }
        return h2.a();
    }

    public final CrashlyticsReport.Session.Event d(CrashlyticsReport.Session.Event event) {
        return e(c(event, this.f30102d, this.f30103e), this.f30103e);
    }

    public final CrashlyticsReport.Session.Event e(CrashlyticsReport.Session.Event event, UserMetadata userMetadata) {
        List g2 = userMetadata.g();
        if (g2.isEmpty()) {
            return event;
        }
        CrashlyticsReport.Session.Event.Builder h2 = event.h();
        h2.e(CrashlyticsReport.Session.Event.RolloutsState.a().b(g2).a());
        return h2.a();
    }

    public final CrashlyticsReportWithSessionId i(CrashlyticsReportWithSessionId crashlyticsReportWithSessionId) {
        if (crashlyticsReportWithSessionId.b().h() != null && crashlyticsReportWithSessionId.b().g() != null) {
            return crashlyticsReportWithSessionId;
        }
        FirebaseInstallationId d2 = this.f30104f.d(true);
        return CrashlyticsReportWithSessionId.a(crashlyticsReportWithSessionId.b().t(d2.b()).s(d2.a()), crashlyticsReportWithSessionId.d(), crashlyticsReportWithSessionId.c());
    }

    public void j(String str, List list, CrashlyticsReport.ApplicationExitInfo applicationExitInfo) {
        Logger.f().b("SessionReportingCoordinator#finalizeSessionWithNativeEvent");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CrashlyticsReport.FilesPayload.File c2 = ((NativeSessionFile) it.next()).c();
            if (c2 != null) {
                arrayList.add(c2);
            }
        }
        this.f30100b.l(str, CrashlyticsReport.FilesPayload.a().b(Collections.unmodifiableList(arrayList)).a(), applicationExitInfo);
    }

    public void k(long j2, String str) {
        this.f30100b.k(str, j2);
    }

    public final ApplicationExitInfo l(String str, List list) {
        long q2 = this.f30100b.q(str);
        for (Object a2 : list) {
            ApplicationExitInfo a3 = g.a(a2);
            if (a3.getTimestamp() < q2) {
                return null;
            }
            if (a3.getReason() == 6) {
                return a3;
            }
        }
        return null;
    }

    public boolean n() {
        return this.f30100b.r();
    }

    public SortedSet p() {
        return this.f30100b.p();
    }

    public void q(String str, long j2) {
        this.f30100b.z(this.f30099a.e(str, j2));
    }

    public final boolean r(Task task) {
        if (task.n()) {
            CrashlyticsReportWithSessionId crashlyticsReportWithSessionId = (CrashlyticsReportWithSessionId) task.k();
            Logger f2 = Logger.f();
            f2.b("Crashlytics report successfully enqueued to DataTransport: " + crashlyticsReportWithSessionId.d());
            File c2 = crashlyticsReportWithSessionId.c();
            if (c2.delete()) {
                Logger f3 = Logger.f();
                f3.b("Deleted report file: " + c2.getPath());
                return true;
            }
            Logger f4 = Logger.f();
            f4.k("Crashlytics could not delete report file: " + c2.getPath());
            return true;
        }
        Logger.f().l("Crashlytics report could not be enqueued to DataTransport", task.j());
        return false;
    }

    public final void s(Throwable th, Thread thread, String str, String str2, long j2, boolean z2) {
        boolean equals = str2.equals("crash");
        CrashlyticsReport.Session.Event d2 = this.f30099a.d(th, thread, str2, j2, 4, 8, z2);
        String str3 = str;
        this.f30100b.y(d(d2), str, equals);
    }

    public void t(Throwable th, Thread thread, String str, long j2) {
        Logger f2 = Logger.f();
        f2.i("Persisting fatal event for session " + str);
        s(th, thread, str, "crash", j2, true);
    }

    public void u(Throwable th, Thread thread, String str, long j2) {
        Logger f2 = Logger.f();
        f2.i("Persisting non-fatal event for session " + str);
        s(th, thread, str, "error", j2, false);
    }

    public void v(String str, List list, LogFileManager logFileManager, UserMetadata userMetadata) {
        ApplicationExitInfo l2 = l(str, list);
        if (l2 == null) {
            Logger f2 = Logger.f();
            f2.i("No relevant ApplicationExitInfo occurred during session: " + str);
            return;
        }
        CrashlyticsReport.Session.Event c2 = this.f30099a.c(f(l2));
        Logger f3 = Logger.f();
        f3.b("Persisting anr for session " + str);
        this.f30100b.y(e(c(c2, logFileManager, userMetadata), userMetadata), str, true);
    }

    public void w() {
        this.f30100b.i();
    }

    public Task x(Executor executor) {
        return y(executor, (String) null);
    }

    public Task y(Executor executor, String str) {
        List<CrashlyticsReportWithSessionId> w2 = this.f30100b.w();
        ArrayList arrayList = new ArrayList();
        for (CrashlyticsReportWithSessionId crashlyticsReportWithSessionId : w2) {
            if (str == null || str.equals(crashlyticsReportWithSessionId.d())) {
                arrayList.add(this.f30101c.c(i(crashlyticsReportWithSessionId), str != null).h(executor, new r(this)));
            }
        }
        return Tasks.f(arrayList);
    }
}
