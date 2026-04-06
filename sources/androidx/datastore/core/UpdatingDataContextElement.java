package androidx.datastore.core;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class UpdatingDataContextElement implements CoroutineContext.Element {

    /* renamed from: B  reason: collision with root package name */
    public static final Companion f20643B = new Companion((DefaultConstructorMarker) null);
    public static final String C = "Calling updateData inside updateData on the same DataStore instance is not supported\nsince updates made in the parent updateData call will not be visible to the nested\nupdateData call. See https://issuetracker.google.com/issues/241760537 for details.";

    /* renamed from: A  reason: collision with root package name */
    public final DataStoreImpl f20644A;

    /* renamed from: z  reason: collision with root package name */
    public final UpdatingDataContextElement f20645z;

    @Metadata
    public static final class Companion {

        @Metadata
        public static final class Key implements CoroutineContext.Key<UpdatingDataContextElement> {

            /* renamed from: z  reason: collision with root package name */
            public static final Key f20646z = new Key();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public UpdatingDataContextElement(UpdatingDataContextElement updatingDataContextElement, DataStoreImpl dataStoreImpl) {
        Intrinsics.i(dataStoreImpl, "instance");
        this.f20645z = updatingDataContextElement;
        this.f20644A = dataStoreImpl;
    }

    public CoroutineContext.Element d(CoroutineContext.Key key) {
        return CoroutineContext.Element.DefaultImpls.b(this, key);
    }

    public final void e(DataStore dataStore) {
        Intrinsics.i(dataStore, "candidate");
        if (this.f20644A != dataStore) {
            UpdatingDataContextElement updatingDataContextElement = this.f20645z;
            if (updatingDataContextElement != null) {
                updatingDataContextElement.e(dataStore);
                return;
            }
            return;
        }
        throw new IllegalStateException(C.toString());
    }

    public CoroutineContext g(CoroutineContext.Key key) {
        return CoroutineContext.Element.DefaultImpls.c(this, key);
    }

    public CoroutineContext.Key getKey() {
        return Companion.Key.f20646z;
    }

    public Object k(Object obj, Function2 function2) {
        return CoroutineContext.Element.DefaultImpls.a(this, obj, function2);
    }

    public CoroutineContext y(CoroutineContext coroutineContext) {
        return CoroutineContext.Element.DefaultImpls.d(this, coroutineContext);
    }
}
