package com.lokalise.sdk.utils;

import kotlin.Metadata;

@Metadata
public final class LokaliseDefines {
    public static final String EXTRA_BUNDLE_VERSION_NEW = "bundle_version_new";
    public static final String EXTRA_BUNDLE_VERSION_OLD = "bundle_version_old";
    public static final String EXTRA_UPDATE_ERROR = "update_error";
    public static final LokaliseDefines INSTANCE = new LokaliseDefines();
    public static final String INTENT_TRANSLATIONS_UPDATED = "com.lokalise.sdk.TRANSLATIONS_UPDATED";
    public static final String INTENT_TRANSLATION_UPDATE_FAILED = "com.lokalise.sdk.INTENT_TRANSLATION_UPDATE_FAILED";
    public static final String INTENT_TRANSLATION_UPDATE_NOT_NEEDED = "com.lokalise.sdk.TRANSLATION_UPDATE_NOT_NEEDED";
    private static final String NAMESPACE = "com.lokalise.sdk";

    private LokaliseDefines() {
    }
}
