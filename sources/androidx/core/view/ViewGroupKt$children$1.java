package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.sequences.Sequence;

@Metadata
public final class ViewGroupKt$children$1 implements Sequence<View> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ViewGroup f20280a;

    public ViewGroupKt$children$1(ViewGroup viewGroup) {
        this.f20280a = viewGroup;
    }

    public Iterator iterator() {
        return ViewGroupKt.c(this.f20280a);
    }
}
