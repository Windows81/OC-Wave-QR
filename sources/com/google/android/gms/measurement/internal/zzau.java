package com.google.android.gms.measurement.internal;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.zzcf;
import java.io.File;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public final class zzau {
    public static Set a(SQLiteDatabase sQLiteDatabase, String str) {
        HashSet hashSet = new HashSet();
        Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT * FROM " + str + " LIMIT 0", (String[]) null);
        try {
            Collections.addAll(hashSet, rawQuery.getColumnNames());
            return hashSet;
        } finally {
            rawQuery.close();
        }
    }

    public static void b(zzgi zzgi, SQLiteDatabase sQLiteDatabase) {
        if (zzgi != null) {
            File file = new File(zzcf.a().m(sQLiteDatabase.getPath()));
            if (!file.setReadable(false, false)) {
                zzgi.L().a("Failed to turn off database read permission");
            }
            if (!file.setWritable(false, false)) {
                zzgi.L().a("Failed to turn off database write permission");
            }
            if (!file.setReadable(true, true)) {
                zzgi.L().a("Failed to turn on database read permission for owner");
            }
            if (!file.setWritable(true, true)) {
                zzgi.L().a("Failed to turn on database write permission for owner");
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Monitor must not be null");
    }

    public static void c(zzgi zzgi, SQLiteDatabase sQLiteDatabase, String str, String str2, String str3, String[] strArr) {
        if (zzgi != null) {
            if (!d(zzgi, sQLiteDatabase, str)) {
                sQLiteDatabase.execSQL(str2);
            }
            try {
                Set a2 = a(sQLiteDatabase, str);
                String[] split = str3.split(",");
                int length = split.length;
                int i2 = 0;
                while (i2 < length) {
                    String str4 = split[i2];
                    if (a2.remove(str4)) {
                        i2++;
                    } else {
                        throw new SQLiteException("Table " + str + " is missing required column: " + str4);
                    }
                }
                if (strArr != null) {
                    for (int i3 = 0; i3 < strArr.length; i3 += 2) {
                        if (!a2.remove(strArr[i3])) {
                            sQLiteDatabase.execSQL(strArr[i3 + 1]);
                        }
                    }
                }
                if (!a2.isEmpty()) {
                    zzgi.L().c("Table has extra columns. table, columns", str, TextUtils.join(", ", a2));
                }
            } catch (SQLiteException e2) {
                zzgi.G().b("Failed to verify columns on table that was just created", str);
                throw e2;
            }
        } else {
            throw new IllegalArgumentException("Monitor must not be null");
        }
    }

    public static boolean d(zzgi zzgi, SQLiteDatabase sQLiteDatabase, String str) {
        if (zzgi != null) {
            Cursor cursor = null;
            try {
                Cursor query = sQLiteDatabase.query("SQLITE_MASTER", new String[]{"name"}, "name=?", new String[]{str}, (String) null, (String) null, (String) null);
                boolean moveToFirst = query.moveToFirst();
                query.close();
                return moveToFirst;
            } catch (SQLiteException e2) {
                zzgi.L().c("Error querying for table", str, e2);
                if (cursor == null) {
                    return false;
                }
                cursor.close();
                return false;
            } catch (Throwable th) {
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } else {
            throw new IllegalArgumentException("Monitor must not be null");
        }
    }
}
