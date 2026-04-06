package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;

@Metadata
public final class ScrollableNode$setScrollSemanticsActions$1 extends Lambda implements Function2<Float, Float, Boolean> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ ScrollableNode f3577z;

    @Metadata
    @DebugMetadata(c = "androidx.compose.foundation.gestures.ScrollableNode$setScrollSemanticsActions$1$1", f = "Scrollable.kt", l = {518}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.ScrollableNode$setScrollSemanticsActions$1$1  reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int D;

        /* renamed from: A */
        public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
            return ((AnonymousClass1) s(coroutineScope, continuation)).x(Unit.f40552a);
        }

        public final Continuation s(Object obj, Continuation continuation) {
            return new AnonymousClass1(scrollableNode, f2, f3, continuation);
        }

        public final Object x(Object obj) {
            Object f2 = IntrinsicsKt.f();
            int i2 = this.D;
            if (i2 == 0) {
                ResultKt.b(obj);
                ScrollingLogic D3 = scrollableNode.e0;
                float f3 = f2;
                float f4 = f3;
                long e2 = Offset.e((((long) Float.floatToRawIntBits(f3)) << 32) | (((long) Float.floatToRawIntBits(f4)) & 4294967295L));
                this.D = 1;
                if (ScrollableKt.l(D3, e2, this) == f2) {
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
    public ScrollableNode$setScrollSemanticsActions$1(ScrollableNode scrollableNode) {
        super(2);
        this.f3577z = scrollableNode;
    }

    public final Boolean b(final float f2, final float f3) {
        CoroutineScope y2 = this.f3577z.y2();
        final ScrollableNode scrollableNode = this.f3577z;
        Job unused = BuildersKt__Builders_commonKt.d(y2, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1((Continuation) null), 3, (Object) null);
        return Boolean.TRUE;
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        return b(((Number) obj).floatValue(), ((Number) obj2).floatValue());
    }
}
