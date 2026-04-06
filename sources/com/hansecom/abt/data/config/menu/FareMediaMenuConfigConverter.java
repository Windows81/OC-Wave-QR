package com.hansecom.abt.data.config.menu;

import com.google.firebase.crashlytics.ktx.FirebaseCrashlyticsKt;
import com.google.firebase.ktx.Firebase;
import com.hansecom.abt.AppFeatures;
import com.hansecom.abt.R;
import com.hansecom.abt.ui.components.listItem.MenuItemState;
import com.hansecom.abt.util.resourcesResolvers.StringValue;
import com.hansecom.abt.util.resourcesResolvers.StringValueKt;
import com.hansecom.mapi.models.FareMedium;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import timber.log.Timber;

@Metadata
public final class FareMediaMenuConfigConverter extends MenuConfigConverter<Params> {

    /* renamed from: d  reason: collision with root package name */
    public final AppFeatures f33220d;

    @Metadata
    public static final class Params {

        /* renamed from: a  reason: collision with root package name */
        public final FareMedium f33221a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f33222b;

        public Params(FareMedium fareMedium, boolean z2) {
            Intrinsics.i(fareMedium, "fareMedium");
            this.f33221a = fareMedium;
            this.f33222b = z2;
        }

        public final FareMedium a() {
            return this.f33221a;
        }

        public final boolean b() {
            return this.f33222b;
        }
    }

    @Metadata
    public /* synthetic */ class WhenMappings {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f33223a;

        /* JADX WARNING: Can't wrap try/catch for region: R(15:0|1|2|3|4|5|6|7|8|9|10|11|12|13|15) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0034 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                com.hansecom.abt.data.config.menu.MenuItemSelector[] r0 = com.hansecom.abt.data.config.menu.MenuItemSelector.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.hansecom.abt.data.config.menu.MenuItemSelector r1 = com.hansecom.abt.data.config.menu.MenuItemSelector.ALL     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.hansecom.abt.data.config.menu.MenuItemSelector r1 = com.hansecom.abt.data.config.menu.MenuItemSelector.NONE     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                com.hansecom.abt.data.config.menu.MenuItemSelector r1 = com.hansecom.abt.data.config.menu.MenuItemSelector.LOCKED     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                com.hansecom.abt.data.config.menu.MenuItemSelector r1 = com.hansecom.abt.data.config.menu.MenuItemSelector.UNLOCKED     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                com.hansecom.abt.data.config.menu.MenuItemSelector r1 = com.hansecom.abt.data.config.menu.MenuItemSelector.VIRTUAL     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                com.hansecom.abt.data.config.menu.MenuItemSelector r1 = com.hansecom.abt.data.config.menu.MenuItemSelector.PHYSICAL     // Catch:{ NoSuchFieldError -> 0x003d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003d }
            L_0x003d:
                f33223a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.data.config.menu.FareMediaMenuConfigConverter.WhenMappings.<clinit>():void");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FareMediaMenuConfigConverter(Json json, AppFeatures appFeatures) {
        super(json);
        Intrinsics.i(json, "json");
        Intrinsics.i(appFeatures, "appFeatures");
        this.f33220d = appFeatures;
    }

    public final boolean g(FareMedium fareMedium, MenuItemSelector menuItemSelector) {
        switch (WhenMappings.f33223a[menuItemSelector.ordinal()]) {
            case 1:
                return true;
            case 2:
                return false;
            case 3:
                return Intrinsics.d(fareMedium.h(), Boolean.TRUE);
            case 4:
                return Intrinsics.d(fareMedium.h(), Boolean.FALSE);
            case 5:
                return Intrinsics.d(fareMedium.q(), Boolean.TRUE);
            case 6:
                return Intrinsics.d(fareMedium.q(), Boolean.FALSE);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final boolean h(FareMedium fareMedium, List list) {
        Iterator it = list.iterator();
        while (true) {
            boolean z2 = true;
            while (true) {
                if (!it.hasNext()) {
                    return z2;
                }
                MenuItemSelector menuItemSelector = (MenuItemSelector) it.next();
                if (!z2 || !g(fareMedium, menuItemSelector)) {
                    z2 = false;
                }
            }
        }
    }

    /* renamed from: i */
    public MenuItemState b(MenuItemConfig menuItemConfig, Params params, boolean z2) {
        MenuItemConfig menuItemConfig2 = menuItemConfig;
        Params params2 = params;
        Intrinsics.i(menuItemConfig2, "config");
        Intrinsics.i(params2, "params");
        try {
            if (Intrinsics.d(menuItemConfig.b(), "institutions")) {
                if (!this.f33220d.e()) {
                    throw new MenuConfigNotAllowedException(menuItemConfig2);
                }
            }
            if (Intrinsics.d(menuItemConfig.b(), "transferBalance")) {
                if (!this.f33220d.a()) {
                    throw new MenuConfigNotAllowedException(menuItemConfig2);
                }
            }
            if (Intrinsics.d(menuItemConfig.b(), "convertToVirtual")) {
                if (!this.f33220d.B()) {
                    throw new MenuConfigNotAllowedException(menuItemConfig2);
                }
            }
            if (!h(params.a(), menuItemConfig.i())) {
                return null;
            }
            boolean h2 = h(params.a(), menuItemConfig.c());
            MenuItemState b2 = super.b(menuItemConfig2, params2, h2);
            return b2 instanceof MenuItemState.Text ? !h2 ? b2 : (!Intrinsics.d(menuItemConfig.b(), "convertToVirtual") || !params.b()) ? (!Intrinsics.d(menuItemConfig.b(), "convertToVirtual") || Intrinsics.d(params.a().d(), Boolean.TRUE)) ? (!Intrinsics.d(menuItemConfig.b(), "unlockCard") || Intrinsics.d(params.a().o(), Boolean.TRUE)) ? b2 : MenuItemState.Text.b((MenuItemState.Text) b2, (StringValue) null, (StringValue) null, (String) null, (String) null, (String) null, (String) null, false, 63, (Object) null) : MenuItemState.Text.b((MenuItemState.Text) b2, (StringValue) null, StringValueKt.c(R.string.F1), (String) null, (String) null, (String) null, (String) null, false, 61, (Object) null) : MenuItemState.Text.b((MenuItemState.Text) b2, (StringValue) null, StringValueKt.c(R.string.E1), (String) null, (String) null, (String) null, (String) null, false, 61, (Object) null) : b2;
        } catch (Throwable th) {
            Timber.f44337a.c(th);
            FirebaseCrashlyticsKt.a(Firebase.f30878a).c(th);
            return null;
        }
    }
}
