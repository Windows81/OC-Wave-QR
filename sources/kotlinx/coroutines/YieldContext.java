package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class YieldContext extends AbstractCoroutineContextElement {

    /* renamed from: B  reason: collision with root package name */
    public static final Key f41442B = new Key((DefaultConstructorMarker) null);

    /* renamed from: A  reason: collision with root package name */
    public boolean f41443A;

    @Metadata
    public static final class Key implements CoroutineContext.Key<YieldContext> {
        public /* synthetic */ Key(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Key() {
        }
    }

    public YieldContext() {
        super(f41442B);
    }
}
