package com.hansecom.abt.ui.components.formFields;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.platform.TextToolbar;
import androidx.compose.ui.platform.TextToolbarStatus;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class EmptyTextToolbar implements TextToolbar {

    /* renamed from: a  reason: collision with root package name */
    public static final EmptyTextToolbar f38318a = new EmptyTextToolbar();

    /* renamed from: b  reason: collision with root package name */
    public static final TextToolbarStatus f38319b = TextToolbarStatus.Hidden;

    public TextToolbarStatus A() {
        return f38319b;
    }

    public void C(Rect rect, Function0 function0, Function0 function02, Function0 function03, Function0 function04) {
        Intrinsics.i(rect, "rect");
    }

    public void a() {
    }
}
