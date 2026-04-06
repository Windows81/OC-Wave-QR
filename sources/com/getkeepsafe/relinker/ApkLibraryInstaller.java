package com.getkeepsafe.relinker;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import com.getkeepsafe.relinker.ReLinker;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public class ApkLibraryInstaller implements ReLinker.LibraryInstaller {

    public static class ZipFileInZipEntry {

        /* renamed from: a  reason: collision with root package name */
        public ZipFile f23777a;

        /* renamed from: b  reason: collision with root package name */
        public ZipEntry f23778b;

        public ZipFileInZipEntry(ZipFile zipFile, ZipEntry zipEntry) {
            this.f23777a = zipFile;
            this.f23778b = zipEntry;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: com.getkeepsafe.relinker.ApkLibraryInstaller$ZipFileInZipEntry} */
    /* JADX WARNING: type inference failed for: r0v0 */
    /* JADX WARNING: type inference failed for: r0v2 */
    /* JADX WARNING: type inference failed for: r0v3, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r0v4 */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0025, code lost:
        r9 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0026, code lost:
        r0 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x009f, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:?, code lost:
        r9 = new java.lang.String[]{r9.toString()};
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:?, code lost:
        r10 = r0.f23777a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x00b3, code lost:
        if (r10 != null) goto L_0x00b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x00b5, code lost:
        r10.close();
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:8:0x0010, B:63:0x009a] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x00b1 A[SYNTHETIC, Splitter:B:72:0x00b1] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(android.content.Context r9, java.lang.String[] r10, java.lang.String r11, java.io.File r12, com.getkeepsafe.relinker.ReLinkerInstance r13) {
        /*
            r8 = this;
            r0 = 0
            com.getkeepsafe.relinker.ApkLibraryInstaller$ZipFileInZipEntry r1 = r8.d(r9, r10, r11, r13)     // Catch:{ all -> 0x00ae }
            if (r1 == 0) goto L_0x009a
            r9 = 0
            r10 = r9
        L_0x0009:
            int r2 = r10 + 1
            r3 = 5
            if (r10 >= r3) goto L_0x008d
            java.lang.String r10 = "Found %s! Extracting..."
            java.lang.Object[] r3 = new java.lang.Object[]{r11}     // Catch:{ all -> 0x0025 }
            r13.i(r10, r3)     // Catch:{ all -> 0x0025 }
            boolean r10 = r12.exists()     // Catch:{ IOException -> 0x008a }
            if (r10 != 0) goto L_0x0029
            boolean r10 = r12.createNewFile()     // Catch:{ IOException -> 0x008a }
            if (r10 != 0) goto L_0x0029
            goto L_0x008a
        L_0x0025:
            r9 = move-exception
            r0 = r1
            goto L_0x00af
        L_0x0029:
            java.util.zip.ZipFile r10 = r1.f23777a     // Catch:{ FileNotFoundException -> 0x0078, IOException -> 0x0075, all -> 0x0072 }
            java.util.zip.ZipEntry r3 = r1.f23778b     // Catch:{ FileNotFoundException -> 0x0078, IOException -> 0x0075, all -> 0x0072 }
            java.io.InputStream r10 = r10.getInputStream(r3)     // Catch:{ FileNotFoundException -> 0x0078, IOException -> 0x0075, all -> 0x0072 }
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x0070, IOException -> 0x006e, all -> 0x006b }
            r3.<init>(r12)     // Catch:{ FileNotFoundException -> 0x0070, IOException -> 0x006e, all -> 0x006b }
            long r4 = r8.c(r10, r3)     // Catch:{ FileNotFoundException -> 0x0086, IOException -> 0x0082, all -> 0x0068 }
            java.io.FileDescriptor r6 = r3.getFD()     // Catch:{ FileNotFoundException -> 0x0086, IOException -> 0x0082, all -> 0x0068 }
            r6.sync()     // Catch:{ FileNotFoundException -> 0x0086, IOException -> 0x0082, all -> 0x0068 }
            long r6 = r12.length()     // Catch:{ FileNotFoundException -> 0x0086, IOException -> 0x0082, all -> 0x0068 }
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x0050
            r8.b(r10)     // Catch:{ all -> 0x0025 }
        L_0x004c:
            r8.b(r3)     // Catch:{ all -> 0x0025 }
            goto L_0x008a
        L_0x0050:
            r8.b(r10)     // Catch:{ all -> 0x0025 }
            r8.b(r3)     // Catch:{ all -> 0x0025 }
            r10 = 1
            r12.setReadable(r10, r9)     // Catch:{ all -> 0x0025 }
            r12.setExecutable(r10, r9)     // Catch:{ all -> 0x0025 }
            r12.setWritable(r10)     // Catch:{ all -> 0x0025 }
            java.util.zip.ZipFile r9 = r1.f23777a     // Catch:{ IOException -> 0x0067 }
            if (r9 == 0) goto L_0x0067
            r9.close()     // Catch:{ IOException -> 0x0067 }
        L_0x0067:
            return
        L_0x0068:
            r9 = move-exception
        L_0x0069:
            r0 = r10
            goto L_0x007b
        L_0x006b:
            r9 = move-exception
            r3 = r0
            goto L_0x0069
        L_0x006e:
            r3 = r0
            goto L_0x0082
        L_0x0070:
            r3 = r0
            goto L_0x0086
        L_0x0072:
            r9 = move-exception
            r3 = r0
            goto L_0x007b
        L_0x0075:
            r10 = r0
            r3 = r10
            goto L_0x0082
        L_0x0078:
            r10 = r0
            r3 = r10
            goto L_0x0086
        L_0x007b:
            r8.b(r0)     // Catch:{ all -> 0x0025 }
            r8.b(r3)     // Catch:{ all -> 0x0025 }
            throw r9     // Catch:{ all -> 0x0025 }
        L_0x0082:
            r8.b(r10)     // Catch:{ all -> 0x0025 }
            goto L_0x004c
        L_0x0086:
            r8.b(r10)     // Catch:{ all -> 0x0025 }
            goto L_0x004c
        L_0x008a:
            r10 = r2
            goto L_0x0009
        L_0x008d:
            java.lang.String r9 = "FATAL! Couldn't extract the library from the APK!"
            r13.h(r9)     // Catch:{ all -> 0x0025 }
            java.util.zip.ZipFile r9 = r1.f23777a     // Catch:{ IOException -> 0x0099 }
            if (r9 == 0) goto L_0x0099
            r9.close()     // Catch:{ IOException -> 0x0099 }
        L_0x0099:
            return
        L_0x009a:
            java.lang.String[] r9 = r8.e(r9, r11)     // Catch:{ Exception -> 0x009f }
            goto L_0x00a8
        L_0x009f:
            r9 = move-exception
            java.lang.String r9 = r9.toString()     // Catch:{ all -> 0x0025 }
            java.lang.String[] r9 = new java.lang.String[]{r9}     // Catch:{ all -> 0x0025 }
        L_0x00a8:
            com.getkeepsafe.relinker.MissingLibraryException r12 = new com.getkeepsafe.relinker.MissingLibraryException     // Catch:{ all -> 0x0025 }
            r12.<init>(r11, r10, r9)     // Catch:{ all -> 0x0025 }
            throw r12     // Catch:{ all -> 0x0025 }
        L_0x00ae:
            r9 = move-exception
        L_0x00af:
            if (r0 == 0) goto L_0x00b8
            java.util.zip.ZipFile r10 = r0.f23777a     // Catch:{ IOException -> 0x00b8 }
            if (r10 == 0) goto L_0x00b8
            r10.close()     // Catch:{ IOException -> 0x00b8 }
        L_0x00b8:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.getkeepsafe.relinker.ApkLibraryInstaller.a(android.content.Context, java.lang.String[], java.lang.String, java.io.File, com.getkeepsafe.relinker.ReLinkerInstance):void");
    }

    public final void b(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public final long c(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[4096];
        long j2 = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                outputStream.flush();
                return j2;
            }
            outputStream.write(bArr, 0, read);
            j2 += (long) read;
        }
    }

    public final ZipFileInZipEntry d(Context context, String[] strArr, String str, ReLinkerInstance reLinkerInstance) {
        String[] strArr2 = strArr;
        String[] f2 = f(context);
        int length = f2.length;
        int i2 = 0;
        while (true) {
            ZipFile zipFile = null;
            if (i2 >= length) {
                return null;
            }
            String str2 = f2[i2];
            int i3 = 0;
            while (true) {
                int i4 = i3 + 1;
                if (i3 >= 5) {
                    break;
                }
                try {
                    zipFile = new ZipFile(new File(str2), 1);
                    break;
                } catch (IOException unused) {
                    i3 = i4;
                }
            }
            if (zipFile == null) {
                String str3 = str;
                ReLinkerInstance reLinkerInstance2 = reLinkerInstance;
            } else {
                int i5 = 0;
                while (true) {
                    int i6 = i5 + 1;
                    if (i5 < 5) {
                        for (String append : strArr2) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("lib");
                            char c2 = File.separatorChar;
                            sb.append(c2);
                            sb.append(append);
                            sb.append(c2);
                            sb.append(str);
                            String sb2 = sb.toString();
                            reLinkerInstance.i("Looking for %s in APK %s...", sb2, str2);
                            ZipEntry entry = zipFile.getEntry(sb2);
                            if (entry != null) {
                                return new ZipFileInZipEntry(zipFile, entry);
                            }
                        }
                        String str4 = str;
                        ReLinkerInstance reLinkerInstance3 = reLinkerInstance;
                        i5 = i6;
                    } else {
                        String str5 = str;
                        ReLinkerInstance reLinkerInstance4 = reLinkerInstance;
                        try {
                            zipFile.close();
                            break;
                        } catch (IOException unused2) {
                        }
                    }
                }
            }
            i2++;
        }
    }

    public final String[] e(Context context, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("lib");
        char c2 = File.separatorChar;
        sb.append(c2);
        sb.append("([^\\");
        sb.append(c2);
        sb.append("]*)");
        sb.append(c2);
        sb.append(str);
        Pattern compile = Pattern.compile(sb.toString());
        HashSet hashSet = new HashSet();
        for (String file : f(context)) {
            try {
                Enumeration<? extends ZipEntry> entries = new ZipFile(new File(file), 1).entries();
                while (entries.hasMoreElements()) {
                    Matcher matcher = compile.matcher(((ZipEntry) entries.nextElement()).getName());
                    if (matcher.matches()) {
                        hashSet.add(matcher.group(1));
                    }
                }
            } catch (IOException unused) {
            }
        }
        return (String[]) hashSet.toArray(new String[hashSet.size()]);
    }

    public final String[] f(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        String[] strArr = applicationInfo.splitSourceDirs;
        if (strArr == null || strArr.length == 0) {
            return new String[]{applicationInfo.sourceDir};
        }
        String[] strArr2 = new String[(strArr.length + 1)];
        strArr2[0] = applicationInfo.sourceDir;
        System.arraycopy(strArr, 0, strArr2, 1, strArr.length);
        return strArr2;
    }
}
