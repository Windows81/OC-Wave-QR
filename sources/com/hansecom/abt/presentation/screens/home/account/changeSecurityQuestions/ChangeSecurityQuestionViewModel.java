package com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModelKt;
import com.hansecom.abt.api.ApiException;
import com.hansecom.abt.api.ApiExceptionsKt;
import com.hansecom.abt.data.useCases.account.ChangeSecurityQuestionsUseCase;
import com.hansecom.abt.data.useCases.configurations.GetSignUpConfigurationUseCase;
import com.hansecom.abt.presentation.mvi.MviViewModel;
import com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.ChangeSecurityQuestions;
import com.hansecom.abt.util.inputValidators.InputValidators;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.StateFlow;

@Metadata
public final class ChangeSecurityQuestionViewModel extends MviViewModel<ChangeSecurityQuestions.Action, ChangeSecurityQuestions.State, ChangeSecurityQuestions.Effect> {

    /* renamed from: i  reason: collision with root package name */
    public final SavedStateHandle f35347i;

    /* renamed from: j  reason: collision with root package name */
    public final ChangeSecurityQuestionsUseCase f35348j;

    /* renamed from: k  reason: collision with root package name */
    public final GetSignUpConfigurationUseCase f35349k;

    /* renamed from: l  reason: collision with root package name */
    public List f35350l = CollectionsKt.m();

    /* renamed from: m  reason: collision with root package name */
    public StateFlow f35351m;

    /* renamed from: n  reason: collision with root package name */
    public StateFlow f35352n;

