package coil.util;

import android.os.SystemClock;
import java.io.File;
import kotlin.Metadata;

@Metadata
final class FileDescriptorCounter {

    /* renamed from: a  reason: collision with root package name */
    public static final FileDescriptorCounter f23748a = new FileDescriptorCounter();

    /* renamed from: b  reason: collision with root package name */
    public static final File f23749b = new File("/proc/self/fd");

    /* renamed from: c  reason: collision with root package name */
    public static int f23750c = 30;

    /* renamed from: d  reason: collision with root package name */
    public static long f23751d = SystemClock.uptimeMillis();

    /* renamed from: e  reason: collision with root package name */
    public static boolean f23752e = true;

    public final boolean a() {
        int i2 = f23750c;
        f23750c = i2 + 1;
        return i2 >= 30 || SystemClock.uptimeMillis() > f23751d + ((long) 30000);
    }

    public final synchronized boolean b(Logger logger) {
        try {
            if (a()) {
                boolean z2 = false;
                f23750c = 0;
                f23751d = SystemClock.uptimeMillis();
                String[] list = f23749b.list();
                if (list == null) {
                    list = new String[0];
                }
                int length = list.length;
                if (length < 800) {
                    z2 = true;
                }
                f23752e = z2;
                if (!z2 && logger != null && logger.a() <= 5) {
                    logger.b("FileDescriptorCounter", 5, "Unable to allocate more hardware bitmaps. Number of used file descriptors: " + length, (Throwable) null);
                }
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
        return f23752e;
    }
}
