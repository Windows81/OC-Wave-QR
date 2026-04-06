package com.hansecom.abt.presentation.screens.home.faremedia.createCard;

import androidx.lifecycle.SavedStateHandle;
import com.hansecom.abt.data.exceptions.FieldErrorsException;
import com.hansecom.abt.data.useCases.fareMedia.CreateFareMediaCardUseCase;
import com.hansecom.abt.presentation.mvi.MviViewModel;
import com.hansecom.abt.presentation.screens.home.faremedia.createCard.FareMediaCreateCard;
import com.hansecom.abt.util.resourcesResolvers.StringValue;
import com.hansecom.abt.util.resourcesResolvers.StringValueKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class FareMediaCreateCardViewModel extends MviViewModel<FareMediaCreateCard.Action, FareMediaCreateCard.State, FareMediaCreateCard.Effect> {

    /* renamed from: j  reason: collision with root package name */
    public static final int f36687j = CreateFareMediaCardUseCase.f33896c;

    /* renamed from: i  reason: collision with root package name */
    public final CreateFareMediaCardUseCase f36688i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FareMediaCreateCardViewModel(SavedStateHandle savedStateHandle, CreateFareMediaCardUseCase createFareMediaCardUseCase) {
        super(savedStateHandle, new FareMediaCreateCard.State((String) null, (StringValue) null, false, 7, (DefaultConstructorMarker) null));
        Intrinsics.i(savedStateHandle, "savedStateHandle");
        Intrinsics.i(createFareMediaCardUseCase, "createFareMediaCardUseCase");
        this.f36688i = createFareMediaCardUseCase;
    }

    public static final FareMediaCreateCard.State A(FareMediaCreateCard.State state) {
        Intrinsics.i(state, "$this$update");
        return FareMediaCreateCard.State.b(state, (String) null, (StringValue) null, true, 3, (Object) null);
    }

    public static final FareMediaCreateCard.State B(Throwable th, FareMediaCreateCard.State state) {
        Intrinsics.i(state, "$this$update");
        return FareMediaCreateCard.State.b(state, (String) null, StringValueKt.b(((FieldErrorsException) th).j()), false, 5, (Object) null);
    }

    public static final FareMediaCreateCard.State C(FareMediaCreateCard.State state) {
        Intrinsics.i(state, "$this$update");
        return FareMediaCreateCard.State.b(state, (String) null, (StringValue) null, false, 3, (Object) null);
    }

    private final void E(String str) {
        r(new g(str));
    }

    public static final FareMediaCreateCard.State F(String str, FareMediaCreateCard.State state) {
        Intrinsics.i(state, "$this$update");
        return FareMediaCreateCard.State.b(state, str, StringValue.Companion.a(), false, 4, (Object) null);
    }

    /* renamed from: D */
    public Object o(FareMediaCreateCard.Action action, Continuation continuation) {
        if (action instanceof FareMediaCreateCard.Action.NickNameChange) {
            E(((FareMediaCreateCard.Action.NickNameChange) action).a());
            return Unit.f40552a;
        } else if (Intrinsics.d(action, FareMediaCreateCard.Action.Confirm.f36676a)) {
            Object z2 = z(continuation);
            return z2 == IntrinsicsKt.f() ? z2 : Unit.f40552a;
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object z(kotlin.coroutines.Continuation r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.hansecom.abt.presentation.screens.home.faremedia.createCard.FareMediaCreateCardViewModel$createCard$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.hansecom.abt.presentation.screens.home.faremedia.createCard.FareMediaCreateCardViewModel$createCard$1 r0 = (com.hansecom.abt.presentation.screens.home.faremedia.createCard.FareMediaCreateCardViewModel$createCard$1) r0
            int r1 = r0.F
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.F = r1
            goto L_0x0018
        L_0x0013:
            com.hansecom.abt.presentation.screens.home.faremedia.createCard.FareMediaCreateCardViewModel$createCard$1 r0 = new com.hansecom.abt.presentation.screens.home.faremedia.createCard.FareMediaCreateCardViewModel$createCard$1
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.D
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.F
            r3 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            java.lang.Object r0 = r0.C
            com.hansecom.abt.presentation.screens.home.faremedia.createCard.FareMediaCreateCardViewModel r0 = (com.hansecom.abt.presentation.screens.home.faremedia.createCard.FareMediaCreateCardViewModel) r0
            kotlin.ResultKt.b(r5)
            kotlin.Result r5 = (kotlin.Result) r5
            java.lang.Object r5 = r5.j()
            goto L_0x005e
        L_0x0033:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x003b:
            kotlin.ResultKt.b(r5)
            com.hansecom.abt.presentation.screens.home.faremedia.createCard.h r5 = new com.hansecom.abt.presentation.screens.home.faremedia.createCard.h
            r5.<init>()
            r4.r(r5)
            com.hansecom.abt.data.useCases.fareMedia.CreateFareMediaCardUseCase r5 = r4.f36688i
            android.os.Parcelable r2 = r4.m()
            com.hansecom.abt.presentation.screens.home.faremedia.createCard.FareMediaCreateCard$State r2 = (com.hansecom.abt.presentation.screens.home.faremedia.createCard.FareMediaCreateCard.State) r2
            java.lang.String r2 = r2.c()
            r0.C = r4
            r0.F = r3
            java.lang.Object r5 = r5.a(r2, r0)
            if (r5 != r1) goto L_0x005d
            return r1
        L_0x005d:
            r0 = r4
        L_0x005e:
            java.lang.Throwable r1 = kotlin.Result.e(r5)
            if (r1 != 0) goto L_0x006c
            com.hansecom.mapi.models.FareMedium r5 = (com.hansecom.mapi.models.FareMedium) r5
            com.hansecom.abt.presentation.screens.home.faremedia.createCard.FareMediaCreateCard$Effect$Success r5 = com.hansecom.abt.presentation.screens.home.faremedia.createCard.FareMediaCreateCard.Effect.Success.f36679a
            r0.p(r5)
            goto L_0x0085
        L_0x006c:
            boolean r5 = r1 instanceof com.hansecom.abt.data.exceptions.FieldErrorsException
            if (r5 == 0) goto L_0x0079
            com.hansecom.abt.presentation.screens.home.faremedia.createCard.i r5 = new com.hansecom.abt.presentation.screens.home.faremedia.createCard.i
            r5.<init>(r1)
            r0.r(r5)
            goto L_0x0085
        L_0x0079:
            com.hansecom.abt.presentation.screens.home.faremedia.createCard.FareMediaCreateCard$Effect$Error r5 = new com.hansecom.abt.presentation.screens.home.faremedia.createCard.FareMediaCreateCard$Effect$Error
            com.hansecom.abt.util.resourcesResolvers.StringValue r1 = com.hansecom.abt.api.ApiExceptionsKt.a(r1)
            r5.<init>(r1)
            r0.p(r5)
        L_0x0085:
            com.hansecom.abt.presentation.screens.home.faremedia.createCard.j r5 = new com.hansecom.abt.presentation.screens.home.faremedia.createCard.j
            r5.<init>()
            r0.r(r5)
            kotlin.Unit r5 = kotlin.Unit.f40552a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.faremedia.createCard.FareMediaCreateCardViewModel.z(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
