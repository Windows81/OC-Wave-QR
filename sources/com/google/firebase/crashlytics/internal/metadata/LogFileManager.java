package com.google.firebase.crashlytics.internal.metadata;

import com.google.firebase.crashlytics.internal.persistence.FileStore;
import java.io.File;

public class LogFileManager {

    /* renamed from: c  reason: collision with root package name */
    public static final NoopLogStore f30131c = new NoopLogStore();

    /* renamed from: a  reason: collision with root package name */
    public final FileStore f30132a;

    /* renamed from: b  reason: collision with root package name */
    public FileLogStore f30133b;

    public static final class NoopLogStore implements FileLogStore {
        public NoopLogStore() {
        }

        public void a() {
        }

        public String b() {
            return null;
        }

        public byte[] c() {
            return null;
        }

        public void d() {
        }

        public void e(long j2, String str) {
        }
    }

    public LogFileManager(FileStore fileStore) {
        this.f30132a = fileStore;
        this.f30133b = f30131c;
    }

    public void a() {
        this.f30133b.d();
    }

    public byte[] b() {
        return this.f30133b.c();
    }

    public String c() {
        return this.f30133b.b();
    }

    public final File d(String str) {
        return this.f30132a.q(str, "userlog");
    }

    public final void e(String str) {
        this.f30133b.a();
        this.f30133b = f30131c;
        if (str != null) {
            f(d(str), 65536);
        }
    }

    public void f(File file, int i2) {
        this.f30133b = new QueueFileLogStore(file, i2);
    }

    public void g(long j2, String str) {
        this.f30133b.e(j2, str);
    }

    public LogFileManager(FileStore fileStore, String str) {
        this(fileStore);
        e(str);
    }
}
