package com.google.firebase.crashlytics.internal.metadata;

import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.metadata.QueueFile;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Locale;

class QueueFileLogStore implements FileLogStore {

    /* renamed from: d  reason: collision with root package name */
    public static final Charset f30149d = Charset.forName("UTF-8");

    /* renamed from: a  reason: collision with root package name */
    public final File f30150a;

    /* renamed from: b  reason: collision with root package name */
    public final int f30151b;

    /* renamed from: c  reason: collision with root package name */
    public QueueFile f30152c;

    public static class LogBytes {

        /* renamed from: a  reason: collision with root package name */
        public final byte[] f30156a;

        /* renamed from: b  reason: collision with root package name */
        public final int f30157b;

        public LogBytes(byte[] bArr, int i2) {
            this.f30156a = bArr;
            this.f30157b = i2;
        }
    }

    public QueueFileLogStore(File file, int i2) {
        this.f30150a = file;
        this.f30151b = i2;
    }

    public void a() {
        CommonUtils.f(this.f30152c, "There was a problem closing the Crashlytics log file.");
        this.f30152c = null;
    }

    public String b() {
        byte[] c2 = c();
        if (c2 != null) {
            return new String(c2, f30149d);
        }
        return null;
    }

    public byte[] c() {
        LogBytes g2 = g();
        if (g2 == null) {
            return null;
        }
        int i2 = g2.f30157b;
        byte[] bArr = new byte[i2];
        System.arraycopy(g2.f30156a, 0, bArr, 0, i2);
        return bArr;
    }

    public void d() {
        a();
        this.f30150a.delete();
    }

    public void e(long j2, String str) {
        h();
        f(j2, str);
    }

    public final void f(long j2, String str) {
        if (this.f30152c != null) {
            if (str == null) {
                str = "null";
            }
            try {
                int i2 = this.f30151b / 4;
                if (str.length() > i2) {
                    str = "..." + str.substring(str.length() - i2);
                }
                this.f30152c.f(String.format(Locale.US, "%d %s%n", new Object[]{Long.valueOf(j2), str.replaceAll("\r", " ").replaceAll("\n", " ")}).getBytes(f30149d));
                while (!this.f30152c.r() && this.f30152c.I() > this.f30151b) {
                    this.f30152c.E();
                }
            } catch (IOException e2) {
                Logger.f().e("There was a problem writing to the Crashlytics log.", e2);
            }
        }
    }

    public final LogBytes g() {
        if (!this.f30150a.exists()) {
            return null;
        }
        h();
        QueueFile queueFile = this.f30152c;
        if (queueFile == null) {
            return null;
        }
        final int[] iArr = {0};
        final byte[] bArr = new byte[queueFile.I()];
        try {
            this.f30152c.l(new QueueFile.ElementReader() {
                public void a(InputStream inputStream, int i2) {
                    try {
                        inputStream.read(bArr, iArr[0], i2);
                        int[] iArr = iArr;
                        iArr[0] = iArr[0] + i2;
                    } finally {
                        inputStream.close();
                    }
                }
            });
        } catch (IOException e2) {
            Logger.f().e("A problem occurred while reading the Crashlytics log file.", e2);
        }
        return new LogBytes(bArr, iArr[0]);
    }

    public final void h() {
        if (this.f30152c == null) {
            try {
                this.f30152c = new QueueFile(this.f30150a);
            } catch (IOException e2) {
                Logger f2 = Logger.f();
                f2.e("Could not open log file: " + this.f30150a, e2);
            }
        }
    }
}
