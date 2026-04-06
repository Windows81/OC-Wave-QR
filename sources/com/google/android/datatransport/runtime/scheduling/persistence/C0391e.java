package com.google.android.datatransport.runtime.scheduling.persistence;

import android.database.sqlite.SQLiteDatabase;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore;

/* renamed from: com.google.android.datatransport.runtime.scheduling.persistence.e  reason: case insensitive filesystem */
public final /* synthetic */ class C0391e implements SQLiteEventStore.Function {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ long f24278a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ TransportContext f24279b;

    public /* synthetic */ C0391e(long j2, TransportContext transportContext) {
        this.f24278a = j2;
        this.f24279b = transportContext;
    }

    public final Object apply(Object obj) {
        return SQLiteEventStore.S1(this.f24278a, this.f24279b, (SQLiteDatabase) obj);
    }
}
