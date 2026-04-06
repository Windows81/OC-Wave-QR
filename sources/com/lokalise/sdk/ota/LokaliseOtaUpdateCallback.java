package com.lokalise.sdk.ota;

import kotlin.Metadata;

@Metadata
public interface LokaliseOtaUpdateCallback {
    void onUpdateFailed(LokaliseOtaUpdateErrorType lokaliseOtaUpdateErrorType);

    void onUpdateNotNeeded();

    void onUpdated(long j2, long j3);
}
