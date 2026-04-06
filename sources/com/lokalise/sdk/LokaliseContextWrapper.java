package com.lokalise.sdk;

import android.content.Context;
import android.content.ContextWrapper;
import com.lokalise.sdk.utils.LokaliseInitException;
import io.github.inflationx.viewpump.ViewPumpContextWrapper;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class LokaliseContextWrapper {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final ContextWrapper wrap(Context context) {
            Intrinsics.i(context, "context");
            if (Lokalise.isSDKReadyToUse) {
                return ViewPumpContextWrapper.f39815c.a(new LokaliseResourcesContextWrapper(context));
            }
            throw new LokaliseInitException("Lokalise SDK was not initialised! Please call 'Lokalise.init(<sdkToken>, <projectId>)' first.");
        }

        private Companion() {
        }
    }

    @JvmStatic
    public static final ContextWrapper wrap(Context context) {
        return Companion.wrap(context);
    }
}
