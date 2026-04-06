package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationResult;
import androidx.compose.animation.core.AnimationSpec;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata
@DebugMetadata(c = "androidx.compose.material3.ThumbNode$measure$2", f = "Switch.kt", l = {278}, m = "invokeSuspend")
public final class ThumbNode$measure$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int D;
    public final /* synthetic */ ThumbNode E;
    public final /* synthetic */ float F;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ThumbNode$measure$2(ThumbNode thumbNode, float f2, Continuation continuation) {
        super(2, continuation);
        this.E = thumbNode;
        this.F = f2;
    }

    /* renamed from: A */
    public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
        return ((ThumbNode$measure$2) s(coroutineScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        return new ThumbNode$measure$2(this.E, this.F, continuation);
    }

    public final Object x(Object obj) {
        Object f2 = IntrinsicsKt.f();
        int i2 = this.D;
        if (i2 == 0) {
            ResultKt.b(obj);
            Animatable a3 = this.E.R;
            if (a3 != null) {
                Float b2 = Boxing.b(this.F);
                AnimationSpec g2 = this.E.Q ? SwitchKt.f11255f : this.E.e3();
                this.D = 1;
                obj = Animatable.f(a3, b2, g2, (Object) null, (Function1) null, this, 12, (Object) null);
                if (obj == f2) {
                    return f2;
                }
            }
            return Unit.f40552a;
        } else if (i2 == 1) {
            ResultKt.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AnimationResult animationResult = (AnimationResult) obj;
        return Unit.f40552a;
    }
}
