package androidx.compose.ui.layout;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

@Metadata
public final class SubcomposeLayoutState {

    /* renamed from: f  reason: collision with root package name */
    public static final int f17164f = 8;

    /* renamed from: a  reason: collision with root package name */
    public final SubcomposeSlotReusePolicy f17165a;

    /* renamed from: b  reason: collision with root package name */
    public LayoutNodeSubcompositionsState f17166b;

    /* renamed from: c  reason: collision with root package name */
    public final Function2 f17167c;

    /* renamed from: d  reason: collision with root package name */
    public final Function2 f17168d;

    /* renamed from: e  reason: collision with root package name */
    public final Function2 f17169e;

    @Metadata
    public interface PrecomposedSlotHandle {
        void a(int i2, long j2) {
        }

        int b() {
            return 0;
        }

        void c(Object obj, Function1 function1) {
        }

        void d();
    }

    public SubcomposeLayoutState(SubcomposeSlotReusePolicy subcomposeSlotReusePolicy) {
        this.f17165a = subcomposeSlotReusePolicy;
        this.f17167c = new SubcomposeLayoutState$setRoot$1(this);
        this.f17168d = new SubcomposeLayoutState$setCompositionContext$1(this);
        this.f17169e = new SubcomposeLayoutState$setMeasurePolicy$1(this);
    }

    public final void d() {
        h().z();
    }

    public final Function2 e() {
        return this.f17168d;
    }

    public final Function2 f() {
        return this.f17169e;
    }

    public final Function2 g() {
        return this.f17167c;
    }

    public final LayoutNodeSubcompositionsState h() {
        LayoutNodeSubcompositionsState layoutNodeSubcompositionsState = this.f17166b;
        if (layoutNodeSubcompositionsState != null) {
            return layoutNodeSubcompositionsState;
        }
        throw new IllegalArgumentException("SubcomposeLayoutState is not attached to SubcomposeLayout");
    }

    public final PrecomposedSlotHandle i(Object obj, Function2 function2) {
        return h().F(obj, function2);
    }

    public SubcomposeLayoutState() {
        this(NoOpSubcomposeSlotReusePolicy.f17130a);
    }
}
