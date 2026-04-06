package com.lokalise.sdk.utils;

import com.google.android.material.R;
import com.lokalise.sdk.Lokalise;
import kotlin.Metadata;

@Metadata
public final class ParsedAttrsKt {
    /* access modifiers changed from: private */
    public static final int[] getMaterialAttrs() {
        if (!Lokalise.isMaterial) {
            return new int[0];
        }
        return new int[]{R.attr.prefixText, R.attr.suffixText};
    }
}
