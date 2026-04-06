package androidx.compose.runtime.snapshots;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

@Metadata
public interface SnapshotContextElement extends CoroutineContext.Element {

    /* renamed from: c  reason: collision with root package name */
    public static final Key f15263c = Key.f15264z;

    @Metadata
    public static final class DefaultImpls {
        public static Object a(SnapshotContextElement snapshotContextElement, Object obj, Function2 function2) {
            return CoroutineContext.Element.DefaultImpls.a(snapshotContextElement, obj, function2);
        }

        public static CoroutineContext.Element b(SnapshotContextElement snapshotContextElement, CoroutineContext.Key key) {
            return CoroutineContext.Element.DefaultImpls.b(snapshotContextElement, key);
        }

        public static CoroutineContext c(SnapshotContextElement snapshotContextElement, CoroutineContext.Key key) {
            return CoroutineContext.Element.DefaultImpls.c(snapshotContextElement, key);
        }

        public static CoroutineContext d(SnapshotContextElement snapshotContextElement, CoroutineContext coroutineContext) {
            return CoroutineContext.Element.DefaultImpls.d(snapshotContextElement, coroutineContext);
        }
    }

    @Metadata
    public static final class Key implements CoroutineContext.Key<SnapshotContextElement> {

        /* renamed from: z  reason: collision with root package name */
        public static final /* synthetic */ Key f15264z = new Key();
    }
}
