package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.ui.input.pointer.PointerInputScope;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata
@DebugMetadata(c = "androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$2", f = "TextFieldDecoratorModifier.kt", l = {220}, m = "invokeSuspend")
public final class TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int D;
    public final /* synthetic */ TextFieldDecoratorModifierNode E;
    public final /* synthetic */ TextFieldSelectionState F;
    public final /* synthetic */ PointerInputScope G;
    public final /* synthetic */ Function0 H;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$2(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode, TextFieldSelectionState textFieldSelectionState, PointerInputScope pointerInputScope, Function0 function0, Continuation continuation) {
        super(2, continuation);
        this.E = textFieldDecoratorModifierNode;
        this.F = textFieldSelectionState;
        this.G = pointerInputScope;
        this.H = function0;
    }

    /* renamed from: A */
    public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
        return ((TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$2) s(coroutineScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        return new TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$2(this.E, this.F, this.G, this.H, continuation);
    }

    public final Object x(Object obj) {
        Object f2 = IntrinsicsKt.f();
        int i2 = this.D;
        if (i2 == 0) {
            ResultKt.b(obj);
            MutableInteractionSource v3 = this.E.v3();
            TextFieldSelectionState textFieldSelectionState = this.F;
            PointerInputScope pointerInputScope = this.G;
            Function0 function0 = this.H;
            final TextFieldDecoratorModifierNode textFieldDecoratorModifierNode = this.E;
            AnonymousClass1 r7 = new Function0<Unit>() {
                public final void invoke() {
                    if (textFieldDecoratorModifierNode.k0 != null) {
                        textFieldDecoratorModifierNode.H3().b();
                    } else {
                        textFieldDecoratorModifierNode.J3(true);
                    }
                }
            };
            this.D = 1;
            if (textFieldSelectionState.Q(pointerInputScope, v3, function0, r7, this) == f2) {
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
