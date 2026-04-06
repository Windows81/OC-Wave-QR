package com.hansecom.abt.presentation.screens.home.faremedia.passes;

import androidx.lifecycle.SavedStateHandle;
import androidx.navigation.SavedStateHandleKt;
import com.hansecom.abt.AppFeatures;
import com.hansecom.abt.data.repositories.FareMediaPassesRepository;
import com.hansecom.abt.presentation.mvi.MviViewModel;
import com.hansecom.abt.presentation.screens.home.faremedia.cardOptions.CardOptionsPassesDestination;
import com.hansecom.abt.presentation.screens.home.faremedia.passes.FareMediaPasses;
import com.hansecom.abt.ui.components.passCard.PassCardStateKt;
import com.hansecom.mapi.models.FareProduct;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
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
import kotlinx.collections.immutable.ExtensionsKt;
import kotlinx.collections.immutable.PersistentList;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

@Metadata
public final class FareMediaPassesViewModel extends MviViewModel<FareMediaPasses.Action, FareMediaPasses.State, FareMediaPasses.Effect> {

    /* renamed from: i  reason: collision with root package name */
    public final String f37007i;

    @Metadata
    @DebugMetadata(c = "com.hansecom.abt.presentation.screens.home.faremedia.passes.FareMediaPassesViewModel$1", f = "FareMediaPassesViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.hansecom.abt.presentation.screens.home.faremedia.passes.FareMediaPassesViewModel$1  reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int D;
        public /* synthetic */ Object E;

        /* renamed from: A */
        public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
            return ((AnonymousClass1) s(coroutineScope, continuation)).x(Unit.f40552a);
        }

        public final Continuation s(Object obj, Continuation continuation) {
            AnonymousClass1 r0 = new AnonymousClass1(fareMediaPassesRepository, this, continuation);
            r0.E = obj;
            return r0;
        }

        public final Object x(Object obj) {
            IntrinsicsKt.f();
            if (this.D == 0) {
                ResultKt.b(obj);
                Flow h2 = fareMediaPassesRepository.h(this.f37007i);
                final FareMediaPassesViewModel fareMediaPassesViewModel = this;
                FlowKt.P(FlowKt.V(h2, new Function2<Result<? extends List<? extends FareProduct>>, Continuation<? super Unit>, Object>((Continuation) null) {
                    public int D;
                    public /* synthetic */ Object E;

                    public static final FareMediaPasses.State D(List list, FareMediaPasses.State state) {
                        Iterable<FareProduct> iterable = list;
                        ArrayList arrayList = new ArrayList(CollectionsKt.x(iterable, 10));
                        for (FareProduct a2 : iterable) {
                            arrayList.add(PassCardStateKt.a(a2));
                        }
                        return FareMediaPasses.State.b(state, false, ExtensionsKt.e(arrayList), false, 4, (Object) null);
                    }

                    public static final FareMediaPasses.State E(FareMediaPasses.State state) {
                        return FareMediaPasses.State.b(state, false, (PersistentList) null, false, 6, (Object) null);
                    }

                    public final Object C(Object obj, Continuation continuation) {
                        return ((AnonymousClass1) s(Result.a(obj), continuation)).x(Unit.f40552a);
                    }

                    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
                        return C(((Result) obj).j(), (Continuation) obj2);
                    }

                    public final Continuation s(Object obj, Continuation continuation) {
                        AnonymousClass1 r0 = 

                        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                        public FareMediaPassesViewModel(SavedStateHandle savedStateHandle, final FareMediaPassesRepository fareMediaPassesRepository, AppFeatures appFeatures) {
                            super(savedStateHandle, new FareMediaPasses.State(true, (PersistentList) null, appFeatures.h(), 2, (DefaultConstructorMarker) null));
                            Intrinsics.i(savedStateHandle, "savedStateHandle");
                            Intrinsics.i(fareMediaPassesRepository, "fareMediaPassesRepository");
                            Intrinsics.i(appFeatures, "appFeatures");
                            this.f37007i = ((CardOptionsPassesDestination) SavedStateHandleKt.a(savedStateHandle, Reflection.b(CardOptionsPassesDestination.class), MapsKt.h())).a();
                            MviViewModel.t(this, (CoroutineScope) null, 0, 0, new AnonymousClass1((Continuation) null), 7, (Object) null);
                        }

                        /* renamed from: x */
                        public Object o(FareMediaPasses.Action action, Continuation continuation) {
                            if (Intrinsics.d(action, FareMediaPasses.Action.AddMorePassClick.f36986a)) {
                                p(FareMediaPasses.Effect.AddPassEffect.f36989a);
                            } else if (!(action instanceof FareMediaPasses.Action.OnAutoLoadClick)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            return Unit.f40552a;
                        }
                    }
