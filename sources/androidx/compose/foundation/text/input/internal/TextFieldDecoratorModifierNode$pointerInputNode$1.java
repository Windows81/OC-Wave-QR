package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;

@Metadata
public final class TextFieldDecoratorModifierNode$pointerInputNode$1 implements PointerInputEventHandler {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ TextFieldDecoratorModifierNode f6335z;

    @Metadata
    @DebugMetadata(c = "androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1$1", f = "TextFieldDecoratorModifier.kt", l = {}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1$1  reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int D;
        public /* synthetic */ Object E;

        /* renamed from: A */
        public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
            return ((AnonymousClass1) s(coroutineScope, continuation)).x(Unit.f40552a);
        }

        public final Continuation s(Object obj, Continuation continuation) {
            AnonymousClass1 r0 = new AnonymousClass1(textFieldDecoratorModifierNode, pointerInputScope, continuation);
            r0.E = obj;
            return r0;
        }

        public final Object x(Object obj) {
            IntrinsicsKt.f();
            if (this.D == 0) {
                ResultKt.b(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.E;
                TextFieldSelectionState A3 = textFieldDecoratorModifierNode.A3();
                TextFieldDecoratorModifierNode textFieldDecoratorModifierNode = textFieldDecoratorModifierNode;
                PointerInputScope pointerInputScope = pointerInputScope;
                TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$requestFocus$1 textFieldDecoratorModifierNode$pointerInputNode$1$1$1$requestFocus$1 = new TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$requestFocus$1(A3, textFieldDecoratorModifierNode);
                CoroutineStart coroutineStart = CoroutineStart.UNDISPATCHED;
                Job unused = BuildersKt__Builders_commonKt.d(coroutineScope, (CoroutineContext) null, coroutineStart, new TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$1(A3, pointerInputScope, (Continuation) null), 1, (Object) null);
                CoroutineScope coroutineScope2 = coroutineScope;
                CoroutineStart coroutineStart2 = coroutineStart;
                Job unused2 = BuildersKt__Builders_commonKt.d(coroutineScope2, (CoroutineContext) null, coroutineStart2, new TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$2(textFieldDecoratorModifierNode, A3, pointerInputScope, textFieldDecoratorModifierNode$pointerInputNode$1$1$1$requestFocus$1, (Continuation) null), 1, (Object) null);
                Job unused3 = BuildersKt__Builders_commonKt.d(coroutineScope2, (CoroutineContext) null, coroutineStart2, new TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$3(A3, pointerInputScope, textFieldDecoratorModifierNode$pointerInputNode$1$1$1$requestFocus$1, (Continuation) null), 1, (Object) null);
                return Unit.f40552a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public TextFieldDecoratorModifierNode$pointerInputNode$1(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode) {
        this.f6335z = textFieldDecoratorModifierNode;
    }

    public final Object invoke(final PointerInputScope pointerInputScope, Continuation continuation) {
        final TextFieldDecoratorModifierNode textFieldDecoratorModifierNode = this.f6335z;
        Object f2 = CoroutineScopeKt.f(new AnonymousClass1((Continuation) null), continuation);
        return f2 == IntrinsicsKt.f() ? f2 : Unit.f40552a;
    }
}
