package com.lokalise.sdk;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.LocaleList;
import android.os.Looper;
import android.text.Html;
import android.text.Spanned;
import com.google.gson.Gson;
import com.lokalise.sdk.api.SdkEndpoints;
import com.lokalise.sdk.api.poko.Item;
import com.lokalise.sdk.api.poko.Translation;
import com.lokalise.sdk.local_db.GlobalConfig;
import com.lokalise.sdk.local_db.LocaleConfig;
import com.lokalise.sdk.local_db.Translations;
import com.lokalise.sdk.ota.LokaliseOtaUpdateCallback;
import com.lokalise.sdk.ota.LokaliseOtaUpdateErrorType;
import com.lokalise.sdk.ota.LokaliseOtaUpdateStatusType;
import com.lokalise.sdk.shared_prefs.LokaliseInstallationInfo;
import com.lokalise.sdk.utils.LogType;
import com.lokalise.sdk.utils.Logger;
import com.lokalise.sdk.utils.LokaliseDefines;
import com.lokalise.sdk.utils.LokaliseInitException;
import com.lokalise.sdk.utils.LokaliseUtils;
import com.lokalise.sdk.utils.ResourceName;
import io.github.inflationx.viewpump.Interceptor;
import io.github.inflationx.viewpump.ViewPump;
import io.realm.Case;
import io.realm.Realm;
import io.realm.RealmConfiguration;
import io.realm.RealmResults;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;
import okhttp3.Request;

@Metadata
public final class Lokalise {
    public static final Lokalise INSTANCE = new Lokalise();
    private static final Lazy androidSDKVersion$delegate = LazyKt.b(Lokalise$androidSDKVersion$2.INSTANCE);
    private static final Lazy apiExecutor$delegate = LazyKt.b(Lokalise$apiExecutor$2.INSTANCE);
    /* access modifiers changed from: private */
    public static Context appContext;
    private static final Lazy appCountry$delegate = LazyKt.b(Lokalise$appCountry$2.INSTANCE);
    private static final Lazy appLabelResId$delegate = LazyKt.b(Lokalise$appLabelResId$2.INSTANCE);
    private static final Lazy appLangId$delegate = LazyKt.b(Lokalise$appLangId$2.INSTANCE);
    private static final Lazy appLanguage$delegate = LazyKt.b(Lokalise$appLanguage$2.INSTANCE);
    private static final Lazy appVersion$delegate = LazyKt.b(Lokalise$appVersion$2.INSTANCE);
    private static final List<LokaliseOtaUpdateCallback> callbacks = Collections.synchronizedList(new ArrayList());
    private static long currentBundleId;
    private static Locale currentLocale;
    private static final Lazy deviceLangId$delegate = LazyKt.b(Lokalise$deviceLangId$2.INSTANCE);
    private static LokaliseFallbackStrategy fallbackStrategy = LokaliseFallbackStrategy.WITH_BUNDLE_DEFAULT_LANGUAGE;
    public static boolean isMaterial;
    private static boolean isPreRelease;
    public static boolean isPreference;
    public static boolean isSDKReadyToUse;
    /* access modifiers changed from: private */
    public static AtomicBoolean isUpdating = new AtomicBoolean(false);
    /* access modifiers changed from: private */
    public static Function1<? super Integer, Unit> lastQuery;
    public static boolean logsEnabled;
    private static Realm mainThreadRealmInstance;
    private static final Lazy packageName$delegate = LazyKt.b(Lokalise$packageName$2.INSTANCE);
    private static int[] preferenceXmlIds;
    private static String projectId;
    private static final Lazy realmConfig$delegate = LazyKt.b(Lokalise$realmConfig$2.INSTANCE);
    private static final Lazy realmWrongConfig$delegate = LazyKt.b(Lokalise$realmWrongConfig$2.INSTANCE);
    private static String sdkToken;
    /* access modifiers changed from: private */
    public static boolean shouldTranslationsBeUpdated;
    private static final ExecutorService threadExecutor = Executors.newSingleThreadExecutor(new ResultExecutor());
    /* access modifiers changed from: private */
    public static Realm threadExecutorRealmInstance;
    private static String userUUID = "";

    @Metadata
    public enum TranslationType {
        ;

        @Metadata
        public static final class ARRAY extends TranslationType {
            private final int lokaliseCode;

            public ARRAY(String str, int i2) {
                super(str, i2, (DefaultConstructorMarker) null);
                this.lokaliseCode = 1;
            }

            public int getLokaliseCode() {
                return this.lokaliseCode;
            }
        }

        @Metadata
        public static final class PLURALS extends TranslationType {
            private final int lokaliseCode;

            public PLURALS(String str, int i2) {
                super(str, i2, (DefaultConstructorMarker) null);
                this.lokaliseCode = 2;
            }

            public int getLokaliseCode() {
                return this.lokaliseCode;
            }
        }

        @Metadata
        public static final class STRING extends TranslationType {
            private final int lokaliseCode;

            public STRING(String str, int i2) {
                super(str, i2, (DefaultConstructorMarker) null);
            }

            public int getLokaliseCode() {
                return this.lokaliseCode;
            }
        }

        public abstract int getLokaliseCode();
    }

