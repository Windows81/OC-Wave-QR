package com.lokalise.sdk.utils;

import androidx.appcompat.R;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;

@Metadata
public final class ParsedAttrsImplV26 implements ParsedAttrs {
    private final int[] appCompatToolbarAttrs = {R.attr.P, R.attr.N, 16844084};
    private final int[] textInputLayoutAttrs = ArraysKt.C(ArraysKt.D(new int[]{16843088}, ParsedAttrsKt.getMaterialAttrs()), 16844084);
    private final int[] textViewAttrs = {16843087, 16843088, 16844084};
    private final int[] toolbarAttrs = {16843233, 16843473, 16844084};
    private final int tooltipAttr = 16844084;

    public int[] getAppCompatToolbarAttrs() {
        return this.appCompatToolbarAttrs;
    }

    public int[] getTextInputLayoutAttrs() {
        return this.textInputLayoutAttrs;
    }

    public int[] getTextViewAttrs() {
        return this.textViewAttrs;
    }

    public int[] getToolbarAttrs() {
        return this.toolbarAttrs;
    }
}
