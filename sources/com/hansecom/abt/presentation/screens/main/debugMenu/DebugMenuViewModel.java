package com.hansecom.abt.presentation.screens.main.debugMenu;

import android.content.Context;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModelKt;
import com.hansecom.abt.api.RealmPreferences;
import com.hansecom.abt.data.preferences.AuthenticationPreferences;
import com.hansecom.abt.data.useCases.LogOutUseCase;
import com.hansecom.abt.impl.Realm;
import com.hansecom.abt.presentation.mvi.MviViewModel;
import com.hansecom.abt.presentation.screens.main.debugMenu.DebugMenu;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ExtensionsKt;
import kotlinx.collections.immutable.PersistentList;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;

@Metadata
public final class DebugMenuViewModel extends MviViewModel<DebugMenu.Action, DebugMenu.State, DebugMenu.Effect> {

    /* renamed from: i  reason: collision with root package name */
    public final Context f37625i;

    /* renamed from: j  reason: collision with root package name */
    public final RealmPreferences f37626j;

    /* renamed from: k  reason: collision with root package name */
    public final AuthenticationPreferences f37627k;

    /* renamed from: l  reason: collision with root package name */
    public final LogOutUseCase f37628l;

    @Metadata
    @DebugMetadata(c = "com.hansecom.abt.presentation.screens.main.debugMenu.DebugMenuViewModel$1", f = "DebugMenuViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.hansecom.abt.presentation.screens.main.debugMenu.DebugMenuViewModel$1  reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int D;
        public final /* synthetic */ DebugMenuViewModel E;

        {
            this.E = r1;
        }

        public static final DebugMenu.State C(DebugMenuViewModel debugMenuViewModel, Realm realm, DebugMenu.State state) {
            EnumEntries<Realm> k2 = debugMenuViewModel.f37626j.k();
            ArrayList arrayList = new ArrayList(CollectionsKt.x(k2, 10));
            for (Realm name : k2) {
                arrayList.add(name.name());
            }
            return state.a(ExtensionsKt.e(arrayList), realm.name());
        }

        /* renamed from: B */
        public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
            return ((AnonymousClass1) s(coroutineScope, continuation)).x(Unit.f40552a);
        }

