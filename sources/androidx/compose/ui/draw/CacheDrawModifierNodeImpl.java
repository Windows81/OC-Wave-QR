package androidx.compose.ui.draw;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DrawModifierNodeKt;
import androidx.compose.ui.node.NodeKind;
import androidx.compose.ui.node.ObserverModifierNode;
import androidx.compose.ui.node.ObserverModifierNodeKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class CacheDrawModifierNodeImpl extends Modifier.Node implements CacheDrawModifierNode, ObserverModifierNode, BuildDrawCacheParams {
    public final CacheDrawScope N;
    public boolean O;
    public ScopedGraphicsContext P;
    public Function1 Q;

    public CacheDrawModifierNodeImpl(CacheDrawScope cacheDrawScope, Function1 function1) {
        this.N = cacheDrawScope;
        this.Q = function1;
        cacheDrawScope.C(this);
        cacheDrawScope.H(new Function0<GraphicsContext>(this) {

            /* renamed from: z  reason: collision with root package name */
            public final /* synthetic */ CacheDrawModifierNodeImpl f15696z;

            {
                this.f15696z = r1;
            }

            /* renamed from: b */
            public final GraphicsContext invoke() {
                return this.f15696z.a3();
            }
        });
    }

    public void G() {
        s0();
    }

    public void J2() {
        super.J2();
        ScopedGraphicsContext scopedGraphicsContext = this.P;
        if (scopedGraphicsContext != null) {
            scopedGraphicsContext.d();
        }
    }

    public void L1() {
        s0();
    }

    public void U(ContentDrawScope contentDrawScope) {
        b3(contentDrawScope).a().invoke(contentDrawScope);
    }

    public final Function1 Z2() {
        return this.Q;
    }

    public final GraphicsContext a3() {
        ScopedGraphicsContext scopedGraphicsContext = this.P;
        if (scopedGraphicsContext == null) {
            scopedGraphicsContext = new ScopedGraphicsContext();
            this.P = scopedGraphicsContext;
        }
        if (scopedGraphicsContext.c() == null) {
            scopedGraphicsContext.e(DelegatableNodeKt.l(this));
        }
        return scopedGraphicsContext;
    }

    public final DrawResult b3(ContentDrawScope contentDrawScope) {
        if (!this.O) {
            CacheDrawScope cacheDrawScope = this.N;
            cacheDrawScope.G((DrawResult) null);
            cacheDrawScope.F(contentDrawScope);
            ObserverModifierNodeKt.a(this, new CacheDrawModifierNodeImpl$getOrBuildCachedDrawBlock$1$1(this, cacheDrawScope));
            if (cacheDrawScope.b() != null) {
                this.O = true;
            } else {
                InlineClassHelperKt.d("DrawResult not defined, did you forget to call onDraw?");
                throw new KotlinNothingValueException();
            }
        }
        DrawResult b2 = this.N.b();
        Intrinsics.f(b2);
        return b2;
    }

    public long c() {
        return IntSizeKt.e(DelegatableNodeKt.j(this, NodeKind.a(128)).a());
    }

    public final void c3(Function1 function1) {
        this.Q = function1;
        s0();
    }

    public void e1() {
        s0();
    }

    public Density getDensity() {
        return DelegatableNodeKt.k(this);
    }

    public LayoutDirection getLayoutDirection() {
        return DelegatableNodeKt.n(this);
    }

    public void j1() {
        s0();
    }

    public void s0() {
        ScopedGraphicsContext scopedGraphicsContext = this.P;
        if (scopedGraphicsContext != null) {
            scopedGraphicsContext.d();
        }
        this.O = false;
        this.N.G((DrawResult) null);
        DrawModifierNodeKt.a(this);
    }
}
