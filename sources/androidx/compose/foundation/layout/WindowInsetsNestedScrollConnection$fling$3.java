package androidx.compose.foundation.layout;

import android.view.WindowInsetsAnimationController;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationVector1D;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;

@Metadata
@DebugMetadata(c = "androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$3", f = "WindowInsetsConnection.android.kt", l = {}, m = "invokeSuspend")
public final class WindowInsetsNestedScrollConnection$fling$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int D;
    public /* synthetic */ Object E;
    public final /* synthetic */ WindowInsetsNestedScrollConnection F;
    public final /* synthetic */ int G;
    public final /* synthetic */ int H;
    public final /* synthetic */ float I;
    public final /* synthetic */ WindowInsetsAnimationController J;
    public final /* synthetic */ boolean K;

    @Metadata
    @DebugMetadata(c = "androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$3$1", f = "WindowInsetsConnection.android.kt", l = {355}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$3$1  reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int D;

        /* renamed from: A */
        public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
            return ((AnonymousClass1) s(coroutineScope, continuation)).x(Unit.f40552a);
        }

        public final Continuation s(Object obj, Continuation continuation) {
            return new AnonymousClass1(i2, i3, f2, windowInsetsAnimationController, z2, windowInsetsNestedScrollConnection2, continuation);
        }

        public final Object x(Object obj) {
            Object f2 = IntrinsicsKt.f();
            int i2 = this.D;
            if (i2 == 0) {
                ResultKt.b(obj);
                Animatable b2 = AnimatableKt.b((float) i2, 0.0f, 2, (Object) null);
                Float b3 = Boxing.b((float) i3);
                Float b4 = Boxing.b(f2);
                final WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection = windowInsetsNestedScrollConnection2;
                AnonymousClass1 r9 = new Function1<Animatable<Float, AnimationVector1D>, Unit>() {
                    public final void b(Animatable animatable) {
                        windowInsetsNestedScrollConnection.h(((Number) animatable.m()).floatValue());
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        b((Animatable) obj);
                        return Unit.f40552a;
                    }
                };
                this.D = 1;
                if (Animatable.f(b2, b3, (AnimationSpec) null, b4, r9, this, 2, (Object) null) == f2) {
                    return f2;
                }
            } else if (i2 == 1) {
                ResultKt.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            windowInsetsAnimationController.finish(z2);
            windowInsetsNestedScrollConnection2.D = null;
            return Unit.f40552a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WindowInsetsNestedScrollConnection$fling$3(WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection, int i2, int i3, float f2, WindowInsetsAnimationController windowInsetsAnimationController, boolean z2, Continuation continuation) {
        super(2, continuation);
        this.F = windowInsetsNestedScrollConnection;
        this.G = i2;
        this.H = i3;
        this.I = f2;
        this.J = windowInsetsAnimationController;
        this.K = z2;
    }

    /* renamed from: A */
    public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
        return ((WindowInsetsNestedScrollConnection$fling$3) s(coroutineScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        WindowInsetsNestedScrollConnection$fling$3 windowInsetsNestedScrollConnection$fling$3 = new WindowInsetsNestedScrollConnection$fling$3(this.F, this.G, this.H, this.I, this.J, this.K, continuation);
        windowInsetsNestedScrollConnection$fling$3.E = obj;
        return windowInsetsNestedScrollConnection$fling$3;
    }

    public final Object x(Object obj) {
        IntrinsicsKt.f();
        if (this.D == 0) {
            ResultKt.b(obj);
            WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection = this.F;
            final int i2 = this.G;
            final int i3 = this.H;
            final float f2 = this.I;
            final WindowInsetsAnimationController windowInsetsAnimationController = this.J;
            final boolean z2 = this.K;
            final WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection2 = windowInsetsNestedScrollConnection;
            windowInsetsNestedScrollConnection.H = BuildersKt__Builders_commonKt.d((CoroutineScope) this.E, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1((Continuation) null), 3, (Object) null);
            return Unit.f40552a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
