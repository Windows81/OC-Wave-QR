package com.lokalise.sdk.api;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class Params {

    @Metadata
    public static final class Api {
        private static String HOSTNAME = "https://ota.lokalise.com/";
        public static final Api INSTANCE = new Api();
        public static final String PLATFORM = "android/";
        public static final String VERSION = "v2.0/";

        private Api() {
        }

        public final String getHOSTNAME() {
            return HOSTNAME;
        }

        public final void setHOSTNAME(String str) {
            Intrinsics.i(str, "<set-?>");
            HOSTNAME = str;
        }
    }

    @Metadata
    public static final class Headers {
        public static final String APP_BUILD = "X-Lokalise-App-Build";
        public static final String APP_LANGUAGE = "X-Lokalise-App-Language";
        public static final String ATTEMPTS = "INTERNAL_ATTEMPTS";
        public static final String CURRENT_BUNDLE = "X-Lokalise-Current-Bundle";
        public static final String DEVICE_LANGUAGE = "X-Lokalise-Device-Language";
        public static final Headers INSTANCE = new Headers();
        public static final String LANGUAGE = "X-Lokalise-Language";
        public static final String PRE_RELEASE = "X-Lokalise-Prerelease";
        public static final String PROJECT_ID = "X-Lokalise-Project-Id";
        public static final String REGION = "X-Lokalise-Region";
        public static final String REQUEST_ID = "X-Request-Id";
        public static final String SDK_BUILD = "X-Lokalise-SDK-Build";
        public static final String SDK_TOKEN = "X-Lokalise-Api-Key";
        public static final String UID = "X-Lokalise-UID";
        public static final String USER_AGENT = "User-Agent";

        private Headers() {
        }
    }

    @Metadata
    public static final class Timeout {
        public static final int CONNECT_LONG = 10000;
        public static final int CONNECT_SHORT = 6000;
        public static final Timeout INSTANCE = new Timeout();
        public static final int MAX_ATTEMPTS = 5;
        public static final int READ_LONG = 50000;
        public static final int READ_SHORT = 14000;

        private Timeout() {
        }
    }
}
