package com.hansecom.abt.presentation.screens.home.account.address;

import androidx.compose.material3.SnackbarDuration;
import com.hansecom.abt.presentation.screens.home.account.address.ChangeAddress;
import com.hansecom.abt.ui.components.snackbar.AbtSnackbarHostState;
import com.hansecom.abt.ui.components.snackbar.SnackbarType;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.presentation.screens.home.account.address.ChangeAddressScreenKt$ChangeAddressScreen$2$1", f = "ChangeAddressScreen.kt", l = {}, m = "invokeSuspend")
public final class ChangeAddressScreenKt$ChangeAddressScreen$2$1 extends SuspendLambda implements Function2<ChangeAddress.Effect, Continuation<? super Unit>, Object> {
    public int D;
    public /* synthetic */ Object E;
    public final /* synthetic */ AbtSnackbarHostState F;
    public final /* synthetic */ CoroutineScope G;
    public final /* synthetic */ Function0 H;
    public final /* synthetic */ Function0 I;

    @Metadata
    @DebugMetadata(c = "com.hansecom.abt.presentation.screens.home.account.address.ChangeAddressScreenKt$ChangeAddressScreen$2$1$1", f = "ChangeAddressScreen.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.hansecom.abt.presentation.screens.home.account.address.ChangeAddressScreenKt$ChangeAddressScreen$2$1$1  reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int D;

        /* renamed from: A */
        public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
            return ((AnonymousClass1) s(coroutineScope, continuation)).x(Unit.f40552a);
        }

        public final Continuation s(Object obj, Continuation continuation) {
            return new AnonymousClass1(abtSnackbarHostState, effect, continuation);
        }

        public final Object x(Object obj) {
            IntrinsicsKt.f();
            if (this.D == 0) {
                ResultKt.b(obj);
                AbtSnackbarHostState.d(abtSnackbarHostState, ((ChangeAddress.Effect.Details.InitialLoadingError) effect).a(), (SnackbarType) null, (String) null, false, (SnackbarDuration) null, (CoroutineScope) null, 62, (Object) null);
                return Unit.f40552a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChangeAddressScreenKt$ChangeAddressScreen$2$1(AbtSnackbarHostState abtSnackbarHostState, CoroutineScope coroutineScope, Function0 function0, Function0 function02, Continuation continuation) {
        super(2, continuation);
        this.F = abtSnackbarHostState;
        this.G = coroutineScope;
        this.H = function0;
        this.I = function02;
    }

    /* renamed from: A */
    public final Object m(ChangeAddress.Effect effect, Continuation continuation) {
        return ((ChangeAddressScreenKt$ChangeAddressScreen$2$1) s(effect, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        ChangeAddressScreenKt$ChangeAddressScreen$2$1 changeAddressScreenKt$ChangeAddressScreen$2$1 = new ChangeAddressScreenKt$ChangeAddressScreen$2$1(this.F, this.G, this.H, this.I, continuation);
        changeAddressScreenKt$ChangeAddressScreen$2$1.E = obj;
        return changeAddressScreenKt$ChangeAddressScreen$2$1;
    }

    public final Object x(Object obj) {
        IntrinsicsKt.f();
        if (this.D == 0) {
            ResultKt.b(obj);
            final ChangeAddress.Effect effect = (ChangeAddress.Effect) this.E;
            if (effect instanceof ChangeAddress.Effect.Details.Error) {
                AbtSnackbarHostState.d(this.F, ((ChangeAddress.Effect.Details.Error) effect).a(), (SnackbarType) null, (String) null, false, (SnackbarDuration) null, (CoroutineScope) null, 62, (Object) null);
            } else if (effect instanceof ChangeAddress.Effect.Details.InitialLoadingError) {
                CoroutineScope coroutineScope = this.G;
                final AbtSnackbarHostState abtSnackbarHostState = this.F;
                Job unused = BuildersKt__Builders_commonKt.d(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1((Continuation) null), 3, (Object) null);
                this.H.invoke();
            } else if (effect instanceof ChangeAddress.Effect.Details.Success) {
                this.I.invoke();
            }
            return Unit.f40552a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
