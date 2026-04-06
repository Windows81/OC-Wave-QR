package androidx.compose.foundation;

import android.view.KeyEvent;
import androidx.collection.LongObjectMapKt;
import androidx.collection.MutableLongObjectMap;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.SemanticsModifierNodeKt;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;

@Metadata
final class CombinedClickableNode extends AbstractClickableNode implements CompositionLocalConsumerModifierNode {
    public String i0;
    public Function0 j0;
    public Function0 k0;
    public boolean l0;
    public final MutableLongObjectMap m0;
    public final MutableLongObjectMap n0;

    @Metadata
    public static final class DoubleKeyClickState {

        /* renamed from: a  reason: collision with root package name */
        public final Job f3037a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f3038b;

        public DoubleKeyClickState(Job job) {
            this.f3037a = job;
        }

        public final boolean a() {
            return this.f3038b;
        }

        public final Job b() {
            return this.f3037a;
        }

        public final void c(boolean z2) {
            this.f3038b = z2;
        }
    }

    public /* synthetic */ CombinedClickableNode(Function0 function0, String str, Function0 function02, Function0 function03, boolean z2, MutableInteractionSource mutableInteractionSource, IndicationNodeFactory indicationNodeFactory, boolean z3, String str2, Role role, DefaultConstructorMarker defaultConstructorMarker) {
        this(function0, str, function02, function03, z2, mutableInteractionSource, indicationNodeFactory, z3, str2, role);
    }

    public final boolean G3() {
        return this.l0;
    }

