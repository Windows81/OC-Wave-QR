package androidx.compose.ui.platform;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;

@Metadata
public interface InfiniteAnimationPolicy extends CoroutineContext.Element {

    /* renamed from: j  reason: collision with root package name */
    public static final Key f17787j = Key.f17788z;

    @Metadata
    public static final class DefaultImpls {
    }

    @Metadata
    public static final class Key implements CoroutineContext.Key<InfiniteAnimationPolicy> {

        /* renamed from: z  reason: collision with root package name */
        public static final /* synthetic */ Key f17788z = new Key();
    }

    Object I(Function1 function1, Continuation continuation);

    CoroutineContext.Key getKey() {
        return f17787j;
    }
}
