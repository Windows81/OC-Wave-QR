package com.hansecom.abt.data.repositories.base;

import com.hansecom.abt.data.preferences.base.BaseLocalDataProvider;
import com.hansecom.abt.data.preferences.base.Seconds;
import com.hansecom.abt.data.preferences.base.ValueLocalDataProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public abstract class ValueRepository<T> extends BaseRepository<T> {

    /* renamed from: j  reason: collision with root package name */
    public final ValueLocalDataProvider f33598j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ValueRepository(Seconds seconds, Seconds seconds2, ValueLocalDataProvider valueLocalDataProvider) {
        super(seconds, seconds2);
        Intrinsics.i(seconds, "timeToRefresh");
        Intrinsics.i(seconds2, "timeToExpiry");
        Intrinsics.i(valueLocalDataProvider, "localBaseRepository");
        this.f33598j = valueLocalDataProvider;
    }

    public /* bridge */ /* synthetic */ BaseLocalDataProvider t() {
        return this.f33598j;
    }

    public final String v() {
        return this.f33598j.z();
    }
}
