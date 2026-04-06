package com.google.firebase.crashlytics.internal.persistence;

import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.CrashlyticsAppQualitySessionsSubscriber;
import com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform;
import com.google.firebase.crashlytics.internal.settings.SettingsProvider;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicInteger;
import m.a;
import m.b;
import m.c;
import m.d;

public class CrashlyticsReportPersistence {

    /* renamed from: e  reason: collision with root package name */
    public static final Charset f30607e = Charset.forName("UTF-8");

    /* renamed from: f  reason: collision with root package name */
    public static final int f30608f = 15;

    /* renamed from: g  reason: collision with root package name */
    public static final CrashlyticsReportJsonTransform f30609g = new CrashlyticsReportJsonTransform();

    /* renamed from: h  reason: collision with root package name */
    public static final Comparator f30610h = new a();

    /* renamed from: i  reason: collision with root package name */
    public static final FilenameFilter f30611i = new b();

    /* renamed from: a  reason: collision with root package name */
    public final AtomicInteger f30612a = new AtomicInteger(0);

    /* renamed from: b  reason: collision with root package name */
    public final FileStore f30613b;

    /* renamed from: c  reason: collision with root package name */
    public final SettingsProvider f30614c;

    /* renamed from: d  reason: collision with root package name */
    public final CrashlyticsAppQualitySessionsSubscriber f30615d;

    public CrashlyticsReportPersistence(FileStore fileStore, SettingsProvider settingsProvider, CrashlyticsAppQualitySessionsSubscriber crashlyticsAppQualitySessionsSubscriber) {
        this.f30613b = fileStore;
        this.f30614c = settingsProvider;
        this.f30615d = crashlyticsAppQualitySessionsSubscriber;
    }

