package com.hansecom.abt.presentation.screens.home.faremedia.addValue;

import android.content.Context;
import androidx.activity.compose.ManagedActivityResultLauncher;
import androidx.compose.material3.SnackbarDuration;
import com.hansecom.abt.R;
import com.hansecom.abt.presentation.screens.home.faremedia.addValue.FareMediaAddValue;
import com.hansecom.abt.ui.components.snackbar.AbtSnackbarHostState;
import com.hansecom.abt.ui.components.snackbar.SnackbarType;
import com.hansecom.abt.util.formatters.CurrencyValueFormater;
import com.hansecom.abt.util.resourcesResolvers.StringResourceKt;
import com.hansecom.abt.util.resourcesResolvers.StringValue;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.presentation.screens.home.faremedia.addValue.FareMediaAddValueScreenKt$ScreenImpl$2$1", f = "FareMediaAddValueScreen.kt", l = {}, m = "invokeSuspend")
public final class FareMediaAddValueScreenKt$ScreenImpl$2$1 extends SuspendLambda implements Function2<FareMediaAddValue.Effect, Continuation<? super Unit>, Object> {
    public int D;
    public /* synthetic */ Object E;
    public final /* synthetic */ AbtSnackbarHostState F;
    public final /* synthetic */ Function0 G;
    public final /* synthetic */ Context H;
    public final /* synthetic */ Function0 I;
    public final /* synthetic */ ManagedActivityResultLauncher J;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FareMediaAddValueScreenKt$ScreenImpl$2$1(AbtSnackbarHostState abtSnackbarHostState, Function0 function0, Context context, Function0 function02, ManagedActivityResultLauncher managedActivityResultLauncher, Continuation continuation) {
        super(2, continuation);
        this.F = abtSnackbarHostState;
        this.G = function0;
        this.H = context;
        this.I = function02;
        this.J = managedActivityResultLauncher;
    }

    /* renamed from: A */
    public final Object m(FareMediaAddValue.Effect effect, Continuation continuation) {
        return ((FareMediaAddValueScreenKt$ScreenImpl$2$1) s(effect, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        FareMediaAddValueScreenKt$ScreenImpl$2$1 fareMediaAddValueScreenKt$ScreenImpl$2$1 = new FareMediaAddValueScreenKt$ScreenImpl$2$1(this.F, this.G, this.H, this.I, this.J, continuation);
        fareMediaAddValueScreenKt$ScreenImpl$2$1.E = obj;
        return fareMediaAddValueScreenKt$ScreenImpl$2$1;
    }

    public final Object x(Object obj) {
        IntrinsicsKt.f();
        if (this.D == 0) {
            ResultKt.b(obj);
            FareMediaAddValue.Effect effect = (FareMediaAddValue.Effect) this.E;
            if (effect instanceof FareMediaAddValue.Effect.InitialLoadingError) {
                AbtSnackbarHostState.d(this.F, ((FareMediaAddValue.Effect.InitialLoadingError) effect).a(), (SnackbarType) null, (String) null, false, (SnackbarDuration) null, (CoroutineScope) null, 62, (Object) null);
                this.G.invoke();
            } else if (effect instanceof FareMediaAddValue.Effect.Error) {
                AbtSnackbarHostState abtSnackbarHostState = this.F;
                Context context = this.H;
                FareMediaAddValue.Effect.Error error = (FareMediaAddValue.Effect.Error) effect;
                StringValue b2 = error.b();
                Object[] array = error.a().toArray(new Object[0]);
                AbtSnackbarHostState.e(abtSnackbarHostState, StringResourceKt.b(context, b2, Arrays.copyOf(array, array.length)), (SnackbarType) null, (String) null, false, (SnackbarDuration) null, (CoroutineScope) null, 62, (Object) null);
            } else if (effect instanceof FareMediaAddValue.Effect.Success) {
                AbtSnackbarHostState abtSnackbarHostState2 = this.F;
                String string = this.H.getString(R.string.W2, new Object[]{CurrencyValueFormater.c(CurrencyValueFormater.f39045a, ((FareMediaAddValue.Effect.Success) effect).a(), false, 2, (Object) null)});
                Intrinsics.h(string, "getString(...)");
                AbtSnackbarHostState.e(abtSnackbarHostState2, string, SnackbarType.POSITIVE, (String) null, false, (SnackbarDuration) null, (CoroutineScope) null, 60, (Object) null);
                this.I.invoke();
            } else if (Intrinsics.d(effect, FareMediaAddValue.Effect.CouponApplied.f36064a)) {
                AbtSnackbarHostState abtSnackbarHostState3 = this.F;
                String string2 = this.H.getString(R.string.N2);
                Intrinsics.h(string2, "getString(...)");
                AbtSnackbarHostState.e(abtSnackbarHostState3, string2, SnackbarType.POSITIVE, (String) null, false, (SnackbarDuration) null, (CoroutineScope) null, 60, (Object) null);
            } else if (Intrinsics.d(effect, FareMediaAddValue.Effect.CouponReset.f36065a)) {
                AbtSnackbarHostState abtSnackbarHostState4 = this.F;
                String string3 = this.H.getString(R.string.M2);
                Intrinsics.h(string3, "getString(...)");
                AbtSnackbarHostState.e(abtSnackbarHostState4, string3, SnackbarType.INFO, (String) null, false, (SnackbarDuration) null, (CoroutineScope) null, 60, (Object) null);
            } else if (!(effect instanceof FareMediaAddValue.Effect.GooglePayRequest)) {
                throw new NoWhenBranchMatchedException();
            } else if (this.J != null) {
                ((FareMediaAddValue.Effect.GooglePayRequest) effect).a().b(new x(this.J));
            }
            return Unit.f40552a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
