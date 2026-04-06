package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.foundation.text.selection.SelectionMagnifierKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.geometry.Offset;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata
@DebugMetadata(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldMagnifierNodeImpl28$restartAnimationJob$1", f = "AndroidTextFieldMagnifier.android.kt", l = {144}, m = "invokeSuspend")
public final class TextFieldMagnifierNodeImpl28$restartAnimationJob$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int D;
    public /* synthetic */ Object E;
    public final /* synthetic */ TextFieldMagnifierNodeImpl28 F;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextFieldMagnifierNodeImpl28$restartAnimationJob$1(TextFieldMagnifierNodeImpl28 textFieldMagnifierNodeImpl28, Continuation continuation) {
        super(2, continuation);
        this.F = textFieldMagnifierNodeImpl28;
    }

    /* renamed from: A */
    public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
        return ((TextFieldMagnifierNodeImpl28$restartAnimationJob$1) s(coroutineScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        TextFieldMagnifierNodeImpl28$restartAnimationJob$1 textFieldMagnifierNodeImpl28$restartAnimationJob$1 = new TextFieldMagnifierNodeImpl28$restartAnimationJob$1(this.F, continuation);
        textFieldMagnifierNodeImpl28$restartAnimationJob$1.E = obj;
        return textFieldMagnifierNodeImpl28$restartAnimationJob$1;
    }

    public final Object x(Object obj) {
        Object f2 = IntrinsicsKt.f();
        int i2 = this.D;
        if (i2 == 0) {
            ResultKt.b(obj);
            final CoroutineScope coroutineScope = (CoroutineScope) this.E;
            final TextFieldMagnifierNodeImpl28 textFieldMagnifierNodeImpl28 = this.F;
            Flow q2 = SnapshotStateKt.q(new Function0<Offset>() {
                public final long b() {
                    return (textFieldMagnifierNodeImpl28.S || textFieldMagnifierNodeImpl28.Q.X() == TextFieldSelectionState.InputType.Touch) ? TextFieldMagnifierKt.a(textFieldMagnifierNodeImpl28.P, textFieldMagnifierNodeImpl28.Q, textFieldMagnifierNodeImpl28.R, textFieldMagnifierNodeImpl28.n3()) : Offset.f15855b.b();
                }

                public /* bridge */ /* synthetic */ Object invoke() {
                    return Offset.d(b());
                }
            });
            final TextFieldMagnifierNodeImpl28 textFieldMagnifierNodeImpl282 = this.F;
            AnonymousClass2 r3 = new FlowCollector() {

                @Metadata
                @DebugMetadata(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldMagnifierNodeImpl28$restartAnimationJob$1$2$1", f = "AndroidTextFieldMagnifier.android.kt", l = {160}, m = "invokeSuspend")
                /* renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldMagnifierNodeImpl28$restartAnimationJob$1$2$1  reason: invalid class name */
                public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                    public int D;

                    /* renamed from: A */
                    public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
                        return ((AnonymousClass1) s(coroutineScope, continuation)).x(Unit.f40552a);
                    }

                    public final Continuation s(Object obj, Continuation continuation) {
                        return new AnonymousClass1(textFieldMagnifierNodeImpl28, j2, continuation);
                    }

                    public final Object x(Object obj) {
                        Object f2 = IntrinsicsKt.f();
                        int i2 = this.D;
                        if (i2 == 0) {
                            ResultKt.b(obj);
                            Animatable g3 = textFieldMagnifierNodeImpl28.U;
                            Offset d2 = Offset.d(j2);
                            SpringSpec e2 = SelectionMagnifierKt.e();
                            this.D = 1;
                            if (Animatable.f(g3, d2, e2, (Object) null, (Function1) null, this, 12, (Object) null) == f2) {
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

                public final Object a(final long j2, Continuation continuation) {
                    if ((((Offset) textFieldMagnifierNodeImpl282.U.m()).t() & 9223372034707292159L) == 9205357640488583168L || (j2 & 9223372034707292159L) == 9205357640488583168L || Float.intBitsToFloat((int) (((Offset) textFieldMagnifierNodeImpl282.U.m()).t() & 4294967295L)) == Float.intBitsToFloat((int) (j2 & 4294967295L))) {
                        Object t2 = textFieldMagnifierNodeImpl282.U.t(Offset.d(j2), continuation);
                        return t2 == IntrinsicsKt.f() ? t2 : Unit.f40552a;
                    }
                    CoroutineScope coroutineScope = coroutineScope;
                    final TextFieldMagnifierNodeImpl28 textFieldMagnifierNodeImpl28 = textFieldMagnifierNodeImpl282;
                    Job unused = BuildersKt__Builders_commonKt.d(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1((Continuation) null), 3, (Object) null);
                    return Unit.f40552a;
                }

                public /* bridge */ /* synthetic */ Object c(Object obj, Continuation continuation) {
                    return a(((Offset) obj).t(), continuation);
                }
            };
            this.D = 1;
            if (q2.a(r3, this) == f2) {
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
