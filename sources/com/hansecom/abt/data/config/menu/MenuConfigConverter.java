package com.hansecom.abt.data.config.menu;

import com.google.firebase.crashlytics.ktx.FirebaseCrashlyticsKt;
import com.google.firebase.ktx.Firebase;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigValue;
import com.google.firebase.remoteconfig.ktx.RemoteConfigKt;
import com.hansecom.abt.data.config.RemoteConfig;
import com.hansecom.abt.ui.components.listItem.MenuItemListState;
import com.hansecom.abt.ui.components.listItem.MenuItemState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ExtensionsKt;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.json.Json;
import timber.log.Timber;

@Metadata
public class MenuConfigConverter<T> {

    /* renamed from: b  reason: collision with root package name */
    public static final Companion f33227b = new Companion((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f33228c = 8;

    /* renamed from: a  reason: collision with root package name */
    public final Json f33229a;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    @Metadata
    public /* synthetic */ class WhenMappings {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f33230a;

        /* JADX WARNING: Can't wrap try/catch for region: R(15:0|1|2|3|4|5|6|7|8|9|10|11|12|13|15) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0034 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                com.hansecom.abt.data.config.menu.MenuItemType[] r0 = com.hansecom.abt.data.config.menu.MenuItemType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.hansecom.abt.data.config.menu.MenuItemType r1 = com.hansecom.abt.data.config.menu.MenuItemType.GROUP     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.hansecom.abt.data.config.menu.MenuItemType r1 = com.hansecom.abt.data.config.menu.MenuItemType.NAVIGATION     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                com.hansecom.abt.data.config.menu.MenuItemType r1 = com.hansecom.abt.data.config.menu.MenuItemType.WEBVIEW     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                com.hansecom.abt.data.config.menu.MenuItemType r1 = com.hansecom.abt.data.config.menu.MenuItemType.BROWSER     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                com.hansecom.abt.data.config.menu.MenuItemType r1 = com.hansecom.abt.data.config.menu.MenuItemType.ACTION     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                com.hansecom.abt.data.config.menu.MenuItemType r1 = com.hansecom.abt.data.config.menu.MenuItemType.SWITCH     // Catch:{ NoSuchFieldError -> 0x003d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003d }
            L_0x003d:
                f33230a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.data.config.menu.MenuConfigConverter.WhenMappings.<clinit>():void");
        }
    }

    public MenuConfigConverter(Json json) {
        Intrinsics.i(json, "json");
        this.f33229a = json;
    }

    public static /* synthetic */ MenuItemState c(MenuConfigConverter menuConfigConverter, MenuItemConfig menuItemConfig, Object obj, boolean z2, int i2, Object obj2) {
        if (obj2 == null) {
            if ((i2 & 4) != 0) {
                z2 = true;
            }
            return menuConfigConverter.b(menuItemConfig, obj, z2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: convertItem");
    }

    public MenuItemListState a(List list, Object obj) {
        Intrinsics.i(list, "configList");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MenuItemState c2 = c(this, (MenuItemConfig) it.next(), obj, false, 4, (Object) null);
            if (c2 != null) {
                arrayList.add(c2);
            }
        }
        return new MenuItemListState(ExtensionsKt.e(arrayList));
    }

    /* JADX WARNING: type inference failed for: r1v8 */
    /* JADX WARNING: type inference failed for: r9v2, types: [com.hansecom.abt.ui.components.listItem.MenuItemState$Text] */
    /* JADX WARNING: type inference failed for: r27v2, types: [com.hansecom.abt.ui.components.listItem.MenuItemState$Text] */
    /* JADX WARNING: type inference failed for: r17v2, types: [com.hansecom.abt.ui.components.listItem.MenuItemState$Text] */
    /* JADX WARNING: type inference failed for: r9v3, types: [com.hansecom.abt.ui.components.listItem.MenuItemState$Switch] */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00ec, code lost:
        if (r0 == null) goto L_0x00f2;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.hansecom.abt.ui.components.listItem.MenuItemState b(com.hansecom.abt.data.config.menu.MenuItemConfig r38, java.lang.Object r39, boolean r40) {
        /*
            r37 = this;
            r0 = r38
            java.lang.String r1 = "config"
            kotlin.jvm.internal.Intrinsics.i(r0, r1)
            com.hansecom.abt.data.config.menu.MenuItemType r1 = r38.g()
            int[] r2 = com.hansecom.abt.data.config.menu.MenuConfigConverter.WhenMappings.f33230a
            int r1 = r1.ordinal()
            r1 = r2[r1]
            switch(r1) {
                case 1: goto L_0x00af;
                case 2: goto L_0x008d;
                case 3: goto L_0x0065;
                case 4: goto L_0x0065;
                case 5: goto L_0x0041;
                case 6: goto L_0x0023;
                default: goto L_0x0016;
            }
        L_0x0016:
            com.hansecom.abt.data.config.menu.MenuConfigUnknownTypeException r1 = new com.hansecom.abt.data.config.menu.MenuConfigUnknownTypeException
            r1.<init>(r0)
            r8 = r37
            r8.f(r1)
            r0 = 0
            goto L_0x0108
        L_0x0023:
            r8 = r37
            com.hansecom.abt.ui.components.listItem.MenuItemState$Switch r1 = new com.hansecom.abt.ui.components.listItem.MenuItemState$Switch
            com.hansecom.abt.util.resourcesResolvers.StringValue r10 = r38.f()
            java.lang.String r11 = r38.d()
            java.lang.String r12 = r38.b()
            r15 = 8
            r16 = 0
            r13 = 0
            r9 = r1
            r14 = r40
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
        L_0x003e:
            r0 = r1
            goto L_0x0108
        L_0x0041:
            r8 = r37
            com.hansecom.abt.ui.components.listItem.MenuItemState$Text r1 = new com.hansecom.abt.ui.components.listItem.MenuItemState$Text
            com.hansecom.abt.util.resourcesResolvers.StringValue r18 = r38.f()
            java.lang.String r20 = r38.d()
            java.lang.String r22 = r38.b()
            java.lang.String r23 = r38.h()
            r25 = 10
            r26 = 0
            r19 = 0
            r21 = 0
            r17 = r1
            r24 = r40
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26)
            goto L_0x003e
        L_0x0065:
            r8 = r37
            com.hansecom.abt.ui.components.listItem.MenuItemState$Text r1 = new com.hansecom.abt.ui.components.listItem.MenuItemState$Text
            com.hansecom.abt.util.resourcesResolvers.StringValue r28 = r38.f()
            java.lang.String r30 = r38.d()
            com.hansecom.abt.data.config.menu.MenuItemType r2 = r38.g()
            java.lang.String r32 = r2.name()
            java.lang.String r33 = r38.h()
            r35 = 2
            r36 = 0
            r29 = 0
            java.lang.String r31 = "chevron_right"
            r27 = r1
            r34 = r40
            r27.<init>(r28, r29, r30, r31, r32, r33, r34, r35, r36)
            goto L_0x003e
        L_0x008d:
            r8 = r37
            com.hansecom.abt.ui.components.listItem.MenuItemState$Text r1 = new com.hansecom.abt.ui.components.listItem.MenuItemState$Text
            com.hansecom.abt.util.resourcesResolvers.StringValue r10 = r38.f()
            java.lang.String r12 = r38.d()
            java.lang.String r14 = r38.b()
            java.lang.String r15 = r38.h()
            r17 = 2
            r18 = 0
            r11 = 0
            java.lang.String r13 = "chevron_right"
            r9 = r1
            r16 = r40
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18)
            goto L_0x003e
        L_0x00af:
            r8 = r37
            com.hansecom.abt.util.resourcesResolvers.StringValue r20 = r38.f()
            java.lang.String r21 = r38.d()
            java.util.List r0 = r38.e()
            if (r0 == 0) goto L_0x00f2
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x00ca:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x00e8
            java.lang.Object r2 = r0.next()
            r3 = r2
            com.hansecom.abt.data.config.menu.MenuItemConfig r3 = (com.hansecom.abt.data.config.menu.MenuItemConfig) r3
            r6 = 4
            r7 = 0
            r5 = 0
            r2 = r37
            r4 = r39
            com.hansecom.abt.ui.components.listItem.MenuItemState r2 = c(r2, r3, r4, r5, r6, r7)
            if (r2 == 0) goto L_0x00ca
            r1.add(r2)
            goto L_0x00ca
        L_0x00e8:
            kotlinx.collections.immutable.PersistentList r0 = kotlinx.collections.immutable.ExtensionsKt.e(r1)
            if (r0 != 0) goto L_0x00ef
            goto L_0x00f2
        L_0x00ef:
            r24 = r0
            goto L_0x00f7
        L_0x00f2:
            kotlinx.collections.immutable.PersistentList r0 = kotlinx.collections.immutable.ExtensionsKt.a()
            goto L_0x00ef
        L_0x00f7:
            com.hansecom.abt.ui.components.listItem.MenuItemState$Group r0 = new com.hansecom.abt.ui.components.listItem.MenuItemState$Group
            java.lang.String r22 = "chevron_right"
            r23 = 0
            r26 = 8
            r27 = 0
            r19 = r0
            r25 = r40
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27)
        L_0x0108:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.data.config.menu.MenuConfigConverter.b(com.hansecom.abt.data.config.menu.MenuItemConfig, java.lang.Object, boolean):com.hansecom.abt.ui.components.listItem.MenuItemState");
    }

    public List d(RemoteConfig remoteConfig) {
        Intrinsics.i(remoteConfig, "menuRemoteConfig");
        try {
            FirebaseRemoteConfigValue r2 = RemoteConfigKt.a(Firebase.f30878a).r(remoteConfig.j());
            Intrinsics.h(r2, "getValue(...)");
            Json json = this.f33229a;
            String d2 = r2.d();
            Intrinsics.h(d2, "asString(...)");
            json.a();
            return (List) json.b(new ArrayListSerializer(MenuItemConfig.Companion.serializer()), d2);
        } catch (Exception e2) {
            Timber.f44337a.c(e2);
            FirebaseCrashlyticsKt.a(Firebase.f30878a).c(new MenuConfigConverterException(e2));
            return CollectionsKt.m();
        }
    }

    public MenuItemListState e(RemoteConfig remoteConfig, Object obj) {
        Intrinsics.i(remoteConfig, "remoteConfig");
        return a(d(remoteConfig), obj);
    }

    public final void f(Exception exc) {
        Intrinsics.i(exc, "exception");
        Timber.f44337a.c(exc);
        FirebaseCrashlyticsKt.a(Firebase.f30878a).c(exc);
    }
}
