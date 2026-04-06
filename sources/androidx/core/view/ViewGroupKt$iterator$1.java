package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMutableIterator;

@Metadata
public final class ViewGroupKt$iterator$1 implements Iterator<View>, KMutableIterator {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ ViewGroup f20282A;

    /* renamed from: z  reason: collision with root package name */
    public int f20283z;

    public ViewGroupKt$iterator$1(ViewGroup viewGroup) {
        this.f20282A = viewGroup;
    }

    /* renamed from: b */
    public View next() {
        ViewGroup viewGroup = this.f20282A;
        int i2 = this.f20283z;
        this.f20283z = i2 + 1;
        View childAt = viewGroup.getChildAt(i2);
        if (childAt != null) {
            return childAt;
        }
        throw new IndexOutOfBoundsException();
    }

    public boolean hasNext() {
        return this.f20283z < this.f20282A.getChildCount();
    }

    public void remove() {
        ViewGroup viewGroup = this.f20282A;
        int i2 = this.f20283z - 1;
        this.f20283z = i2;
        viewGroup.removeViewAt(i2);
    }
}