    public static String A(File file) {
        byte[] bArr = new byte[8192];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            try {
                int read = fileInputStream.read(bArr);
                if (read > 0) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    String str = new String(byteArrayOutputStream.toByteArray(), f30607e);
                    fileInputStream.close();
                    return str;
                }
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        }
        throw th;
    }

    public static void F(File file, String str) {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), f30607e);
        try {
            outputStreamWriter.write(str);
            outputStreamWriter.close();
            return;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    public static void G(File file, String str, long j2) {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), f30607e);
        try {
            outputStreamWriter.write(str);
            file.setLastModified(h(j2));
            outputStreamWriter.close();
            return;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    public static int f(List list, int i2) {
        int size = list.size();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            File file = (File) it.next();
            if (size <= i2) {
                return size;
            }
            FileStore.v(file);
            size--;
        }
        return size;
    }

    public static long h(long j2) {
        return j2 * 1000;
    }

    public static String m(int i2, boolean z2) {
        String format = String.format(Locale.US, "%010d", new Object[]{Integer.valueOf(i2)});
        String str = z2 ? "_" : "";
        return "event" + format + str;
    }

    public static String o(String str) {
        return str.substring(0, f30608f);
    }

    public static boolean s(String str) {
        return str.startsWith("event") && str.endsWith("_");
    }

    public static boolean t(File file, String str) {
        return str.startsWith("event") && !str.endsWith("_");
    }

    public static int x(File file, File file2) {
        return o(file.getName()).compareTo(o(file2.getName()));
    }

    public final void B(File file, CrashlyticsReport.FilesPayload filesPayload, String str, CrashlyticsReport.ApplicationExitInfo applicationExitInfo) {
        String d2 = this.f30615d.d(str);
        try {
            CrashlyticsReportJsonTransform crashlyticsReportJsonTransform = f30609g;
            F(this.f30613b.i(str), crashlyticsReportJsonTransform.M(crashlyticsReportJsonTransform.L(A(file)).u(filesPayload).q(applicationExitInfo).p(d2)));
        } catch (IOException e2) {
            Logger f2 = Logger.f();
            f2.l("Could not synthesize final native report file for " + file, e2);
        }
    }

    public final void C(String str, long j2) {
        boolean z2;
        List r2 = this.f30613b.r(str, f30611i);
        if (r2.isEmpty()) {
            Logger.f().i("Session " + str + " has no events.");
            return;
        }
        Collections.sort(r2);
        ArrayList arrayList = new ArrayList();
        Iterator it = r2.iterator();
        loop0:
        while (true) {
            z2 = false;
            while (true) {
                if (!it.hasNext()) {
                    break loop0;
                }
                File file = (File) it.next();
                try {
                    arrayList.add(f30609g.j(A(file)));
                    if (z2 || s(file.getName())) {
                        z2 = true;
                    }
                } catch (IOException e2) {
                    Logger.f().l("Could not add event to report for " + file, e2);
                }
            }
        }
        if (arrayList.isEmpty()) {
            Logger.f().k("Could not parse event files for session " + str);
            return;
        }
        D(this.f30613b.q(str, "report"), arrayList, j2, z2, UserMetadata.k(str, this.f30613b), this.f30615d.d(str));
    }

    public final void D(File file, List list, long j2, boolean z2, String str, String str2) {
        try {
            CrashlyticsReportJsonTransform crashlyticsReportJsonTransform = f30609g;
            CrashlyticsReport r2 = crashlyticsReportJsonTransform.L(A(file)).v(j2, z2, str).p(str2).r(list);
            CrashlyticsReport.Session n2 = r2.n();
            if (n2 != null) {
                Logger f2 = Logger.f();
                f2.b("appQualitySessionId: " + str2);
                F(z2 ? this.f30613b.l(n2.i()) : this.f30613b.n(n2.i()), crashlyticsReportJsonTransform.M(r2));
            }
        } catch (IOException e2) {
            Logger f3 = Logger.f();
            f3.l("Could not synthesize final report file for " + file, e2);
        }
    }

    public final int E(String str, int i2) {
        List r2 = this.f30613b.r(str, new c());
        Collections.sort(r2, new d());
        return f(r2, i2);
    }

    public final SortedSet e(String str) {
        this.f30613b.d();
        SortedSet p2 = p();
        if (str != null) {
            p2.remove(str);
        }
        if (p2.size() <= 8) {
            return p2;
        }
        while (p2.size() > 8) {
            String str2 = (String) p2.last();
            Logger f2 = Logger.f();
            f2.b("Removing session over cap: " + str2);
            this.f30613b.e(str2);
            p2.remove(str2);
        }
        return p2;
    }

    public final void g() {
        int i2 = this.f30614c.b().f30653a.f30665b;
        List n2 = n();
        int size = n2.size();
        if (size > i2) {
            for (File delete : n2.subList(i2, size)) {
                delete.delete();
            }
        }
    }

    public void i() {
        j(this.f30613b.o());
        j(this.f30613b.m());
        j(this.f30613b.j());
    }

    public final void j(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
    }

    public void k(String str, long j2) {
        for (String str2 : e(str)) {
            Logger f2 = Logger.f();
            f2.i("Finalizing report for session " + str2);
            C(str2, j2);
            this.f30613b.e(str2);
        }
        g();
    }

    public void l(String str, CrashlyticsReport.FilesPayload filesPayload, CrashlyticsReport.ApplicationExitInfo applicationExitInfo) {
        File q2 = this.f30613b.q(str, "report");
        Logger f2 = Logger.f();
        f2.b("Writing native session report for " + str + " to file: " + q2);
        B(q2, filesPayload, str, applicationExitInfo);
    }

    public final List n() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f30613b.m());
        arrayList.addAll(this.f30613b.j());
        Comparator comparator = f30610h;
        Collections.sort(arrayList, comparator);
        List o2 = this.f30613b.o();
        Collections.sort(o2, comparator);
        arrayList.addAll(o2);
        return arrayList;
    }

    public SortedSet p() {
        return new TreeSet(this.f30613b.f()).descendingSet();
    }

    public long q(String str) {
        return this.f30613b.q(str, "start-time").lastModified();
    }

    public boolean r() {
        return !this.f30613b.o().isEmpty() || !this.f30613b.m().isEmpty() || !this.f30613b.j().isEmpty();
    }

    public List w() {
        List<File> n2 = n();
        ArrayList arrayList = new ArrayList();
        for (File file : n2) {
            try {
                arrayList.add(CrashlyticsReportWithSessionId.a(f30609g.L(A(file)), file.getName(), file));
            } catch (IOException e2) {
                Logger f2 = Logger.f();
                f2.l("Could not load report file " + file + "; deleting", e2);
                file.delete();
            }
        }
        return arrayList;
    }

    public void y(CrashlyticsReport.Session.Event event, String str, boolean z2) {
        int i2 = this.f30614c.b().f30653a.f30664a;
        try {
            F(this.f30613b.q(str, m(this.f30612a.getAndIncrement(), z2)), f30609g.k(event));
        } catch (IOException e2) {
            Logger f2 = Logger.f();
            f2.l("Could not persist event for session " + str, e2);
        }
        E(str, i2);
    }

    public void z(CrashlyticsReport crashlyticsReport) {
        CrashlyticsReport.Session n2 = crashlyticsReport.n();
        if (n2 == null) {
            Logger.f().b("Could not get session for report");
            return;
        }
        String i2 = n2.i();
        try {
            F(this.f30613b.q(i2, "report"), f30609g.M(crashlyticsReport));
            G(this.f30613b.q(i2, "start-time"), "", n2.l());
        } catch (IOException e2) {
            Logger f2 = Logger.f();
            f2.c("Could not persist report for session " + i2, e2);
        }
    }
}