        public final Continuation s(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.E, continuation);
        }

        public final Object x(Object obj) {
            IntrinsicsKt.f();
            if (this.D == 0) {
                ResultKt.b(obj);
                if (this.E.f37626j.n()) {
                    Realm l2 = this.E.f37626j.l();
                    DebugMenuViewModel debugMenuViewModel = this.E;
                    debugMenuViewModel.r(new n(debugMenuViewModel, l2));
                }
                return Unit.f40552a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DebugMenuViewModel(Context context, SavedStateHandle savedStateHandle, RealmPreferences realmPreferences, AuthenticationPreferences authenticationPreferences, LogOutUseCase logOutUseCase) {
        super(savedStateHandle, new DebugMenu.State((PersistentList) null, (String) null, 3, (DefaultConstructorMarker) null));
        Intrinsics.i(context, "context");
        Intrinsics.i(savedStateHandle, "savedStateHandle");
        Intrinsics.i(realmPreferences, "realmPreferences");
        Intrinsics.i(authenticationPreferences, "authenticationPreferences");
        Intrinsics.i(logOutUseCase, "logOutUseCase");
        this.f37625i = context;
        this.f37626j = realmPreferences;
        this.f37627k = authenticationPreferences;
        this.f37628l = logOutUseCase;
        Job unused = BuildersKt__Builders_commonKt.d(ViewModelKt.a(this), (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, (Continuation) null), 3, (Object) null);
    }

    public static final DebugMenu.State A(Realm realm, DebugMenu.State state) {
        Intrinsics.i(state, "$this$update");
        return DebugMenu.State.b(state, (PersistentList) null, realm.name(), 1, (Object) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: com.hansecom.abt.impl.Realm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: com.hansecom.abt.impl.Realm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: com.hansecom.abt.impl.Realm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: com.hansecom.abt.impl.Realm} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0116 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0137 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002f  */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object o(com.hansecom.abt.presentation.screens.main.debugMenu.DebugMenu.Action r20, kotlin.coroutines.Continuation r21) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            boolean r3 = r2 instanceof com.hansecom.abt.presentation.screens.main.debugMenu.DebugMenuViewModel$handle$1
            if (r3 == 0) goto L_0x0019
            r3 = r2
            com.hansecom.abt.presentation.screens.main.debugMenu.DebugMenuViewModel$handle$1 r3 = (com.hansecom.abt.presentation.screens.main.debugMenu.DebugMenuViewModel$handle$1) r3
            int r4 = r3.G
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0019
            int r4 = r4 - r5
            r3.G = r4
            goto L_0x001e
        L_0x0019:
            com.hansecom.abt.presentation.screens.main.debugMenu.DebugMenuViewModel$handle$1 r3 = new com.hansecom.abt.presentation.screens.main.debugMenu.DebugMenuViewModel$handle$1
            r3.<init>(r0, r2)
        L_0x001e:
            java.lang.Object r2 = r3.E
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r5 = r3.G
            java.lang.String r6 = "1"
            r7 = 4
            r8 = 3
            r9 = 2
            r10 = 1
            r11 = 0
            if (r5 == 0) goto L_0x006f
            if (r5 == r10) goto L_0x0063
            if (r5 == r9) goto L_0x0051
            if (r5 == r8) goto L_0x0044
            if (r5 != r7) goto L_0x003c
            kotlin.ResultKt.b(r2)
            goto L_0x0138
        L_0x003c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0044:
            java.lang.Object r1 = r3.D
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r5 = r3.C
            com.hansecom.abt.data.preferences.AuthenticationPreferences r5 = (com.hansecom.abt.data.preferences.AuthenticationPreferences) r5
            kotlin.ResultKt.b(r2)
            goto L_0x011c
        L_0x0051:
            java.lang.Object r1 = r3.D
            com.hansecom.abt.data.preferences.AuthenticationPreferences r1 = (com.hansecom.abt.data.preferences.AuthenticationPreferences) r1
            java.lang.Object r5 = r3.C
            com.hansecom.abt.presentation.screens.main.debugMenu.DebugMenuViewModel r5 = (com.hansecom.abt.presentation.screens.main.debugMenu.DebugMenuViewModel) r5
            kotlin.ResultKt.b(r2)
            r18 = r5
            r5 = r1
            r1 = r18
            goto L_0x00f9
        L_0x0063:
            java.lang.Object r1 = r3.D
            com.hansecom.abt.impl.Realm r1 = (com.hansecom.abt.impl.Realm) r1
            java.lang.Object r3 = r3.C
            com.hansecom.abt.presentation.screens.main.debugMenu.DebugMenuViewModel r3 = (com.hansecom.abt.presentation.screens.main.debugMenu.DebugMenuViewModel) r3
            kotlin.ResultKt.b(r2)
            goto L_0x00bc
        L_0x006f:
            kotlin.ResultKt.b(r2)
            boolean r2 = r1 instanceof com.hansecom.abt.presentation.screens.main.debugMenu.DebugMenu.Action.RealmChange
            if (r2 == 0) goto L_0x00c5
            com.hansecom.abt.api.RealmPreferences r2 = r0.f37626j
            boolean r2 = r2.n()
            if (r2 == 0) goto L_0x00dd
            com.hansecom.abt.api.RealmPreferences r2 = r0.f37626j
            kotlin.enums.EnumEntries r2 = r2.k()
            java.util.Iterator r2 = r2.iterator()
        L_0x0088:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x00a7
            java.lang.Object r5 = r2.next()
            r6 = r5
            com.hansecom.abt.impl.Realm r6 = (com.hansecom.abt.impl.Realm) r6
            java.lang.String r6 = r6.name()
            r7 = r1
            com.hansecom.abt.presentation.screens.main.debugMenu.DebugMenu$Action$RealmChange r7 = (com.hansecom.abt.presentation.screens.main.debugMenu.DebugMenu.Action.RealmChange) r7
            java.lang.String r7 = r7.a()
            boolean r6 = kotlin.jvm.internal.Intrinsics.d(r6, r7)
            if (r6 == 0) goto L_0x0088
            r11 = r5
        L_0x00a7:
            r1 = r11
            com.hansecom.abt.impl.Realm r1 = (com.hansecom.abt.impl.Realm) r1
            if (r1 == 0) goto L_0x00dd
            com.hansecom.abt.api.RealmPreferences r2 = r0.f37626j
            r3.C = r0
            r3.D = r1
            r3.G = r10
            java.lang.Object r2 = r2.q(r1, r3)
            if (r2 != r4) goto L_0x00bb
            return r4
        L_0x00bb:
            r3 = r0
        L_0x00bc:
            com.hansecom.abt.presentation.screens.main.debugMenu.m r2 = new com.hansecom.abt.presentation.screens.main.debugMenu.m
            r2.<init>(r1)
            r3.r(r2)
            goto L_0x00dd
        L_0x00c5:
            com.hansecom.abt.presentation.screens.main.debugMenu.DebugMenu$Action$RestartApp r2 = com.hansecom.abt.presentation.screens.main.debugMenu.DebugMenu.Action.RestartApp.f37607a
            boolean r2 = kotlin.jvm.internal.Intrinsics.d(r1, r2)
            if (r2 == 0) goto L_0x00e0
            kotlinx.coroutines.GlobalScope r12 = kotlinx.coroutines.GlobalScope.f41412z
            com.hansecom.abt.presentation.screens.main.debugMenu.DebugMenuViewModel$handle$3 r15 = new com.hansecom.abt.presentation.screens.main.debugMenu.DebugMenuViewModel$handle$3
            r15.<init>(r0, r11)
            r16 = 3
            r17 = 0
            r13 = 0
            r14 = 0
            kotlinx.coroutines.Job unused = kotlinx.coroutines.BuildersKt__Builders_commonKt.d(r12, r13, r14, r15, r16, r17)
        L_0x00dd:
            kotlin.Unit r1 = kotlin.Unit.f40552a
            return r1
        L_0x00e0:
            com.hansecom.abt.presentation.screens.main.debugMenu.DebugMenu$Action$BreakAccessTokens r2 = com.hansecom.abt.presentation.screens.main.debugMenu.DebugMenu.Action.BreakAccessTokens.f37605a
            boolean r1 = kotlin.jvm.internal.Intrinsics.d(r1, r2)
            if (r1 == 0) goto L_0x013b
            com.hansecom.abt.data.preferences.AuthenticationPreferences r1 = r0.f37627k
            r3.C = r0
            r3.D = r1
            r3.G = r9
            java.lang.Object r2 = r1.e(r3)
            if (r2 != r4) goto L_0x00f7
            return r4
        L_0x00f7:
            r5 = r1
            r1 = r0
        L_0x00f9:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r2)
            r9.append(r6)
            java.lang.String r2 = r9.toString()
            com.hansecom.abt.data.preferences.AuthenticationPreferences r1 = r1.f37627k
            r3.C = r5
            r3.D = r2
            r3.G = r8
            java.lang.Object r1 = r1.g(r3)
            if (r1 != r4) goto L_0x0117
            return r4
        L_0x0117:
            r18 = r2
            r2 = r1
            r1 = r18
        L_0x011c:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r2)
            r8.append(r6)
            java.lang.String r2 = r8.toString()
            r3.C = r11
            r3.D = r11
            r3.G = r7
            java.lang.Object r1 = r5.h(r1, r2, r3)
            if (r1 != r4) goto L_0x0138
            return r4
        L_0x0138:
            kotlin.Unit r1 = kotlin.Unit.f40552a
            return r1
        L_0x013b:
            kotlin.NoWhenBranchMatchedException r1 = new kotlin.NoWhenBranchMatchedException
            r1.<init>()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.main.debugMenu.DebugMenuViewModel.o(com.hansecom.abt.presentation.screens.main.debugMenu.DebugMenu$Action, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
