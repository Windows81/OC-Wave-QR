package androidx.core.view;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata
public final class ViewKt$doOnNextLayout$1 implements View.OnLayoutChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Function1 f20290a;

    public void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        view.removeOnLayoutChangeListener(this);
        this.f20290a.invoke(view);
    }
}
