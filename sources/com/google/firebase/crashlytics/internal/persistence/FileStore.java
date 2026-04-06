package com.google.firebase.crashlytics.internal.persistence;

import android.content.Context;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.ProcessDetailsProvider;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import m.e;

public class FileStore {

    /* renamed from: a  reason: collision with root package name */
    public final String f30616a;

    /* renamed from: b  reason: collision with root package name */
    public final File f30617b;

    /* renamed from: c  reason: collision with root package name */
    public final File f30618c;

    /* renamed from: d  reason: collision with root package name */
    public final File f30619d;

    /* renamed from: e  reason: collision with root package name */
    public final File f30620e;

    /* renamed from: f  reason: collision with root package name */
    public final File f30621f;

    /* renamed from: g  reason: collision with root package name */
    public final File f30622g;

    public FileStore(Context context) {
        String str;
        String d2 = ProcessDetailsProvider.f29919a.e(context).d();
        this.f30616a = d2;
        File filesDir = context.getFilesDir();
        this.f30617b = filesDir;
        if (y()) {
            str = ".crashlytics.v3" + File.separator + x(d2);
        } else {
            str = ".com.google.firebase.crashlytics.files.v1";
        }
        File t2 = t(new File(filesDir, str));
        this.f30618c = t2;
        this.f30619d = t(new File(t2, "open-sessions"));
        this.f30620e = t(new File(t2, "reports"));
        this.f30621f = t(new File(t2, "priority-reports"));
        this.f30622g = t(new File(t2, "native-reports"));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0053, code lost:
        return r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized java.io.File t(java.io.File r4) {
        /*
            java.lang.Class<com.google.firebase.crashlytics.internal.persistence.FileStore> r0 = com.google.firebase.crashlytics.internal.persistence.FileStore.class
            monitor-enter(r0)
            boolean r1 = r4.exists()     // Catch:{ all -> 0x0032 }
            if (r1 == 0) goto L_0x0034
            boolean r1 = r4.isDirectory()     // Catch:{ all -> 0x0032 }
            if (r1 == 0) goto L_0x0011
            monitor-exit(r0)
            return r4
        L_0x0011:
            com.google.firebase.crashlytics.internal.Logger r1 = com.google.firebase.crashlytics.internal.Logger.f()     // Catch:{ all -> 0x0032 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0032 }
            r2.<init>()     // Catch:{ all -> 0x0032 }
            java.lang.String r3 = "Unexpected non-directory file: "
            r2.append(r3)     // Catch:{ all -> 0x0032 }
            r2.append(r4)     // Catch:{ all -> 0x0032 }
            java.lang.String r3 = "; deleting file and creating new directory."
            r2.append(r3)     // Catch:{ all -> 0x0032 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0032 }
            r1.b(r2)     // Catch:{ all -> 0x0032 }
            r4.delete()     // Catch:{ all -> 0x0032 }
            goto L_0x0034
        L_0x0032:
            r4 = move-exception
            goto L_0x0054
        L_0x0034:
            boolean r1 = r4.mkdirs()     // Catch:{ all -> 0x0032 }
            if (r1 != 0) goto L_0x0052
            com.google.firebase.crashlytics.internal.Logger r1 = com.google.firebase.crashlytics.internal.Logger.f()     // Catch:{ all -> 0x0032 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0032 }
            r2.<init>()     // Catch:{ all -> 0x0032 }
            java.lang.String r3 = "Could not create Crashlytics-specific directory: "
            r2.append(r3)     // Catch:{ all -> 0x0032 }
            r2.append(r4)     // Catch:{ all -> 0x0032 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0032 }
            r1.d(r2)     // Catch:{ all -> 0x0032 }
        L_0x0052:
            monitor-exit(r0)
            return r4
        L_0x0054:
            monitor-exit(r0)     // Catch:{ all -> 0x0032 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.crashlytics.internal.persistence.FileStore.t(java.io.File):java.io.File");
    }

    public static File u(File file) {
        file.mkdirs();
        return file;
    }

    public static boolean v(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File v2 : listFiles) {
                v(v2);
            }
        }
        return file.delete();
    }

    public static List w(Object[] objArr) {
        return objArr == null ? Collections.emptyList() : Arrays.asList(objArr);
    }

    public static String x(String str) {
        return str.length() > 40 ? CommonUtils.z(str) : str.replaceAll("[^a-zA-Z0-9.]", "_");
    }

    public final void b(String str) {
        File file = new File(this.f30617b, str);
        if (file.exists() && v(file)) {
            Logger f2 = Logger.f();
            f2.b("Deleted previous Crashlytics file system: " + file.getPath());
        }
    }

    public final void c(String str) {
        String[] list;
        if (this.f30617b.exists() && (list = this.f30617b.list(new e(str))) != null) {
            for (String b2 : list) {
                b(b2);
            }
        }
    }

    public void d() {
        b(".com.google.firebase.crashlytics");
        b(".com.google.firebase.crashlytics-ndk");
        if (y()) {
            b(".com.google.firebase.crashlytics.files.v1");
            c(".com.google.firebase.crashlytics.files.v2" + File.pathSeparator);
        }
    }

    public boolean e(String str) {
        return v(new File(this.f30619d, str));
    }

    public List f() {
        return w(this.f30619d.list());
    }

    public File g(String str) {
        return new File(this.f30618c, str);
    }

    public List h(FilenameFilter filenameFilter) {
        return w(this.f30618c.listFiles(filenameFilter));
    }

    public File i(String str) {
        return new File(this.f30622g, str);
    }

    public List j() {
        return w(this.f30622g.listFiles());
    }

    public File k(String str) {
        return u(new File(p(str), "native"));
    }

    public File l(String str) {
        return new File(this.f30621f, str);
    }

    public List m() {
        return w(this.f30621f.listFiles());
    }

    public File n(String str) {
        return new File(this.f30620e, str);
    }

    public List o() {
        return w(this.f30620e.listFiles());
    }

    public final File p(String str) {
        return u(new File(this.f30619d, str));
    }

    public File q(String str, String str2) {
        return new File(p(str), str2);
    }

    public List r(String str, FilenameFilter filenameFilter) {
        return w(p(str).listFiles(filenameFilter));
    }

    public final boolean y() {
        return !this.f30616a.isEmpty();
    }
}
