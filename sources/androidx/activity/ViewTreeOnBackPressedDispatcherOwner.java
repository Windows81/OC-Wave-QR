package androidx.activity;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.SequencesKt;

@Metadata
public final class ViewTreeOnBackPressedDispatcherOwner {
    public static final OnBackPressedDispatcherOwner a(View view) {
        Intrinsics.i(view, "<this>");
        return (OnBackPressedDispatcherOwner) SequencesKt.u(SequencesKt.A(SequencesKt.h(view, ViewTreeOnBackPressedDispatcherOwner$findViewTreeOnBackPressedDispatcherOwner$1.f124z), ViewTreeOnBackPressedDispatcherOwner$findViewTreeOnBackPressedDispatcherOwner$2.f125z));
    }

    public static final void b(View view, OnBackPressedDispatcherOwner onBackPressedDispatcherOwner) {
        Intrinsics.i(view, "<this>");
        Intrinsics.i(onBackPressedDispatcherOwner, "onBackPressedDispatcherOwner");
        view.setTag(R.id.f113b, onBackPressedDispatcherOwner);
    }
}
