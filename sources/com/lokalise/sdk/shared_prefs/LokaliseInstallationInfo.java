package com.lokalise.sdk.shared_prefs;

import android.content.Context;
import android.content.SharedPreferences;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class LokaliseInstallationInfo {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String getUUID(Context context) {
            Intrinsics.i(context, "context");
            return context.getSharedPreferences("lokalise_sdk_installation_prefs", 0).getString("installation_uuid", (String) null);
        }

        public final void saveUUID(Context context, String str) {
            Intrinsics.i(context, "context");
            Intrinsics.i(str, "uuid");
            SharedPreferences sharedPreferences = context.getSharedPreferences("lokalise_sdk_installation_prefs", 0);
            Intrinsics.h(sharedPreferences, "context.getSharedPrefere…(PREF_NAME, MODE_PRIVATE)");
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putString("installation_uuid", str);
            edit.apply();
            edit.apply();
        }

        private Companion() {
        }
    }
}
