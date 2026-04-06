package com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout;

import android.content.Context;
import androidx.activity.compose.ManagedActivityResultLauncher;
import androidx.compose.material3.SnackbarDuration;
import com.hansecom.abt.R;
import com.hansecom.abt.presentation.screens.home.faremedia.addValue.x;
import com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout.PassCheckout;
import com.hansecom.abt.ui.components.snackbar.AbtSnackbarHostState;
import com.hansecom.abt.ui.components.snackbar.SnackbarType;
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
@DebugMetadata(c = "com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout.PassCheckoutScreenKt$ScreenImpl$2$1", f = "PassCheckoutScreen.kt", l = {}, m = "invokeSuspend")
public final class PassCheckoutScreenKt$ScreenImpl$2$1 extends SuspendLambda implements Function2<PassCheckout.Effect, Continuation<? super Unit>, Object> {
    public int D;
    public /* synthetic */ Object E;
    public final /* synthetic */ AbtSnackbarHostState F;
    public final /* synthetic */ Context G;
    public final /* synthetic */ Function0 H;
    public final /* synthetic */ ManagedActivityResultLauncher I;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PassCheckoutScreenKt$ScreenImpl$2$1(AbtSnackbarHostState abtSnackbarHostState, Context context, Function0 function0, ManagedActivityResultLauncher managedActivityResultLauncher, Continuation continuation) {
        super(2, continuation);
        this.F = abtSnackbarHostState;
        this.G = context;
        this.H = function0;
        this.I = managedActivityResultLauncher;
    }

    /* renamed from: A */
    public final Object m(PassCheckout.Effect effect, Continuation continuation) {
        return ((PassCheckoutScreenKt$ScreenImpl$2$1) s(effect, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        PassCheckoutScreenKt$ScreenImpl$2$1 passCheckoutScreenKt$ScreenImpl$2$1 = new PassCheckoutScreenKt$ScreenImpl$2$1(this.F, this.G, this.H, this.I, continuation);
        passCheckoutScreenKt$ScreenImpl$2$1.E = obj;
        return passCheckoutScreenKt$ScreenImpl$2$1;
    }

    public final Object x(Object obj) {
        IntrinsicsKt.f();
        if (this.D == 0) {
            ResultKt.b(obj);
            PassCheckout.Effect effect = (PassCheckout.Effect) this.E;
            if (effect instanceof PassCheckout.Effect.Error) {
                AbtSnackbarHostState abtSnackbarHostState = this.F;
                Context context = this.G;
                PassCheckout.Effect.Error error = (PassCheckout.Effect.Error) effect;
                StringValue b2 = error.b();
                Object[] array = error.a().toArray(new Object[0]);
                AbtSnackbarHostState.e(abtSnackbarHostState, StringResourceKt.b(context, b2, Arrays.copyOf(array, array.length)), (SnackbarType) null, (String) null, false, (SnackbarDuration) null, (CoroutineScope) null, 62, (Object) null);
            } else if (Intrinsics.d(effect, PassCheckout.Effect.CouponApplied.f37092a)) {
                AbtSnackbarHostState abtSnackbarHostState2 = this.F;
                String string = this.G.getString(R.string.N2);
                Intrinsics.h(string, "getString(...)");
                AbtSnackbarHostState.e(abtSnackbarHostState2, string, SnackbarType.POSITIVE, (String) null, false, (SnackbarDuration) null, (CoroutineScope) null, 60, (Object) null);
            } else if (Intrinsics.d(effect, PassCheckout.Effect.CouponReset.f37093a)) {
                AbtSnackbarHostState abtSnackbarHostState3 = this.F;
                String string2 = this.G.getString(R.string.M2);
                Intrinsics.h(string2, "getString(...)");
                AbtSnackbarHostState.e(abtSnackbarHostState3, string2, SnackbarType.INFO, (String) null, false, (SnackbarDuration) null, (CoroutineScope) null, 60, (Object) null);
            } else if (effect instanceof PassCheckout.Effect.Success) {
                AbtSnackbarHostState abtSnackbarHostState4 = this.F;
                String string3 = this.G.getString(R.string.R2, new Object[]{((PassCheckout.Effect.Success) effect).a()});
                Intrinsics.h(string3, "getString(...)");
                AbtSnackbarHostState.e(abtSnackbarHostState4, string3, SnackbarType.POSITIVE, (String) null, false, (SnackbarDuration) null, (CoroutineScope) null, 60, (Object) null);
                this.H.invoke();
                Unit unit = Unit.f40552a;
            } else if (effect instanceof PassCheckout.Effect.GooglePayRequest) {
                if (this.I != null) {
                    ((PassCheckout.Effect.GooglePayRequest) effect).a().b(new x(this.I));
                }
                Unit unit2 = Unit.f40552a;
            } else {
                throw new NoWhenBranchMatchedException();
            }
            return Unit.f40552a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
