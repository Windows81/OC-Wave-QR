package com.hansecom.abt.presentation.screens.home.faremedia.instituitions.search;

import androidx.lifecycle.SavedStateHandle;
import androidx.navigation.SavedStateHandleKt;
import com.hansecom.abt.data.repositories.FareMediaInstitutionsRepository;
import com.hansecom.abt.data.repositories.InstitutionsRepository;
import com.hansecom.abt.presentation.model.InstitutionStateKt;
import com.hansecom.abt.presentation.mvi.MviViewModel;
import com.hansecom.abt.presentation.screens.home.faremedia.cardOptions.CardOptionsSearchInstitutionsDestination;
import com.hansecom.abt.presentation.screens.home.faremedia.instituitions.search.InstitutionsSearch;
import com.hansecom.mapi.models.Institution;
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
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import kotlinx.collections.immutable.ExtensionsKt;
import kotlinx.collections.immutable.PersistentList;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

@Metadata
public final class InstitutionsSearchViewModel extends MviViewModel<InstitutionsSearch.Action, InstitutionsSearch.State, InstitutionsSearch.Effect> {

    /* renamed from: i  reason: collision with root package name */
    public final CardOptionsSearchInstitutionsDestination f36879i;

    @Metadata
    @DebugMetadata(c = "com.hansecom.abt.presentation.screens.home.faremedia.instituitions.search.InstitutionsSearchViewModel$1", f = "InstitutionsSearchViewModel.kt", l = {59}, m = "invokeSuspend")
    /* renamed from: com.hansecom.abt.presentation.screens.home.faremedia.instituitions.search.InstitutionsSearchViewModel$1  reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int D;

        /* renamed from: A */
        public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
            return ((AnonymousClass1) s(coroutineScope, continuation)).x(Unit.f40552a);
        }

        public final Continuation s(Object obj, Continuation continuation) {
            return new AnonymousClass1(institutionsRepository, fareMediaInstitutionsRepository, this, continuation);
        }

        public final Object x(Object obj) {
            Object f2 = IntrinsicsKt.f();
            int i2 = this.D;
            if (i2 == 0) {
                ResultKt.b(obj);
                Flow p2 = institutionsRepository.p();
                InstitutionsSearchViewModel$1$invokeSuspend$$inlined$map$1 institutionsSearchViewModel$1$invokeSuspend$$inlined$map$1 = new InstitutionsSearchViewModel$1$invokeSuspend$$inlined$map$1(fareMediaInstitutionsRepository.f(this.f36879i.a()));
                Flow u2 = FlowKt.u(new InstitutionsSearchViewModel$1$invokeSuspend$$inlined$map$2(this.n()));
                final InstitutionsSearchViewModel institutionsSearchViewModel = this;
                Flow n2 = FlowKt.n(p2, institutionsSearchViewModel$1$invokeSuspend$$inlined$map$1, u2, new Function4<Result<? extends List<? extends Institution>>, List<? extends Integer>, String, Continuation<? super Unit>, Object>((Continuation) null) {
                    public int D;
                    public /* synthetic */ Object E;
                    public /* synthetic */ Object F;
                    public /* synthetic */ Object G;

                    public static final InstitutionsSearch.State C(List list, List list2, String str, InstitutionsSearch.State state) {
                        String d2;
                        ArrayList<Institution> arrayList = new ArrayList<>();
                        for (Object next : list) {
                            Institution institution = (Institution) next;
                            if (!list2.contains(institution.a()) && (str.length() == 0 || ((d2 = institution.d()) != null && StringsKt.U(d2, str, true)))) {
                                arrayList.add(next);
                            }
                        }
                        ArrayList arrayList2 = new ArrayList(CollectionsKt.x(arrayList, 10));
                        for (Institution a2 : arrayList) {
                            arrayList2.add(InstitutionStateKt.a(a2));
                        }
                        return InstitutionsSearch.State.b(state, (String) null, ExtensionsKt.e(arrayList2), 1, (Object) null);
                    }

                    public final Object B(Object obj, List list, String str, Continuation continuation) {
                        AnonymousClass3 r0 = 

                        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                        public InstitutionsSearchViewModel(SavedStateHandle savedStateHandle, final FareMediaInstitutionsRepository fareMediaInstitutionsRepository, final InstitutionsRepository institutionsRepository) {
                            super(savedStateHandle, new InstitutionsSearch.State((String) null, (PersistentList) null, 3, (DefaultConstructorMarker) null));
                            Intrinsics.i(savedStateHandle, "savedStateHandle");
                            Intrinsics.i(fareMediaInstitutionsRepository, "fareMediaInstitutionsRepository");
                            Intrinsics.i(institutionsRepository, "institutionsRepository");
                            this.f36879i = (CardOptionsSearchInstitutionsDestination) SavedStateHandleKt.a(savedStateHandle, Reflection.b(CardOptionsSearchInstitutionsDestination.class), MapsKt.h());
                            MviViewModel.t(this, (CoroutineScope) null, 0, 0, new AnonymousClass1((Continuation) null), 7, (Object) null);
                        }

                        public static final InstitutionsSearch.State z(InstitutionsSearch.Action action, InstitutionsSearch.State state) {
                            Intrinsics.i(state, "$this$update");
                            return InstitutionsSearch.State.b(state, ((InstitutionsSearch.Action.FilterChange) action).a(), (PersistentList) null, 2, (Object) null);
                        }

                        /* renamed from: y */
                        public Object o(InstitutionsSearch.Action action, Continuation continuation) {
                            if (action instanceof InstitutionsSearch.Action.FilterChange) {
                                r(new i(action));
                                return Unit.f40552a;
                            }
                            throw new NoWhenBranchMatchedException();
                        }
                    }
