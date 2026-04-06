package com.google.firebase.crashlytics.internal.common;

import android.os.Process;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicLong;

class CLSUUID {

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicLong f29956a = new AtomicLong(0);

    /* renamed from: b  reason: collision with root package name */
    public static String f29957b;

    public CLSUUID(IdManager idManager) {
        byte[] bArr = new byte[10];
        e(bArr);
        d(bArr);
        c(bArr);
        String z2 = CommonUtils.z(idManager.a().c());
        String t2 = CommonUtils.t(bArr);
        Locale locale = Locale.US;
        f29957b = String.format(locale, "%s%s%s%s", new Object[]{t2.substring(0, 12), t2.substring(12, 16), t2.subSequence(16, 20), z2.substring(0, 12)}).toUpperCase(locale);
    }

    public static byte[] a(long j2) {
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.putInt((int) j2);
        allocate.order(ByteOrder.BIG_ENDIAN);
        allocate.position(0);
        return allocate.array();
    }

    public static byte[] b(long j2) {
        ByteBuffer allocate = ByteBuffer.allocate(2);
        allocate.putShort((short) ((int) j2));
        allocate.order(ByteOrder.BIG_ENDIAN);
        allocate.position(0);
        return allocate.array();
    }

    public final void c(byte[] bArr) {
        byte[] b2 = b((long) Integer.valueOf(Process.myPid()).shortValue());
        bArr[8] = b2[0];
        bArr[9] = b2[1];
    }

    public final void d(byte[] bArr) {
        byte[] b2 = b(f29956a.incrementAndGet());
        bArr[6] = b2[0];
        bArr[7] = b2[1];
    }

    public final void e(byte[] bArr) {
        long time = new Date().getTime();
        byte[] a2 = a(time / 1000);
        bArr[0] = a2[0];
        bArr[1] = a2[1];
        bArr[2] = a2[2];
        bArr[3] = a2[3];
        byte[] b2 = b(time % 1000);
        bArr[4] = b2[0];
        bArr[5] = b2[1];
    }

    public String toString() {
        return f29957b;
    }
}
