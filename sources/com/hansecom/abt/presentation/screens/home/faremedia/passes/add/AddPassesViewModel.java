package com.hansecom.abt.presentation.screens.home.faremedia.passes.add;

import androidx.lifecycle.SavedStateHandle;
import androidx.navigation.SavedStateHandleKt;
import com.hansecom.abt.data.repositories.generalData.FareMediaPassesToOfferRepository;
import com.hansecom.abt.presentation.mvi.MviViewModel;
import com.hansecom.abt.presentation.screens.home.faremedia.cardOptions.CardOptionsAddPassesDestination;
import com.hansecom.abt.presentation.screens.home.faremedia.passes.add.AddPasses;
import com.hansecom.abt.ui.components.passCard.PassOfferCardState;
import java.math.BigDecimal;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.RangesKt;
import kotlinx.collections.immutable.ExtensionsKt;
import kotlinx.collections.immutable.PersistentList;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;

@Metadata
public final class AddPassesViewModel extends MviViewModel<AddPasses.Action, AddPasses.State, AddPasses.Effect> {

    /* renamed from: i  reason: collision with root package name */
    public final String f37043i;

    @Metadata
    @DebugMetadata(c = "com.hansecom.abt.presentation.screens.home.faremedia.passes.add.AddPassesViewModel$1", f = "AddPassesViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.hansecom.abt.presentation.screens.home.faremedia.passes.add.AddPassesViewModel$1  reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int D;
        public /* synthetic */ Object E;

        /* renamed from: A */
        public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
            return ((AnonymousClass1) s(coroutineScope, continuation)).x(Unit.f40552a);
        }

        public final Continuation s(Object obj, Continuation continuation) {
            AnonymousClass1 r0 = new AnonymousClass1(fareMediaPassesToOfferRepository, this, continuation);
            r0.E = obj;
            return r0;
        }

        public final Object x(Object obj) {
            IntrinsicsKt.f();
            if (this.D == 0) {
                ResultKt.b(obj);
                FlowKt.P(new AddPassesViewModel$1$invokeSuspend$$inlined$map$1(fareMediaPassesToOfferRepository.f(this.f37043i), this), (CoroutineScope) this.E);
                return Unit.f40552a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AddPassesViewModel(SavedStateHandle savedStateHandle, final FareMediaPassesToOfferRepository fareMediaPassesToOfferRepository) {
        super(savedStateHandle, new AddPasses.State(true, (PersistentList) null, 2, (DefaultConstructorMarker) null));
        Intrinsics.i(savedStateHandle, "savedStateHandle");
        Intrinsics.i(fareMediaPassesToOfferRepository, "fareMediaPassesToOfferRepository");
        this.f37043i = ((CardOptionsAddPassesDestination) SavedStateHandleKt.a(savedStateHandle, Reflection.b(CardOptionsAddPassesDestination.class), MapsKt.h())).a();
        MviViewModel.t(this, (CoroutineScope) null, 0, 0, new AnonymousClass1((Continuation) null), 7, (Object) null);
    }

    public static final AddPasses.State A(PassOfferCardState passOfferCardState, PassOfferCardState passOfferCardState2, AddPasses.State state) {
        Intrinsics.i(state, "$this$update");
        List P0 = CollectionsKt.P0(state.d());
        P0.set(P0.indexOf(passOfferCardState), passOfferCardState2);
        Unit unit = Unit.f40552a;
        return AddPasses.State.b(state, false, ExtensionsKt.e(P0), 1, (Object) null);
    }

    public static final AddPasses.State z(PassOfferCardState passOfferCardState, PassOfferCardState passOfferCardState2, AddPasses.State state) {
        Intrinsics.i(state, "$this$update");
        List P0 = CollectionsKt.P0(state.d());
        P0.set(P0.indexOf(passOfferCardState), passOfferCardState2);
        Unit unit = Unit.f40552a;
        return AddPasses.State.b(state, false, ExtensionsKt.e(P0), 1, (Object) null);
    }

    /* renamed from: y */
    public Object o(AddPasses.Action action, Continuation continuation) {
        AddPasses.Action action2 = action;
        if (action2 instanceof AddPasses.Action.AddPassClick) {
            AddPasses.Action.AddPassClick addPassClick = (AddPasses.Action.AddPassClick) action2;
            p(new AddPasses.Effect.AddPassEffect(addPassClick.b(), addPassClick.a()));
        } else if (action2 instanceof AddPasses.Action.LessClick) {
            for (PassOfferCardState passOfferCardState : ((AddPasses.State) m()).d()) {
                if (passOfferCardState.e() == ((AddPasses.Action.LessClick) action2).a()) {
                    r(new f(passOfferCardState, PassOfferCardState.b(passOfferCardState, 0, (String) null, (String) null, (String) null, (BigDecimal) null, (String) null, false, RangesKt.e(passOfferCardState.d() - 1, passOfferCardState.g()), 0, 0, 895, (Object) null)));
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        } else if (action2 instanceof AddPasses.Action.MoreClick) {
            for (PassOfferCardState passOfferCardState2 : ((AddPasses.State) m()).d()) {
                if (passOfferCardState2.e() == ((AddPasses.Action.MoreClick) action2).a()) {
                    r(new g(passOfferCardState2, PassOfferCardState.b(passOfferCardState2, 0, (String) null, (String) null, (String) null, (BigDecimal) null, (String) null, false, RangesKt.j(passOfferCardState2.d() + 1, passOfferCardState2.f()), 0, 0, 895, (Object) null)));
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return Unit.f40552a;
    }
}
