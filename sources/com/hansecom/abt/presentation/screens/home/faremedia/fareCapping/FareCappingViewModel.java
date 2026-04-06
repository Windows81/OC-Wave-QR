package com.hansecom.abt.presentation.screens.home.faremedia.fareCapping;

import androidx.lifecycle.SavedStateHandle;
import androidx.navigation.SavedStateHandleKt;
import com.hansecom.abt.data.repositories.FareCappingRepository;
import com.hansecom.abt.presentation.mvi.MviViewModel;
import com.hansecom.abt.presentation.screens.home.faremedia.cardOptions.CardOptionsFareCappingDestination;
import com.hansecom.abt.presentation.screens.home.faremedia.fareCapping.FareCapping;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.collections.immutable.PersistentList;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;

@Metadata
public final class FareCappingViewModel extends MviViewModel<FareCapping.Action, FareCapping.State, FareCapping.Effect> {

    /* renamed from: i  reason: collision with root package name */
    public final FareCappingRepository f36734i;

    /* renamed from: j  reason: collision with root package name */
    public final String f36735j;

    @Metadata
    @DebugMetadata(c = "com.hansecom.abt.presentation.screens.home.faremedia.fareCapping.FareCappingViewModel$1", f = "FareCappingViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.hansecom.abt.presentation.screens.home.faremedia.fareCapping.FareCappingViewModel$1  reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int D;
        public /* synthetic */ Object E;
        public final /* synthetic */ FareCappingViewModel F;

        {
            this.F = r1;
        }

        /* renamed from: A */
        public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
            return ((AnonymousClass1) s(coroutineScope, continuation)).x(Unit.f40552a);
        }

        public final Continuation s(Object obj, Continuation continuation) {
            AnonymousClass1 r0 = new AnonymousClass1(this.F, continuation);
            r0.E = obj;
            return r0;
        }

        public final Object x(Object obj) {
            IntrinsicsKt.f();
            if (this.D == 0) {
                ResultKt.b(obj);
                FlowKt.P(new FareCappingViewModel$1$invokeSuspend$$inlined$map$1(this.F.f36734i.u(this.F.f36735j), this.F), (CoroutineScope) this.E);
                return Unit.f40552a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FareCappingViewModel(SavedStateHandle savedStateHandle, FareCappingRepository fareCappingRepository) {
        super(savedStateHandle, new FareCapping.State((String) null, (PersistentList) null, false, false, 15, (DefaultConstructorMarker) null));
        Intrinsics.i(savedStateHandle, "savedStateHandle");
        Intrinsics.i(fareCappingRepository, "fareCappingRepository");
        this.f36734i = fareCappingRepository;
        this.f36735j = ((CardOptionsFareCappingDestination) SavedStateHandleKt.a(savedStateHandle, Reflection.b(CardOptionsFareCappingDestination.class), MapsKt.h())).a();
        MviViewModel.t(this, (CoroutineScope) null, 0, 0, new AnonymousClass1(this, (Continuation) null), 7, (Object) null);
    }

    public static final FareCapping.State B(FareCapping.State state) {
        Intrinsics.i(state, "$this$update");
        return FareCapping.State.b(state, (String) null, (PersistentList) null, false, true, 7, (Object) null);
    }

    public static final FareCapping.State C(FareCapping.State state) {
        Intrinsics.i(state, "$this$update");
        return FareCapping.State.b(state, (String) null, (PersistentList) null, false, false, 7, (Object) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: A */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object o(com.hansecom.abt.presentation.screens.home.faremedia.fareCapping.FareCapping.Action r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.hansecom.abt.presentation.screens.home.faremedia.fareCapping.FareCappingViewModel$handle$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.hansecom.abt.presentation.screens.home.faremedia.fareCapping.FareCappingViewModel$handle$1 r0 = (com.hansecom.abt.presentation.screens.home.faremedia.fareCapping.FareCappingViewModel$handle$1) r0
            int r1 = r0.F
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.F = r1
            goto L_0x0018
        L_0x0013:
            com.hansecom.abt.presentation.screens.home.faremedia.fareCapping.FareCappingViewModel$handle$1 r0 = new com.hansecom.abt.presentation.screens.home.faremedia.fareCapping.FareCappingViewModel$handle$1
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.D
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.F
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r5 = r0.C
            com.hansecom.abt.presentation.screens.home.faremedia.fareCapping.FareCappingViewModel r5 = (com.hansecom.abt.presentation.screens.home.faremedia.fareCapping.FareCappingViewModel) r5
            kotlin.ResultKt.b(r6)
            goto L_0x0058
        L_0x002d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0035:
            kotlin.ResultKt.b(r6)
            com.hansecom.abt.presentation.screens.home.faremedia.fareCapping.FareCapping$Action$Refresh r6 = com.hansecom.abt.presentation.screens.home.faremedia.fareCapping.FareCapping.Action.Refresh.f36712a
            boolean r5 = kotlin.jvm.internal.Intrinsics.d(r5, r6)
            if (r5 == 0) goto L_0x0063
            com.hansecom.abt.presentation.screens.home.faremedia.fareCapping.h r5 = new com.hansecom.abt.presentation.screens.home.faremedia.fareCapping.h
            r5.<init>()
            r4.r(r5)
            com.hansecom.abt.data.repositories.FareCappingRepository r5 = r4.f36734i
            java.lang.String r6 = r4.f36735j
            r0.C = r4
            r0.F = r3
            java.lang.Object r5 = r5.o(r6, r0)
            if (r5 != r1) goto L_0x0057
            return r1
        L_0x0057:
            r5 = r4
        L_0x0058:
            com.hansecom.abt.presentation.screens.home.faremedia.fareCapping.i r6 = new com.hansecom.abt.presentation.screens.home.faremedia.fareCapping.i
            r6.<init>()
            r5.r(r6)
            kotlin.Unit r5 = kotlin.Unit.f40552a
            return r5
        L_0x0063:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.faremedia.fareCapping.FareCappingViewModel.o(com.hansecom.abt.presentation.screens.home.faremedia.fareCapping.FareCapping$Action, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
