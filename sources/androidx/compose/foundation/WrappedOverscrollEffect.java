package androidx.compose.foundation;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.unit.Velocity;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class WrappedOverscrollEffect implements OverscrollEffect {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f3187a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f3188b;

    /* renamed from: c  reason: collision with root package name */
    public final OverscrollEffect f3189c;

    /* renamed from: d  reason: collision with root package name */
    public final DelegatableNode f3190d;

    public DelegatableNode M() {
        return this.f3190d;
    }

    public long N(long j2, int i2, Function1 function1) {
        return this.f3188b ? this.f3189c.N(j2, i2, function1) : ((Offset) function1.invoke(Offset.d(j2))).t();
    }

    public Object O(long j2, Function2 function2, Continuation continuation) {
        if (this.f3188b) {
            Object O = this.f3189c.O(j2, function2, continuation);
            return O == IntrinsicsKt.f() ? O : Unit.f40552a;
        }
        Object m2 = function2.m(Velocity.b(j2), continuation);
        return m2 == IntrinsicsKt.f() ? m2 : Unit.f40552a;
    }

    public boolean P() {
        return this.f3189c.P();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WrappedOverscrollEffect)) {
            return false;
        }
        WrappedOverscrollEffect wrappedOverscrollEffect = (WrappedOverscrollEffect) obj;
        return this.f3187a == wrappedOverscrollEffect.f3187a && this.f3188b == wrappedOverscrollEffect.f3188b && Intrinsics.d(this.f3189c, wrappedOverscrollEffect.f3189c);
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.f3187a) * 31) + Boolean.hashCode(this.f3188b)) * 31) + this.f3189c.hashCode();
    }
}
