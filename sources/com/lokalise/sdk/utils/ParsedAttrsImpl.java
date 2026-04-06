package com.lokalise.sdk.utils;

import androidx.appcompat.R;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;

@Metadata
public final class ParsedAttrsImpl implements ParsedAttrs {
    private final int[] appCompatToolbarAttrs = {R.attr.P, R.attr.N};
    private final int[] textInputLayoutAttrs = ArraysKt.D(new int[]{16843088}, ParsedAttrsKt.getMaterialAttrs());
    private final int[] textViewAttrs = {16843087, 16843088};
    private final int[] toolbarAttrs = {16843233, 16843473};

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