    public final void H3() {
        MutableLongObjectMap mutableLongObjectMap = this.m0;
        Object[] objArr = mutableLongObjectMap.f1831c;
        long[] jArr = mutableLongObjectMap.f1829a;
        int length = jArr.length - 2;
        long j2 = -9187201950435737472L;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j3 = jArr[i2];
                if ((((~j3) << 7) & j3 & j2) != j2) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((j3 & 255) < 128) {
                            Job.DefaultImpls.a((Job) objArr[(i2 << 3) + i4], (CancellationException) null, 1, (Object) null);
                        }
                        j3 >>= 8;
                    }
                    if (i3 != 8) {
                        break;
                    }
                }
                if (i2 == length) {
                    break;
                }
                i2++;
                j2 = -9187201950435737472L;
            }
        }
        mutableLongObjectMap.g();
        MutableLongObjectMap mutableLongObjectMap2 = this.n0;
        Object[] objArr2 = mutableLongObjectMap2.f1831c;
        long[] jArr2 = mutableLongObjectMap2.f1829a;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i5 = 0;
            while (true) {
                long j4 = jArr2[i5];
                if ((((~j4) << 7) & j4 & -9187201950435737472L) != -9187201950435737472L) {
                    int i6 = 8 - ((~(i5 - length2)) >>> 31);
                    for (int i7 = 0; i7 < i6; i7++) {
                        if ((j4 & 255) < 128) {
                            Job.DefaultImpls.a(((DoubleKeyClickState) objArr2[(i5 << 3) + i7]).b(), (CancellationException) null, 1, (Object) null);
                        }
                        j4 >>= 8;
                    }
                    if (i6 != 8) {
                        break;
                    }
                }
                if (i5 == length2) {
                    break;
                }
                i5++;
            }
        }
        mutableLongObjectMap2.g();
    }

    public final void I3(boolean z2) {
        this.l0 = z2;
    }

    public final void J3(Function0 function0, String str, Function0 function02, Function0 function03, MutableInteractionSource mutableInteractionSource, IndicationNodeFactory indicationNodeFactory, boolean z2, String str2, Role role) {
        boolean z3;
        String str3 = str;
        Function0 function04 = function02;
        Function0 function05 = function03;
        if (!Intrinsics.d(this.i0, str)) {
            this.i0 = str3;
            SemanticsModifierNodeKt.b(this);
        }
        boolean z4 = false;
        if ((this.j0 == null) != (function04 == null)) {
            p3();
            SemanticsModifierNodeKt.b(this);
            z3 = true;
        } else {
            z3 = false;
        }
        this.j0 = function04;
        boolean z5 = this.k0 == null;
        if (function05 == null) {
            z4 = true;
        }
        if (z5 != z4) {
            z3 = true;
        }
        this.k0 = function05;
        boolean z6 = s3() != z2 ? true : z3;
        C3(mutableInteractionSource, indicationNodeFactory, z2, str2, role, function0);
        if (z6) {
            A3();
        }
    }

    public void K2() {
        super.K2();
        H3();
    }

    public void m3(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        if (this.j0 != null) {
            SemanticsPropertiesKt.F(semanticsPropertyReceiver, this.i0, new CombinedClickableNode$applyAdditionalSemantics$1(this));
        }
    }

    public Object n3(PointerInputScope pointerInputScope, Continuation continuation) {
        Object l2 = TapGestureDetectorKt.l(pointerInputScope, (!s3() || this.k0 == null) ? null : new CombinedClickableNode$clickPointerInput$2(this), (!s3() || this.j0 == null) ? null : new CombinedClickableNode$clickPointerInput$3(this), new CombinedClickableNode$clickPointerInput$4(this, (Continuation) null), new CombinedClickableNode$clickPointerInput$5(this), continuation);
        return l2 == IntrinsicsKt.f() ? l2 : Unit.f40552a;
    }

    public void w3() {
        H3();
    }

    public boolean x3(KeyEvent keyEvent) {
        boolean z2;
        long a2 = KeyEvent_androidKt.a(keyEvent);
        if (this.j0 == null || this.m0.b(a2) != null) {
            z2 = false;
        } else {
            this.m0.r(a2, BuildersKt__Builders_commonKt.d(y2(), (CoroutineContext) null, (CoroutineStart) null, new CombinedClickableNode$onClickKeyDownEvent$1(this, (Continuation) null), 3, (Object) null));
            z2 = true;
        }
        DoubleKeyClickState doubleKeyClickState = (DoubleKeyClickState) this.n0.b(a2);
        if (doubleKeyClickState != null) {
            if (doubleKeyClickState.b().b()) {
                Job.DefaultImpls.a(doubleKeyClickState.b(), (CancellationException) null, 1, (Object) null);
                if (!doubleKeyClickState.a()) {
                    t3().invoke();
                    this.n0.o(a2);
                }
            } else {
                this.n0.o(a2);
            }
        }
        return z2;
    }

    public boolean y3(KeyEvent keyEvent) {
        Function0 function0;
        long a2 = KeyEvent_androidKt.a(keyEvent);
        boolean z2 = false;
        if (this.m0.b(a2) != null) {
            Job job = (Job) this.m0.b(a2);
            if (job != null) {
                if (job.b()) {
                    Job.DefaultImpls.a(job, (CancellationException) null, 1, (Object) null);
                } else {
                    z2 = true;
                }
            }
            this.m0.o(a2);
        }
        if (this.k0 != null) {
            if (this.n0.b(a2) != null) {
                if (!z2 && (function0 = this.k0) != null) {
                    function0.invoke();
                }
                this.n0.o(a2);
            } else if (!z2) {
                this.n0.r(a2, new DoubleKeyClickState(BuildersKt__Builders_commonKt.d(y2(), (CoroutineContext) null, (CoroutineStart) null, new CombinedClickableNode$onClickKeyUpEvent$2(this, a2, (Continuation) null), 3, (Object) null)));
            }
        } else if (!z2) {
            t3().invoke();
        }
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CombinedClickableNode(Function0 function0, String str, Function0 function02, Function0 function03, boolean z2, MutableInteractionSource mutableInteractionSource, IndicationNodeFactory indicationNodeFactory, boolean z3, String str2, Role role) {
        super(mutableInteractionSource, indicationNodeFactory, z3, str2, role, function0, (DefaultConstructorMarker) null);
        this.i0 = str;
        this.j0 = function02;
        this.k0 = function03;
        this.l0 = z2;
        this.m0 = LongObjectMapKt.c();
        this.n0 = LongObjectMapKt.c();
    }
}