    /* renamed from: o  reason: collision with root package name */
    public final InputValidators.InputValidator f35353o;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ChangeSecurityQuestionViewModel(androidx.lifecycle.SavedStateHandle r25, com.hansecom.abt.util.inputValidators.InputValidators r26, com.hansecom.abt.data.repositories.generalData.SecurityQuestionsRepository r27, com.hansecom.abt.data.repositories.UserSecurityQuestionsRepository r28, com.hansecom.abt.data.useCases.account.ChangeSecurityQuestionsUseCase r29, com.hansecom.abt.data.useCases.configurations.GetSignUpConfigurationUseCase r30) {
        /*
            r24 = this;
            r8 = r24
            r0 = r25
            r1 = r27
            r2 = r28
            r3 = r29
            r4 = r30
            java.lang.String r5 = "savedStateHandle"
            kotlin.jvm.internal.Intrinsics.i(r0, r5)
            java.lang.String r5 = "inputValidators"
            r9 = r26
            kotlin.jvm.internal.Intrinsics.i(r9, r5)
            java.lang.String r5 = "securityQuestionsRepository"
            kotlin.jvm.internal.Intrinsics.i(r1, r5)
            java.lang.String r5 = "userSecurityQuestionsRepository"
            kotlin.jvm.internal.Intrinsics.i(r2, r5)
            java.lang.String r5 = "changeSecurityQuestionsUseCase"
            kotlin.jvm.internal.Intrinsics.i(r3, r5)
            java.lang.String r5 = "getSignUpConfigurationUseCase"
            kotlin.jvm.internal.Intrinsics.i(r4, r5)
            com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.ChangeSecurityQuestions$State r5 = new com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.ChangeSecurityQuestions$State
            com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.ChangeSecurityQuestions$State$Main r6 = new com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.ChangeSecurityQuestions$State$Main
            r22 = 1535(0x5ff, float:2.151E-42)
            r23 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 1
            r21 = 0
            r10 = r6
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            r7 = 2
            r10 = 0
            r5.<init>(r6, r10, r7, r10)
            r8.<init>(r0, r5)
            r8.f35347i = r0
            r8.f35348j = r3
            r8.f35349k = r4
            java.util.List r3 = kotlin.collections.CollectionsKt.m()
            r8.f35350l = r3
            java.lang.String r3 = "chosenQuestionId"
            kotlinx.coroutines.flow.StateFlow r3 = r0.d(r3, r10)
            r8.f35351m = r3
            java.lang.String r3 = "secondChosenQuestionId"
            kotlinx.coroutines.flow.StateFlow r0 = r0.d(r3, r10)
            r8.f35352n = r0
            kotlinx.coroutines.CoroutineScope r11 = androidx.lifecycle.ViewModelKt.a(r24)
            com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.ChangeSecurityQuestionViewModel$1 r14 = new com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.ChangeSecurityQuestionViewModel$1
            r14.<init>(r8, r10)
            r15 = 3
            r16 = 0
            kotlinx.coroutines.Job unused = kotlinx.coroutines.BuildersKt__Builders_commonKt.d(r11, r12, r13, r14, r15, r16)
            com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.ChangeSecurityQuestionViewModel$2 r5 = new com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.ChangeSecurityQuestionViewModel$2
            r5.<init>(r2, r1, r8, r10)
            r6 = 7
            r7 = 0
            r1 = 0
            r2 = 0
            r3 = 0
            r0 = r24
            com.hansecom.abt.presentation.mvi.MviViewModel.t(r0, r1, r2, r3, r5, r6, r7)
            com.hansecom.abt.util.inputValidators.InputValidators$InputValidator r0 = r26.y()
            r8.f35353o = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.ChangeSecurityQuestionViewModel.<init>(androidx.lifecycle.SavedStateHandle, com.hansecom.abt.util.inputValidators.InputValidators, com.hansecom.abt.data.repositories.generalData.SecurityQuestionsRepository, com.hansecom.abt.data.repositories.UserSecurityQuestionsRepository, com.hansecom.abt.data.useCases.account.ChangeSecurityQuestionsUseCase, com.hansecom.abt.data.useCases.configurations.GetSignUpConfigurationUseCase):void");
    }

    private final void O(String str) {
        r(new p(str));
    }

    public static final ChangeSecurityQuestions.State P(String str, ChangeSecurityQuestions.State state) {
        ChangeSecurityQuestions.State state2 = state;
        Intrinsics.i(state2, "$this$update");
        return ChangeSecurityQuestions.State.b(state2, ChangeSecurityQuestions.State.Main.b(state.d(), false, str, "", (String) null, (String) null, true, true, false, false, false, false, 1945, (Object) null), (ChangeSecurityQuestions.State.Questions) null, 2, (Object) null);
    }

    private final void Q(String str) {
        r(new q(str));
    }

    public static final ChangeSecurityQuestions.State R(String str, ChangeSecurityQuestions.State state) {
        ChangeSecurityQuestions.State state2 = state;
        Intrinsics.i(state2, "$this$update");
        return ChangeSecurityQuestions.State.b(state2, ChangeSecurityQuestions.State.Main.b(state.d(), false, (String) null, (String) null, str, "", false, false, true, true, false, false, 1639, (Object) null), (ChangeSecurityQuestions.State.Questions) null, 2, (Object) null);
    }

    public static final ChangeSecurityQuestions.State V(ChangeSecurityQuestions.Action.Main main, ChangeSecurityQuestions.State state) {
        ChangeSecurityQuestions.State state2 = state;
        Intrinsics.i(state2, "$this$update");
        return ChangeSecurityQuestions.State.b(state2, ChangeSecurityQuestions.State.Main.b(state.d(), false, (String) null, ((ChangeSecurityQuestions.Action.Main.AnswerChange) main).a(), (String) null, (String) null, false, true, false, false, false, false, 1979, (Object) null), (ChangeSecurityQuestions.State.Questions) null, 2, (Object) null);
    }

    public static final ChangeSecurityQuestions.State W(ChangeSecurityQuestions.Action.Main main, ChangeSecurityQuestions.State state) {
        ChangeSecurityQuestions.State state2 = state;
        Intrinsics.i(state2, "$this$update");
        return ChangeSecurityQuestions.State.b(state2, ChangeSecurityQuestions.State.Main.b(state.d(), false, (String) null, (String) null, (String) null, ((ChangeSecurityQuestions.Action.Main.SecondAnswerChange) main).a(), false, false, false, true, false, false, 1775, (Object) null), (ChangeSecurityQuestions.State.Questions) null, 2, (Object) null);
    }

    public static final ChangeSecurityQuestions.State X(ChangeSecurityQuestions.State state) {
        Intrinsics.i(state, "$this$update");
        return ChangeSecurityQuestions.State.b(state, ChangeSecurityQuestions.State.Main.b(state.d(), false, (String) null, (String) null, (String) null, (String) null, false, false, false, false, false, true, 1023, (Object) null), (ChangeSecurityQuestions.State.Questions) null, 2, (Object) null);
    }

    public static final ChangeSecurityQuestions.State Y(ChangeSecurityQuestions.State state) {
        Intrinsics.i(state, "$this$update");
        return ChangeSecurityQuestions.State.b(state, ChangeSecurityQuestions.State.Main.b(state.d(), false, (String) null, (String) null, (String) null, (String) null, false, false, false, false, false, false, 1023, (Object) null), (ChangeSecurityQuestions.State.Questions) null, 2, (Object) null);
    }

    public static final ChangeSecurityQuestions.State Z(ChangeSecurityQuestions.State state) {
        Intrinsics.i(state, "$this$update");
        return ChangeSecurityQuestions.State.b(state, ChangeSecurityQuestions.State.Main.b(state.d(), false, (String) null, (String) null, (String) null, (String) null, false, false, false, false, false, false, 1023, (Object) null), (ChangeSecurityQuestions.State.Questions) null, 2, (Object) null);
    }

    public static final ChangeSecurityQuestions.State e0(ChangeSecurityQuestionViewModel changeSecurityQuestionViewModel, ChangeSecurityQuestions.State state) {
        ChangeSecurityQuestionViewModel changeSecurityQuestionViewModel2 = changeSecurityQuestionViewModel;
        ChangeSecurityQuestions.State state2 = state;
        Intrinsics.i(state2, "$this$update");
        return ChangeSecurityQuestions.State.b(state2, ChangeSecurityQuestions.State.Main.b(state.d(), false, (String) null, (String) null, (String) null, (String) null, ((ChangeSecurityQuestions.State) changeSecurityQuestionViewModel.m()).d().c().length() > 0, changeSecurityQuestionViewModel2.f35353o.a(((ChangeSecurityQuestions.State) changeSecurityQuestionViewModel.m()).d().d()), !((ChangeSecurityQuestions.State) changeSecurityQuestionViewModel.m()).d().l() || ((ChangeSecurityQuestions.State) changeSecurityQuestionViewModel.m()).d().j().length() > 0, !((ChangeSecurityQuestions.State) changeSecurityQuestionViewModel.m()).d().l() || changeSecurityQuestionViewModel2.f35353o.a(((ChangeSecurityQuestions.State) changeSecurityQuestionViewModel.m()).d().h()), false, false, 1567, (Object) null), (ChangeSecurityQuestions.State.Questions) null, 2, (Object) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00c1 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0106 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object N(kotlin.coroutines.Continuation r14) {
        /*
            r13 = this;
            boolean r0 = r14 instanceof com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.ChangeSecurityQuestionViewModel$changeSecurityQuestions$1
            if (r0 == 0) goto L_0x0013
            r0 = r14
            com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.ChangeSecurityQuestionViewModel$changeSecurityQuestions$1 r0 = (com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.ChangeSecurityQuestionViewModel$changeSecurityQuestions$1) r0
            int r1 = r0.I
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.I = r1
            goto L_0x0018
        L_0x0013:
            com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.ChangeSecurityQuestionViewModel$changeSecurityQuestions$1 r0 = new com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.ChangeSecurityQuestionViewModel$changeSecurityQuestions$1
            r0.<init>(r13, r14)
        L_0x0018:
            java.lang.Object r14 = r0.G
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.I
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 0
            r7 = 1
            if (r2 == 0) goto L_0x0075
            if (r2 == r7) goto L_0x0063
            if (r2 == r5) goto L_0x0057
            if (r2 == r4) goto L_0x0046
            if (r2 != r3) goto L_0x003e
            java.lang.Object r0 = r0.C
            com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.ChangeSecurityQuestionViewModel r0 = (com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.ChangeSecurityQuestionViewModel) r0
            kotlin.ResultKt.b(r14)
            kotlin.Result r14 = (kotlin.Result) r14
            java.lang.Object r14 = r14.j()
            goto L_0x0108
        L_0x003e:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L_0x0046:
            java.lang.Object r2 = r0.E
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r4 = r0.D
            java.util.List r4 = (java.util.List) r4
            java.lang.Object r5 = r0.C
            com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.ChangeSecurityQuestionViewModel r5 = (com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.ChangeSecurityQuestionViewModel) r5
            kotlin.ResultKt.b(r14)
            goto L_0x00da
        L_0x0057:
            java.lang.Object r2 = r0.D
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r5 = r0.C
            com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.ChangeSecurityQuestionViewModel r5 = (com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.ChangeSecurityQuestionViewModel) r5
            kotlin.ResultKt.b(r14)
            goto L_0x00c6
        L_0x0063:
            int r2 = r0.F
            java.lang.Object r7 = r0.E
            com.hansecom.mapi.models.SecurityQuestionRequest[] r7 = (com.hansecom.mapi.models.SecurityQuestionRequest[]) r7
            java.lang.Object r8 = r0.D
            com.hansecom.mapi.models.SecurityQuestionRequest[] r8 = (com.hansecom.mapi.models.SecurityQuestionRequest[]) r8
            java.lang.Object r9 = r0.C
            com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.ChangeSecurityQuestionViewModel r9 = (com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.ChangeSecurityQuestionViewModel) r9
            kotlin.ResultKt.b(r14)
            goto L_0x0093
        L_0x0075:
            kotlin.ResultKt.b(r14)
            com.hansecom.mapi.models.SecurityQuestionRequest[] r14 = new com.hansecom.mapi.models.SecurityQuestionRequest[r7]
            kotlinx.coroutines.flow.StateFlow r2 = r13.f35351m
            r0.C = r13
            r0.D = r14
            r0.E = r14
            r8 = 0
            r0.F = r8
            r0.I = r7
            java.lang.Object r2 = kotlinx.coroutines.flow.FlowKt.D(r2, r0)
            if (r2 != r1) goto L_0x008e
            return r1
        L_0x008e:
            r9 = r13
            r7 = r14
            r14 = r2
            r2 = r8
            r8 = r7
        L_0x0093:
            kotlin.jvm.internal.Intrinsics.f(r14)
            java.lang.Integer r14 = (java.lang.Integer) r14
            android.os.Parcelable r10 = r9.m()
            com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.ChangeSecurityQuestions$State r10 = (com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.ChangeSecurityQuestions.State) r10
            com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.ChangeSecurityQuestions$State$Main r10 = r10.d()
            java.lang.String r10 = r10.d()
            com.hansecom.mapi.models.SecurityQuestionRequest r11 = new com.hansecom.mapi.models.SecurityQuestionRequest
            r11.<init>(r14, r10)
            r7[r2] = r11
            java.util.List r14 = kotlin.collections.CollectionsKt.s(r8)
            kotlinx.coroutines.flow.StateFlow r2 = r9.f35352n
            r0.C = r9
            r0.D = r14
            r0.E = r6
            r0.I = r5
            java.lang.Object r2 = kotlinx.coroutines.flow.FlowKt.D(r2, r0)
            if (r2 != r1) goto L_0x00c2
            return r1
        L_0x00c2:
            r5 = r9
            r12 = r2
            r2 = r14
            r14 = r12
        L_0x00c6:
            if (r14 == 0) goto L_0x00f6
            kotlinx.coroutines.flow.StateFlow r14 = r5.f35352n
            r0.C = r5
            r0.D = r2
            r0.E = r2
            r0.I = r4
            java.lang.Object r14 = kotlinx.coroutines.flow.FlowKt.D(r14, r0)
            if (r14 != r1) goto L_0x00d9
            return r1
        L_0x00d9:
            r4 = r2
        L_0x00da:
            kotlin.jvm.internal.Intrinsics.f(r14)
            java.lang.Integer r14 = (java.lang.Integer) r14
            android.os.Parcelable r7 = r5.m()
            com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.ChangeSecurityQuestions$State r7 = (com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.ChangeSecurityQuestions.State) r7
            com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.ChangeSecurityQuestions$State$Main r7 = r7.d()
            java.lang.String r7 = r7.h()
            com.hansecom.mapi.models.SecurityQuestionRequest r8 = new com.hansecom.mapi.models.SecurityQuestionRequest
            r8.<init>(r14, r7)
            r2.add(r8)
            r2 = r4
        L_0x00f6:
            com.hansecom.abt.data.useCases.account.ChangeSecurityQuestionsUseCase r14 = r5.f35348j
            r0.C = r5
            r0.D = r6
            r0.E = r6
            r0.I = r3
            java.lang.Object r14 = r14.b(r2, r0)
            if (r14 != r1) goto L_0x0107
            return r1
        L_0x0107:
            r0 = r5
        L_0x0108:
            java.lang.Throwable r1 = kotlin.Result.e(r14)
            if (r1 != 0) goto L_0x0116
            kotlin.Unit r14 = (kotlin.Unit) r14
            com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.ChangeSecurityQuestions$Effect$Main$UpdateSuccess r14 = com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.ChangeSecurityQuestions.Effect.Main.UpdateSuccess.f35369a
            r0.p(r14)
            goto L_0x011f
        L_0x0116:
            boolean r14 = r1 instanceof com.hansecom.abt.api.ApiException
            if (r14 == 0) goto L_0x011f
            com.hansecom.abt.api.ApiException r1 = (com.hansecom.abt.api.ApiException) r1
            r0.T(r1)
        L_0x011f:
            kotlin.Unit r14 = kotlin.Unit.f40552a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.ChangeSecurityQuestionViewModel.N(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* renamed from: S */
    public Object o(ChangeSecurityQuestions.Action action, Continuation continuation) {
        if (action instanceof ChangeSecurityQuestions.Action.Main) {
            Object U = U((ChangeSecurityQuestions.Action.Main) action, continuation);
            return U == IntrinsicsKt.f() ? U : Unit.f40552a;
        } else if (action instanceof ChangeSecurityQuestions.Action.Questions) {
            a0((ChangeSecurityQuestions.Action.Questions) action);
            return Unit.f40552a;
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    public final void T(ApiException apiException) {
        p(new ChangeSecurityQuestions.Effect.Main.Fail(ApiExceptionsKt.a(apiException)));
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object U(com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.ChangeSecurityQuestions.Action.Main r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.ChangeSecurityQuestionViewModel$handleMain$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.ChangeSecurityQuestionViewModel$handleMain$1 r0 = (com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.ChangeSecurityQuestionViewModel$handleMain$1) r0
            int r1 = r0.F
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.F = r1
            goto L_0x0018
        L_0x0013:
            com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.ChangeSecurityQuestionViewModel$handleMain$1 r0 = new com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.ChangeSecurityQuestionViewModel$handleMain$1
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.D
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.F
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r5 = r0.C
            com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.ChangeSecurityQuestionViewModel r5 = (com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.ChangeSecurityQuestionViewModel) r5
            kotlin.ResultKt.b(r6)
            goto L_0x0088
        L_0x002d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0035:
            kotlin.ResultKt.b(r6)
            boolean r6 = r5 instanceof com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.ChangeSecurityQuestions.Action.Main.AnswerChange
            if (r6 == 0) goto L_0x0045
            com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.k r6 = new com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.k
            r6.<init>(r5)
            r4.r(r6)
            goto L_0x0090
        L_0x0045:
            boolean r6 = r5 instanceof com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.ChangeSecurityQuestions.Action.Main.SecondAnswerChange
            if (r6 == 0) goto L_0x0052
            com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.l r6 = new com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.l
            r6.<init>(r5)
            r4.r(r6)
            goto L_0x0090
        L_0x0052:
            boolean r5 = r5 instanceof com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.ChangeSecurityQuestions.Action.Main.Confirm
            if (r5 == 0) goto L_0x0093
            com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.m r5 = new com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.m
            r5.<init>()
            r4.r(r5)
            r4.d0()
            android.os.Parcelable r5 = r4.m()
            com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.ChangeSecurityQuestions$State r5 = (com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.ChangeSecurityQuestions.State) r5
            com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.ChangeSecurityQuestions$State$Main r5 = r5.d()
            boolean r5 = r5.g()
            if (r5 == 0) goto L_0x007c
            com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.n r5 = new com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.n
            r5.<init>()
            r4.r(r5)
            kotlin.Unit r5 = kotlin.Unit.f40552a
            return r5
        L_0x007c:
            r0.C = r4
            r0.F = r3
            java.lang.Object r5 = r4.N(r0)
            if (r5 != r1) goto L_0x0087
            return r1
        L_0x0087:
            r5 = r4
        L_0x0088:
            com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.o r6 = new com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.o
            r6.<init>()
            r5.r(r6)
        L_0x0090:
            kotlin.Unit r5 = kotlin.Unit.f40552a
            return r5
        L_0x0093:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.ChangeSecurityQuestionViewModel.U(com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.ChangeSecurityQuestions$Action$Main, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void a0(ChangeSecurityQuestions.Action.Questions questions) {
        if (questions instanceof ChangeSecurityQuestions.Action.Questions.ChooseSecurityQuestion) {
            O(((ChangeSecurityQuestions.Action.Questions.ChooseSecurityQuestion) questions).a());
            p(ChangeSecurityQuestions.Effect.Questions.GoBack.f35370a);
            Job unused = BuildersKt__Builders_commonKt.d(ViewModelKt.a(this), (CoroutineContext) null, (CoroutineStart) null, new ChangeSecurityQuestionViewModel$handleQuestions$1(this, questions, (Continuation) null), 3, (Object) null);
        } else if (questions instanceof ChangeSecurityQuestions.Action.Questions.ChooseSecondSecurityQuestion) {
            Q(((ChangeSecurityQuestions.Action.Questions.ChooseSecondSecurityQuestion) questions).a());
            p(ChangeSecurityQuestions.Effect.Questions.GoBack.f35370a);
            Job unused2 = BuildersKt__Builders_commonKt.d(ViewModelKt.a(this), (CoroutineContext) null, (CoroutineStart) null, new ChangeSecurityQuestionViewModel$handleQuestions$2(this, questions, (Continuation) null), 3, (Object) null);
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    public final void b0(int i2) {
        this.f35347i.f("chosenQuestionId", Integer.valueOf(i2));
    }

    public final void c0(int i2) {
        this.f35347i.f("secondChosenQuestionId", Integer.valueOf(i2));
    }

    public final void d0() {
        r(new r(this));
    }
}
