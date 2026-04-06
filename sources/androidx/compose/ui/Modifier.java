package androidx.compose.ui;

import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.ObserverNodeOwnerScope;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;

@Metadata
public interface Modifier {

    /* renamed from: d  reason: collision with root package name */
    public static final Companion f15489d = Companion.f15490z;

    @Metadata
    public static final class Companion implements Modifier {

        /* renamed from: z  reason: collision with root package name */
        public static final /* synthetic */ Companion f15490z = new Companion();

        public Object C(Object obj, Function2 function2) {
            return obj;
        }

        public boolean P(Function1 function1) {
            return true;
        }

        public Modifier o0(Modifier modifier) {
            return modifier;
        }

        public String toString() {
            return "Modifier";
        }
    }

    @Metadata
    public static final class DefaultImpls {
    }

    @Metadata
    public interface Element extends Modifier {

        @Metadata
        public static final class DefaultImpls {
        }

        Object C(Object obj, Function2 function2) {
            return function2.m(obj, this);
        }

        boolean P(Function1 function1) {
            return ((Boolean) function1.invoke(this)).booleanValue();
        }
    }

    @Metadata
    public static abstract class Node implements DelegatableNode {

        /* renamed from: A  reason: collision with root package name */
        public CoroutineScope f15491A;

        /* renamed from: B  reason: collision with root package name */
        public int f15492B;
        public int C = -1;
        public Node D;
        public Node E;
        public ObserverNodeOwnerScope F;
        public NodeCoordinator G;
        public boolean H;
        public boolean I;
        public boolean J;
        public boolean K;
        public Function0 L;
        public boolean M;

        /* renamed from: z  reason: collision with root package name */
        public Node f15493z = this;

        public final int A2() {
            return this.f15492B;
        }

        public final ObserverNodeOwnerScope B2() {
            return this.F;
        }

        public final Node C2() {
            return this.D;
        }

        public boolean D2() {
            return true;
        }

        public final boolean E2() {
            return this.I;
        }

        public final boolean F2() {
            return this.M;
        }

        public void G2() {
            if (this.M) {
                InlineClassHelperKt.c("node attached multiple times");
            }
            if (!(this.G != null)) {
                InlineClassHelperKt.c("attach invoked on a node without a coordinator");
            }
            this.M = true;
            this.J = true;
        }

        public void H2() {
            if (!this.M) {
                InlineClassHelperKt.c("Cannot detach a node that is not attached");
            }
            if (this.J) {
                InlineClassHelperKt.c("Must run runAttachLifecycle() before markAsDetached()");
            }
            if (this.K) {
                InlineClassHelperKt.c("Must run runDetachLifecycle() before markAsDetached()");
            }
            this.M = false;
            CoroutineScope coroutineScope = this.f15491A;
            if (coroutineScope != null) {
                CoroutineScopeKt.d(coroutineScope, new ModifierNodeDetachedCancellationException());
                this.f15491A = null;
            }
        }

        public void I2() {
        }

        public void J2() {
        }

        public void K2() {
        }

        public void L2() {
            if (!this.M) {
                InlineClassHelperKt.c("reset() called on an unattached node");
            }
            K2();
        }

        public final Node M() {
            return this.f15493z;
        }

        public void M2() {
            if (!this.M) {
                InlineClassHelperKt.c("Must run markAsAttached() prior to runAttachLifecycle");
            }
            if (!this.J) {
                InlineClassHelperKt.c("Must run runAttachLifecycle() only once after markAsAttached()");
            }
            this.J = false;
            I2();
            this.K = true;
        }

        public void N2() {
            if (!this.M) {
                InlineClassHelperKt.c("node detached multiple times");
            }
            if (!(this.G != null)) {
                InlineClassHelperKt.c("detach invoked on a node without a coordinator");
            }
            if (!this.K) {
                InlineClassHelperKt.c("Must run runDetachLifecycle() once after runAttachLifecycle() and before markAsDetached()");
            }
            this.K = false;
            Function0 function0 = this.L;
            if (function0 != null) {
                function0.invoke();
            }
            J2();
        }

        public final void O2(int i2) {
            this.C = i2;
        }

        public void P2(Node node) {
            this.f15493z = node;
        }

        public final void Q2(Node node) {
            this.E = node;
        }

        public final void R2(Function0 function0) {
            this.L = function0;
        }

        public final void S2(boolean z2) {
            this.H = z2;
        }

        public final void T2(int i2) {
            this.f15492B = i2;
        }

        public final void U2(ObserverNodeOwnerScope observerNodeOwnerScope) {
            this.F = observerNodeOwnerScope;
        }

        public final void V2(Node node) {
            this.D = node;
        }

        public final void W2(boolean z2) {
            this.I = z2;
        }

        public final void X2(Function0 function0) {
            DelegatableNodeKt.p(this).F(function0);
        }

        public void Y2(NodeCoordinator nodeCoordinator) {
            this.G = nodeCoordinator;
        }

        public final int v2() {
            return this.C;
        }

        public final Node w2() {
            return this.E;
        }

        public final NodeCoordinator x2() {
            return this.G;
        }

        public final CoroutineScope y2() {
            CoroutineScope coroutineScope = this.f15491A;
            if (coroutineScope != null) {
                return coroutineScope;
            }
            CoroutineScope a2 = CoroutineScopeKt.a(DelegatableNodeKt.p(this).getCoroutineContext().y(JobKt.a((Job) DelegatableNodeKt.p(this).getCoroutineContext().d(Job.f41415x))));
            this.f15491A = a2;
            return a2;
        }

        public final boolean z2() {
            return this.H;
        }
    }

    Object C(Object obj, Function2 function2);

    boolean P(Function1 function1);

    Modifier o0(Modifier modifier) {
        return modifier == f15489d ? this : new CombinedModifier(this, modifier);
    }
}
