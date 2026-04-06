package com.hansecom.abt.data.config.menu;

import com.hansecom.abt.AppFeatures;
import com.hansecom.abt.ui.components.listItem.MenuItemState;
import com.hansecom.abt.util.resourcesResolvers.StringValue;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;

@Metadata
public final class AccountMenuConfigConverter extends MenuConfigConverter<Params> {

    /* renamed from: d  reason: collision with root package name */
    public final AppFeatures f33214d;

    @Metadata
    public static final class Params {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f33215a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f33216b;

        public Params(boolean z2, boolean z3) {
            this.f33215a = z2;
            this.f33216b = z3;
        }

        public final boolean a() {
            return this.f33216b;
        }

        public final boolean b() {
            return this.f33215a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Params)) {
                return false;
            }
            Params params = (Params) obj;
            return this.f33215a == params.f33215a && this.f33216b == params.f33216b;
        }

        public int hashCode() {
            return (Boolean.hashCode(this.f33215a) * 31) + Boolean.hashCode(this.f33216b);
        }

        public String toString() {
            boolean z2 = this.f33215a;
            boolean z3 = this.f33216b;
            return "Params(isBiometricsLockAvailable=" + z2 + ", isBiometricsLockActivated=" + z3 + ")";
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AccountMenuConfigConverter(Json json, AppFeatures appFeatures) {
        super(json);
        Intrinsics.i(json, "json");
        Intrinsics.i(appFeatures, "appFeatures");
        this.f33214d = appFeatures;
    }

    /* renamed from: g */
    public MenuItemState b(MenuItemConfig menuItemConfig, Params params, boolean z2) {
        Intrinsics.i(menuItemConfig, "config");
        Intrinsics.i(params, "params");
        try {
            if (Intrinsics.d(menuItemConfig.b(), "changePin")) {
                if (!this.f33214d.m()) {
                    throw new MenuConfigNotAllowedException(menuItemConfig);
                }
            }
            if (Intrinsics.d(menuItemConfig.b(), "biometricsLock")) {
                if (!this.f33214d.E()) {
                    throw new MenuConfigNotAllowedException(menuItemConfig);
                }
            }
            MenuItemState b2 = super.b(menuItemConfig, params, z2);
            return (!(b2 instanceof MenuItemState.Switch) || !Intrinsics.d(menuItemConfig.b(), "biometricsLock")) ? b2 : MenuItemState.Switch.b((MenuItemState.Switch) b2, (StringValue) null, (String) null, (String) null, params.a(), params.b(), 7, (Object) null);
        } catch (Exception e2) {
            f(e2);
            return null;
        }
    }
}
