package androidx.compose.foundation.text.input.internal;

import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.WindowInfo;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

@Metadata
@DebugMetadata(c = "androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode$startCursorJob$1", f = "TextFieldCoreModifier.kt", l = {558}, m = "invokeSuspend")
public final class TextFieldCoreModifierNode$startCursorJob$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int D;
    public final /* synthetic */ TextFieldCoreModifierNode E;

    @Metadata
    @DebugMetadata(c = "androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode$startCursorJob$1$2", f = "TextFieldCoreModifier.kt", l = {560}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode$startCursorJob$1$2  reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<Integer, Continuation<? super Unit>, Object> {
        public int D;
        public /* synthetic */ int E;

        public final Object A(int i2, Continuation continuation) {
            return ((AnonymousClass2) s(Integer.valueOf(i2), continuation)).x(Unit.f40552a);
        }

        public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
            return A(((Number) obj).intValue(), (Continuation) obj2);
        }

        public final Continuation s(Object obj, Continuation continuation) {
            AnonymousClass2 r0 = new AnonymousClass2(textFieldCoreModifierNode2, continuation);
            r0.E = ((Number) obj).intValue();
            return r0;
        }

        public final Object x(Object obj) {
            CursorAnimationState f3;
            Object f2 = IntrinsicsKt.f();
            int i2 = this.D;
            if (i2 == 0) {
                ResultKt.b(obj);
                if (Math.abs(this.E) == 1 && (f3 = textFieldCoreModifierNode2.Y) != null) {
                    this.D = 1;
                    if (f3.g(this) == f2) {
                        return f2;
                    }
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
    public TextFieldCoreModifierNode$startCursorJob$1(TextFieldCoreModifierNode textFieldCoreModifierNode, Continuation continuation) {
        super(2, continuation);
        this.E = textFieldCoreModifierNode;
    }

    /* renamed from: A */
    public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
        return ((TextFieldCoreModifierNode$startCursorJob$1) s(coroutineScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        return new TextFieldCoreModifierNode$startCursorJob$1(this.E, continuation);
    }

    public final Object x(Object obj) {
        Object f2 = IntrinsicsKt.f();
        int i2 = this.D;
        if (i2 == 0) {
            ResultKt.b(obj);
            final Ref.IntRef intRef = new Ref.IntRef();
            intRef.f40906z = 1;
            final TextFieldCoreModifierNode textFieldCoreModifierNode = this.E;
            Flow q2 = SnapshotStateKt.q(new Function0<Integer>() {
                public final Integer invoke() {
                    textFieldCoreModifierNode.S.o();
                    Integer valueOf = Integer.valueOf(((!textFieldCoreModifierNode.F2() || !((WindowInfo) CompositionLocalConsumerModifierNodeKt.a(textFieldCoreModifierNode, CompositionLocalsKt.u())).b()) ? 2 : 1) * intRef.f40906z);
                    intRef.f40906z *= -1;
                    return valueOf;
                }
            });
            final TextFieldCoreModifierNode textFieldCoreModifierNode2 = this.E;
            AnonymousClass2 r1 = new AnonymousClass2((Continuation) null);
            this.D = 1;
            if (FlowKt.l(q2, r1, this) == f2) {
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
