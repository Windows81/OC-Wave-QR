package com.hansecom.abt.presentation.screens.home.faremedia.linkCard;

import androidx.lifecycle.SavedStateHandle;
import com.hansecom.abt.AppFeatures;
import com.hansecom.abt.R;
import com.hansecom.abt.data.exceptions.FieldErrorsException;
import com.hansecom.abt.data.useCases.fareMedia.LinkFareMediaCardUseCase;
import com.hansecom.abt.presentation.mvi.MviViewModel;
import com.hansecom.abt.presentation.screens.home.faremedia.linkCard.FareMediaLinkCard;
import com.hansecom.abt.util.StringExtKt;
import com.hansecom.abt.util.resourcesResolvers.StringValue;
import com.hansecom.abt.util.resourcesResolvers.StringValueKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata
public final class FareMediaLinkCardViewModel extends MviViewModel<FareMediaLinkCard.Action, FareMediaLinkCard.State, FareMediaLinkCard.Effect> {

    /* renamed from: i  reason: collision with root package name */
    public final LinkFareMediaCardUseCase f36925i;

    /* renamed from: j  reason: collision with root package name */
    public final AppFeatures f36926j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FareMediaLinkCardViewModel(SavedStateHandle savedStateHandle, LinkFareMediaCardUseCase linkFareMediaCardUseCase, AppFeatures appFeatures) {
        super(savedStateHandle, new FareMediaLinkCard.State((String) null, (StringValue) null, (String) null, (StringValue) null, appFeatures.c(), (String) null, (StringValue) null, false, 239, (DefaultConstructorMarker) null));
        Intrinsics.i(savedStateHandle, "savedStateHandle");
        Intrinsics.i(linkFareMediaCardUseCase, "linkFareMediaCardUseCase");
        Intrinsics.i(appFeatures, "appFeatures");
        this.f36925i = linkFareMediaCardUseCase;
        this.f36926j = appFeatures;
    }

    private final boolean E() {
        boolean T = T(((FareMediaLinkCard.State) m()).c());
        boolean U = U(((FareMediaLinkCard.State) m()).f());
        if (T && U) {
            return true;
        }
        r(new q(T, U));
        return false;
    }

    public static final FareMediaLinkCard.State F(boolean z2, boolean z3, FareMediaLinkCard.State state) {
        Intrinsics.i(state, "$this$update");
        return FareMediaLinkCard.State.b(state, (String) null, (StringValue) null, (String) null, z2 ? StringValue.Companion.a() : StringValueKt.c(R.string.h4), 0, (String) null, z3 ? StringValue.Companion.a() : StringValueKt.c(R.string.k4), false, 183, (Object) null);
    }

    public static final FareMediaLinkCard.State I(FareMediaLinkCard.State state) {
        Intrinsics.i(state, "$this$update");
        return FareMediaLinkCard.State.b(state, (String) null, (StringValue) null, (String) null, (StringValue) null, 0, (String) null, (StringValue) null, false, 127, (Object) null);
    }

    public static final FareMediaLinkCard.State J(FareMediaLinkCard.State state) {
        Intrinsics.i(state, "$this$update");
        return FareMediaLinkCard.State.b(state, (String) null, (StringValue) null, (String) null, (StringValue) null, 0, (String) null, (StringValue) null, true, 127, (Object) null);
    }

    public static final FareMediaLinkCard.State K(FareMediaLinkCard.State state) {
        Intrinsics.i(state, "$this$update");
        return FareMediaLinkCard.State.b(state, (String) null, (StringValue) null, (String) null, (StringValue) null, 0, (String) null, (StringValue) null, false, 127, (Object) null);
    }

    public static final FareMediaLinkCard.State L(FareMediaLinkCard.State state) {
        Intrinsics.i(state, "$this$update");
        return FareMediaLinkCard.State.b(state, (String) null, (StringValue) null, (String) null, StringValueKt.c(R.string.h4), 0, (String) null, (StringValue) null, false, 247, (Object) null);
    }

