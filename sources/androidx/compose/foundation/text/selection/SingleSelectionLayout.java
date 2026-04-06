package androidx.compose.foundation.text.selection;

import androidx.collection.LongObjectMap;
import androidx.collection.LongObjectMapKt;
import androidx.compose.foundation.text.selection.Selection;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
final class SingleSelectionLayout implements SelectionLayout {

    /* renamed from: f  reason: collision with root package name */
    public static final Companion f6962f = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final boolean f6963a;

    /* renamed from: b  reason: collision with root package name */
    public final int f6964b;

    /* renamed from: c  reason: collision with root package name */
    public final int f6965c;

    /* renamed from: d  reason: collision with root package name */
    public final Selection f6966d;

    /* renamed from: e  reason: collision with root package name */
    public final SelectableInfo f6967e;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public SingleSelectionLayout(boolean z2, int i2, int i3, Selection selection, SelectableInfo selectableInfo) {
        this.f6963a = z2;
        this.f6964b = i2;
        this.f6965c = i3;
        this.f6966d = selection;
        this.f6967e = selectableInfo;
    }

    public boolean a() {
        return this.f6963a;
    }

    public SelectableInfo b() {
        return this.f6967e;
    }

    public Selection c() {
        return this.f6966d;
    }

    public SelectableInfo d() {
        return this.f6967e;
    }

    public int e() {
        return 1;
    }

    public LongObjectMap f(Selection selection) {
        if ((!selection.d() && selection.e().d() > selection.c().d()) || (selection.d() && selection.e().d() <= selection.c().d())) {
            selection = Selection.b(selection, (Selection.AnchorInfo) null, (Selection.AnchorInfo) null, !selection.d(), 3, (Object) null);
        }
        return LongObjectMapKt.b(this.f6967e.h(), selection);
    }

    public boolean g(SelectionLayout selectionLayout) {
        return c() == null || selectionLayout == null || !(selectionLayout instanceof SingleSelectionLayout) || m() != selectionLayout.m() || h() != selectionLayout.h() || a() != selectionLayout.a() || this.f6967e.n(((SingleSelectionLayout) selectionLayout).f6967e);
    }

    public int h() {
        return this.f6965c;
    }

    public SelectableInfo i() {
        return this.f6967e;
    }

    public CrossStatus j() {
        return m() < h() ? CrossStatus.NOT_CROSSED : m() > h() ? CrossStatus.CROSSED : this.f6967e.d();
    }

    public void k(Function1 function1) {
    }

    public SelectableInfo l() {
        return this.f6967e;
    }

    public int m() {
        return this.f6964b;
    }

    public String toString() {
        return "SingleSelectionLayout(isStartHandle=" + a() + ", crossed=" + j() + ", info=\n\t" + this.f6967e + ')';
    }
}
