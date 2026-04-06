package androidx.compose.foundation.layout;

import android.view.WindowInsetsAnimationController;
import androidx.compose.animation.core.SuspendAnimationKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;

@Metadata
@DebugMetadata(c = "androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$2", f = "WindowInsetsConnection.android.kt", l = {345}, m = "invokeSuspend")
public final class WindowInsetsNestedScrollConnection$fling$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int D;
    public /* synthetic */ Object E;
    public final /* synthetic */ WindowInsetsNestedScrollConnection F;
    public final /* synthetic */ int G;
    public final /* synthetic */ float H;
    public final /* synthetic */ SplineBasedFloatDecayAnimationSpec I;
    public final /* synthetic */ int J;
    public final /* synthetic */ int K;
    public final /* synthetic */ Ref.FloatRef L;
    public final /* synthetic */ WindowInsetsAnimationController M;
    public final /* synthetic */ boolean N;

    @Metadata
    @DebugMetadata(c = "androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$2$1", f = "WindowInsetsConnection.android.kt", l = {329}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$2$1  reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int D;

        /* renamed from: A */
        public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
            return ((AnonymousClass1) s(coroutineScope, continuation)).x(Unit.f40552a);
        }

        public final Continuation s(Object obj, Continuation continuation) {
            return new AnonymousClass1(i3, f3, splineBasedFloatDecayAnimationSpec, i4, i5, windowInsetsNestedScrollConnection2, floatRef, windowInsetsAnimationController, z2, continuation);
        }

        public final Object x(Object obj) {
            Object f2 = IntrinsicsKt.f();
            int i2 = this.D;
            if (i2 == 0) {
                ResultKt.b(obj);
                float f3 = f3;
                SplineBasedFloatDecayAnimationSpec splineBasedFloatDecayAnimationSpec = splineBasedFloatDecayAnimationSpec;
                final int i3 = i4;
                final int i4 = i5;
                final WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection = windowInsetsNestedScrollConnection2;
                final Ref.FloatRef floatRef = floatRef;
                final WindowInsetsAnimationController windowInsetsAnimationController = windowInsetsAnimationController;
                final boolean z2 = z2;
                AnonymousClass1 r4 = new Function2<Float, Float, Unit>() {
                    public final void b(float f2, float f3) {
                        float f4 = (float) i3;
                        if (f2 > ((float) i4) || f4 > f2) {
                            floatRef.f40905z = f3;
                            windowInsetsAnimationController.finish(z2);
                            windowInsetsNestedScrollConnection.D = null;
                            Job c2 = windowInsetsNestedScrollConnection.H;
                            if (c2 != null) {
                                c2.c(new WindowInsetsAnimationCancelledException());
                                return;
                            }
                            return;
                        }
                        windowInsetsNestedScrollConnection.h(f2);
                    }

                    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
                        b(((Number) obj).floatValue(), ((Number) obj2).floatValue());
                        return Unit.f40552a;
                    }
                };
                this.D = 1;
                if (SuspendAnimationKt.g((float) i3, f3, splineBasedFloatDecayAnimationSpec, r4, this) == f2) {
                    return f2;
                }
            } else if (i2 == 1) {
                ResultKt.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return Unit.f40552a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WindowInsetsNestedScrollConnection$fling$2(WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection, int i2, float f2, SplineBasedFloatDecayAnimationSpec splineBasedFloatDecayAnimationSpec, int i3, int i4, Ref.FloatRef floatRef, WindowInsetsAnimationController windowInsetsAnimationController, boolean z2, Continuation continuation) {
        super(2, continuation);
        this.F = windowInsetsNestedScrollConnection;
        this.G = i2;
        this.H = f2;
        this.I = splineBasedFloatDecayAnimationSpec;
        this.J = i3;
        this.K = i4;
        this.L = floatRef;
        this.M = windowInsetsAnimationController;
        this.N = z2;
    }

    /* renamed from: A */
    public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
        return ((WindowInsetsNestedScrollConnection$fling$2) s(coroutineScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        WindowInsetsNestedScrollConnection$fling$2 windowInsetsNestedScrollConnection$fling$2 = new WindowInsetsNestedScrollConnection$fling$2(this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, continuation);
        windowInsetsNestedScrollConnection$fling$2.E = obj;
        return windowInsetsNestedScrollConnection$fling$2;
    }

    public final Object x(Object obj) {
        Object f2 = IntrinsicsKt.f();
        int i2 = this.D;
        if (i2 == 0) {
            ResultKt.b(obj);
            WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection = this.F;
            final int i3 = this.G;
            final float f3 = this.H;
            final SplineBasedFloatDecayAnimationSpec splineBasedFloatDecayAnimationSpec = this.I;
            final int i4 = this.J;
            final int i5 = this.K;
            final Ref.FloatRef floatRef = this.L;
            final WindowInsetsAnimationController windowInsetsAnimationController = this.M;
            final boolean z2 = this.N;
            final WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection2 = windowInsetsNestedScrollConnection;
            windowInsetsNestedScrollConnection.H = BuildersKt__Builders_commonKt.d((CoroutineScope) this.E, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1((Continuation) null), 3, (Object) null);
            Job c2 = this.F.H;
            if (c2 != null) {
                this.D = 1;
                if (c2.D(this) == f2) {
                    return f2;
                }
            }
        } else if (i2 == 1) {
            ResultKt.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this.F.H = null;
        return Unit.f40552a;
    }
}
