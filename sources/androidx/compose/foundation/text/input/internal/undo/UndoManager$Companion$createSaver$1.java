package androidx.compose.foundation.text.input.internal.undo;

import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class UndoManager$Companion$createSaver$1 implements Saver<UndoManager<Object>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Saver f6595a;

    /* renamed from: c */
    public UndoManager a(Object obj) {
        Intrinsics.g(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
        List list = (List) obj;
        int intValue = ((Number) list.get(0)).intValue();
        int intValue2 = ((Number) list.get(1)).intValue();
        int intValue3 = ((Number) list.get(2)).intValue();
        Saver saver = this.f6595a;
        List c2 = CollectionsKt.c();
        int i2 = 3;
        while (i2 < intValue2 + 3) {
            Object a2 = saver.a(list.get(i2));
            Intrinsics.f(a2);
            c2.add(a2);
            i2++;
        }
        List a3 = CollectionsKt.a(c2);
        Saver saver2 = this.f6595a;
        List c3 = CollectionsKt.c();
        while (i2 < intValue2 + intValue3 + 3) {
            Object a4 = saver2.a(list.get(i2));
            Intrinsics.f(a4);
            c3.add(a4);
            i2++;
        }
        return new UndoManager(a3, CollectionsKt.a(c3), intValue);
    }

    /* renamed from: d */
    public Object b(SaverScope saverScope, UndoManager undoManager) {
        Saver saver = this.f6595a;
        List c2 = CollectionsKt.c();
        c2.add(Integer.valueOf(undoManager.f6592a));
        c2.add(Integer.valueOf(undoManager.f6593b.size()));
        c2.add(Integer.valueOf(undoManager.f6594c.size()));
        SnapshotStateList c3 = undoManager.f6593b;
        int size = c3.size();
        for (int i2 = 0; i2 < size; i2++) {
            c2.add(saver.b(saverScope, c3.get(i2)));
        }
        SnapshotStateList b2 = undoManager.f6594c;
        int size2 = b2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            c2.add(saver.b(saverScope, b2.get(i3)));
        }
        return CollectionsKt.a(c2);
    }
}
