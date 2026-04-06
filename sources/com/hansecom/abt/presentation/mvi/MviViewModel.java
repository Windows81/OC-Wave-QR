package com.hansecom.abt.presentation.mvi;

import android.os.Parcelable;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.hansecom.abt.util.ChecksKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import timber.log.Timber;

@Metadata
public abstract class MviViewModel<Action, State extends Parcelable, Effect> extends ViewModel implements Mvi<Action, State, Effect> {

    /* renamed from: g  reason: collision with root package name */
    public static final Companion f34192g = new Companion((DefaultConstructorMarker) null);

    /* renamed from: h  reason: collision with root package name */
    public static final int f34193h = 8;

    /* renamed from: b  reason: collision with root package name */
    public final SavedStateHandle f34194b;

    /* renamed from: c  reason: collision with root package name */
    public final StateFlow f34195c;

    /* renamed from: d  reason: collision with root package name */
    public final Channel f34196d;

    /* renamed from: e  reason: collision with root package name */
    public final Flow f34197e;

    /* renamed from: f  reason: collision with root package name */
    public final MutableStateFlow f34198f = StateFlowKt.a(0);

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public MviViewModel(SavedStateHandle savedStateHandle, Parcelable parcelable) {
        Intrinsics.i(savedStateHandle, "savedStateHandle");
        Intrinsics.i(parcelable, "initialState");
        this.f34194b = savedStateHandle;
        this.f34195c = savedStateHandle.d("state", parcelable);
        Channel b2 = ChannelKt.b(0, (BufferOverflow) null, new b(), 3, (Object) null);
        this.f34196d = b2;
        this.f34197e = FlowKt.Y(b2);
    }

    public static final Unit h(Object obj) {
        Timber.Forest forest = Timber.f44337a;
        forest.o(obj + " is undelivered", new Object[0]);
        return Unit.f40552a;
    }

