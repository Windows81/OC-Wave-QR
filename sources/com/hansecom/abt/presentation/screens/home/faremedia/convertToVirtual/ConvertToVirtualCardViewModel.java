package com.hansecom.abt.presentation.screens.home.faremedia.convertToVirtual;

import androidx.lifecycle.SavedStateHandle;
import androidx.navigation.SavedStateHandleKt;
import com.hansecom.abt.data.useCases.fareMedia.ConvertToVirtualUseCase;
import com.hansecom.abt.presentation.mvi.MviViewModel;
import com.hansecom.abt.presentation.screens.home.faremedia.cardOptions.CardOptionsConvertToVirtualDestination;
import com.hansecom.abt.presentation.screens.home.faremedia.convertToVirtual.ConvertToVirtual;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

@Metadata
public final class ConvertToVirtualCardViewModel extends MviViewModel<ConvertToVirtual.Action, ConvertToVirtual.State, ConvertToVirtual.Effect> {

    /* renamed from: i  reason: collision with root package name */
    public final ConvertToVirtualUseCase f36657i;

    /* renamed from: j  reason: collision with root package name */
    public final CardOptionsConvertToVirtualDestination f36658j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConvertToVirtualCardViewModel(SavedStateHandle savedStateHandle, ConvertToVirtualUseCase convertToVirtualUseCase) {
        super(savedStateHandle, new ConvertToVirtual.State(false, 1, (DefaultConstructorMarker) null));
        Intrinsics.i(savedStateHandle, "savedStateHandle");
        Intrinsics.i(convertToVirtualUseCase, "convertToVirtualUseCase");
        this.f36657i = convertToVirtualUseCase;
        this.f36658j = (CardOptionsConvertToVirtualDestination) SavedStateHandleKt.a(savedStateHandle, Reflection.b(CardOptionsConvertToVirtualDestination.class), MapsKt.h());
    }

    public static final ConvertToVirtual.State A(ConvertToVirtual.State state) {
        Intrinsics.i(state, "$this$update");
        return state.a(false);
    }

    public static final ConvertToVirtual.State B(ConvertToVirtual.State state) {
        Intrinsics.i(state, "$this$update");
        return state.a(false);
    }

    public static final ConvertToVirtual.State z(ConvertToVirtual.State state) {
        Intrinsics.i(state, "$this$update");
        return state.a(true);
    }

    /* renamed from: C */
    public Object o(ConvertToVirtual.Action action, Continuation continuation) {
        if (Intrinsics.d(action, ConvertToVirtual.Action.Confirm.f36653a)) {
            Object y2 = y(continuation);
            return y2 == IntrinsicsKt.f() ? y2 : Unit.f40552a;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object y(kotlin.coroutines.Continuation r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.hansecom.abt.presentation.screens.home.faremedia.convertToVirtual.ConvertToVirtualCardViewModel$convertToVirtual$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.hansecom.abt.presentation.screens.home.faremedia.convertToVirtual.ConvertToVirtualCardViewModel$convertToVirtual$1 r0 = (com.hansecom.abt.presentation.screens.home.faremedia.convertToVirtual.ConvertToVirtualCardViewModel$convertToVirtual$1) r0
            int r1 = r0.F
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.F = r1
            goto L_0x0018
        L_0x0013:
            com.hansecom.abt.presentation.screens.home.faremedia.convertToVirtual.ConvertToVirtualCardViewModel$convertToVirtual$1 r0 = new com.hansecom.abt.presentation.screens.home.faremedia.convertToVirtual.ConvertToVirtualCardViewModel$convertToVirtual$1
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.D
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.F
            r3 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            java.lang.Object r0 = r0.C
            com.hansecom.abt.presentation.screens.home.faremedia.convertToVirtual.ConvertToVirtualCardViewModel r0 = (com.hansecom.abt.presentation.screens.home.faremedia.convertToVirtual.ConvertToVirtualCardViewModel) r0
            kotlin.ResultKt.b(r5)
            kotlin.Result r5 = (kotlin.Result) r5
            java.lang.Object r5 = r5.j()
            goto L_0x005a
        L_0x0033:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x003b:
            kotlin.ResultKt.b(r5)
            com.hansecom.abt.presentation.screens.home.faremedia.convertToVirtual.h r5 = new com.hansecom.abt.presentation.screens.home.faremedia.convertToVirtual.h
            r5.<init>()
            r4.r(r5)
            com.hansecom.abt.data.useCases.fareMedia.ConvertToVirtualUseCase r5 = r4.f36657i
            com.hansecom.abt.presentation.screens.home.faremedia.cardOptions.CardOptionsConvertToVirtualDestination r2 = r4.f36658j
            java.lang.String r2 = r2.a()
            r0.C = r4
            r0.F = r3
            java.lang.Object r5 = r5.a(r2, r0)
            if (r5 != r1) goto L_0x0059
            return r1
        L_0x0059:
            r0 = r4
        L_0x005a:
            java.lang.Throwable r1 = kotlin.Result.e(r5)
            if (r1 != 0) goto L_0x0070
            kotlin.Unit r5 = (kotlin.Unit) r5
            com.hansecom.abt.presentation.screens.home.faremedia.convertToVirtual.i r5 = new com.hansecom.abt.presentation.screens.home.faremedia.convertToVirtual.i
            r5.<init>()
            r0.r(r5)
            com.hansecom.abt.presentation.screens.home.faremedia.convertToVirtual.ConvertToVirtual$Effect$Success r5 = com.hansecom.abt.presentation.screens.home.faremedia.convertToVirtual.ConvertToVirtual.Effect.Success.f36655a
            r0.p(r5)
            goto L_0x0084
        L_0x0070:
            com.hansecom.abt.presentation.screens.home.faremedia.convertToVirtual.j r5 = new com.hansecom.abt.presentation.screens.home.faremedia.convertToVirtual.j
            r5.<init>()
            r0.r(r5)
            com.hansecom.abt.presentation.screens.home.faremedia.convertToVirtual.ConvertToVirtual$Effect$Error r5 = new com.hansecom.abt.presentation.screens.home.faremedia.convertToVirtual.ConvertToVirtual$Effect$Error
            com.hansecom.abt.util.resourcesResolvers.StringValue r1 = com.hansecom.abt.api.ApiExceptionsKt.a(r1)
            r5.<init>(r1)
            r0.p(r5)
        L_0x0084:
            kotlin.Unit r5 = kotlin.Unit.f40552a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.faremedia.convertToVirtual.ConvertToVirtualCardViewModel.y(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
