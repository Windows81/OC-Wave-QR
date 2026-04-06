package com.lokalise.sdk;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.content.res.Resources;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class LokaliseResourcesContextWrapper extends ContextWrapper {
    private final Lazy lokaliseResources$delegate;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LokaliseResourcesContextWrapper(Context context) {
        super(context);
        Intrinsics.i(context, "context");
        this.lokaliseResources$delegate = LazyKt.b(new LokaliseResourcesContextWrapper$lokaliseResources$2(context));
    }

    private final Resources getLokaliseResources() {
        return (Resources) this.lokaliseResources$delegate.getValue();
    }

    public LokaliseResourcesContextWrapper createConfigurationContext(Configuration configuration) {
        Intrinsics.i(configuration, "overrideConfiguration");
        return this;
    }

    public Resources getResources() {
        return getLokaliseResources();
    }
}