    @Metadata
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|16|(2:17|18)|19|21) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0033 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x003b */
        static {
            /*
                com.lokalise.sdk.ota.LokaliseOtaUpdateStatusType[] r0 = com.lokalise.sdk.ota.LokaliseOtaUpdateStatusType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r1 = 1
                com.lokalise.sdk.ota.LokaliseOtaUpdateStatusType r2 = com.lokalise.sdk.ota.LokaliseOtaUpdateStatusType.UPDATED     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                r2 = 2
                com.lokalise.sdk.ota.LokaliseOtaUpdateStatusType r3 = com.lokalise.sdk.ota.LokaliseOtaUpdateStatusType.NOT_NEEDED     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                r3 = 3
                com.lokalise.sdk.ota.LokaliseOtaUpdateStatusType r4 = com.lokalise.sdk.ota.LokaliseOtaUpdateStatusType.FAILED     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0[r4] = r3     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                $EnumSwitchMapping$0 = r0
                com.lokalise.sdk.Lokalise$TranslationType[] r0 = com.lokalise.sdk.Lokalise.TranslationType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.lokalise.sdk.Lokalise$TranslationType r4 = com.lokalise.sdk.Lokalise.TranslationType.STRING     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r0[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                com.lokalise.sdk.Lokalise$TranslationType r1 = com.lokalise.sdk.Lokalise.TranslationType.ARRAY     // Catch:{ NoSuchFieldError -> 0x003b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003b }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003b }
            L_0x003b:
                com.lokalise.sdk.Lokalise$TranslationType r1 = com.lokalise.sdk.Lokalise.TranslationType.PLURALS     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                $EnumSwitchMapping$1 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.lokalise.sdk.Lokalise.WhenMappings.<clinit>():void");
        }
    }

    private Lokalise() {
    }

    @JvmStatic
    public static final void addCallback(LokaliseOtaUpdateCallback lokaliseOtaUpdateCallback) {
        Intrinsics.i(lokaliseOtaUpdateCallback, "callback");
        List<LokaliseOtaUpdateCallback> list = callbacks;
        if (!list.contains(lokaliseOtaUpdateCallback)) {
            list.add(lokaliseOtaUpdateCallback);
        }
    }

    private final void changeCurrentConfig(Locale locale, Context context) {
        Logger logger = Logger.INSTANCE;
        LogType logType = LogType.SDK;
        logger.printDebug(logType, "Try to change current config to '" + locale + "'");
        currentLocale = locale;
        updateConfiguration(locale, context);
    }

    @JvmStatic
    public static final void clearAllCallbacks() {
        callbacks.clear();
    }

    /* access modifiers changed from: private */
    public final SdkEndpoints getApiExecutor() {
        return (SdkEndpoints) apiExecutor$delegate.getValue();
    }

    /* access modifiers changed from: private */
    public final String getApplicationVersionCode(Context context) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            return Build.VERSION.SDK_INT >= 28 ? String.valueOf(packageInfo.getLongVersionCode()) : String.valueOf(packageInfo.versionCode);
        } catch (Exception unused) {
            return "";
        }
    }

    @JvmStatic
    public static final Locale[] getAvailableLocales() {
        Lokalise lokalise = INSTANCE;
        if (!lokalise.isMainThread()) {
            Object obj = threadExecutor.submit(new ResultCallable(Lokalise$getAvailableLocales$1.INSTANCE)).get();
            Intrinsics.g(obj, "null cannot be cast to non-null type kotlin.Array<java.util.Locale>");
            return (Locale[]) obj;
        }
        Realm realm = mainThreadRealmInstance;
        if (realm == null) {
            Intrinsics.y("mainThreadRealmInstance");
            realm = null;
        }
        RealmResults k2 = realm.E1(LocaleConfig.class).k();
        Intrinsics.h(k2, "mainThreadRealmInstance.…ig::class.java).findAll()");
        return lokalise.parseLocalesToArray(k2);
    }

    public static final long getCurrentBundleId() {
        return currentBundleId;
    }

    @JvmStatic
    public static /* synthetic */ void getCurrentBundleId$annotations() {
    }

    private final Spanned getHtmlParsedString(String str, Object[] objArr) {
        Logger logger = Logger.INSTANCE;
        LogType logType = LogType.SDK;
        String arrays = Arrays.toString(objArr);
        Intrinsics.h(arrays, "toString(this)");
        logger.printDebug(logType, "Incoming string IS \"" + str + "\" with args " + arrays);
        if (objArr != null) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.f40914a;
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            str = String.format(str, Arrays.copyOf(copyOf, copyOf.length));
            Intrinsics.h(str, "format(format, *args)");
        }
        Spanned fromHtml = Html.fromHtml(str, 0);
        Intrinsics.h(fromHtml, "{\n            Html.fromH…ML_MODE_LEGACY)\n        }");
        return fromHtml;
    }

    public static /* synthetic */ Spanned getHtmlParsedString$default(Lokalise lokalise, String str, Object[] objArr, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            objArr = null;
        }
        return lokalise.getHtmlParsedString(str, objArr);
    }

    private final String getInstallationUUID() {
        LokaliseInstallationInfo.Companion companion = LokaliseInstallationInfo.Companion;
        Context context = appContext;
        if (context == null) {
            Intrinsics.y("appContext");
            context = null;
        }
        String uuid = companion.getUUID(context);
        if (uuid != null) {
            return uuid;
        }
        String uuid2 = UUID.randomUUID().toString();
        Intrinsics.h(uuid2, "randomUUID().toString()");
        return uuid2;
    }

    public static final int[] getPreferenceXmlIds() {
        return preferenceXmlIds;
    }

    @JvmStatic
    public static /* synthetic */ void getPreferenceXmlIds$annotations() {
    }

    private final RealmConfiguration getRealmConfig() {
        return (RealmConfiguration) realmConfig$delegate.getValue();
    }

    private final RealmConfiguration getRealmWrongConfig() {
        return (RealmConfiguration) realmWrongConfig$delegate.getValue();
    }

    private final Translations getTranslation(RealmResults<Translations> realmResults, String... strArr) {
        T t2;
        int length = strArr.length;
        int i2 = 0;
        while (true) {
            t2 = null;
            if (i2 < length) {
                String str = strArr[i2];
                if (str != null) {
                    Iterator<T> it = realmResults.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        T next = it.next();
                        if (Intrinsics.d(((Translations) next).getLangId(), str)) {
                            t2 = next;
                            break;
                        }
                    }
                    t2 = (Translations) t2;
                }
                if (t2 != null) {
                    break;
                }
                i2++;
            } else {
                break;
            }
        }
        return t2;
    }

    /* renamed from: getTranslation-0O2xxSo$sdk_release$default  reason: not valid java name */
    public static /* synthetic */ Object m15getTranslation0O2xxSo$sdk_release$default(Lokalise lokalise, String str, TranslationType translationType, Object[] objArr, Locale locale, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            objArr = null;
        }
        return lokalise.m23getTranslation0O2xxSo$sdk_release(str, translationType, objArr, locale);
    }

    private final Translations getTranslationFromArray(RealmResults<Translations> realmResults, Locale locale) {
        Logger.INSTANCE.printDebug(LogType.SDK, "Try to find translation for '" + locale + "' or for relevant locale from the list of translations");
        String country = locale.getCountry();
        Intrinsics.h(country, "locale.country");
        if (country.length() > 0) {
            String language = locale.getLanguage();
            String str = locale.getLanguage() + "_" + locale.getCountry();
            String variant = locale.getVariant();
            Intrinsics.h(variant, "locale.variant");
            if (variant.length() <= 0) {
                return Intrinsics.d(str, "zh_MO") ? getTranslation(realmResults, str, language, "zh_TW") : getTranslation(realmResults, str, language);
            }
            return getTranslation(realmResults, locale.getLanguage() + "_" + locale.getVariant() + "_" + locale.getCountry(), str, language);
        }
        String language2 = locale.getLanguage();
        return Intrinsics.d(language2, "zh") ? getTranslation(realmResults, language2, "zh_TW") : getTranslation(realmResults, language2);
    }

    /* renamed from: getTranslationsContainsLang-0O2xxSo  reason: not valid java name */
    private final RealmResults<Translations> m16getTranslationsContainsLang0O2xxSo(String str, TranslationType translationType, String str2, Realm realm) {
        Logger logger = Logger.INSTANCE;
        LogType logType = LogType.SDK;
        String r2 = ResourceName.m36toStringimpl(str);
        logger.printDebug(logType, "Getting translations for: language='" + str2 + "', key='" + r2 + "', type='" + translationType + "'");
        RealmResults<Translations> k2 = realm.E1(Translations.class).h("type", Integer.valueOf(translationType.getLokaliseCode())).a().i("key", str).a().c("langId", str2, Case.SENSITIVE).k();
        Intrinsics.h(k2, "realm.where(Translations…E)\n            .findAll()");
        return k2;
    }

    /* access modifiers changed from: private */
    public final void getTranslationsFile(String str, long j2) {
        Logger logger = Logger.INSTANCE;
        LogType logType = LogType.API;
        logger.printDebug(logType, "get translations file by link. Bundle id = '" + j2 + "'");
        Ref.IntRef intRef = new Ref.IntRef();
        intRef.f40906z = 1;
        Lokalise$getTranslationsFile$1 lokalise$getTranslationsFile$1 = new Lokalise$getTranslationsFile$1(intRef, str, j2);
        lastQuery = lokalise$getTranslationsFile$1;
        lokalise$getTranslationsFile$1.invoke(Integer.valueOf(intRef.f40906z));
    }

    public static final String getUserUUID() {
        if (!StringsKt.l0(userUUID)) {
            return userUUID;
        }
        throw new LokaliseInitException("Lokalise SDK was not initialised! Please call 'Lokalise.init(<sdkToken>, <projectId>)' first.");
    }

    @JvmStatic
    public static /* synthetic */ void getUserUUID$annotations() {
    }

    @JvmStatic
    public static final void init(Context context, String str, String str2) {
        Intrinsics.i(context, "appContext");
        Intrinsics.i(str, "sdkToken");
        Intrinsics.i(str2, "projectId");
        init$default(context, str, str2, (LokaliseFallbackStrategy) null, (List) null, (List) null, 56, (Object) null);
    }

    public static /* synthetic */ void init$default(Context context, String str, String str2, LokaliseFallbackStrategy lokaliseFallbackStrategy, List list, List list2, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            lokaliseFallbackStrategy = fallbackStrategy;
        }
        LokaliseFallbackStrategy lokaliseFallbackStrategy2 = lokaliseFallbackStrategy;
        if ((i2 & 16) != 0) {
            list = CollectionsKt.m();
        }
        List list3 = list;
        if ((i2 & 32) != 0) {
            list2 = CollectionsKt.m();
        }
        init(context, str, str2, lokaliseFallbackStrategy2, list3, list2);
    }

    private final boolean isClassExist(String str) {
        try {
            Class.forName(str);
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    private final boolean isMainThread() {
        return Intrinsics.d(Looper.myLooper(), Looper.getMainLooper());
    }

    public static final boolean isPreRelease() {
        return isPreRelease;
    }

    @JvmStatic
    public static /* synthetic */ void isPreRelease$annotations() {
    }

    private final boolean isWrongProcess() {
        Context context = appContext;
        if (context == null) {
            Intrinsics.y("appContext");
            context = null;
        }
        return LokaliseUtils.isNotMainProcess(context);
    }

    /* access modifiers changed from: private */
    public final Realm newRealmInstance() {
        Realm G0 = Realm.G0(getRealmConfig());
        Intrinsics.h(G0, "getInstance(realmConfig)");
        return G0;
    }

    private final void notifySubscribers(long j2, long j3, LokaliseOtaUpdateStatusType lokaliseOtaUpdateStatusType, LokaliseOtaUpdateErrorType lokaliseOtaUpdateErrorType) {
        Logger logger = Logger.INSTANCE;
        LogType logType = LogType.SDK;
        StringBuilder sb = new StringBuilder();
        sb.append("Notify subscribers");
        sb.append("\n\t\t old bundle id = '" + j2 + "'");
        sb.append("\n\t\t new bundle id = '" + j3 + "'");
        String name = lokaliseOtaUpdateStatusType.name();
        sb.append("\n\t\t callback type = '" + name + "'");
        String name2 = lokaliseOtaUpdateErrorType != null ? lokaliseOtaUpdateErrorType.name() : null;
        sb.append("\n\t\t error type = '" + name2 + "'");
        Unit unit = Unit.f40552a;
        String sb2 = sb.toString();
        Intrinsics.h(sb2, "StringBuilder().apply(builderAction).toString()");
        logger.printInfo(logType, sb2);
        List<LokaliseOtaUpdateCallback> list = callbacks;
        if (list.size() > 0) {
            Intrinsics.h(list, "callbacks");
            List<LokaliseOtaUpdateCallback> list2 = (List) CollectionsKt.H0(list, new ArrayList());
            int i2 = WhenMappings.$EnumSwitchMapping$0[lokaliseOtaUpdateStatusType.ordinal()];
            if (i2 == 1) {
                for (LokaliseOtaUpdateCallback onUpdated : list2) {
                    onUpdated.onUpdated(j2, j3);
                }
                sendUpdatedBroadcast(j2, j3);
            } else if (i2 == 2) {
                for (LokaliseOtaUpdateCallback onUpdateNotNeeded : list2) {
                    onUpdateNotNeeded.onUpdateNotNeeded();
                }
                sendNotNeededBroadcast();
            } else if (i2 == 3) {
                Intrinsics.f(lokaliseOtaUpdateErrorType);
                for (LokaliseOtaUpdateCallback onUpdateFailed : list2) {
                    onUpdateFailed.onUpdateFailed(lokaliseOtaUpdateErrorType);
                }
                sendFailedBroadcast(lokaliseOtaUpdateErrorType);
            }
        }
    }

    public static /* synthetic */ void notifySubscribers$default(Lokalise lokalise, long j2, long j3, LokaliseOtaUpdateStatusType lokaliseOtaUpdateStatusType, LokaliseOtaUpdateErrorType lokaliseOtaUpdateErrorType, int i2, Object obj) {
        lokalise.notifySubscribers((i2 & 1) != 0 ? -1 : j2, (i2 & 2) != 0 ? -1 : j3, lokaliseOtaUpdateStatusType, (i2 & 8) != 0 ? null : lokaliseOtaUpdateErrorType);
    }

    /* access modifiers changed from: private */
    public final Locale[] parseLocalesToArray(RealmResults<LocaleConfig> realmResults) {
        Locale locale;
        if (realmResults.size() == 0) {
            return new Locale[0];
        }
        ArrayList arrayList = new ArrayList(CollectionsKt.x(realmResults, 10));
        for (LocaleConfig localeConfig : realmResults) {
            if (StringsKt.W(localeConfig.getLangId(), "_", false, 2, (Object) null)) {
                List N0 = StringsKt.N0(localeConfig.getLangId(), new String[]{"_"}, false, 0, 6, (Object) null);
                locale = new Locale((String) N0.get(0), (String) N0.get(1));
            } else {
                locale = new Locale(localeConfig.getLangId());
            }
            arrayList.add(locale);
        }
        return (Locale[]) arrayList.toArray(new Locale[0]);
    }

    /* access modifiers changed from: private */
    public final void printQueryLog(Request request, Request request2) {
        Map n2 = request.f().n();
        Intrinsics.h(n2, "request1.headers().toMultimap()");
        String str = "";
        for (Map.Entry entry : n2.entrySet()) {
            str = str + entry.getKey() + ": " + entry.getValue() + "\n\t\t\t";
        }
        if (request2 != null) {
            Map n3 = request2.f().n();
            Intrinsics.h(n3, "request2.headers().toMultimap()");
            for (Map.Entry entry2 : n3.entrySet()) {
                str = str + entry2.getKey() + ": " + entry2.getValue() + "\n\t\t\t";
            }
        }
        Logger logger = Logger.INSTANCE;
        LogType logType = LogType.API;
        StringBuilder sb = new StringBuilder();
        sb.append("API query log");
        sb.append("\n\t\tURL: " + request.k());
        sb.append("\n\t\tHeaders:\n\t\t\t" + str);
        Unit unit = Unit.f40552a;
        String sb2 = sb.toString();
        Intrinsics.h(sb2, "StringBuilder().apply(builderAction).toString()");
        logger.printInfo(logType, sb2);
    }

    public static /* synthetic */ void printQueryLog$default(Lokalise lokalise, Request request, Request request2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            request2 = null;
        }
        lokalise.printQueryLog(request, request2);
    }

    @JvmStatic
    public static final void removeCallback(LokaliseOtaUpdateCallback lokaliseOtaUpdateCallback) {
        Intrinsics.i(lokaliseOtaUpdateCallback, "callback");
        List<LokaliseOtaUpdateCallback> list = callbacks;
        if (list.contains(lokaliseOtaUpdateCallback)) {
            list.remove(lokaliseOtaUpdateCallback);
        }
    }

    private final void removeRealmWrongConfigIfNeeded() {
        Realm.t(getRealmWrongConfig());
    }

    private final Object returnSomeResult(String str, TranslationType translationType, Object[] objArr) {
        int i2 = WhenMappings.$EnumSwitchMapping$1[translationType.ordinal()];
        if (i2 == 1) {
            return getHtmlParsedString(str, objArr);
        }
        if (i2 == 2) {
            Object j2 = new Gson().j(str, String[].class);
            Intrinsics.h(j2, "Gson().fromJson(s, Array<String>::class.java)");
            Object[] objArr2 = (Object[]) j2;
            ArrayList arrayList = new ArrayList(objArr2.length);
            for (Object obj : objArr2) {
                arrayList.add(getHtmlParsedString$default(INSTANCE, (String) obj, (Object[]) null, 2, (Object) null));
            }
            return arrayList.toArray(new Spanned[0]);
        } else if (i2 == 3) {
            Object j3 = new Gson().j(str, Map.class);
            Intrinsics.h(j3, "Gson().fromJson(s, Map::class.java)");
            Map map = (Map) j3;
            LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.e(map.size()));
            for (Map.Entry entry : map.entrySet()) {
                Object key = entry.getKey();
                Lokalise lokalise = INSTANCE;
                Object value = entry.getValue();
                Intrinsics.g(value, "null cannot be cast to non-null type kotlin.String");
                linkedHashMap.put(key, lokalise.getHtmlParsedString((String) value, objArr));
            }
            return linkedHashMap;
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    public static /* synthetic */ Object returnSomeResult$default(Lokalise lokalise, String str, TranslationType translationType, Object[] objArr, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            objArr = null;
        }
        return lokalise.returnSomeResult(str, translationType, objArr);
    }

    /* renamed from: runWithNewRealmInstanceIfNeeded-0O2xxSo  reason: not valid java name */
    private final Object m17runWithNewRealmInstanceIfNeeded0O2xxSo(String str, TranslationType translationType, Locale locale, Object[] objArr) {
        if (!isMainThread()) {
            return threadExecutor.submit(new ResultCallable(new Lokalise$runWithNewRealmInstanceIfNeeded$1(str, translationType, locale, objArr))).get();
        }
        Realm realm = mainThreadRealmInstance;
        if (realm == null) {
            Intrinsics.y("mainThreadRealmInstance");
            realm = null;
        }
        return m20sdkGetStringnbQUOxs(str, translationType, locale, objArr, realm);
    }

    /* renamed from: runWithNewRealmInstanceIfNeeded-0O2xxSo$default  reason: not valid java name */
    public static /* synthetic */ Object m18runWithNewRealmInstanceIfNeeded0O2xxSo$default(Lokalise lokalise, String str, TranslationType translationType, Locale locale, Object[] objArr, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            objArr = null;
        }
        return lokalise.m17runWithNewRealmInstanceIfNeeded0O2xxSo(str, translationType, locale, objArr);
    }

    /* access modifiers changed from: private */
    public final void saveAppVersionToDB(String str) {
        Logger logger = Logger.INSTANCE;
        LogType logType = LogType.REALM;
        String userUUID2 = getUserUUID();
        logger.printDebug(logType, "Save app version '" + str + "' to DB. UUID = " + userUUID2);
        Realm realm = mainThreadRealmInstance;
        if (realm == null) {
            Intrinsics.y("mainThreadRealmInstance");
            realm = null;
        }
        realm.t0(new b(str));
    }

    /* access modifiers changed from: private */
    public static final void saveAppVersionToDB$lambda$4(String str, Realm realm) {
        Intrinsics.i(str, "$appVersion");
        Realm realm2 = mainThreadRealmInstance;
        if (realm2 == null) {
            Intrinsics.y("mainThreadRealmInstance");
            realm2 = null;
        }
        realm2.W0(new GlobalConfig(getUserUUID(), currentBundleId, str));
    }

    /* access modifiers changed from: private */
    public final void saveData(long j2, List<Translation> list) {
        Logger.INSTANCE.printDebug(LogType.REALM, "Save translations to local storage as compacted");
        Realm realm = mainThreadRealmInstance;
        if (realm == null) {
            Intrinsics.y("mainThreadRealmInstance");
            realm = null;
        }
        realm.w0(new c(j2, list), new d(j2), new e());
    }

    /* access modifiers changed from: private */
    public static final void saveData$lambda$11(long j2, List list, Realm realm) {
        Intrinsics.i(list, "$translations");
        realm.E1(LocaleConfig.class).k().e();
        realm.E1(Translations.class).k().e();
        realm.W0(new GlobalConfig(getUserUUID(), j2, INSTANCE.getAppVersion$sdk_release()));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Translation translation = (Translation) it.next();
            realm.W0(new LocaleConfig(StringsKt.K(translation.getIso(), "-", "_", false, 4, (Object) null), translation.isDefault()));
            Iterable<Item> items = translation.getItems();
            ArrayList arrayList = new ArrayList(CollectionsKt.x(items, 10));
            for (Item item : items) {
                arrayList.add(new Translations(item.getKey(), item.getValue(), item.getType(), StringsKt.K(translation.getIso(), "-", "_", false, 4, (Object) null)));
            }
            realm.b1(arrayList);
        }
    }

    /* access modifiers changed from: private */
    public static final void saveData$lambda$12(long j2) {
        threadExecutor.submit(new ResultCallable(Lokalise$saveData$2$1.INSTANCE));
        notifySubscribers$default(INSTANCE, currentBundleId, j2, LokaliseOtaUpdateStatusType.UPDATED, (LokaliseOtaUpdateErrorType) null, 8, (Object) null);
        currentBundleId = j2;
    }

    /* access modifiers changed from: private */
    public static final void saveData$lambda$13(Throwable th) {
        notifySubscribers$default(INSTANCE, 0, 0, LokaliseOtaUpdateStatusType.FAILED, LokaliseOtaUpdateErrorType.OTHER, 3, (Object) null);
    }

    private final void saveUserUUIDToDB(String str) {
        Logger.INSTANCE.printDebug(LogType.REALM, "Save user UUID '" + str + "' to DB");
        LokaliseInstallationInfo.Companion companion = LokaliseInstallationInfo.Companion;
        Context context = appContext;
        Realm realm = null;
        if (context == null) {
            Intrinsics.y("appContext");
            context = null;
        }
        companion.saveUUID(context, str);
        Realm realm2 = mainThreadRealmInstance;
        if (realm2 == null) {
            Intrinsics.y("mainThreadRealmInstance");
        } else {
            realm = realm2;
        }
        realm.t0(new a(str));
    }

    /* access modifiers changed from: private */
    public static final void saveUserUUIDToDB$lambda$3(String str, Realm realm) {
        Intrinsics.i(str, "$uuid");
        Realm realm2 = mainThreadRealmInstance;
        if (realm2 == null) {
            Intrinsics.y("mainThreadRealmInstance");
            realm2 = null;
        }
        realm2.U0(new GlobalConfig(str, 0, (String) null, 6, (DefaultConstructorMarker) null));
    }

    private final LocaleConfig sdkGetDefaultConfig(Realm realm) {
        return (LocaleConfig) realm.E1(LocaleConfig.class).g("isDefault", Boolean.TRUE).l();
    }

    /* renamed from: sdkGetDefaultTranslation-gwhbKNs  reason: not valid java name */
    private final Translations m19sdkGetDefaultTranslationgwhbKNs(String str, TranslationType translationType, Realm realm) {
        if (fallbackStrategy == LokaliseFallbackStrategy.IGNORE_BUNDLE_DEFAULT_LANGUAGE) {
            return null;
        }
        LocaleConfig sdkGetDefaultConfig = sdkGetDefaultConfig(realm);
        Logger logger = Logger.INSTANCE;
        LogType logType = LogType.SDK;
        String langId = sdkGetDefaultConfig != null ? sdkGetDefaultConfig.getLangId() : null;
        logger.printDebug(logType, "Getting translation for Lokalise default '" + langId + "' locale");
        if (sdkGetDefaultConfig != null) {
            return (Translations) realm.E1(Translations.class).h("type", Integer.valueOf(translationType.getLokaliseCode())).a().i("langId", sdkGetDefaultConfig.getLangId()).a().i("key", str).l();
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: sdkGetString-nbQUOxs  reason: not valid java name */
    public final Object m20sdkGetStringnbQUOxs(String str, TranslationType translationType, Locale locale, Object[] objArr, Realm realm) {
        Logger logger = Logger.INSTANCE;
        LogType logType = LogType.SDK;
        String name = Thread.currentThread().getName();
        logger.printDebug(logType, "Execute getting translation on '" + name + " thread'");
        if (shouldTranslationsBeUpdated) {
            return null;
        }
        String language = locale.getLanguage();
        Intrinsics.h(language, "locale.language");
        Translations translationFromArray = getTranslationFromArray(m16getTranslationsContainsLang0O2xxSo(str, translationType, language, realm), locale);
        if (translationFromArray == null) {
            LocaleList locales = Resources.getSystem().getConfiguration().getLocales();
            Intrinsics.h(locales, "getSystem().configuration.locales");
            translationFromArray = m22sdkGetTranslationFromLocaleListprGjWdo(locales, str, translationType, realm);
            if (translationFromArray == null) {
                translationFromArray = m19sdkGetDefaultTranslationgwhbKNs(str, translationType, realm);
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Results:");
        String value = translationFromArray != null ? translationFromArray.getValue() : null;
        String langId = translationFromArray != null ? translationFromArray.getLangId() : null;
        sb.append("'" + value + "' was received for '" + langId + "' locale");
        sb.append("\n\t\tQuery:");
        String r9 = ResourceName.m36toStringimpl(str);
        sb.append("\n\t\tkey='" + r9 + "'");
        sb.append("\n\t\ttype='" + translationType + "'");
        sb.append("\n\t\tlocale=" + locale + " ");
        String arrays = Arrays.toString(objArr);
        Intrinsics.h(arrays, "toString(this)");
        sb.append("\n\t\tformatArgs=" + arrays);
        Unit unit = Unit.f40552a;
        String sb2 = sb.toString();
        Intrinsics.h(sb2, "StringBuilder().apply(builderAction).toString()");
        logger.printDebug(logType, sb2);
        if (translationFromArray != null) {
            return returnSomeResult(translationFromArray.getValue(), translationType, objArr);
        }
        return null;
    }

    /* renamed from: sdkGetString-nbQUOxs$default  reason: not valid java name */
    public static /* synthetic */ Object m21sdkGetStringnbQUOxs$default(Lokalise lokalise, String str, TranslationType translationType, Locale locale, Object[] objArr, Realm realm, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            objArr = null;
        }
        return lokalise.m20sdkGetStringnbQUOxs(str, translationType, locale, objArr, realm);
    }

    /* renamed from: sdkGetTranslationFromLocaleList-prGjWdo  reason: not valid java name */
    private final Translations m22sdkGetTranslationFromLocaleListprGjWdo(LocaleList localeList, String str, TranslationType translationType, Realm realm) {
        Logger logger = Logger.INSTANCE;
        LogType logType = LogType.SDK;
        logger.printDebug(logType, "Getting translation for one of " + localeList + " locales");
        if (fallbackStrategy == LokaliseFallbackStrategy.IGNORE_BUNDLE_DEFAULT_LANGUAGE) {
            return null;
        }
        int i2 = 0;
        do {
            Locale locale = localeList.get(i2);
            String language = locale.getLanguage();
            Intrinsics.h(language, "locale.language");
            RealmResults<Translations> r3 = m16getTranslationsContainsLang0O2xxSo(str, translationType, language, realm);
            if (r3.size() > 0) {
                return getTranslationFromArray(r3, locale);
            }
            i2++;
        } while (i2 < localeList.size());
        return null;
    }

    private final void sendFailedBroadcast(LokaliseOtaUpdateErrorType lokaliseOtaUpdateErrorType) {
        Intent intent = new Intent(LokaliseDefines.INTENT_TRANSLATION_UPDATE_FAILED);
        intent.putExtra(LokaliseDefines.EXTRA_UPDATE_ERROR, lokaliseOtaUpdateErrorType);
        Context context = appContext;
        if (context == null) {
            Intrinsics.y("appContext");
            context = null;
        }
        context.sendBroadcast(intent);
    }

    private final void sendNotNeededBroadcast() {
        Intent intent = new Intent(LokaliseDefines.INTENT_TRANSLATION_UPDATE_NOT_NEEDED);
        Context context = appContext;
        if (context == null) {
            Intrinsics.y("appContext");
            context = null;
        }
        context.sendBroadcast(intent);
    }

    private final void sendUpdatedBroadcast(long j2, long j3) {
        Intent intent = new Intent(LokaliseDefines.INTENT_TRANSLATIONS_UPDATED);
        intent.putExtra(LokaliseDefines.EXTRA_BUNDLE_VERSION_OLD, j2);
        intent.putExtra(LokaliseDefines.EXTRA_BUNDLE_VERSION_NEW, j3);
        Context context = appContext;
        if (context == null) {
            Intrinsics.y("appContext");
            context = null;
        }
        context.sendBroadcast(intent);
    }

    @JvmStatic
    public static final void setLocale() {
        setLocale$default((String) null, (String) null, (String) null, (Context) null, 15, (Object) null);
    }

    public static /* synthetic */ void setLocale$default(String str, String str2, String str3, Context context, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = "";
        }
        if ((i2 & 2) != 0) {
            str2 = "";
        }
        if ((i2 & 4) != 0) {
            str3 = "";
        }
        if ((i2 & 8) != 0 && (context = appContext) == null) {
            Intrinsics.y("appContext");
            context = null;
        }
        setLocale(str, str2, str3, context);
    }

    public static final void setPreRelease(boolean z2) {
        isPreRelease = z2;
    }

    public static final void setPreferenceXmlIds(int[] iArr) {
        preferenceXmlIds = iArr;
    }

    private final void updateConfiguration(Locale locale, Context context) {
        Logger.INSTANCE.printDebug(LogType.SDK, "Invoking updateConfiguration('" + locale + "')");
        Context context2 = appContext;
        Context context3 = null;
        if (context2 == null) {
            Intrinsics.y("appContext");
            context2 = null;
        }
        Configuration configuration = context2.getResources().getConfiguration();
        configuration.setLocale(locale);
        LocaleList localeList = new LocaleList(new Locale[]{locale});
        LocaleList.setDefault(localeList);
        configuration.setLocales(localeList);
        Context context4 = appContext;
        if (context4 == null) {
            Intrinsics.y("appContext");
        } else {
            context3 = context4;
        }
        context3.createConfigurationContext(configuration);
        if (context instanceof Activity) {
            ((Activity) context).onConfigurationChanged(configuration);
        }
    }

    private final void updateFallbackStrategy(LokaliseFallbackStrategy lokaliseFallbackStrategy) {
        if (fallbackStrategy != lokaliseFallbackStrategy) {
            Logger logger = Logger.INSTANCE;
            LogType logType = LogType.SDK;
            logger.printDebug(logType, "change fallback strategy to " + lokaliseFallbackStrategy);
            fallbackStrategy = lokaliseFallbackStrategy;
        }
    }

    @JvmStatic
    public static final void updateTranslations() {
        if (INSTANCE.isWrongProcess()) {
            Logger.INSTANCE.printDebug(LogType.SDK, "'Lokalise.updateTranslations()' was called from not the main process. Immediately return");
        } else if (isSDKReadyToUse) {
            Logger.INSTANCE.printDebug(LogType.API, "get translations from API");
            if (!isUpdating.get()) {
                isUpdating.set(true);
                String uuid = UUID.randomUUID().toString();
                Intrinsics.h(uuid, "randomUUID().toString()");
                Ref.IntRef intRef = new Ref.IntRef();
                intRef.f40906z = 1;
                Lokalise$updateTranslations$1 lokalise$updateTranslations$1 = new Lokalise$updateTranslations$1(uuid, intRef);
                lastQuery = lokalise$updateTranslations$1;
                lokalise$updateTranslations$1.invoke(Integer.valueOf(intRef.f40906z));
            }
        } else {
            throw new LokaliseInitException("Lokalise SDK was not initialised! Please call 'Lokalise.init(<sdkToken>, <projectId>)' first.");
        }
    }

    public final String getAndroidSDKVersion$sdk_release() {
        return (String) androidSDKVersion$delegate.getValue();
    }

    public final String getAppCountry$sdk_release() {
        return (String) appCountry$delegate.getValue();
    }

    public final int getAppLabelResId$sdk_release() {
        return ((Number) appLabelResId$delegate.getValue()).intValue();
    }

    public final String getAppLangId$sdk_release() {
        return (String) appLangId$delegate.getValue();
    }

    public final String getAppLanguage$sdk_release() {
        return (String) appLanguage$delegate.getValue();
    }

    public final String getAppVersion$sdk_release() {
        return (String) appVersion$delegate.getValue();
    }

    public final String getDeviceLangId$sdk_release() {
        return (String) deviceLangId$delegate.getValue();
    }

    public final String getPackageName$sdk_release() {
        return (String) packageName$delegate.getValue();
    }

    public final String getProjectId$sdk_release() {
        String str = projectId;
        if (str != null) {
            return str;
        }
        Intrinsics.y("projectId");
        return null;
    }

    public final String getSdkToken$sdk_release() {
        String str = sdkToken;
        if (str != null) {
            return str;
        }
        Intrinsics.y("sdkToken");
        return null;
    }

    /* renamed from: getTranslation-0O2xxSo$sdk_release  reason: not valid java name */
    public final Object m23getTranslation0O2xxSo$sdk_release(String str, TranslationType translationType, Object[] objArr, Locale locale) {
        Object obj;
        Intrinsics.i(str, "key");
        Intrinsics.i(translationType, "type");
        Logger logger = Logger.INSTANCE;
        LogType logType = LogType.SDK;
        String r2 = ResourceName.m36toStringimpl(str);
        String name = translationType.name();
        String arrays = Arrays.toString(objArr);
        Intrinsics.h(arrays, "toString(this)");
        logger.printDebug(logType, "Get translation by key. Key={'" + r2 + "'} with Type=" + name + " where \nargs:" + arrays + "\nLocale:" + locale);
        LokaliseFallbackStrategy lokaliseFallbackStrategy = fallbackStrategy;
        String name2 = lokaliseFallbackStrategy.name();
        StringBuilder sb = new StringBuilder();
        sb.append("actual fallback strategy is ");
        sb.append(name2);
        logger.printDebug(logType, sb.toString());
        if (locale != null) {
            INSTANCE.updateFallbackStrategy(LokaliseFallbackStrategy.IGNORE_BUNDLE_DEFAULT_LANGUAGE);
        } else {
            locale = currentLocale;
            if (locale == null) {
                Intrinsics.y("currentLocale");
                locale = null;
            }
        }
        Locale locale2 = locale;
        int i2 = WhenMappings.$EnumSwitchMapping$1[translationType.ordinal()];
        if (i2 == 1) {
            obj = m17runWithNewRealmInstanceIfNeeded0O2xxSo(str, translationType, locale2, objArr);
        } else if (i2 == 2) {
            obj = m18runWithNewRealmInstanceIfNeeded0O2xxSo$default(this, str, translationType, locale2, (Object[]) null, 8, (Object) null);
        } else if (i2 == 3) {
            obj = m18runWithNewRealmInstanceIfNeeded0O2xxSo$default(this, str, translationType, locale2, (Object[]) null, 8, (Object) null);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        updateFallbackStrategy(lokaliseFallbackStrategy);
        return obj;
    }

    @JvmStatic
    public static final void init(Context context, String str, String str2, LokaliseFallbackStrategy lokaliseFallbackStrategy) {
        Intrinsics.i(context, "appContext");
        Intrinsics.i(str, "sdkToken");
        Intrinsics.i(str2, "projectId");
        Intrinsics.i(lokaliseFallbackStrategy, "translationsFallbackStrategy");
        init$default(context, str, str2, lokaliseFallbackStrategy, (List) null, (List) null, 48, (Object) null);
    }

    @JvmStatic
    public static final void setLocale(String str) {
        Intrinsics.i(str, "language");
        setLocale$default(str, (String) null, (String) null, (Context) null, 14, (Object) null);
    }

    @JvmStatic
    public static final void init(Context context, String str, String str2, LokaliseFallbackStrategy lokaliseFallbackStrategy, List<? extends Interceptor> list) {
        Intrinsics.i(context, "appContext");
        Intrinsics.i(str, "sdkToken");
        Intrinsics.i(str2, "projectId");
        Intrinsics.i(lokaliseFallbackStrategy, "translationsFallbackStrategy");
        Intrinsics.i(list, "postInterceptors");
        init$default(context, str, str2, lokaliseFallbackStrategy, list, (List) null, 32, (Object) null);
    }

    @JvmStatic
    public static final void setLocale(String str, String str2) {
        Intrinsics.i(str, "language");
        Intrinsics.i(str2, "country");
        setLocale$default(str, str2, (String) null, (Context) null, 12, (Object) null);
    }

    @JvmStatic
    public static final void init(Context context, String str, String str2, LokaliseFallbackStrategy lokaliseFallbackStrategy, List<? extends Interceptor> list, List<? extends Interceptor> list2) {
        Intrinsics.i(context, "appContext");
        Intrinsics.i(str, "sdkToken");
        Intrinsics.i(str2, "projectId");
        Intrinsics.i(lokaliseFallbackStrategy, "translationsFallbackStrategy");
        Intrinsics.i(list, "postInterceptors");
        Intrinsics.i(list2, "preInterceptors");
        appContext = context;
        fallbackStrategy = lokaliseFallbackStrategy;
        Lokalise lokalise = INSTANCE;
        if (!lokalise.isMainThread()) {
            Logger logger = Logger.INSTANCE;
            LogType logType = LogType.SDK;
            String name = Thread.currentThread().getName();
            logger.printDebug(logType, "'Lokalise.init(<sdkToken>, <projectId>)' was called from '" + name + "' thread. Immediately return");
            return;
        }
        sdkToken = str;
        projectId = str2;
        lokalise.init(context);
        isMaterial = lokalise.isClassExist("com.google.android.material.R$styleable");
        isPreference = lokalise.isClassExist("androidx.preference.Preference");
        ViewPump.Companion companion = ViewPump.f39802h;
        ViewPump.Builder a2 = companion.a();
        for (Interceptor a3 : list) {
            a2.a(a3);
        }
        a2.a(new LokalisePostInterceptor());
        for (Interceptor a4 : list2) {
            a2.a(a4);
        }
        a2.a(new LokalisePreInterceptor());
        companion.c(a2.b());
    }

    @JvmStatic
    public static final void setLocale(String str, String str2, String str3) {
        Intrinsics.i(str, "language");
        Intrinsics.i(str2, "country");
        Intrinsics.i(str3, "variant");
        setLocale$default(str, str2, str3, (Context) null, 8, (Object) null);
    }

    @JvmStatic
    public static final void setLocale(String str, String str2, String str3, Context context) {
        Intrinsics.i(str, "language");
        Intrinsics.i(str2, "country");
        Intrinsics.i(str3, "variant");
        Intrinsics.i(context, "context");
        if (isSDKReadyToUse) {
            Logger logger = Logger.INSTANCE;
            LogType logType = LogType.SDK;
            Locale locale = currentLocale;
            if (locale == null) {
                Intrinsics.y("currentLocale");
                locale = null;
            }
            logger.printDebug(logType, "Invoking setLocale(" + str + ", " + str2 + ", " + str3 + "). Current locale = '" + locale + "'}");
            INSTANCE.changeCurrentConfig(new Locale(str, str2, str3), context);
            return;
        }
        throw new LokaliseInitException("Lokalise SDK was not initialised! Please call 'Lokalise.init(<sdkToken>, <projectId>)' first.");
    }

    private final void init(Context context) {
        Locale locale = context.getResources().getConfiguration().getLocales().get(0);
        Intrinsics.h(locale, "appContext.resources.con…    else locale\n        }");
        currentLocale = locale;
        Realm.L0(context);
        mainThreadRealmInstance = newRealmInstance();
        removeRealmWrongConfigIfNeeded();
        Realm realm = mainThreadRealmInstance;
        if (realm == null) {
            Intrinsics.y("mainThreadRealmInstance");
            realm = null;
        }
        GlobalConfig globalConfig = (GlobalConfig) realm.E1(GlobalConfig.class).l();
        if (globalConfig != null) {
            currentBundleId = globalConfig.getBundleId();
            userUUID = globalConfig.getUserUUID();
            LokaliseInstallationInfo.Companion.saveUUID(context, getUserUUID());
            if (!Intrinsics.d(globalConfig.getLastKnownAppVersion(), getAppVersion$sdk_release())) {
                Logger.INSTANCE.printDebug(LogType.SDK, "app version was changed. Need to clear translations when will be needed");
                shouldTranslationsBeUpdated = true;
            }
        } else if (!isWrongProcess()) {
            userUUID = getInstallationUUID();
            saveUserUUIDToDB(getUserUUID());
            saveAppVersionToDB(getAppVersion$sdk_release());
        }
        isSDKReadyToUse = true;
    }
}
