package com.lokalise.sdk;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class LokaliseResourcesContextWrapper$lokaliseResources$2 extends Lambda implements Function0<LokaliseResources> {
    final /* synthetic */ Context $context;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LokaliseResourcesContextWrapper$lokaliseResources$2(Context context) {
        super(0);
        this.$context = context;
    }

    public final LokaliseResources invoke() {
        this.$context.getResources().getConfiguration().setLocales(this.$context.getApplicationContext().getResources().getConfiguration().getLocales());
        return new LokaliseResources(this.$context);
    }
}
