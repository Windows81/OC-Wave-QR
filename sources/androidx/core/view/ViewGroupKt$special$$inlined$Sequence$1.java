package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.sequences.Sequence;

@Metadata
public final class ViewGroupKt$special$$inlined$Sequence$1 implements Sequence<View> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ViewGroup f20279a;

    public ViewGroupKt$special$$inlined$Sequence$1(ViewGroup viewGroup) {
        this.f20279a = viewGroup;
    }

    public Iterator iterator() {
        return new TreeIterator(ViewGroupKt.a(this.f20279a).iterator(), ViewGroupKt$descendants$1$1.f20281z);
    }
}
