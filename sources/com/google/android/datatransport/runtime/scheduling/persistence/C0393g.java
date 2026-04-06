package com.google.android.datatransport.runtime.scheduling.persistence;

import android.database.sqlite.SQLiteDatabase;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore;

/* renamed from: com.google.android.datatransport.runtime.scheduling.persistence.g  reason: case insensitive filesystem */
public final /* synthetic */ class C0393g implements SQLiteEventStore.Function {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f24281a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ LogEventDropped.Reason f24282b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ long f24283c;

    public /* synthetic */ C0393g(String str, LogEventDropped.Reason reason, long j2) {
        this.f24281a = str;
        this.f24282b = reason;
        this.f24283c = j2;
    }

    public final Object apply(Object obj) {
        return SQLiteEventStore.R1(this.f24281a, this.f24282b, this.f24283c, (SQLiteDatabase) obj);
    }
}
