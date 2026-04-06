package androidx.profileinstaller;

import android.content.res.AssetManager;
import android.os.Build;
import androidx.profileinstaller.ProfileInstaller;
import com.google.api.Service;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.concurrent.Executor;

public class DeviceProfileWriter {

    /* renamed from: a  reason: collision with root package name */
    public final AssetManager f22757a;

    /* renamed from: b  reason: collision with root package name */
    public final Executor f22758b;

    /* renamed from: c  reason: collision with root package name */
    public final ProfileInstaller.DiagnosticsCallback f22759c;

    /* renamed from: d  reason: collision with root package name */
    public final byte[] f22760d;

    /* renamed from: e  reason: collision with root package name */
    public final File f22761e;

    /* renamed from: f  reason: collision with root package name */
    public final String f22762f;

    /* renamed from: g  reason: collision with root package name */
    public final String f22763g;

    /* renamed from: h  reason: collision with root package name */
    public final String f22764h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f22765i = false;

    /* renamed from: j  reason: collision with root package name */
    public DexProfileData[] f22766j;

    /* renamed from: k  reason: collision with root package name */
    public byte[] f22767k;

    public DeviceProfileWriter(AssetManager assetManager, Executor executor, ProfileInstaller.DiagnosticsCallback diagnosticsCallback, String str, String str2, String str3, File file) {
        this.f22757a = assetManager;
        this.f22758b = executor;
        this.f22759c = diagnosticsCallback;
        this.f22762f = str;
        this.f22763g = str2;
        this.f22764h = str3;
        this.f22761e = file;
        this.f22760d = d();
    }

