package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public abstract class zzck extends SQLiteOpenHelper {
    public zzck(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i2) {
        this(context, str, (SQLiteDatabase.CursorFactory) null, 1, zzcm.f25394a);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzck(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i2, zzcm zzcm) {
        super(context, (str == null || zzcf.a().a(str, zzcm, zzcj.SQLITE_OPEN_HELPER_TYPE).equals("")) ? null : str, (SQLiteDatabase.CursorFactory) null, 1);
    }
}
