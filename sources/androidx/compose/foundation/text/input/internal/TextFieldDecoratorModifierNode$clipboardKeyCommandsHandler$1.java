package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.KeyCommand;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;

@Metadata
public final class TextFieldDecoratorModifierNode$clipboardKeyCommandsHandler$1 extends Lambda implements Function1<KeyCommand, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ TextFieldDecoratorModifierNode f6319z;

    @Metadata
    @DebugMetadata(c = "androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$clipboardKeyCommandsHandler$1$1", f = "TextFieldDecoratorModifier.kt", l = {385, 386, 387}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$clipboardKeyCommandsHandler$1$1  reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int D;

        @Metadata
        /* renamed from: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$clipboardKeyCommandsHandler$1$1$WhenMappings */
        public /* synthetic */ class WhenMappings {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f6320a;

            static {
                /*
                    androidx.compose.foundation.text.KeyCommand[] r0 = androidx.compose.foundation.text.KeyCommand.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    androidx.compose.foundation.text.KeyCommand r1 = androidx.compose.foundation.text.KeyCommand.COPY     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    androidx.compose.foundation.text.KeyCommand r1 = androidx.compose.foundation.text.KeyCommand.CUT     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    androidx.compose.foundation.text.KeyCommand r1 = androidx.compose.foundation.text.KeyCommand.PASTE     // Catch:{ NoSuchFieldError -> 0x0022 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                    r2 = 3
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
                L_0x0022:
                    f6320a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$clipboardKeyCommandsHandler$1.AnonymousClass1.WhenMappings.<clinit>():void");
            }
        }

        /* renamed from: A */
        public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
            return ((AnonymousClass1) s(coroutineScope, continuation)).x(Unit.f40552a);
        }

        public final Continuation s(Object obj, Continuation continuation) {
            return new AnonymousClass1(keyCommand, textFieldDecoratorModifierNode, continuation);
        }

        public final Object x(Object obj) {
            Object f2 = IntrinsicsKt.f();
            int i2 = this.D;
            if (i2 == 0) {
                ResultKt.b(obj);
                int i3 = WhenMappings.f6320a[keyCommand.ordinal()];
                if (i3 == 1) {
                    TextFieldSelectionState A3 = textFieldDecoratorModifierNode.A3();
                    this.D = 1;
                    if (A3.H(false, this) == f2) {
                        return f2;
                    }
                } else if (i3 == 2) {
                    TextFieldSelectionState A32 = textFieldDecoratorModifierNode.A3();
                    this.D = 2;
                    if (A32.K(this) == f2) {
                        return f2;
                    }
                } else if (i3 == 3) {
                    TextFieldSelectionState A33 = textFieldDecoratorModifierNode.A3();
                    this.D = 3;
                    if (A33.q0(this) == f2) {
                        return f2;
                    }
                }
            } else if (i2 == 1 || i2 == 2 || i2 == 3) {
                ResultKt.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return Unit.f40552a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextFieldDecoratorModifierNode$clipboardKeyCommandsHandler$1(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode) {
        super(1);
        this.f6319z = textFieldDecoratorModifierNode;
    }

    public final void b(final KeyCommand keyCommand) {
        CoroutineScope y2 = this.f6319z.y2();
        CoroutineStart coroutineStart = CoroutineStart.UNDISPATCHED;
        final TextFieldDecoratorModifierNode textFieldDecoratorModifierNode = this.f6319z;
        Job unused = BuildersKt__Builders_commonKt.d(y2, (CoroutineContext) null, coroutineStart, new AnonymousClass1((Continuation) null), 1, (Object) null);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((KeyCommand) obj);
        return Unit.f40552a;
    }
}
