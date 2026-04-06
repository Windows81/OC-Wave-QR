package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpec;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class WideNavigationRailStateImpl implements WideNavigationRailState {

    /* renamed from: c  reason: collision with root package name */
    public static final Companion f11774c = new Companion((DefaultConstructorMarker) null);

    /* renamed from: d  reason: collision with root package name */
    public static final int f11775d = 8;

    /* renamed from: a  reason: collision with root package name */
    public final AnimationSpec f11776a;

    /* renamed from: b  reason: collision with root package name */
    public final Animatable f11777b;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public Object a(Continuation continuation) {
        Object f2 = Animatable.f(this.f11777b, Boxing.b(0.0f), this.f11776a, (Object) null, (Function1) null, continuation, 12, (Object) null);
        return f2 == IntrinsicsKt.f() ? f2 : Unit.f40552a;
    }
}
