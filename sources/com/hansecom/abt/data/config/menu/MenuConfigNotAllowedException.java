package com.hansecom.abt.data.config.menu;

import kotlin.Metadata;

@Metadata
public final class MenuConfigNotAllowedException extends Exception {
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MenuConfigNotAllowedException(com.hansecom.abt.data.config.menu.MenuItemConfig r4) {
        /*
            r3 = this;
            java.lang.String r0 = "config"
            kotlin.jvm.internal.Intrinsics.i(r4, r0)
            java.lang.String r0 = r4.b()
            com.hansecom.abt.data.config.menu.MenuItemType r4 = r4.g()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Menu item action="
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = ", type="
            r1.append(r0)
            r1.append(r4)
            java.lang.String r4 = " found in menu configuration, but not allowed by app features"
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r3.<init>(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.data.config.menu.MenuConfigNotAllowedException.<init>(com.hansecom.abt.data.config.menu.MenuItemConfig):void");
    }
}
