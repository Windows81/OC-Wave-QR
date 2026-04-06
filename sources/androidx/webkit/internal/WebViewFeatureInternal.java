package androidx.webkit.internal;

import android.content.pm.PackageInfo;
import android.os.Build;
import androidx.webkit.WebViewCompat;
import androidx.webkit.WebViewFeature;
import androidx.webkit.internal.ApiFeature;
import androidx.webkit.internal.StartupApiFeature;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WebViewFeatureInternal {

    /* renamed from: A  reason: collision with root package name */
    public static final ApiFeature.M f23173A = new ApiFeature.M("WEB_MESSAGE_PORT_POST_MESSAGE", "WEB_MESSAGE_PORT_POST_MESSAGE");

    /* renamed from: B  reason: collision with root package name */
    public static final ApiFeature.M f23174B = new ApiFeature.M("WEB_MESSAGE_PORT_CLOSE", "WEB_MESSAGE_PORT_CLOSE");
    public static final ApiFeature.NoFramework C = new ApiFeature.NoFramework("WEB_MESSAGE_ARRAY_BUFFER", "WEB_MESSAGE_ARRAY_BUFFER");
    public static final ApiFeature.M D = new ApiFeature.M("WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK", "WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK");
    public static final ApiFeature.M E = new ApiFeature.M("CREATE_WEB_MESSAGE_CHANNEL", "CREATE_WEB_MESSAGE_CHANNEL");
    public static final ApiFeature.M F = new ApiFeature.M("POST_WEB_MESSAGE", "POST_WEB_MESSAGE");
    public static final ApiFeature.M G = new ApiFeature.M("WEB_MESSAGE_CALLBACK_ON_MESSAGE", "WEB_MESSAGE_CALLBACK_ON_MESSAGE");
    public static final ApiFeature.O H = new ApiFeature.O("GET_WEB_VIEW_CLIENT", "GET_WEB_VIEW_CLIENT");
    public static final ApiFeature.O I = new ApiFeature.O("GET_WEB_CHROME_CLIENT", "GET_WEB_CHROME_CLIENT");
    public static final ApiFeature.Q J = new ApiFeature.Q("GET_WEB_VIEW_RENDERER", "GET_WEB_VIEW_RENDERER");
    public static final ApiFeature.Q K = new ApiFeature.Q("WEB_VIEW_RENDERER_TERMINATE", "WEB_VIEW_RENDERER_TERMINATE");
    public static final ApiFeature.P L = new ApiFeature.P("TRACING_CONTROLLER_BASIC_USAGE", "TRACING_CONTROLLER_BASIC_USAGE");
    public static final StartupApiFeature.P M = new StartupApiFeature.P("STARTUP_FEATURE_SET_DATA_DIRECTORY_SUFFIX", "STARTUP_FEATURE_SET_DATA_DIRECTORY_SUFFIX");
    public static final StartupApiFeature.NoFramework N = new StartupApiFeature.NoFramework("STARTUP_FEATURE_SET_DIRECTORY_BASE_PATHS", "STARTUP_FEATURE_SET_DIRECTORY_BASE_PATH");
    public static final ApiFeature.Q O = new ApiFeature.Q("WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE", "WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE");
    public static final ApiFeature.T P = new ApiFeature.T("ALGORITHMIC_DARKENING", "ALGORITHMIC_DARKENING") {

        /* renamed from: d  reason: collision with root package name */
        public final Pattern f23201d = Pattern.compile("\\A\\d+");

        public boolean d() {
            boolean d2 = super.d();
            if (!d2 || Build.VERSION.SDK_INT >= 29) {
                return d2;
            }
            PackageInfo a2 = WebViewCompat.a();
            if (a2 == null) {
                return false;
            }
            Matcher matcher = this.f23201d.matcher(a2.versionName);
            return matcher.find() && Integer.parseInt(a2.versionName.substring(matcher.start(), matcher.end())) >= 105;
        }
    };
    public static final ApiFeature.NoFramework Q = new ApiFeature.NoFramework("PROXY_OVERRIDE", "PROXY_OVERRIDE:3");
    public static final ApiFeature.NoFramework R = new ApiFeature.NoFramework("MULTI_PROCESS", "MULTI_PROCESS_QUERY");
    public static final ApiFeature.Q S = new ApiFeature.Q("FORCE_DARK", "FORCE_DARK");
    public static final ApiFeature.NoFramework T = new ApiFeature.NoFramework("FORCE_DARK_STRATEGY", "FORCE_DARK_BEHAVIOR");
    public static final ApiFeature.NoFramework U = new ApiFeature.NoFramework("WEB_MESSAGE_LISTENER", "WEB_MESSAGE_LISTENER");
    public static final ApiFeature.NoFramework V = new ApiFeature.NoFramework("DOCUMENT_START_SCRIPT", "DOCUMENT_START_SCRIPT:1");
    public static final ApiFeature.NoFramework W = new ApiFeature.NoFramework("PROXY_OVERRIDE_REVERSE_BYPASS", "PROXY_OVERRIDE_REVERSE_BYPASS");
    public static final ApiFeature.NoFramework X = new ApiFeature.NoFramework("GET_VARIATIONS_HEADER", "GET_VARIATIONS_HEADER");
    public static final ApiFeature.NoFramework Y = new ApiFeature.NoFramework("ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY", "ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY");
    public static final ApiFeature.NoFramework Z = new ApiFeature.NoFramework("GET_COOKIE_INFO", "GET_COOKIE_INFO");

    /* renamed from: a  reason: collision with root package name */
    public static final ApiFeature.M f23175a = new ApiFeature.M("VISUAL_STATE_CALLBACK", "VISUAL_STATE_CALLBACK");
    public static final ApiFeature.NoFramework a0 = new ApiFeature.NoFramework("REQUESTED_WITH_HEADER_ALLOW_LIST", "REQUESTED_WITH_HEADER_ALLOW_LIST");

    /* renamed from: b  reason: collision with root package name */
    public static final ApiFeature.M f23176b = new ApiFeature.M("OFF_SCREEN_PRERASTER", "OFF_SCREEN_PRERASTER");
    public static final ApiFeature.NoFramework b0 = new ApiFeature.NoFramework("USER_AGENT_METADATA", "USER_AGENT_METADATA");

    /* renamed from: c  reason: collision with root package name */
    public static final ApiFeature.O f23177c = new ApiFeature.O("SAFE_BROWSING_ENABLE", "SAFE_BROWSING_ENABLE");
    public static final ApiFeature.NoFramework c0 = new ApiFeature.NoFramework("MULTI_PROFILE", "MULTI_PROFILE") {
        public boolean d() {
            if (super.d() && WebViewFeature.a("MULTI_PROCESS")) {
                return WebViewCompat.c();
            }
            return false;
        }
    };

    /* renamed from: d  reason: collision with root package name */
    public static final ApiFeature.N f23178d = new ApiFeature.N("DISABLED_ACTION_MODE_MENU_ITEMS", "DISABLED_ACTION_MODE_MENU_ITEMS");
    public static final ApiFeature.NoFramework d0 = new ApiFeature.NoFramework("ATTRIBUTION_REGISTRATION_BEHAVIOR", "ATTRIBUTION_BEHAVIOR");

    /* renamed from: e  reason: collision with root package name */
    public static final ApiFeature.O_MR1 f23179e = new ApiFeature.O_MR1("START_SAFE_BROWSING", "START_SAFE_BROWSING");
    public static final ApiFeature.NoFramework e0 = new ApiFeature.NoFramework("WEBVIEW_MEDIA_INTEGRITY_API_STATUS", "WEBVIEW_INTEGRITY_API_STATUS");

    /* renamed from: f  reason: collision with root package name */
    public static final ApiFeature.O_MR1 f23180f = new ApiFeature.O_MR1("SAFE_BROWSING_WHITELIST", "SAFE_BROWSING_WHITELIST");
    public static final ApiFeature.NoFramework f0 = new ApiFeature.NoFramework("MUTE_AUDIO", "MUTE_AUDIO");

    /* renamed from: g  reason: collision with root package name */
    public static final ApiFeature.O_MR1 f23181g = new ApiFeature.O_MR1("SAFE_BROWSING_WHITELIST", "SAFE_BROWSING_ALLOWLIST");
    public static final ApiFeature.NoFramework g0 = new ApiFeature.NoFramework("WEB_AUTHENTICATION", "WEB_AUTHENTICATION");

    /* renamed from: h  reason: collision with root package name */
    public static final ApiFeature.O_MR1 f23182h = new ApiFeature.O_MR1("SAFE_BROWSING_ALLOWLIST", "SAFE_BROWSING_WHITELIST");
    public static final ApiFeature.NoFramework h0 = new ApiFeature.NoFramework("SPECULATIVE_LOADING_STATUS", "SPECULATIVE_LOADING");

    /* renamed from: i  reason: collision with root package name */
    public static final ApiFeature.O_MR1 f23183i = new ApiFeature.O_MR1("SAFE_BROWSING_ALLOWLIST", "SAFE_BROWSING_ALLOWLIST");
    public static final ApiFeature.NoFramework i0 = new ApiFeature.NoFramework("BACK_FORWARD_CACHE", "BACK_FORWARD_CACHE");

    /* renamed from: j  reason: collision with root package name */
    public static final ApiFeature.O_MR1 f23184j = new ApiFeature.O_MR1("SAFE_BROWSING_PRIVACY_POLICY_URL", "SAFE_BROWSING_PRIVACY_POLICY_URL");

    /* renamed from: k  reason: collision with root package name */
    public static final ApiFeature.N f23185k = new ApiFeature.N("SERVICE_WORKER_BASIC_USAGE", "SERVICE_WORKER_BASIC_USAGE");

    /* renamed from: l  reason: collision with root package name */
    public static final ApiFeature.N f23186l = new ApiFeature.N("SERVICE_WORKER_CACHE_MODE", "SERVICE_WORKER_CACHE_MODE");

    /* renamed from: m  reason: collision with root package name */
    public static final ApiFeature.N f23187m = new ApiFeature.N("SERVICE_WORKER_CONTENT_ACCESS", "SERVICE_WORKER_CONTENT_ACCESS");

    /* renamed from: n  reason: collision with root package name */
    public static final ApiFeature.N f23188n = new ApiFeature.N("SERVICE_WORKER_FILE_ACCESS", "SERVICE_WORKER_FILE_ACCESS");

    /* renamed from: o  reason: collision with root package name */
    public static final ApiFeature.N f23189o = new ApiFeature.N("SERVICE_WORKER_BLOCK_NETWORK_LOADS", "SERVICE_WORKER_BLOCK_NETWORK_LOADS");

    /* renamed from: p  reason: collision with root package name */
    public static final ApiFeature.N f23190p = new ApiFeature.N("SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST", "SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST");

    /* renamed from: q  reason: collision with root package name */
    public static final ApiFeature.M f23191q = new ApiFeature.M("RECEIVE_WEB_RESOURCE_ERROR", "RECEIVE_WEB_RESOURCE_ERROR");

    /* renamed from: r  reason: collision with root package name */
    public static final ApiFeature.M f23192r = new ApiFeature.M("RECEIVE_HTTP_ERROR", "RECEIVE_HTTP_ERROR");

    /* renamed from: s  reason: collision with root package name */
    public static final ApiFeature.N f23193s = new ApiFeature.N("SHOULD_OVERRIDE_WITH_REDIRECTS", "SHOULD_OVERRIDE_WITH_REDIRECTS");

    /* renamed from: t  reason: collision with root package name */
    public static final ApiFeature.O_MR1 f23194t = new ApiFeature.O_MR1("SAFE_BROWSING_HIT", "SAFE_BROWSING_HIT");

    /* renamed from: u  reason: collision with root package name */
    public static final ApiFeature.N f23195u = new ApiFeature.N("WEB_RESOURCE_REQUEST_IS_REDIRECT", "WEB_RESOURCE_REQUEST_IS_REDIRECT");

    /* renamed from: v  reason: collision with root package name */
    public static final ApiFeature.M f23196v = new ApiFeature.M("WEB_RESOURCE_ERROR_GET_DESCRIPTION", "WEB_RESOURCE_ERROR_GET_DESCRIPTION");

    /* renamed from: w  reason: collision with root package name */
    public static final ApiFeature.M f23197w = new ApiFeature.M("WEB_RESOURCE_ERROR_GET_CODE", "WEB_RESOURCE_ERROR_GET_CODE");

    /* renamed from: x  reason: collision with root package name */
    public static final ApiFeature.O_MR1 f23198x = new ApiFeature.O_MR1("SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY", "SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY");

    /* renamed from: y  reason: collision with root package name */
    public static final ApiFeature.O_MR1 f23199y = new ApiFeature.O_MR1("SAFE_BROWSING_RESPONSE_PROCEED", "SAFE_BROWSING_RESPONSE_PROCEED");

    /* renamed from: z  reason: collision with root package name */
    public static final ApiFeature.O_MR1 f23200z = new ApiFeature.O_MR1("SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL", "SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL");

    public static UnsupportedOperationException a() {
        return new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
    }

    public static boolean b(String str) {
        return c(str, ApiFeature.e());
    }

    public static boolean c(String str, Collection collection) {
        HashSet<ConditionallySupportedFeature> hashSet = new HashSet<>();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            ConditionallySupportedFeature conditionallySupportedFeature = (ConditionallySupportedFeature) it.next();
            if (conditionallySupportedFeature.b().equals(str)) {
                hashSet.add(conditionallySupportedFeature);
            }
        }
        if (!hashSet.isEmpty()) {
            for (ConditionallySupportedFeature a2 : hashSet) {
                if (a2.a()) {
                    return true;
                }
            }
            return false;
        }
        throw new RuntimeException("Unknown feature " + str);
    }
}
