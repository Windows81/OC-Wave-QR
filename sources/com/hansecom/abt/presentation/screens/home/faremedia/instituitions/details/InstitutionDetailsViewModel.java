package com.hansecom.abt.presentation.screens.home.faremedia.instituitions.details;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModelKt;
import androidx.navigation.SavedStateHandleKt;
import com.hansecom.abt.AppFeatures;
import com.hansecom.abt.data.repositories.InstitutionsRepository;
import com.hansecom.abt.data.useCases.institution.UnlinkInstitutionUseCase;
import com.hansecom.abt.presentation.model.InstitutionState;
import com.hansecom.abt.presentation.mvi.MviViewModel;
import com.hansecom.abt.presentation.screens.home.faremedia.cardOptions.CardOptionsInstitutionDetailsDestination;
import com.hansecom.abt.presentation.screens.home.faremedia.instituitions.details.InstitutionDetails;
import com.hansecom.mapi.models.Institution;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

@Metadata
public final class InstitutionDetailsViewModel extends MviViewModel<InstitutionDetails.Action, InstitutionDetails.State, InstitutionDetails.Effect> {

    /* renamed from: i  reason: collision with root package name */
    public final UnlinkInstitutionUseCase f36835i;

    /* renamed from: j  reason: collision with root package name */
    public final CardOptionsInstitutionDetailsDestination f36836j;

    @Metadata
    @DebugMetadata(c = "com.hansecom.abt.presentation.screens.home.faremedia.instituitions.details.InstitutionDetailsViewModel$1", f = "InstitutionDetailsViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.hansecom.abt.presentation.screens.home.faremedia.instituitions.details.InstitutionDetailsViewModel$1  reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int D;
        public /* synthetic */ Object E;

        /* renamed from: A */
        public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
            return ((AnonymousClass1) s(coroutineScope, continuation)).x(Unit.f40552a);
        }

        public final Continuation s(Object obj, Continuation continuation) {
            AnonymousClass1 r0 = new AnonymousClass1(institutionsRepository, this, continuation);
            r0.E = obj;
            return r0;
        }

        public final Object x(Object obj) {
            IntrinsicsKt.f();
            if (this.D == 0) {
                ResultKt.b(obj);
                Flow o2 = institutionsRepository.o();
                final InstitutionDetailsViewModel institutionDetailsViewModel = this;
                FlowKt.P(FlowKt.V(o2, new Function2<List<? extends Institution>, Continuation<? super Unit>, Object>((Continuation) null) {
                    public int D;
                    public /* synthetic */ Object E;

                    public static final InstitutionDetails.State C(InstitutionState institutionState, InstitutionDetails.State state) {
                        return InstitutionDetails.State.b(state, institutionState, false, false, false, false, 30, (Object) null);
                    }

                    /* renamed from: B */
                    public final Object m(List list, Continuation continuation) {
                        return ((AnonymousClass1) s(list, continuation)).x(Unit.f40552a);
                    }

                    public final Continuation s(Object obj, Continuation continuation) {
                        AnonymousClass1 r0 = 

                        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                        public InstitutionDetailsViewModel(SavedStateHandle savedStateHandle, AppFeatures appFeatures, final InstitutionsRepository institutionsRepository, UnlinkInstitutionUseCase unlinkInstitutionUseCase) {
                            super(savedStateHandle, new InstitutionDetails.State((InstitutionState) null, false, false, appFeatures.z(), appFeatures.r(), 7, (DefaultConstructorMarker) null));
                            Intrinsics.i(savedStateHandle, "savedStateHandle");
                            Intrinsics.i(appFeatures, "appFeatures");
                            Intrinsics.i(institutionsRepository, "institutionsRepository");
                            Intrinsics.i(unlinkInstitutionUseCase, "unlinkInstitutionUseCase");
                            this.f36835i = unlinkInstitutionUseCase;
                            this.f36836j = (CardOptionsInstitutionDetailsDestination) SavedStateHandleKt.a(savedStateHandle, Reflection.b(CardOptionsInstitutionDetailsDestination.class), MapsKt.h());
                            MviViewModel.t(this, (CoroutineScope) null, 0, 0, new AnonymousClass1((Continuation) null), 7, (Object) null);
                        }

                        public static final InstitutionDetails.State A(InstitutionDetails.Action action, InstitutionDetails.State state) {
                            Intrinsics.i(state, "$this$update");
                            return InstitutionDetails.State.b(state, (InstitutionState) null, ((InstitutionDetails.Action.ShowUnlinkDialog) action).a(), false, false, false, 29, (Object) null);
                        }

                        /* renamed from: z */
                        public Object o(InstitutionDetails.Action action, Continuation continuation) {
                            if (Intrinsics.d(action, InstitutionDetails.Action.Unlink.f36826a)) {
                                Job unused = BuildersKt__Builders_commonKt.d(ViewModelKt.a(this), (CoroutineContext) null, (CoroutineStart) null, new InstitutionDetailsViewModel$handle$2(this, (Continuation) null), 3, (Object) null);
                            } else if (action instanceof InstitutionDetails.Action.ShowUnlinkDialog) {
                                r(new h(action));
                            } else {
                                throw new NoWhenBranchMatchedException();
                            }
                            return Unit.f40552a;
                        }
                    }
