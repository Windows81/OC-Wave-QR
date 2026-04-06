package androidx.activity;

import android.graphics.Rect;
import android.view.View;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;

@Metadata
@DebugMetadata(c = "androidx.activity.PipHintTrackerKt$trackPipAnimationHintView$flow$1", f = "PipHintTracker.kt", l = {86}, m = "invokeSuspend")
final class PipHintTrackerKt$trackPipAnimationHintView$flow$1 extends SuspendLambda implements Function2<ProducerScope<? super Rect>, Continuation<? super Unit>, Object> {
    public int D;
    public /* synthetic */ Object E;
    public final /* synthetic */ View F;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PipHintTrackerKt$trackPipAnimationHintView$flow$1(View view, Continuation continuation) {
        super(2, continuation);
        this.F = view;
    }

    public static final void D(ProducerScope producerScope, View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        if (i2 != i6 || i4 != i8 || i3 != i7 || i5 != i9) {
            Intrinsics.h(view, "v");
            producerScope.L(PipHintTrackerKt.b(view));
        }
    }

    public static final void E(ProducerScope producerScope, View view) {
        producerScope.L(PipHintTrackerKt.b(view));
    }

    /* renamed from: C */
    public final Object m(ProducerScope producerScope, Continuation continuation) {
        return ((PipHintTrackerKt$trackPipAnimationHintView$flow$1) s(producerScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        PipHintTrackerKt$trackPipAnimationHintView$flow$1 pipHintTrackerKt$trackPipAnimationHintView$flow$1 = new PipHintTrackerKt$trackPipAnimationHintView$flow$1(this.F, continuation);
        pipHintTrackerKt$trackPipAnimationHintView$flow$1.E = obj;
        return pipHintTrackerKt$trackPipAnimationHintView$flow$1;
    }

    public final Object x(Object obj) {
        Object f2 = IntrinsicsKt.f();
        int i2 = this.D;
        if (i2 == 0) {
            ResultKt.b(obj);
            ProducerScope producerScope = (ProducerScope) this.E;
            final s sVar = new s(producerScope);
            final t tVar = new t(producerScope, this.F);
            final PipHintTrackerKt$trackPipAnimationHintView$flow$1$attachStateChangeListener$1 pipHintTrackerKt$trackPipAnimationHintView$flow$1$attachStateChangeListener$1 = new PipHintTrackerKt$trackPipAnimationHintView$flow$1$attachStateChangeListener$1(producerScope, this.F, tVar, sVar);
            if (this.F.isAttachedToWindow()) {
                producerScope.L(PipHintTrackerKt.b(this.F));
                this.F.getViewTreeObserver().addOnScrollChangedListener(tVar);
                this.F.addOnLayoutChangeListener(sVar);
            }
            this.F.addOnAttachStateChangeListener(pipHintTrackerKt$trackPipAnimationHintView$flow$1$attachStateChangeListener$1);
            final View view = this.F;
            AnonymousClass1 r5 = new Function0<Unit>() {
                public final void invoke() {
                    view.getViewTreeObserver().removeOnScrollChangedListener(tVar);
                    view.removeOnLayoutChangeListener(sVar);
                    view.removeOnAttachStateChangeListener(pipHintTrackerKt$trackPipAnimationHintView$flow$1$attachStateChangeListener$1);
                }
            };
            this.D = 1;
            if (ProduceKt.a(producerScope, r5, this) == f2) {
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
