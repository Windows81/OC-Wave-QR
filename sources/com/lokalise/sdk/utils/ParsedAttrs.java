package com.lokalise.sdk.utils;

import kotlin.Metadata;

@Metadata
public interface ParsedAttrs {
    int[] getAppCompatToolbarAttrs();

    int[] getTextInputLayoutAttrs();

    int[] getTextViewAttrs();

    int[] getToolbarAttrs();
}
