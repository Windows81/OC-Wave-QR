package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.os.Build;
import androidx.concurrent.futures.ResolvableFuture;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Objects;

public final class ProfileVerifier {

    /* renamed from: a  reason: collision with root package name */
    public static final ResolvableFuture f22785a = ResolvableFuture.E();

    /* renamed from: b  reason: collision with root package name */
    public static final Object f22786b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public static CompilationStatus f22787c = null;

    public static class Api33Impl {
        public static PackageInfo a(PackageManager packageManager, Context context) {
            return packageManager.getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0));
        }
    }

    public static class Cache {

        /* renamed from: a  reason: collision with root package name */
        public final int f22788a;

        /* renamed from: b  reason: collision with root package name */
        public final int f22789b;

        /* renamed from: c  reason: collision with root package name */
        public final long f22790c;

        /* renamed from: d  reason: collision with root package name */
        public final long f22791d;

        public Cache(int i2, int i3, long j2, long j3) {
            this.f22788a = i2;
            this.f22789b = i3;
            this.f22790c = j2;
            this.f22791d = j3;
        }

        public static Cache a(File file) {
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
            try {
                Cache cache = new Cache(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
                dataInputStream.close();
                return cache;
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
            throw th;
        }

        public void b(File file) {
            file.delete();
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
            try {
                dataOutputStream.writeInt(this.f22788a);
                dataOutputStream.writeInt(this.f22789b);
                dataOutputStream.writeLong(this.f22790c);
                dataOutputStream.writeLong(this.f22791d);
                dataOutputStream.close();
                return;
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
            throw th;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof Cache)) {
                return false;
            }
            Cache cache = (Cache) obj;
            return this.f22789b == cache.f22789b && this.f22790c == cache.f22790c && this.f22788a == cache.f22788a && this.f22791d == cache.f22791d;
        }

        public int hashCode() {
            return Objects.hash(new Object[]{Integer.valueOf(this.f22789b), Long.valueOf(this.f22790c), Integer.valueOf(this.f22788a), Long.valueOf(this.f22791d)});
        }
    }

    public static class CompilationStatus {

        /* renamed from: a  reason: collision with root package name */
        public final int f22792a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f22793b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f22794c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f22795d;

        @Retention(RetentionPolicy.SOURCE)
        public @interface ResultCode {
        }

        public CompilationStatus(int i2, boolean z2, boolean z3, boolean z4) {
            this.f22792a = i2;
            this.f22794c = z3;
            this.f22793b = z2;
            this.f22795d = z4;
        }
    }

    public static long a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? Api33Impl.a(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    public static CompilationStatus b(int i2, boolean z2, boolean z3, boolean z4) {
        CompilationStatus compilationStatus = new CompilationStatus(i2, z2, z3, z4);
        f22787c = compilationStatus;
        f22785a.z(compilationStatus);
        return f22787c;
    }

    public static CompilationStatus c(Context context, boolean z2) {
        boolean z3;
        Cache cache;
        Cache cache2;
        AssetFileDescriptor openFd;
        Throwable th;
        CompilationStatus compilationStatus;
        if (!z2 && (compilationStatus = f22787c) != null) {
            return compilationStatus;
        }
        synchronized (f22786b) {
            if (!z2) {
                CompilationStatus compilationStatus2 = f22787c;
                if (compilationStatus2 != null) {
                    return compilationStatus2;
                }
            }
            int i2 = 0;
            try {
                openFd = context.getAssets().openFd("dexopt/baseline.prof");
                z3 = openFd.getLength() > 0;
                openFd.close();
            } catch (IOException unused) {
                z3 = false;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            int i3 = Build.VERSION.SDK_INT;
            if (i3 >= 28) {
                if (i3 != 30) {
                    File file = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                    long length = file.length();
                    boolean z4 = file.exists() && length > 0;
                    File file2 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                    long length2 = file2.length();
                    boolean z5 = file2.exists() && length2 > 0;
                    try {
                        long a2 = a(context);
                        File file3 = new File(context.getFilesDir(), "profileInstalled");
                        if (file3.exists()) {
                            try {
                                cache = Cache.a(file3);
                            } catch (IOException unused2) {
                                return b(131072, z4, z5, z3);
                            }
                        } else {
                            cache = null;
                        }
                        if (cache != null && cache.f22790c == a2) {
                            int i4 = cache.f22789b;
                            if (i4 != 2) {
                                i2 = i4;
                                if (z2 && z5 && i2 != 1) {
                                    i2 = 2;
                                }
                                if (cache != null && cache.f22789b == 2 && i2 == 1 && length < cache.f22791d) {
                                    i2 = 3;
                                }
                                cache2 = new Cache(1, i2, a2, length2);
                                if (cache == null || !cache.equals(cache2)) {
                                    cache2.b(file3);
                                }
                                CompilationStatus b2 = b(i2, z4, z5, z3);
                                return b2;
                            }
                        }
                        if (!z3) {
                            i2 = 327680;
                        } else if (z4) {
                            i2 = 1;
                        } else if (z5) {
                            i2 = 2;
                        }
                        i2 = 2;
                        i2 = 3;
                        cache2 = new Cache(1, i2, a2, length2);
                        try {
                            cache2.b(file3);
                        } catch (IOException unused3) {
                            i2 = 196608;
                        }
                        CompilationStatus b22 = b(i2, z4, z5, z3);
                        return b22;
                    } catch (PackageManager.NameNotFoundException unused4) {
                        return b(65536, z4, z5, z3);
                    }
                }
            }
            CompilationStatus b3 = b(262144, false, false, z3);
            return b3;
        }
        throw th;
    }
}
