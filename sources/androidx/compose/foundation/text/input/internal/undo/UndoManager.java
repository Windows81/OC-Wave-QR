package androidx.compose.foundation.text.input.internal.undo;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class UndoManager<T> {

    /* renamed from: d  reason: collision with root package name */
    public static final Companion f6590d = new Companion((DefaultConstructorMarker) null);

    /* renamed from: e  reason: collision with root package name */
    public static final int f6591e = 8;

    /* renamed from: a  reason: collision with root package name */
    public final int f6592a;

    /* renamed from: b  reason: collision with root package name */
    public SnapshotStateList f6593b;

    /* renamed from: c  reason: collision with root package name */
    public SnapshotStateList f6594c;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public UndoManager(List list, List list2, int i2) {
        this.f6592a = i2;
        SnapshotStateList snapshotStateList = new SnapshotStateList();
        snapshotStateList.addAll(list);
        this.f6593b = snapshotStateList;
        SnapshotStateList snapshotStateList2 = new SnapshotStateList();
        snapshotStateList2.addAll(list2);
        this.f6594c = snapshotStateList2;
        boolean z2 = false;
        if (!(i2 >= 0)) {
            InlineClassHelperKt.a("Capacity must be a positive integer");
        }
        if (!(g() <= i2 ? true : z2)) {
            InlineClassHelperKt.a("Initial list of undo and redo operations have a size greater than the given capacity.");
        }
    }

    public final void d() {
        this.f6593b.clear();
        this.f6594c.clear();
    }

    public final boolean e() {
        return !this.f6594c.isEmpty();
    }

    public final boolean f() {
        return !this.f6593b.isEmpty();
    }

    public final int g() {
        return this.f6593b.size() + this.f6594c.size();
    }

    public final void h(Object obj) {
        this.f6594c.clear();
        while (g() > this.f6592a - 1) {
            CollectionsKt.I(this.f6593b);
        }
        this.f6593b.add(obj);
    }

    public final Object i() {
        if (!e()) {
            InlineClassHelperKt.c("It's an error to call redo while there is nothing to redo. Please first check `canRedo` value before calling the `redo` function.");
        }
        Object K = CollectionsKt.K(this.f6594c);
        this.f6593b.add(K);
        return K;
    }

    public final Object j() {
        if (!f()) {
            InlineClassHelperKt.c("It's an error to call undo while there is nothing to undo. Please first check `canUndo` value before calling the `undo` function.");
        }
        Object K = CollectionsKt.K(this.f6593b);
        this.f6594c.add(K);
        return K;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ UndoManager(List list, List list2, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? CollectionsKt.m() : list, (i3 & 2) != 0 ? CollectionsKt.m() : list2, (i3 & 4) != 0 ? 100 : i2);
    }
}
