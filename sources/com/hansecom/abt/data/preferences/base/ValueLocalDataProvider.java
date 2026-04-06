package com.hansecom.abt.data.preferences.base;

import androidx.datastore.core.DataStore;
import androidx.datastore.core.DataStoreFactory;
import androidx.datastore.core.Serializer;
import androidx.datastore.core.handlers.ReplaceFileCorruptionHandler;
import java.io.File;
import java.io.InputStream;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.io.ByteStreamsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;

@Metadata
public abstract class ValueLocalDataProvider<T> extends BaseLocalDataProvider<T> {

    /* renamed from: d  reason: collision with root package name */
    public static final Companion f33368d = new Companion((DefaultConstructorMarker) null);

    /* renamed from: e  reason: collision with root package name */
    public static final int f33369e = 8;

    /* renamed from: a  reason: collision with root package name */
    public final String f33370a;

    /* renamed from: b  reason: collision with root package name */
    public final Lazy f33371b;

    /* renamed from: c  reason: collision with root package name */
    public final Lazy f33372c = LazyKt.b(new e(this));

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    @Metadata
    public static abstract class EncoderDecoder<T> {
    }

    public ValueLocalDataProvider(String str, DataStoreFileProducer dataStoreFileProducer) {
        Intrinsics.i(str, "name");
        Intrinsics.i(dataStoreFileProducer, "dataStoreFileProducer");
        this.f33370a = str;
        this.f33371b = LazyKt.b(new d(dataStoreFileProducer, this));
    }

    public static final Function0 B(DataStoreFileProducer dataStoreFileProducer, ValueLocalDataProvider valueLocalDataProvider) {
        return new f(dataStoreFileProducer, valueLocalDataProvider);
    }

    public static final File C(DataStoreFileProducer dataStoreFileProducer, ValueLocalDataProvider valueLocalDataProvider) {
        return (File) dataStoreFileProducer.a().invoke(valueLocalDataProvider.f33370a);
    }

    public static final DataStore t(ValueLocalDataProvider valueLocalDataProvider) {
        return DataStoreFactory.c(DataStoreFactory.f20547a, valueLocalDataProvider.s(valueLocalDataProvider.f33370a), (ReplaceFileCorruptionHandler) null, (List) null, (CoroutineScope) null, valueLocalDataProvider.A(), 14, (Object) null);
    }

    public final Function0 A() {
        return (Function0) this.f33371b.getValue();
    }

    public final Flow d() {
        return w().getData();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object f(kotlin.coroutines.Continuation r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.hansecom.abt.data.preferences.base.ValueLocalDataProvider$getRefreshDate$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.hansecom.abt.data.preferences.base.ValueLocalDataProvider$getRefreshDate$1 r0 = (com.hansecom.abt.data.preferences.base.ValueLocalDataProvider$getRefreshDate$1) r0
            int r1 = r0.E
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.E = r1
            goto L_0x0018
        L_0x0013:
            com.hansecom.abt.data.preferences.base.ValueLocalDataProvider$getRefreshDate$1 r0 = new com.hansecom.abt.data.preferences.base.ValueLocalDataProvider$getRefreshDate$1
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.C
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.E
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            kotlin.ResultKt.b(r5)
            goto L_0x003d
        L_0x0029:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0031:
            kotlin.ResultKt.b(r5)
            r0.E = r3
            java.lang.Object r5 = r4.c(r0)
            if (r5 != r1) goto L_0x003d
            return r1
        L_0x003d:
            com.hansecom.abt.data.preferences.base.CacheValue r5 = (com.hansecom.abt.data.preferences.base.CacheValue) r5
            if (r5 == 0) goto L_0x0047
            java.time.LocalDateTime r5 = r5.d()
            if (r5 != 0) goto L_0x004e
        L_0x0047:
            java.time.LocalDateTime r5 = java.time.LocalDateTime.MIN
            java.lang.String r0 = "MIN"
            kotlin.jvm.internal.Intrinsics.h(r5, r0)
        L_0x004e:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.data.preferences.base.ValueLocalDataProvider.f(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Object j(CacheValue cacheValue, Continuation continuation) {
        Object a2 = w().a(new ValueLocalDataProvider$put$2(cacheValue, (Continuation) null), continuation);
        return a2 == IntrinsicsKt.f() ? a2 : Unit.f40552a;
    }

    public final Serializer s(String str) {
        return new ValueLocalDataProvider$buildCacheValueSerializer$1(this, str);
    }

    public final CacheValue u(InputStream inputStream) {
        String x2 = StringsKt.x(ByteStreamsKt.c(inputStream));
        if (StringsKt.l0(x2)) {
            return null;
        }
        return (CacheValue) x().invoke(x2);
    }

    public final String v(CacheValue cacheValue) {
        return (String) y().invoke(cacheValue);
    }

    public final DataStore w() {
        return (DataStore) this.f33372c.getValue();
    }

    public abstract Function1 x();

    public abstract Function1 y();

    public final String z() {
        return this.f33370a;
    }
}
