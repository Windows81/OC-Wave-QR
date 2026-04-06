package com.hansecom.abt.util;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class ScaffoldImePaddingKt {
    public static final Modifier a(Modifier modifier, PaddingValues paddingValues) {
        Intrinsics.i(modifier, "<this>");
        Intrinsics.i(paddingValues, "innerPadding");
        return WindowInsetsPadding_androidKt.a(WindowInsetsPaddingKt.a(PaddingKt.h(modifier, paddingValues), paddingValues));
    }
}