    public static /* synthetic */ void t(MviViewModel mviViewModel, CoroutineScope coroutineScope, int i2, long j2, Function2 function2, int i3, Object obj) {
        if (obj == null) {
            if ((i3 & 1) != 0) {
                coroutineScope = ViewModelKt.a(mviViewModel);
            }
            CoroutineScope coroutineScope2 = coroutineScope;
            int i4 = (i3 & 2) != 0 ? 1 : i2;
            if ((i3 & 4) != 0) {
                Duration.Companion companion = Duration.f41206A;
                j2 = DurationKt.s(1, DurationUnit.SECONDS);
            }
            mviViewModel.s(coroutineScope2, i4, j2, function2);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: whileSubscribed-exY8QGI");
    }

    public final void k(Object obj) {
        Job unused = BuildersKt__Builders_commonKt.d(ViewModelKt.a(this), (CoroutineContext) null, (CoroutineStart) null, new MviViewModel$action$1(this, obj, (Continuation) null), 3, (Object) null);
    }

    public Flow l() {
        return this.f34197e;
    }

    public final Parcelable m() {
        ChecksKt.a();
        return (Parcelable) n().getValue();
    }

    public StateFlow n() {
        return this.f34195c;
    }

    public abstract Object o(Object obj, Continuation continuation);

    public final void p(Object obj) {
        Job unused = BuildersKt__Builders_commonKt.d(ViewModelKt.a(this), (CoroutineContext) null, (CoroutineStart) null, new MviViewModel$send$1(this, obj, (Continuation) null), 3, (Object) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: kotlin.jvm.functions.Function2} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.compose.runtime.State q(androidx.lifecycle.LifecycleOwner r9, androidx.lifecycle.Lifecycle.State r10, androidx.compose.runtime.Composer r11, int r12, int r13) {
        /*
            r8 = this;
            r0 = -1588836211(0xffffffffa14c488d, float:-6.921391E-19)
            r11.X(r0)
            r1 = r13 & 1
            if (r1 == 0) goto L_0x0014
            androidx.compose.runtime.ProvidableCompositionLocal r9 = androidx.lifecycle.compose.LocalLifecycleOwnerKt.c()
            java.lang.Object r9 = r11.C(r9)
            androidx.lifecycle.LifecycleOwner r9 = (androidx.lifecycle.LifecycleOwner) r9
        L_0x0014:
            r13 = r13 & 2
            if (r13 == 0) goto L_0x001a
            androidx.lifecycle.Lifecycle$State r10 = androidx.lifecycle.Lifecycle.State.STARTED
        L_0x001a:
            r4 = r10
            boolean r10 = androidx.compose.runtime.ComposerKt.P()
            if (r10 == 0) goto L_0x0027
            r10 = -1
            java.lang.String r13 = "com.hansecom.abt.presentation.mvi.MviViewModel.subscribe (MviViewModel.kt:84)"
            androidx.compose.runtime.ComposerKt.Y(r0, r12, r10, r13)
        L_0x0027:
            androidx.lifecycle.Lifecycle r3 = r9.a()
            kotlinx.coroutines.flow.StateFlow r9 = r8.n()
            java.lang.Object r1 = r9.getValue()
            r9 = 948313219(0x38861c83, float:6.394929E-5)
            r11.X(r9)
            boolean r9 = r11.l(r3)
            r10 = r12 & 112(0x70, float:1.57E-43)
            r10 = r10 ^ 48
            r13 = 32
            if (r10 <= r13) goto L_0x004b
            boolean r10 = r11.W(r4)
            if (r10 != 0) goto L_0x004f
        L_0x004b:
            r10 = r12 & 48
            if (r10 != r13) goto L_0x0051
        L_0x004f:
            r10 = 1
            goto L_0x0052
        L_0x0051:
            r10 = 0
        L_0x0052:
            r9 = r9 | r10
            boolean r10 = r11.l(r8)
            r9 = r9 | r10
            java.lang.Object r10 = r11.g()
            if (r9 != 0) goto L_0x0066
            androidx.compose.runtime.Composer$Companion r9 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r9 = r9.a()
            if (r10 != r9) goto L_0x006f
        L_0x0066:
            com.hansecom.abt.presentation.mvi.MviViewModel$subscribe$1$1 r10 = new com.hansecom.abt.presentation.mvi.MviViewModel$subscribe$1$1
            r9 = 0
            r10.<init>(r3, r4, r8, r9)
            r11.N(r10)
        L_0x006f:
            r5 = r10
            kotlin.jvm.functions.Function2 r5 = (kotlin.jvm.functions.Function2) r5
            r11.M()
            int r9 = r12 >> 3
            r9 = r9 & 112(0x70, float:1.57E-43)
            int r10 = r12 << 6
            r10 = r10 & 7168(0x1c00, float:1.0045E-41)
            r7 = r9 | r10
            r2 = r8
            r6 = r11
            androidx.compose.runtime.State r9 = androidx.compose.runtime.SnapshotStateKt.l(r1, r2, r3, r4, r5, r6, r7)
            boolean r10 = androidx.compose.runtime.ComposerKt.P()
            if (r10 == 0) goto L_0x008e
            androidx.compose.runtime.ComposerKt.X()
        L_0x008e:
            r11.M()
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.mvi.MviViewModel.q(androidx.lifecycle.LifecycleOwner, androidx.lifecycle.Lifecycle$State, androidx.compose.runtime.Composer, int, int):androidx.compose.runtime.State");
    }

    public final void r(Function1 function1) {
        Intrinsics.i(function1, "block");
        ChecksKt.a();
        this.f34194b.f("state", function1.invoke(n().getValue()));
    }

    public final void s(CoroutineScope coroutineScope, int i2, long j2, Function2 function2) {
        Intrinsics.i(coroutineScope, "scope");
        Intrinsics.i(function2, "action");
        Job unused = BuildersKt__Builders_commonKt.d(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new MviViewModel$whileSubscribed$1(this, i2, j2, function2, (Continuation) null), 3, (Object) null);
    }
}
