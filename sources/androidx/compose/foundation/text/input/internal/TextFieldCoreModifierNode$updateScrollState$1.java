package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.gestures.ScrollExtensionsKt;
import androidx.compose.foundation.relocation.BringIntoViewRequester;
import androidx.compose.ui.geometry.Rect;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata
@DebugMetadata(c = "androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode$updateScrollState$1", f = "TextFieldCoreModifier.kt", l = {447, 450}, m = "invokeSuspend")
public final class TextFieldCoreModifierNode$updateScrollState$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int D;
    public final /* synthetic */ TextFieldCoreModifierNode E;
    public final /* synthetic */ float F;
    public final /* synthetic */ Rect G;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextFieldCoreModifierNode$updateScrollState$1(TextFieldCoreModifierNode textFieldCoreModifierNode, float f2, Rect rect, Continuation continuation) {
        super(2, continuation);
        this.E = textFieldCoreModifierNode;
        this.F = f2;
        this.G = rect;
    }

    /* renamed from: A */
    public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
        return ((TextFieldCoreModifierNode$updateScrollState$1) s(coroutineScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        return new TextFieldCoreModifierNode$updateScrollState$1(this.E, this.F, this.G, continuation);
    }

    public final Object x(Object obj) {
        Object f2 = IntrinsicsKt.f();
        int i2 = this.D;
        if (i2 == 0) {
            ResultKt.b(obj);
            ScrollState g3 = this.E.W;
            float c2 = TextFieldCoreModifierKt.f(this.F);
            this.D = 1;
            if (ScrollExtensionsKt.b(g3, c2, this) == f2) {
                return f2;
            }
        } else if (i2 == 1) {
            ResultKt.b(obj);
        } else if (i2 == 2) {
            ResultKt.b(obj);
            return Unit.f40552a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        BringIntoViewRequester c3 = this.E.R.c();
        Rect rect = this.G;
        this.D = 2;
        if (c3.a(rect, this) == f2) {
            return f2;
        }
        return Unit.f40552a;
    }
}
