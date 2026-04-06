package com.google.firebase.crashlytics.internal.common;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;
import java.util.zip.GZIPOutputStream;

class NativeSessionFileGzipper {
    public static void a(InputStream inputStream, File file) {
        if (inputStream != null) {
            byte[] bArr = new byte[8192];
            GZIPOutputStream gZIPOutputStream = null;
            try {
                GZIPOutputStream gZIPOutputStream2 = new GZIPOutputStream(new FileOutputStream(file));
                while (true) {
                    try {
                        int read = inputStream.read(bArr);
                        if (read > 0) {
                            gZIPOutputStream2.write(bArr, 0, read);
                        } else {
                            gZIPOutputStream2.finish();
                            CommonUtils.g(gZIPOutputStream2);
                            return;
                        }
                    } catch (Throwable th) {
                        th = th;
                        gZIPOutputStream = gZIPOutputStream2;
                        CommonUtils.g(gZIPOutputStream);
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                CommonUtils.g(gZIPOutputStream);
                throw th;
            }
        }
    }

    public static void b(File file, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            NativeSessionFile nativeSessionFile = (NativeSessionFile) it.next();
            InputStream inputStream = null;
            try {
                inputStream = nativeSessionFile.b();
                if (inputStream != null) {
                    a(inputStream, new File(file, nativeSessionFile.a()));
                }
            } catch (IOException unused) {
            } catch (Throwable th) {
                CommonUtils.g(inputStream);
                throw th;
            }
            CommonUtils.g(inputStream);
        }
    }
}
