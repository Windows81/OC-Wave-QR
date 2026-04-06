package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
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
@DebugMetadata(c = "androidx.compose.material3.SearchBarKt$SearchBar$3$1", f = "SearchBar.kt", l = {559}, m = "invokeSuspend")
final class SearchBarKt$SearchBar$3$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int D;
    public final /* synthetic */ Animatable E;
    public final /* synthetic */ boolean F;
    public final /* synthetic */ MutableFloatState G;
    public final /* synthetic */ MutableState H;
    public final /* synthetic */ MutableState I;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchBarKt$SearchBar$3$1(Animatable animatable, boolean z2, MutableFloatState mutableFloatState, MutableState mutableState, MutableState mutableState2, Continuation continuation) {
        super(2, continuation);
        this.E = animatable;
        this.F = z2;
        this.G = mutableFloatState;
        this.H = mutableState;
        this.I = mutableState2;
    }

    /* renamed from: A */
    public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
        return ((SearchBarKt$SearchBar$3$1) s(coroutineScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        return new SearchBarKt$SearchBar$3$1(this.E, this.F, this.G, this.H, this.I, continuation);
    }

    public final Object x(Object obj) {
        Object f2 = IntrinsicsKt.f();
        int i2 = this.D;
        if (i2 == 0) {
            ResultKt.b(obj);
            float f3 = 0.0f;
            FiniteAnimationSpec u2 = (((Number) this.E.m()).floatValue() <= 0.0f || ((Number) this.E.m()).floatValue() >= 1.0f) ? this.F ? SearchBarKt.f10825m : SearchBarKt.f10826n : SearchBarKt.f10827o;
            if (this.F) {
                f3 = 1.0f;
            }
            if (((Number) this.E.m()).floatValue() != f3) {
                Animatable animatable = this.E;
                Float b2 = Boxing.b(f3);
                this.D = 1;
                if (Animatable.f(animatable, b2, u2, (Object) null, (Function1) null, this, 12, (Object) null) == f2) {
                    return f2;
                }
            }
        } else if (i2 == 1) {
            ResultKt.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        if (!this.F) {
            this.G.j(Float.NaN);
            this.H.setValue((Object) null);
            this.I.setValue((Object) null);
        }
        return Unit.f40552a;
    }
}
