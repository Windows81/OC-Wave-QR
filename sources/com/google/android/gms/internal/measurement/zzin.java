package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.StrictMode;
import android.util.Log;
import androidx.collection.SimpleArrayMap;
import com.google.common.base.Optional;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public final class zzin {

    public static class zza {

        /* renamed from: a  reason: collision with root package name */
        public static volatile Optional f25520a;

        public static Optional a(Context context) {
            Optional optional;
            Optional optional2 = f25520a;
            if (optional2 == null) {
                synchronized (zza.class) {
                    try {
                        optional2 = f25520a;
                        if (optional2 == null) {
                            new zzin();
                            if (!zzio.c(Build.TYPE, Build.TAGS)) {
                                optional = Optional.a();
                            } else {
                                if (zzia.a()) {
                                    if (!context.isDeviceProtectedStorage()) {
                                        context = context.createDeviceProtectedStorageContext();
                                    }
                                }
                                optional = zzin.b(context);
                            }
                            f25520a = optional;
                            optional2 = optional;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return optional2;
        }
    }

    public static zzil a(Context context, File file) {
        BufferedReader bufferedReader;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
            SimpleArrayMap simpleArrayMap = new SimpleArrayMap();
            HashMap hashMap = new HashMap();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    String[] split = readLine.split(" ", 3);
                    if (split.length != 3) {
                        Log.e("HermeticFileOverrides", "Invalid: " + readLine);
                    } else {
                        String c2 = c(split[0]);
                        String decode = Uri.decode(c(split[1]));
                        String str = (String) hashMap.get(split[2]);
                        if (str == null) {
                            String c3 = c(split[2]);
                            str = Uri.decode(c3);
                            if (str.length() < 1024 || str == c3) {
                                hashMap.put(c3, str);
                            }
                        }
                        SimpleArrayMap simpleArrayMap2 = (SimpleArrayMap) simpleArrayMap.get(c2);
                        if (simpleArrayMap2 == null) {
                            simpleArrayMap2 = new SimpleArrayMap();
                            simpleArrayMap.put(c2, simpleArrayMap2);
                        }
                        simpleArrayMap2.put(decode, str);
                    }
                } else {
                    String valueOf = String.valueOf(file);
                    String packageName = context.getPackageName();
                    Log.w("HermeticFileOverrides", "Parsed " + valueOf + " for Android package " + packageName);
                    zzig zzig = new zzig(simpleArrayMap);
                    bufferedReader.close();
                    return zzig;
                }
            }
        } catch (IOException e2) {
            throw new RuntimeException(e2);
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    public static Optional b(Context context) {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            StrictMode.allowThreadDiskWrites();
            Optional d2 = d(context);
            return d2.c() ? Optional.d(a(context, (File) d2.b())) : Optional.a();
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    public static final String c(String str) {
        return new String(str);
    }

    public static Optional d(Context context) {
        try {
            File file = new File(context.getDir("phenotype_hermetic", 0), "overrides.txt");
            return file.exists() ? Optional.d(file) : Optional.a();
        } catch (RuntimeException e2) {
            Log.e("HermeticFileOverrides", "no data dir", e2);
            return Optional.a();
        }
    }
}