    public static final FareMediaLinkCard.State M(Throwable th, FareMediaLinkCard.State state) {
        Intrinsics.i(state, "$this$update");
        FieldErrorsException fieldErrorsException = (FieldErrorsException) th;
        return FareMediaLinkCard.State.b(state, (String) null, StringValueKt.b(fieldErrorsException.j()), (String) null, StringValueKt.b(fieldErrorsException.f()), 0, (String) null, StringValueKt.b(fieldErrorsException.g()), false, 181, (Object) null);
    }

    private final void N(String str) {
        r(new i(str, this));
    }

    public static final FareMediaLinkCard.State O(String str, FareMediaLinkCardViewModel fareMediaLinkCardViewModel, FareMediaLinkCard.State state) {
        Intrinsics.i(state, "$this$update");
        String n1 = StringsKt.n1(StringExtKt.a(str), fareMediaLinkCardViewModel.f36926j.c());
        StringValue.Companion companion = StringValue.Companion;
        return FareMediaLinkCard.State.b(state, (String) null, (StringValue) null, n1, companion.a(), 0, (String) null, companion.a(), false, 179, (Object) null);
    }

    private final void P(String str) {
        r(new o(StringsKt.n1(StringExtKt.a(str), this.f36926j.o())));
    }

    public static final FareMediaLinkCard.State Q(String str, FareMediaLinkCard.State state) {
        Intrinsics.i(state, "$this$update");
        return FareMediaLinkCard.State.b(state, (String) null, (StringValue) null, (String) null, (StringValue) null, 0, str, StringValue.Companion.a(), false, 159, (Object) null);
    }

    private final void R(String str) {
        r(new p(str));
    }

    public static final FareMediaLinkCard.State S(String str, FareMediaLinkCard.State state) {
        Intrinsics.i(state, "$this$update");
        return FareMediaLinkCard.State.b(state, str, StringValue.Companion.a(), (String) null, (StringValue) null, 0, (String) null, (StringValue) null, false, 252, (Object) null);
    }

    private final boolean T(String str) {
        return str.length() == this.f36926j.c();
    }

    private final boolean U(String str) {
        return str.length() == this.f36926j.o();
    }

