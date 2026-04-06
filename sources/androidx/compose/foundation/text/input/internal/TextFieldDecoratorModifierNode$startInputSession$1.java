package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.content.internal.ReceiveContentConfiguration;
import androidx.compose.foundation.text.input.internal.selection.TextToolbarState;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.PlatformTextInputModifierNodeKt;
import androidx.compose.ui.platform.PlatformTextInputSessionScope;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.ImeOptions;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata
@DebugMetadata(c = "androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$startInputSession$1", f = "TextFieldDecoratorModifier.kt", l = {759}, m = "invokeSuspend")
public final class TextFieldDecoratorModifierNode$startInputSession$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int D;
    public final /* synthetic */ TextFieldDecoratorModifierNode E;
    public final /* synthetic */ ReceiveContentConfiguration F;

    @Metadata
    @DebugMetadata(c = "androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$startInputSession$1$1", f = "TextFieldDecoratorModifier.kt", l = {760}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$startInputSession$1$1  reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<PlatformTextInputSessionScope, Continuation<?>, Object> {
        public int D;
        public /* synthetic */ Object E;

        /* renamed from: A */
        public final Object m(PlatformTextInputSessionScope platformTextInputSessionScope, Continuation continuation) {
            return ((AnonymousClass1) s(platformTextInputSessionScope, continuation)).x(Unit.f40552a);
        }

        public final Continuation s(Object obj, Continuation continuation) {
            AnonymousClass1 r0 = new AnonymousClass1(textFieldDecoratorModifierNode, receiveContentConfiguration, continuation);
            r0.E = obj;
            return r0;
        }

        public final Object x(Object obj) {
            Object f2 = IntrinsicsKt.f();
            int i2 = this.D;
            if (i2 == 0) {
                ResultKt.b(obj);
                TransformedTextFieldState B3 = textFieldDecoratorModifierNode.B3();
                TextLayoutState C3 = textFieldDecoratorModifierNode.C3();
                ImeOptions o2 = textFieldDecoratorModifierNode.w3().o(textFieldDecoratorModifierNode.y3());
                ReceiveContentConfiguration receiveContentConfiguration = receiveContentConfiguration;
                AnonymousClass1 r8 = new Function1<ImeAction, Unit>(textFieldDecoratorModifierNode) {
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        v(((ImeAction) obj).p());
                        return Unit.f40552a;
                    }

                    public final void v(int i2) {
                        ((TextFieldDecoratorModifierNode) this.f40885A).G3(i2);
                    }
                };
                final TextFieldDecoratorModifierNode textFieldDecoratorModifierNode = textFieldDecoratorModifierNode;
                this.D = 1;
                if (AndroidTextInputSession_androidKt.e((PlatformTextInputSessionScope) this.E, B3, C3, o2, receiveContentConfiguration, r8, new Function0<Unit>() {
                    public final void invoke() {
                        textFieldDecoratorModifierNode.A3().L0(TextToolbarState.Selection);
                    }
                }, textFieldDecoratorModifierNode.z3(), (ViewConfiguration) CompositionLocalConsumerModifierNodeKt.a(textFieldDecoratorModifierNode, CompositionLocalsKt.t()), this) == f2) {
                    return f2;
                }
            } else if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                ResultKt.b(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextFieldDecoratorModifierNode$startInputSession$1(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode, ReceiveContentConfiguration receiveContentConfiguration, Continuation continuation) {
        super(2, continuation);
        this.E = textFieldDecoratorModifierNode;
        this.F = receiveContentConfiguration;
    }

    /* renamed from: A */
    public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
        return ((TextFieldDecoratorModifierNode$startInputSession$1) s(coroutineScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        return new TextFieldDecoratorModifierNode$startInputSession$1(this.E, this.F, continuation);
    }

    public final Object x(Object obj) {
        Object f2 = IntrinsicsKt.f();
        int i2 = this.D;
        if (i2 == 0) {
            ResultKt.b(obj);
            final TextFieldDecoratorModifierNode textFieldDecoratorModifierNode = this.E;
            final ReceiveContentConfiguration receiveContentConfiguration = this.F;
            AnonymousClass1 r1 = new AnonymousClass1((Continuation) null);
            this.D = 1;
            if (PlatformTextInputModifierNodeKt.c(textFieldDecoratorModifierNode, r1, this) == f2) {
                return f2;
            }
        } else if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            ResultKt.b(obj);
        }
        throw new KotlinNothingValueException();
    }
}
