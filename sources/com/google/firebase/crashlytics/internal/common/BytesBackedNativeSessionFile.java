package com.google.firebase.crashlytics.internal.common;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPOutputStream;

class BytesBackedNativeSessionFile implements NativeSessionFile {

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f29953a;

    /* renamed from: b  reason: collision with root package name */
    public final String f29954b;

    /* renamed from: c  reason: collision with root package name */
    public final String f29955c;

    public BytesBackedNativeSessionFile(String str, String str2, byte[] bArr) {
        this.f29954b = str;
        this.f29955c = str2;
        this.f29953a = bArr;
    }

    public String a() {
        return this.f29955c;
    }

    public InputStream b() {
        if (e()) {
            return null;
        }
        return new ByteArrayInputStream(this.f29953a);
    }

    public CrashlyticsReport.FilesPayload.File c() {
        byte[] d2 = d();
        if (d2 == null) {
            return null;
        }
        return CrashlyticsReport.FilesPayload.File.a().b(d2).c(this.f29954b).a();
    }

    public final byte[] d() {
        ByteArrayOutputStream byteArrayOutputStream;
        GZIPOutputStream gZIPOutputStream;
        if (e()) {
            return null;
        }
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(this.f29953a);
            gZIPOutputStream.finish();
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (IOException unused) {
            return null;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
        throw th;
    }

    public final boolean e() {
        byte[] bArr = this.f29953a;
        return bArr == null || bArr.length == 0;
    }
}
