package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.sequences.Sequence;

@Metadata
public final class ViewGroupKt$descendants$1$1 extends Lambda implements Function1<View, Iterator<? extends View>> {

    /* renamed from: z  reason: collision with root package name */
    public static final ViewGroupKt$descendants$1$1 f20281z = new ViewGroupKt$descendants$1$1();

    public ViewGroupKt$descendants$1$1() {
        super(1);
    }

    /* renamed from: b */
    public final Iterator invoke(View view) {
        Sequence a2;
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup == null || (a2 = ViewGroupKt.a(viewGroup)) == null) {
            return null;
        }
        return a2.iterator();
    }
}
