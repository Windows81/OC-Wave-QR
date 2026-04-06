package androidx.compose.foundation.text.selection;

import androidx.collection.LongObjectMap;
import androidx.collection.LongObjectMapKt;
import androidx.collection.MutableLongObjectMap;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.LayoutCoordinates;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class SelectionRegistrarImpl implements SelectionRegistrar {

    /* renamed from: m  reason: collision with root package name */
    public static final Companion f6937m = new Companion((DefaultConstructorMarker) null);

    /* renamed from: n  reason: collision with root package name */
    public static final int f6938n = 8;

    /* renamed from: o  reason: collision with root package name */
    public static final Saver f6939o = SaverKt.e(SelectionRegistrarImpl$Companion$Saver$1.f6952z, SelectionRegistrarImpl$Companion$Saver$2.f6953z);

    /* renamed from: a  reason: collision with root package name */
    public boolean f6940a;

    /* renamed from: b  reason: collision with root package name */
    public final List f6941b;

    /* renamed from: c  reason: collision with root package name */
    public final MutableLongObjectMap f6942c;

    /* renamed from: d  reason: collision with root package name */
    public AtomicLong f6943d;

    /* renamed from: e  reason: collision with root package name */
    public Function1 f6944e;

    /* renamed from: f  reason: collision with root package name */
    public Function4 f6945f;

    /* renamed from: g  reason: collision with root package name */
    public Function2 f6946g;

    /* renamed from: h  reason: collision with root package name */
    public Function6 f6947h;

    /* renamed from: i  reason: collision with root package name */
    public Function0 f6948i;

    /* renamed from: j  reason: collision with root package name */
    public Function1 f6949j;

    /* renamed from: k  reason: collision with root package name */
    public Function1 f6950k;

    /* renamed from: l  reason: collision with root package name */
    public final MutableState f6951l;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Saver a() {
            return SelectionRegistrarImpl.f6939o;
        }

        public Companion() {
        }
    }

    public /* synthetic */ SelectionRegistrarImpl(long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2);
    }

    public static final int x(Function2 function2, Object obj, Object obj2) {
        return ((Number) function2.m(obj, obj2)).intValue();
    }

    public void a(long j2) {
        Function1 function1 = this.f6949j;
        if (function1 != null) {
            function1.invoke(Long.valueOf(j2));
        }
    }

    public boolean b(LayoutCoordinates layoutCoordinates, long j2, long j3, boolean z2, SelectionAdjustment selectionAdjustment, boolean z3) {
        Function6 function6 = this.f6947h;
        if (function6 == null) {
            return true;
        }
        return ((Boolean) function6.l(Boolean.valueOf(z3), layoutCoordinates, Offset.d(j2), Offset.d(j3), Boolean.valueOf(z2), selectionAdjustment)).booleanValue();
    }

    public long c() {
        long andIncrement = this.f6943d.getAndIncrement();
        while (andIncrement == 0) {
            andIncrement = this.f6943d.getAndIncrement();
        }
        return andIncrement;
    }

    public void d() {
        Function0 function0 = this.f6948i;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public LongObjectMap e() {
        return (LongObjectMap) this.f6951l.getValue();
    }

    public Selectable f(Selectable selectable) {
        if (!(selectable.k() != 0)) {
            InlineClassHelperKt.a("The selectable contains an invalid id: " + selectable.k());
        }
        if (this.f6942c.a(selectable.k())) {
            InlineClassHelperKt.a("Another selectable with the id: " + selectable + ".selectableId has already subscribed.");
        }
        this.f6942c.r(selectable.k(), selectable);
        this.f6941b.add(selectable);
        this.f6940a = false;
        return selectable;
    }

    public void g(long j2) {
        this.f6940a = false;
        Function1 function1 = this.f6944e;
        if (function1 != null) {
            function1.invoke(Long.valueOf(j2));
        }
    }

    public void h(LayoutCoordinates layoutCoordinates, long j2, SelectionAdjustment selectionAdjustment, boolean z2) {
        Function4 function4 = this.f6945f;
        if (function4 != null) {
            function4.j(Boolean.valueOf(z2), layoutCoordinates, Offset.d(j2), selectionAdjustment);
        }
    }

    public void i(Selectable selectable) {
        if (this.f6942c.a(selectable.k())) {
            this.f6941b.remove(selectable);
            this.f6942c.o(selectable.k());
            Function1 function1 = this.f6950k;
            if (function1 != null) {
                function1.invoke(Long.valueOf(selectable.k()));
            }
        }
    }

    public final LongObjectMap m() {
        return this.f6942c;
    }

    public final List n() {
        return this.f6941b;
    }

    public final void o(Function1 function1) {
        this.f6950k = function1;
    }

    public final void p(Function1 function1) {
        this.f6944e = function1;
    }

    public final void q(Function1 function1) {
        this.f6949j = function1;
    }

    public final void r(Function6 function6) {
        this.f6947h = function6;
    }

    public final void s(Function0 function0) {
        this.f6948i = function0;
    }

    public final void t(Function2 function2) {
        this.f6946g = function2;
    }

    public final void u(Function4 function4) {
        this.f6945f = function4;
    }

    public void v(LongObjectMap longObjectMap) {
        this.f6951l.setValue(longObjectMap);
    }

    public final List w(LayoutCoordinates layoutCoordinates) {
        if (!this.f6940a) {
            CollectionsKt.A(this.f6941b, new f(new SelectionRegistrarImpl$sort$1(layoutCoordinates)));
            this.f6940a = true;
        }
        return n();
    }

    public SelectionRegistrarImpl(long j2) {
        this.f6941b = new ArrayList();
        this.f6942c = LongObjectMapKt.c();
        this.f6943d = new AtomicLong(j2);
        this.f6951l = SnapshotStateKt__SnapshotStateKt.e(LongObjectMapKt.a(), (SnapshotMutationPolicy) null, 2, (Object) null);
    }

    public SelectionRegistrarImpl() {
        this(1);
    }
}
