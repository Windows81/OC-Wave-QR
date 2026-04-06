package com.hansecom.abt.api;

import com.hansecom.abt.R;
import com.hansecom.abt.util.resourcesResolvers.StringValueKt;
import kotlin.Metadata;

@Metadata
public final class NoConnectionException extends LocalizedException {
    public NoConnectionException() {
        super(StringValueKt.c(R.string.R3));
    }
}
