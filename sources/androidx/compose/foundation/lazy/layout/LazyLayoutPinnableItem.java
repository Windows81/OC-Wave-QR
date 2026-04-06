package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.layout.PinnableContainer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

@Metadata
final class LazyLayoutPinnableItem implements PinnableContainer, PinnableContainer.PinnedHandle, LazyLayoutPinnedItemList.PinnedItem {

    /* renamed from: a  reason: collision with root package name */
    public final Object f4895a;

    /* renamed from: b  reason: collision with root package name */
    public final LazyLayoutPinnedItemList f4896b;

    /* renamed from: c  reason: collision with root package name */
    public int f4897c = -1;

    /* renamed from: d  reason: collision with root package name */
    public int f4898d;

    /* renamed from: e  reason: collision with root package name */
    public PinnableContainer.PinnedHandle f4899e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f4900f;

    /* renamed from: g  reason: collision with root package name */
    public final MutableState f4901g = SnapshotStateKt__SnapshotStateKt.e((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);

    public LazyLayoutPinnableItem(Object obj, LazyLayoutPinnedItemList lazyLayoutPinnedItemList) {
        this.f4895a = obj;
        this.f4896b = lazyLayoutPinnedItemList;
    }

    public PinnableContainer.PinnedHandle a() {
        if (this.f4900f) {
            InlineClassHelperKt.c("Pin should not be called on an already disposed item ");
        }
        if (this.f4898d == 0) {
            this.f4896b.n(this);
            PinnableContainer b2 = b();
            this.f4899e = b2 != null ? b2.a() : null;
        }
        this.f4898d++;
        return this;
    }

    public final PinnableContainer b() {
        return c();
    }

    public final PinnableContainer c() {
        return (PinnableContainer) this.f4901g.getValue();
    }

    public final void d() {
        this.f4900f = true;
    }

    public void e(int i2) {
        this.f4897c = i2;
    }

    public final void f(PinnableContainer pinnableContainer) {
        Snapshot.Companion companion = Snapshot.f15255e;
        Snapshot d2 = companion.d();
        PinnableContainer.PinnedHandle pinnedHandle = null;
        Function1 g2 = d2 != null ? d2.g() : null;
        Snapshot f2 = companion.f(d2);
        try {
            if (pinnableContainer != c()) {
                h(pinnableContainer);
                if (this.f4898d > 0) {
                    PinnableContainer.PinnedHandle pinnedHandle2 = this.f4899e;
                    if (pinnedHandle2 != null) {
                        pinnedHandle2.g();
                    }
                    if (pinnableContainer != null) {
                        pinnedHandle = pinnableContainer.a();
                    }
                    this.f4899e = pinnedHandle;
                }
            }
            Unit unit = Unit.f40552a;
            companion.m(d2, f2, g2);
        } catch (Throwable th) {
            companion.m(d2, f2, g2);
            throw th;
        }
    }

    public void g() {
        if (!this.f4900f) {
            if (!(this.f4898d > 0)) {
                InlineClassHelperKt.c("Release should only be called once");
            }
            int i2 = this.f4898d - 1;
            this.f4898d = i2;
            if (i2 == 0) {
                this.f4896b.o(this);
                PinnableContainer.PinnedHandle pinnedHandle = this.f4899e;
                if (pinnedHandle != null) {
                    pinnedHandle.g();
                }
                this.f4899e = null;
            }
        }
    }

    public int getIndex() {
        return this.f4897c;
    }

    public Object getKey() {
        return this.f4895a;
    }

    public final void h(PinnableContainer pinnableContainer) {
        this.f4901g.setValue(pinnableContainer);
    }
}
