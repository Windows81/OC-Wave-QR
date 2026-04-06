package androidx.compose.runtime.tooling;

import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.changelist.OperationErrorContext;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class CompositionErrorContextImpl implements CompositionErrorContext, OperationErrorContext, CoroutineContext.Element {

    /* renamed from: A  reason: collision with root package name */
    public static final Key f15392A = new Key((DefaultConstructorMarker) null);

    /* renamed from: B  reason: collision with root package name */
    public static final int f15393B = 8;

    /* renamed from: z  reason: collision with root package name */
    public final ComposerImpl f15394z;

    @Metadata
    public static final class Key implements CoroutineContext.Key<CompositionErrorContextImpl> {
        public /* synthetic */ Key(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public String toString() {
            return "CompositionErrorContext";
        }

        public Key() {
        }
    }

    public CompositionErrorContextImpl(ComposerImpl composerImpl) {
        this.f15394z = composerImpl;
    }

    public static final List i(CompositionErrorContextImpl compositionErrorContextImpl, Object obj) {
        return compositionErrorContextImpl.f15394z.B1(obj);
    }

    public CoroutineContext.Element d(CoroutineContext.Key key) {
        return CoroutineContext.Element.DefaultImpls.b(this, key);
    }

    public boolean e(Throwable th, Object obj) {
        return ComposeStackTraceKt.c(th, new a(this, obj));
    }

    public List f(Integer num) {
        return this.f15394z.e1();
    }

    public CoroutineContext g(CoroutineContext.Key key) {
        return CoroutineContext.Element.DefaultImpls.c(this, key);
    }

    public CoroutineContext.Key getKey() {
        return f15392A;
    }

    public Object k(Object obj, Function2 function2) {
        return CoroutineContext.Element.DefaultImpls.a(this, obj, function2);
    }

    public CoroutineContext y(CoroutineContext coroutineContext) {
        return CoroutineContext.Element.DefaultImpls.d(this, coroutineContext);
    }
}