    public static byte[] d() {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            return ProfileVersion.f22796a;
        }
        switch (i2) {
            case Service.BILLING_FIELD_NUMBER /*26*/:
                return ProfileVersion.f22799d;
            case 27:
                return ProfileVersion.f22798c;
            case Service.MONITORING_FIELD_NUMBER /*28*/:
            case Service.SYSTEM_PARAMETERS_FIELD_NUMBER /*29*/:
            case 30:
                return ProfileVersion.f22797b;
            default:
                return null;
        }
    }

    public static boolean k() {
        return Build.VERSION.SDK_INT >= 31;
    }

    public final DeviceProfileWriter b(DexProfileData[] dexProfileDataArr, byte[] bArr) {
        InputStream h2;
        try {
            h2 = h(this.f22757a, this.f22764h);
            if (h2 != null) {
                this.f22766j = ProfileTranscoder.r(h2, ProfileTranscoder.p(h2, ProfileTranscoder.f22784b), bArr, dexProfileDataArr);
                h2.close();
                return this;
            }
            if (h2 != null) {
                h2.close();
            }
            return null;
        } catch (FileNotFoundException e2) {
            this.f22759c.b(9, e2);
        } catch (IOException e3) {
            this.f22759c.b(7, e3);
        } catch (IllegalStateException e4) {
            this.f22766j = null;
            this.f22759c.b(8, e4);
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    public final void c() {
        if (!this.f22765i) {
            throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
        }
    }

    public boolean e() {
        if (this.f22760d == null) {
            l(3, Integer.valueOf(Build.VERSION.SDK_INT));
            return false;
        }
        if (!this.f22761e.exists()) {
            try {
                if (!this.f22761e.createNewFile()) {
                    l(4, (Object) null);
                    return false;
                }
            } catch (IOException unused) {
                l(4, (Object) null);
                return false;
            }
        } else if (!this.f22761e.canWrite()) {
            l(4, (Object) null);
            return false;
        }
        this.f22765i = true;
        return true;
    }

    public final InputStream f(AssetManager assetManager) {
        try {
            return h(assetManager, this.f22763g);
        } catch (FileNotFoundException e2) {
            this.f22759c.b(6, e2);
            return null;
        } catch (IOException e3) {
            this.f22759c.b(7, e3);
            return null;
        }
    }

    public final /* synthetic */ void g(int i2, Object obj) {
        this.f22759c.b(i2, obj);
    }

    public final InputStream h(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e2) {
            String message = e2.getMessage();
            if (message != null && message.contains("compressed")) {
                this.f22759c.a(5, (Object) null);
            }
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0020, code lost:
        r0 = b(r0, r2.f22760d);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public androidx.profileinstaller.DeviceProfileWriter i() {
        /*
            r2 = this;
            r2.c()
            byte[] r0 = r2.f22760d
            if (r0 != 0) goto L_0x0008
            return r2
        L_0x0008:
            android.content.res.AssetManager r0 = r2.f22757a
            java.io.InputStream r0 = r2.f(r0)
            if (r0 == 0) goto L_0x0016
            androidx.profileinstaller.DexProfileData[] r0 = r2.j(r0)
            r2.f22766j = r0
        L_0x0016:
            androidx.profileinstaller.DexProfileData[] r0 = r2.f22766j
            if (r0 == 0) goto L_0x0029
            boolean r1 = k()
            if (r1 == 0) goto L_0x0029
            byte[] r1 = r2.f22760d
            androidx.profileinstaller.DeviceProfileWriter r0 = r2.b(r0, r1)
            if (r0 == 0) goto L_0x0029
            return r0
        L_0x0029:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.profileinstaller.DeviceProfileWriter.i():androidx.profileinstaller.DeviceProfileWriter");
    }

    public final DexProfileData[] j(InputStream inputStream) {
        try {
            DexProfileData[] x2 = ProfileTranscoder.x(inputStream, ProfileTranscoder.p(inputStream, ProfileTranscoder.f22783a), this.f22762f);
            try {
                inputStream.close();
                return x2;
            } catch (IOException e2) {
                this.f22759c.b(7, e2);
                return x2;
            }
        } catch (IOException e3) {
            this.f22759c.b(7, e3);
            inputStream.close();
            return null;
        } catch (IllegalStateException e4) {
            this.f22759c.b(8, e4);
            try {
                inputStream.close();
            } catch (IOException e5) {
                this.f22759c.b(7, e5);
            }
            return null;
        } catch (Throwable th) {
            try {
                inputStream.close();
            } catch (IOException e6) {
                this.f22759c.b(7, e6);
            }
            throw th;
        }
    }

    public final void l(int i2, Object obj) {
        this.f22758b.execute(new a(this, i2, obj));
    }

    public DeviceProfileWriter m() {
        ByteArrayOutputStream byteArrayOutputStream;
        DexProfileData[] dexProfileDataArr = this.f22766j;
        byte[] bArr = this.f22760d;
        if (!(dexProfileDataArr == null || bArr == null)) {
            c();
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                ProfileTranscoder.F(byteArrayOutputStream, bArr);
                if (!ProfileTranscoder.C(byteArrayOutputStream, bArr, dexProfileDataArr)) {
                    this.f22759c.b(5, (Object) null);
                    this.f22766j = null;
                    byteArrayOutputStream.close();
                    return this;
                }
                this.f22767k = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
                this.f22766j = null;
            } catch (IOException e2) {
                this.f22759c.b(7, e2);
            } catch (IllegalStateException e3) {
                this.f22759c.b(8, e3);
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        }
        return this;
        throw th;
    }

    public boolean n() {
        ByteArrayInputStream byteArrayInputStream;
        FileChannel channel;
        FileLock tryLock;
        byte[] bArr = this.f22767k;
        if (bArr == null) {
            return false;
        }
        c();
        try {
            byteArrayInputStream = new ByteArrayInputStream(bArr);
            FileOutputStream fileOutputStream = new FileOutputStream(this.f22761e);
            try {
                channel = fileOutputStream.getChannel();
                tryLock = channel.tryLock();
                Encoding.l(byteArrayInputStream, fileOutputStream, tryLock);
                l(1, (Object) null);
                if (tryLock != null) {
                    tryLock.close();
                }
                channel.close();
                fileOutputStream.close();
                byteArrayInputStream.close();
                this.f22767k = null;
                this.f22766j = null;
                return true;
            } catch (Throwable th) {
                fileOutputStream.close();
                throw th;
            }
        } catch (FileNotFoundException e2) {
            l(6, e2);
            this.f22767k = null;
            this.f22766j = null;
            return false;
        } catch (IOException e3) {
            l(7, e3);
            this.f22767k = null;
            this.f22766j = null;
            return false;
        } catch (Throwable th2) {
            this.f22767k = null;
            this.f22766j = null;
            throw th2;
        }
        throw th;
        throw th;
        throw th;
    }
}
