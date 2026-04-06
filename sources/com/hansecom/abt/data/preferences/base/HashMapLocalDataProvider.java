package com.hansecom.abt.data.preferences.base;

import androidx.datastore.core.DataStore;
import androidx.datastore.core.DataStoreFactory;
import androidx.datastore.core.Serializer;
import androidx.datastore.core.handlers.ReplaceFileCorruptionHandler;
import java.io.File;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
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
public abstract class HashMapLocalDataProvider<P, T> {

    /* renamed from: d  reason: collision with root package name */
    public static final Companion f33346d = new Companion((DefaultConstructorMarker) null);

    /* renamed from: e  reason: collision with root package name */
    public static final int f33347e = 8;

    /* renamed from: a  reason: collision with root package name */
    public final String f33348a;

    /* renamed from: b  reason: collision with root package name */
    public final Lazy f33349b;

    /* renamed from: c  reason: collision with root package name */
    public final Lazy f33350c = LazyKt.b(new b(this));

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

    public HashMapLocalDataProvider(String str, DataStoreFileProducer dataStoreFileProducer) {
        Intrinsics.i(str, "name");
        Intrinsics.i(dataStoreFileProducer, "dataStoreFileProducer");
        this.f33348a = str;
        this.f33349b = LazyKt.b(new a(dataStoreFileProducer, this));
    }

    public static final DataStore h(HashMapLocalDataProvider hashMapLocalDataProvider) {
        return DataStoreFactory.c(DataStoreFactory.f20547a, hashMapLocalDataProvider.g(hashMapLocalDataProvider.f33348a), (ReplaceFileCorruptionHandler) null, (List) null, (CoroutineScope) null, hashMapLocalDataProvider.q(), 14, (Object) null);
    }

    public static final Function0 r(DataStoreFileProducer dataStoreFileProducer, HashMapLocalDataProvider hashMapLocalDataProvider) {
        return new c(dataStoreFileProducer, hashMapLocalDataProvider);
    }

    public static final File s(DataStoreFileProducer dataStoreFileProducer, HashMapLocalDataProvider hashMapLocalDataProvider) {
        return (File) dataStoreFileProducer.a().invoke(hashMapLocalDataProvider.f33348a);
    }

    public final Serializer g(String str) {
        return new HashMapLocalDataProvider$buildCacheValueSerializer$1(this, str);
    }

    public final Map i(InputStream inputStream) {
        return (Map) m().invoke(StringsKt.x(ByteStreamsKt.c(inputStream)));
    }

    public final String j(Map map) {
        return (String) n().invoke(map);
    }

    public final String k(Object obj) {
        return obj instanceof Unit ? "Unit" : String.valueOf(obj.hashCode());
    }

    public final DataStore l() {
        return (DataStore) this.f33350c.getValue();
    }

    public abstract Function1 m();

    public abstract Function1 n();

    public final Flow o(Object obj) {
        Intrinsics.i(obj, "parameter");
        return new HashMapLocalDataProvider$getFlow$$inlined$map$1(l().getData(), this, obj);
    }

    public final String p() {
        return this.f33348a;
    }

    public final Function0 q() {
        return (Function0) this.f33349b.getValue();
    }

    public final Object t(Object obj, CacheValue cacheValue, Continuation continuation) {
        Object a2 = l().a(new HashMapLocalDataProvider$put$2(this, obj, cacheValue, (Continuation) null), continuation);
        return a2 == IntrinsicsKt.f() ? a2 : Unit.f40552a;
    }
}
