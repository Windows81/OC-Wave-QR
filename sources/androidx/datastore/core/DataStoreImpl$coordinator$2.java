package androidx.datastore.core;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class DataStoreImpl$coordinator$2 extends Lambda implements Function0<InterProcessCoordinator> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ DataStoreImpl f20569z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DataStoreImpl$coordinator$2(DataStoreImpl dataStoreImpl) {
        super(0);
        this.f20569z = dataStoreImpl;
    }

    /* renamed from: b */
    public final InterProcessCoordinator invoke() {
        return this.f20569z.s().c();
    }
}