    /* renamed from: G */
    public Object o(FareMediaLinkCard.Action action, Continuation continuation) {
        if (action instanceof FareMediaLinkCard.Action.NickNameChange) {
            R(((FareMediaLinkCard.Action.NickNameChange) action).a());
        } else if (action instanceof FareMediaLinkCard.Action.CardNumberChange) {
            N(((FareMediaLinkCard.Action.CardNumberChange) action).a());
        } else if (action instanceof FareMediaLinkCard.Action.CodeChange) {
            P(((FareMediaLinkCard.Action.CodeChange) action).a());
        } else if (Intrinsics.d(action, FareMediaLinkCard.Action.Confirm.f36914a)) {
            Object H = H(continuation);
            return H == IntrinsicsKt.f() ? H : Unit.f40552a;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return Unit.f40552a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object H(kotlin.coroutines.Continuation r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.hansecom.abt.presentation.screens.home.faremedia.linkCard.FareMediaLinkCardViewModel$linkCard$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.hansecom.abt.presentation.screens.home.faremedia.linkCard.FareMediaLinkCardViewModel$linkCard$1 r0 = (com.hansecom.abt.presentation.screens.home.faremedia.linkCard.FareMediaLinkCardViewModel$linkCard$1) r0
            int r1 = r0.F
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.F = r1
            goto L_0x0018
        L_0x0013:
            com.hansecom.abt.presentation.screens.home.faremedia.linkCard.FareMediaLinkCardViewModel$linkCard$1 r0 = new com.hansecom.abt.presentation.screens.home.faremedia.linkCard.FareMediaLinkCardViewModel$linkCard$1
            r0.<init>(r6, r7)
        L_0x0018:
            java.lang.Object r7 = r0.D
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.F
            r3 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            java.lang.Object r0 = r0.C
            com.hansecom.abt.presentation.screens.home.faremedia.linkCard.FareMediaLinkCardViewModel r0 = (com.hansecom.abt.presentation.screens.home.faremedia.linkCard.FareMediaLinkCardViewModel) r0
            kotlin.ResultKt.b(r7)
            kotlin.Result r7 = (kotlin.Result) r7
            java.lang.Object r7 = r7.j()
            goto L_0x0083
        L_0x0033:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x003b:
            kotlin.ResultKt.b(r7)
            com.hansecom.abt.presentation.screens.home.faremedia.linkCard.j r7 = new com.hansecom.abt.presentation.screens.home.faremedia.linkCard.j
            r7.<init>()
            r6.r(r7)
            boolean r7 = r6.E()
            if (r7 != 0) goto L_0x0057
            com.hansecom.abt.presentation.screens.home.faremedia.linkCard.k r7 = new com.hansecom.abt.presentation.screens.home.faremedia.linkCard.k
            r7.<init>()
            r6.r(r7)
            kotlin.Unit r7 = kotlin.Unit.f40552a
            return r7
        L_0x0057:
            com.hansecom.abt.data.useCases.fareMedia.LinkFareMediaCardUseCase r7 = r6.f36925i
            android.os.Parcelable r2 = r6.m()
            com.hansecom.abt.presentation.screens.home.faremedia.linkCard.FareMediaLinkCard$State r2 = (com.hansecom.abt.presentation.screens.home.faremedia.linkCard.FareMediaLinkCard.State) r2
            java.lang.String r2 = r2.c()
            android.os.Parcelable r4 = r6.m()
            com.hansecom.abt.presentation.screens.home.faremedia.linkCard.FareMediaLinkCard$State r4 = (com.hansecom.abt.presentation.screens.home.faremedia.linkCard.FareMediaLinkCard.State) r4
            java.lang.String r4 = r4.f()
            android.os.Parcelable r5 = r6.m()
            com.hansecom.abt.presentation.screens.home.faremedia.linkCard.FareMediaLinkCard$State r5 = (com.hansecom.abt.presentation.screens.home.faremedia.linkCard.FareMediaLinkCard.State) r5
            java.lang.String r5 = r5.h()
            r0.C = r6
            r0.F = r3
            java.lang.Object r7 = r7.a(r2, r4, r5, r0)
            if (r7 != r1) goto L_0x0082
            return r1
        L_0x0082:
            r0 = r6
        L_0x0083:
            java.lang.Throwable r1 = kotlin.Result.e(r7)
            if (r1 != 0) goto L_0x0091
            kotlin.Unit r7 = (kotlin.Unit) r7
            com.hansecom.abt.presentation.screens.home.faremedia.linkCard.FareMediaLinkCard$Effect$Success r7 = com.hansecom.abt.presentation.screens.home.faremedia.linkCard.FareMediaLinkCard.Effect.Success.f36917a
            r0.p(r7)
            goto L_0x00b7
        L_0x0091:
            boolean r7 = r1 instanceof com.hansecom.abt.data.useCases.fareMedia.PhysicalCardNumberInvalidException
            if (r7 == 0) goto L_0x009e
            com.hansecom.abt.presentation.screens.home.faremedia.linkCard.l r7 = new com.hansecom.abt.presentation.screens.home.faremedia.linkCard.l
            r7.<init>()
            r0.r(r7)
            goto L_0x00b7
        L_0x009e:
            boolean r7 = r1 instanceof com.hansecom.abt.data.exceptions.FieldErrorsException
            if (r7 == 0) goto L_0x00ab
            com.hansecom.abt.presentation.screens.home.faremedia.linkCard.m r7 = new com.hansecom.abt.presentation.screens.home.faremedia.linkCard.m
            r7.<init>(r1)
            r0.r(r7)
            goto L_0x00b7
        L_0x00ab:
            com.hansecom.abt.presentation.screens.home.faremedia.linkCard.FareMediaLinkCard$Effect$Error r7 = new com.hansecom.abt.presentation.screens.home.faremedia.linkCard.FareMediaLinkCard$Effect$Error
            com.hansecom.abt.util.resourcesResolvers.StringValue r1 = com.hansecom.abt.api.ApiExceptionsKt.a(r1)
            r7.<init>(r1)
            r0.p(r7)
        L_0x00b7:
            com.hansecom.abt.presentation.screens.home.faremedia.linkCard.n r7 = new com.hansecom.abt.presentation.screens.home.faremedia.linkCard.n
            r7.<init>()
            r0.r(r7)
            kotlin.Unit r7 = kotlin.Unit.f40552a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.faremedia.linkCard.FareMediaLinkCardViewModel.H(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
