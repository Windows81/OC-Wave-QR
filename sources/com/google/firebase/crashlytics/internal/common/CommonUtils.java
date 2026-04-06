package com.google.firebase.crashlytics.internal.common;

import android.app.ActivityManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.hardware.SensorManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Debug;
import android.os.StatFs;
import android.text.TextUtils;
import com.google.firebase.crashlytics.internal.Logger;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class CommonUtils {

    /* renamed from: a  reason: collision with root package name */
    public static final char[] f29958a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public enum Architecture {
        X86_32,
        X86_64,
        ARM_UNKNOWN,
        PPC,
        PPC64,
        ARMV6,
        ARMV7,
        UNKNOWN,
        ARMV7S,
        ARM64;
        
        public static final Map J = null;

        static {
            Architecture architecture;
            Architecture architecture2;
            Architecture architecture3;
            Architecture architecture4;
            HashMap hashMap = new HashMap(4);
            J = hashMap;
            hashMap.put("armeabi-v7a", architecture3);
            hashMap.put("armeabi", architecture2);
            hashMap.put("arm64-v8a", architecture4);
            hashMap.put("x86", architecture);
        }

        public static Architecture f() {
            String str = Build.CPU_ABI;
            if (TextUtils.isEmpty(str)) {
                Logger.f().i("Architecture#getValue()::Build.CPU_ABI returned null or empty");
                return UNKNOWN;
            }
            Architecture architecture = (Architecture) J.get(str.toLowerCase(Locale.US));
            return architecture == null ? UNKNOWN : architecture;
        }
    }

    public static String A(InputStream inputStream) {
        Scanner useDelimiter = new Scanner(inputStream).useDelimiter("\\A");
        return useDelimiter.hasNext() ? useDelimiter.next() : "";
    }

    public static long a(Context context) {
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
        return memoryInfo.availMem;
    }

    public static synchronized long b(Context context) {
        long j2;
        synchronized (CommonUtils.class) {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
            j2 = memoryInfo.totalMem;
        }
        return j2;
    }

    public static long c(String str) {
        StatFs statFs = new StatFs(str);
        long blockSize = (long) statFs.getBlockSize();
        return (((long) statFs.getBlockCount()) * blockSize) - (blockSize * ((long) statFs.getAvailableBlocks()));
    }

    public static boolean d(Context context) {
        if (!e(context, "android.permission.ACCESS_NETWORK_STATE")) {
            return true;
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting();
    }

    public static boolean e(Context context, String str) {
        return context.checkCallingOrSelfPermission(str) == 0;
    }

    public static void f(Closeable closeable, String str) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e2) {
                Logger.f().e(str, e2);
            }
        }
    }

    public static void g(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused) {
            }
        }
    }

    public static String h(String... strArr) {
        if (strArr == null || strArr.length == 0) {
            return null;
        }
        ArrayList<String> arrayList = new ArrayList<>();
        for (String str : strArr) {
            if (str != null) {
                arrayList.add(str.replace("-", "").toLowerCase(Locale.US));
            }
        }
        Collections.sort(arrayList);
        StringBuilder sb = new StringBuilder();
        for (String append : arrayList) {
            sb.append(append);
        }
        String sb2 = sb.toString();
        if (sb2.length() > 0) {
            return z(sb2);
        }
        return null;
    }

    public static boolean i(Context context, String str, boolean z2) {
        Resources resources;
        if (!(context == null || (resources = context.getResources()) == null)) {
            int p2 = p(context, str, "bool");
            if (p2 > 0) {
                return resources.getBoolean(p2);
            }
            int p3 = p(context, str, "string");
            if (p3 > 0) {
                return Boolean.parseBoolean(context.getString(p3));
            }
        }
        return z2;
    }

    public static List j(Context context) {
        ArrayList arrayList = new ArrayList();
        int p2 = p(context, "com.google.firebase.crashlytics.build_ids_lib", "array");
        int p3 = p(context, "com.google.firebase.crashlytics.build_ids_arch", "array");
        int p4 = p(context, "com.google.firebase.crashlytics.build_ids_build_id", "array");
        if (p2 == 0 || p3 == 0 || p4 == 0) {
            Logger.f().b(String.format("Could not find resources: %d %d %d", new Object[]{Integer.valueOf(p2), Integer.valueOf(p3), Integer.valueOf(p4)}));
            return arrayList;
        }
        String[] stringArray = context.getResources().getStringArray(p2);
        String[] stringArray2 = context.getResources().getStringArray(p3);
        String[] stringArray3 = context.getResources().getStringArray(p4);
        if (stringArray.length == stringArray3.length && stringArray2.length == stringArray3.length) {
            for (int i2 = 0; i2 < stringArray3.length; i2++) {
                arrayList.add(new BuildIdInfo(stringArray[i2], stringArray2[i2], stringArray3[i2]));
            }
            return arrayList;
        }
        Logger.f().b(String.format("Lengths did not match: %d %d %d", new Object[]{Integer.valueOf(stringArray.length), Integer.valueOf(stringArray2.length), Integer.valueOf(stringArray3.length)}));
        return arrayList;
    }

    public static int k() {
        return Architecture.f().ordinal();
    }

    public static int l() {
        boolean w2 = w();
        if (x()) {
            w2 |= true;
        }
        return v() ? w2 | true ? 1 : 0 : w2 ? 1 : 0;
    }

    public static String m(Context context) {
        int p2 = p(context, "com.google.firebase.crashlytics.mapping_file_id", "string");
        if (p2 == 0) {
            p2 = p(context, "com.crashlytics.android.build_id", "string");
        }
        if (p2 != 0) {
            return context.getResources().getString(p2);
        }
        return null;
    }

    public static boolean n(Context context) {
        return !w() && ((SensorManager) context.getSystemService("sensor")).getDefaultSensor(8) != null;
    }

    public static String o(Context context) {
        int i2 = context.getApplicationContext().getApplicationInfo().icon;
        if (i2 <= 0) {
            return context.getPackageName();
        }
        try {
            String resourcePackageName = context.getResources().getResourcePackageName(i2);
            return "android".equals(resourcePackageName) ? context.getPackageName() : resourcePackageName;
        } catch (Resources.NotFoundException unused) {
            return context.getPackageName();
        }
    }

    public static int p(Context context, String str, String str2) {
        return context.getResources().getIdentifier(str, str2, o(context));
    }

    public static SharedPreferences q(Context context) {
        return context.getSharedPreferences("com.google.firebase.crashlytics", 0);
    }

    public static String r(String str, String str2) {
        return s(str.getBytes(), str2);
    }

    public static String s(byte[] bArr, String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance(str);
            instance.update(bArr);
            return t(instance.digest());
        } catch (NoSuchAlgorithmException e2) {
            Logger f2 = Logger.f();
            f2.e("Could not create hashing algorithm: " + str + ", returning empty string.", e2);
            return "";
        }
    }

    public static String t(byte[] bArr) {
        char[] cArr = new char[(bArr.length * 2)];
        for (int i2 = 0; i2 < bArr.length; i2++) {
            byte b2 = bArr[i2];
            int i3 = i2 * 2;
            char[] cArr2 = f29958a;
            cArr[i3] = cArr2[(b2 & 255) >>> 4];
            cArr[i3 + 1] = cArr2[b2 & 15];
        }
        return new String(cArr);
    }

    public static boolean u(Context context) {
        return (context.getApplicationInfo().flags & 2) != 0;
    }

    public static boolean v() {
        return Debug.isDebuggerConnected() || Debug.waitingForDebugger();
    }

    public static boolean w() {
        if (!Build.PRODUCT.contains("sdk")) {
            String str = Build.HARDWARE;
            return str.contains("goldfish") || str.contains("ranchu");
        }
    }

    public static boolean x() {
        boolean w2 = w();
        String str = Build.TAGS;
        if ((!w2 && str != null && str.contains("test-keys")) || new File("/system/app/Superuser.apk").exists()) {
            return true;
        }
        return !w2 && new File("/system/xbin/su").exists();
    }

    public static boolean y(String str, String str2) {
        return str == null ? str2 == null : str.equals(str2);
    }

    public static String z(String str) {
        return r(str, "SHA-1");
    }
}
