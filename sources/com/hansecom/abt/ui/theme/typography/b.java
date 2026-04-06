package com.hansecom.abt.ui.theme.typography;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.text.TextStyle;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class b implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ TextStyle f38973A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ int f38974B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ String f38975z;

    public /* synthetic */ b(String str, TextStyle textStyle, int i2) {
        this.f38975z = str;
        this.f38973A = textStyle;
        this.f38974B = i2;
    }

    public final Object m(Object obj, Object obj2) {
        return AbtTypographyPreviewKt.c(this.f38975z, this.f38973A, this.f38974B, (Composer) obj, ((Integer) obj2).intValue());
    }
}
