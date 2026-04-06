package androidx.compose.ui.scrollcapture;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.semantics.ScrollAxisRange;
import androidx.compose.ui.semantics.SemanticsProperties;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

@Metadata
@DebugMetadata(c = "androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback$scrollTracker$1", f = "ComposeScrollCaptureCallback.android.kt", l = {88}, m = "invokeSuspend")
public final class ComposeScrollCaptureCallback$scrollTracker$1 extends SuspendLambda implements Function2<Float, Continuation<? super Float>, Object> {
    public boolean D;
    public int E;
    public /* synthetic */ float F;
    public final /* synthetic */ ComposeScrollCaptureCallback G;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ComposeScrollCaptureCallback$scrollTracker$1(ComposeScrollCaptureCallback composeScrollCaptureCallback, Continuation continuation) {
        super(2, continuation);
        this.G = composeScrollCaptureCallback;
    }

    public final Object A(float f2, Continuation continuation) {
        return ((ComposeScrollCaptureCallback$scrollTracker$1) s(Float.valueOf(f2), continuation)).x(Unit.f40552a);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        return A(((Number) obj).floatValue(), (Continuation) obj2);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        ComposeScrollCaptureCallback$scrollTracker$1 composeScrollCaptureCallback$scrollTracker$1 = new ComposeScrollCaptureCallback$scrollTracker$1(this.G, continuation);
        composeScrollCaptureCallback$scrollTracker$1.F = ((Number) obj).floatValue();
        return composeScrollCaptureCallback$scrollTracker$1;
    }

    public final Object x(Object obj) {
        boolean z2;
        Object f2 = IntrinsicsKt.f();
        int i2 = this.E;
        if (i2 == 0) {
            ResultKt.b(obj);
            float f3 = this.F;
            Function2 c2 = ScrollCapture_androidKt.c(this.G.f17996a);
            if (c2 != null) {
                boolean b2 = ((ScrollAxisRange) this.G.f17996a.w().n(SemanticsProperties.f18102a.M())).b();
                if (b2) {
                    f3 = -f3;
                }
                Offset d2 = Offset.d(Offset.e((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L)));
                this.D = b2;
                this.E = 1;
                obj = c2.m(d2, this);
                if (obj == f2) {
                    return f2;
                }
                z2 = b2;
            } else {
                InlineClassHelperKt.d("Required value was null.");
                throw new KotlinNothingValueException();
            }
        } else if (i2 == 1) {
            z2 = this.D;
            ResultKt.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        long t2 = ((Offset) obj).t();
        return Boxing.b(z2 ? -Float.intBitsToFloat((int) (t2 & 4294967295L)) : Float.intBitsToFloat((int) (t2 & 4294967295L)));
    }
}
