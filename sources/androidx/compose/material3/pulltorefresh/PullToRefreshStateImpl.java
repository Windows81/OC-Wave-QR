package androidx.compose.material3.pulltorefresh;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FloatCompanionObject;

@Metadata
public final class PullToRefreshStateImpl implements PullToRefreshState {

    /* renamed from: b  reason: collision with root package name */
    public static final Companion f12616b = new Companion((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    public static final Saver f12617c = SaverKt.e(new n(), new o());

    /* renamed from: a  reason: collision with root package name */
    public final Animatable f12618a;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Saver a() {
            return PullToRefreshStateImpl.f12617c;
        }

        public Companion() {
        }
    }

    public PullToRefreshStateImpl(Animatable animatable) {
        this.f12618a = animatable;
    }

    public static final Float h(SaverScope saverScope, PullToRefreshStateImpl pullToRefreshStateImpl) {
        return (Float) pullToRefreshStateImpl.f12618a.m();
    }

    public static final PullToRefreshStateImpl i(float f2) {
        return new PullToRefreshStateImpl(new Animatable(Float.valueOf(f2), VectorConvertersKt.i(FloatCompanionObject.f40896a), (Object) null, (String) null, 12, (DefaultConstructorMarker) null));
    }

    public Object a(Continuation continuation) {
        Object f2 = Animatable.f(this.f12618a, Boxing.b(0.0f), (AnimationSpec) null, (Object) null, (Function1) null, continuation, 14, (Object) null);
        return f2 == IntrinsicsKt.f() ? f2 : Unit.f40552a;
    }

    public float b() {
        return ((Number) this.f12618a.m()).floatValue();
    }

    public boolean c() {
        return this.f12618a.p();
    }

    public Object d(float f2, Continuation continuation) {
        Object t2 = this.f12618a.t(Boxing.b(f2), continuation);
        return t2 == IntrinsicsKt.f() ? t2 : Unit.f40552a;
    }

    public Object e(Continuation continuation) {
        Object f2 = Animatable.f(this.f12618a, Boxing.b(1.0f), (AnimationSpec) null, (Object) null, (Function1) null, continuation, 14, (Object) null);
        return f2 == IntrinsicsKt.f() ? f2 : Unit.f40552a;
    }

    public PullToRefreshStateImpl() {
        this(new Animatable(Float.valueOf(0.0f), VectorConvertersKt.i(FloatCompanionObject.f40896a), (Object) null, (String) null, 12, (DefaultConstructorMarker) null));
    }
}
