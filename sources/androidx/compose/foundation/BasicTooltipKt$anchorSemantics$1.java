package androidx.compose.foundation;

import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
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
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;

@Metadata
public final class BasicTooltipKt$anchorSemantics$1 extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f2950A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ BasicTooltipState f2951B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ String f2952z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BasicTooltipKt$anchorSemantics$1(String str, CoroutineScope coroutineScope, BasicTooltipState basicTooltipState) {
        super(1);
        this.f2952z = str;
        this.f2950A = coroutineScope;
        this.f2951B = basicTooltipState;
    }

    public final void b(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        String str = this.f2952z;
        final CoroutineScope coroutineScope = this.f2950A;
        final BasicTooltipState basicTooltipState = this.f2951B;
        SemanticsPropertiesKt.F(semanticsPropertyReceiver, str, new Function0<Boolean>() {

            @Metadata
            @DebugMetadata(c = "androidx.compose.foundation.BasicTooltipKt$anchorSemantics$1$1$1", f = "BasicTooltip.kt", l = {220}, m = "invokeSuspend")
            /* renamed from: androidx.compose.foundation.BasicTooltipKt$anchorSemantics$1$1$1  reason: invalid class name */
            public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                public int D;

                /* renamed from: A */
                public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
                    return ((AnonymousClass1) s(coroutineScope, continuation)).x(Unit.f40552a);
                }

                public final Continuation s(Object obj, Continuation continuation) {
                    return new AnonymousClass1(basicTooltipState, continuation);
                }

                public final Object x(Object obj) {
                    Object f2 = IntrinsicsKt.f();
                    int i2 = this.D;
                    if (i2 == 0) {
                        ResultKt.b(obj);
                        BasicTooltipState basicTooltipState = basicTooltipState;
                        this.D = 1;
                        if (BasicTooltipState.c(basicTooltipState, (MutatePriority) null, this, 1, (Object) null) == f2) {
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

            /* renamed from: b */
            public final Boolean invoke() {
                CoroutineScope coroutineScope = coroutineScope;
                final BasicTooltipState basicTooltipState = basicTooltipState;
                Job unused = BuildersKt__Builders_commonKt.d(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1((Continuation) null), 3, (Object) null);
                return Boolean.TRUE;
            }
        });
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((SemanticsPropertyReceiver) obj);
        return Unit.f40552a;
    }
}
