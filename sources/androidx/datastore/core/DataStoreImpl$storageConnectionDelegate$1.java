package androidx.datastore.core;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class DataStoreImpl$storageConnectionDelegate$1 extends Lambda implements Function0<StorageConnection<T>> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ DataStoreImpl f20571z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DataStoreImpl$storageConnectionDelegate$1(DataStoreImpl dataStoreImpl) {
        super(0);
        this.f20571z = dataStoreImpl;
    }

    /* renamed from: b */
    public final StorageConnection invoke() {
        return this.f20571z.f20549a.a();
    }
}
