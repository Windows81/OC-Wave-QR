package com.lokalise.sdk;

import android.content.res.Resources;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import io.github.inflationx.viewpump.InflateResult;
import io.github.inflationx.viewpump.Interceptor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class LokalisePostInterceptor implements Interceptor {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final ArrayList<Companion.MenuDetail> menuDetails = new ArrayList<>();
    /* access modifiers changed from: private */
    public static final Map<Integer, List<Companion.PreferenceDetail>> preferenceDetailsMap = new LinkedHashMap();
    /* access modifiers changed from: private */
    public static final Map<Integer, List<Companion.PreferenceEntryDetail>> preferenceEntriesMap = new LinkedHashMap();

    @Metadata
    public static final class Companion {

        @Metadata
        public static final class MenuDetail {
            private final int resId;
            private final int viewId;

            public MenuDetail(int i2, int i3) {
                this.viewId = i2;
                this.resId = i3;
            }

            public static /* synthetic */ MenuDetail copy$default(MenuDetail menuDetail, int i2, int i3, int i4, Object obj) {
                if ((i4 & 1) != 0) {
                    i2 = menuDetail.viewId;
                }
                if ((i4 & 2) != 0) {
                    i3 = menuDetail.resId;
                }
                return menuDetail.copy(i2, i3);
            }

            public final int component1() {
                return this.viewId;
            }

            public final int component2() {
                return this.resId;
            }

            public final MenuDetail copy(int i2, int i3) {
                return new MenuDetail(i2, i3);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof MenuDetail)) {
                    return false;
                }
                MenuDetail menuDetail = (MenuDetail) obj;
                return this.viewId == menuDetail.viewId && this.resId == menuDetail.resId;
            }

            public final int getResId() {
                return this.resId;
            }

            public final int getViewId() {
                return this.viewId;
            }

            public int hashCode() {
                return (Integer.hashCode(this.viewId) * 31) + Integer.hashCode(this.resId);
            }

            public String toString() {
                int i2 = this.viewId;
                int i3 = this.resId;
                return "MenuDetail(viewId=" + i2 + ", resId=" + i3 + ")";
            }
        }

        @Metadata
        public static final class PreferenceDetail {
            private final int summaryResId;
            private final int titleResId;

            public PreferenceDetail(int i2, int i3) {
                this.titleResId = i2;
                this.summaryResId = i3;
            }

            public static /* synthetic */ PreferenceDetail copy$default(PreferenceDetail preferenceDetail, int i2, int i3, int i4, Object obj) {
                if ((i4 & 1) != 0) {
                    i2 = preferenceDetail.titleResId;
                }
                if ((i4 & 2) != 0) {
                    i3 = preferenceDetail.summaryResId;
                }
                return preferenceDetail.copy(i2, i3);
            }

            public final int component1() {
                return this.titleResId;
            }

            public final int component2() {
                return this.summaryResId;
            }

            public final PreferenceDetail copy(int i2, int i3) {
                return new PreferenceDetail(i2, i3);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof PreferenceDetail)) {
                    return false;
                }
                PreferenceDetail preferenceDetail = (PreferenceDetail) obj;
                return this.titleResId == preferenceDetail.titleResId && this.summaryResId == preferenceDetail.summaryResId;
            }

            public final int getSummaryResId() {
                return this.summaryResId;
            }

            public final int getTitleResId() {
                return this.titleResId;
            }

            public int hashCode() {
                return (Integer.hashCode(this.titleResId) * 31) + Integer.hashCode(this.summaryResId);
            }

            public String toString() {
                int i2 = this.titleResId;
                int i3 = this.summaryResId;
                return "PreferenceDetail(titleResId=" + i2 + ", summaryResId=" + i3 + ")";
            }
        }

        @Metadata
        public static final class PreferenceEntryDetail {
            private final int entriesResId;
            private final int entriesValueResId;

            public PreferenceEntryDetail(int i2, int i3) {
                this.entriesResId = i2;
                this.entriesValueResId = i3;
            }

            public static /* synthetic */ PreferenceEntryDetail copy$default(PreferenceEntryDetail preferenceEntryDetail, int i2, int i3, int i4, Object obj) {
                if ((i4 & 1) != 0) {
                    i2 = preferenceEntryDetail.entriesResId;
                }
                if ((i4 & 2) != 0) {
                    i3 = preferenceEntryDetail.entriesValueResId;
                }
                return preferenceEntryDetail.copy(i2, i3);
            }

            public final int component1() {
                return this.entriesResId;
            }

            public final int component2() {
                return this.entriesValueResId;
            }

            public final PreferenceEntryDetail copy(int i2, int i3) {
                return new PreferenceEntryDetail(i2, i3);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof PreferenceEntryDetail)) {
                    return false;
                }
                PreferenceEntryDetail preferenceEntryDetail = (PreferenceEntryDetail) obj;
                return this.entriesResId == preferenceEntryDetail.entriesResId && this.entriesValueResId == preferenceEntryDetail.entriesValueResId;
            }

            public final int getEntriesResId() {
                return this.entriesResId;
            }

            public final int getEntriesValueResId() {
                return this.entriesValueResId;
            }

            public int hashCode() {
                return (Integer.hashCode(this.entriesResId) * 31) + Integer.hashCode(this.entriesValueResId);
            }

            public String toString() {
                int i2 = this.entriesResId;
                int i3 = this.entriesValueResId;
                return "PreferenceEntryDetail(entriesResId=" + i2 + ", entriesValueResId=" + i3 + ")";
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final void parseMenuItem(Resources resources, MenuItem menuItem) {
            T t2;
            Iterator<T> it = getMenuDetails().iterator();
            while (true) {
                if (!it.hasNext()) {
                    t2 = null;
                    break;
                }
                t2 = it.next();
                if (((MenuDetail) t2).getViewId() == menuItem.getItemId()) {
                    break;
                }
            }
            MenuDetail menuDetail = (MenuDetail) t2;
            if (menuDetail != null) {
                menuItem.setTitle(resources.getText(menuDetail.getResId()));
            }
        }

        public final ArrayList<MenuDetail> getMenuDetails() {
            return LokalisePostInterceptor.menuDetails;
        }

        public final Map<Integer, List<PreferenceDetail>> getPreferenceDetailsMap() {
            return LokalisePostInterceptor.preferenceDetailsMap;
        }

        public final Map<Integer, List<PreferenceEntryDetail>> getPreferenceEntriesMap() {
            return LokalisePostInterceptor.preferenceEntriesMap;
        }

        public final void parseMenu$sdk_release(Resources resources, Menu menu) {
            Intrinsics.i(resources, "resources");
            Intrinsics.i(menu, "menu");
            int size = menu.size();
            for (int i2 = 0; i2 < size; i2++) {
                MenuItem item = menu.getItem(i2);
                if (item.hasSubMenu()) {
                    SubMenu subMenu = item.getSubMenu();
                    if (subMenu != null) {
                        Companion companion = LokalisePostInterceptor.Companion;
                        Intrinsics.h(subMenu, "it");
                        companion.parseMenu$sdk_release(resources, subMenu);
                    }
                } else {
                    LokalisePostInterceptor.Companion.parseMenuItem(resources, item);
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:33:0x00ef, code lost:
            r11 = r11.getClass();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void setPreferenceFragmentTranslations$sdk_release(int r10, androidx.recyclerview.widget.RecyclerView r11) {
            /*
                r9 = this;
                java.lang.String r0 = "preferenceRecyclerView"
                kotlin.jvm.internal.Intrinsics.i(r11, r0)
                boolean r0 = com.lokalise.sdk.Lokalise.isPreference
                if (r0 == 0) goto L_0x0115
                androidx.recyclerview.widget.RecyclerView$Adapter r11 = r11.getAdapter()
                boolean r0 = r11 instanceof androidx.preference.PreferenceGroupAdapter
                if (r0 == 0) goto L_0x00e9
                androidx.preference.PreferenceGroupAdapter r11 = (androidx.preference.PreferenceGroupAdapter) r11
                int r0 = r11.getItemCount()
                r1 = 0
            L_0x0018:
                if (r1 >= r0) goto L_0x011e
                androidx.preference.Preference r2 = r11.getItem(r1)
                if (r2 == 0) goto L_0x00e5
                com.lokalise.sdk.LokalisePostInterceptor$Companion r3 = com.lokalise.sdk.LokalisePostInterceptor.Companion
                java.util.Map r4 = r3.getPreferenceDetailsMap()
                java.lang.Integer r5 = java.lang.Integer.valueOf(r10)
                java.lang.Object r4 = r4.get(r5)
                java.util.List r4 = (java.util.List) r4
                java.util.Map r3 = r3.getPreferenceEntriesMap()
                java.lang.Integer r5 = java.lang.Integer.valueOf(r10)
                java.lang.Object r3 = r3.get(r5)
                java.util.List r3 = (java.util.List) r3
                if (r4 == 0) goto L_0x009a
                int r5 = r4.size()
                int r5 = r5 + -1
                if (r5 < r1) goto L_0x009a
                java.lang.CharSequence r5 = r2.getTitle()
                java.lang.Object r6 = r4.get(r1)
                com.lokalise.sdk.LokalisePostInterceptor$Companion$PreferenceDetail r6 = (com.lokalise.sdk.LokalisePostInterceptor.Companion.PreferenceDetail) r6
                int r6 = r6.getTitleResId()
                java.lang.CharSequence r7 = r2.getSummary()
                java.lang.Object r8 = r4.get(r1)
                com.lokalise.sdk.LokalisePostInterceptor$Companion$PreferenceDetail r8 = (com.lokalise.sdk.LokalisePostInterceptor.Companion.PreferenceDetail) r8
                int r8 = r8.getSummaryResId()
                if (r5 == 0) goto L_0x0089
                if (r6 == 0) goto L_0x0089
                java.lang.Object r5 = r4.get(r1)
                com.lokalise.sdk.LokalisePostInterceptor$Companion$PreferenceDetail r5 = (com.lokalise.sdk.LokalisePostInterceptor.Companion.PreferenceDetail) r5
                int r5 = r5.getTitleResId()
                r2.setTitle(r5)
                boolean r5 = r2 instanceof androidx.preference.DialogPreference
                if (r5 == 0) goto L_0x0089
                r5 = r2
                androidx.preference.DialogPreference r5 = (androidx.preference.DialogPreference) r5
                java.lang.Object r6 = r4.get(r1)
                com.lokalise.sdk.LokalisePostInterceptor$Companion$PreferenceDetail r6 = (com.lokalise.sdk.LokalisePostInterceptor.Companion.PreferenceDetail) r6
                int r6 = r6.getTitleResId()
                r5.setDialogTitle(r6)
            L_0x0089:
                if (r7 == 0) goto L_0x009a
                if (r8 == 0) goto L_0x009a
                java.lang.Object r4 = r4.get(r1)
                com.lokalise.sdk.LokalisePostInterceptor$Companion$PreferenceDetail r4 = (com.lokalise.sdk.LokalisePostInterceptor.Companion.PreferenceDetail) r4
                int r4 = r4.getSummaryResId()
                r2.setSummary(r4)
            L_0x009a:
                if (r3 == 0) goto L_0x00e5
                int r4 = r3.size()
                int r4 = r4 + -1
                if (r4 < r1) goto L_0x00e5
                boolean r4 = r2 instanceof androidx.preference.ListPreference
                if (r4 == 0) goto L_0x00c5
                r4 = r2
                androidx.preference.ListPreference r4 = (androidx.preference.ListPreference) r4
                java.lang.Object r5 = r3.get(r1)
                com.lokalise.sdk.LokalisePostInterceptor$Companion$PreferenceEntryDetail r5 = (com.lokalise.sdk.LokalisePostInterceptor.Companion.PreferenceEntryDetail) r5
                int r5 = r5.getEntriesResId()
                r4.setEntries(r5)
                java.lang.Object r5 = r3.get(r1)
                com.lokalise.sdk.LokalisePostInterceptor$Companion$PreferenceEntryDetail r5 = (com.lokalise.sdk.LokalisePostInterceptor.Companion.PreferenceEntryDetail) r5
                int r5 = r5.getEntriesValueResId()
                r4.setEntryValues(r5)
            L_0x00c5:
                boolean r4 = r2 instanceof androidx.preference.MultiSelectListPreference
                if (r4 == 0) goto L_0x00e5
                androidx.preference.MultiSelectListPreference r2 = (androidx.preference.MultiSelectListPreference) r2
                java.lang.Object r4 = r3.get(r1)
                com.lokalise.sdk.LokalisePostInterceptor$Companion$PreferenceEntryDetail r4 = (com.lokalise.sdk.LokalisePostInterceptor.Companion.PreferenceEntryDetail) r4
                int r4 = r4.getEntriesResId()
                r2.setEntries(r4)
                java.lang.Object r3 = r3.get(r1)
                com.lokalise.sdk.LokalisePostInterceptor$Companion$PreferenceEntryDetail r3 = (com.lokalise.sdk.LokalisePostInterceptor.Companion.PreferenceEntryDetail) r3
                int r3 = r3.getEntriesValueResId()
                r2.setEntryValues(r3)
            L_0x00e5:
                int r1 = r1 + 1
                goto L_0x0018
            L_0x00e9:
                com.lokalise.sdk.utils.Logger r10 = com.lokalise.sdk.utils.Logger.INSTANCE
                com.lokalise.sdk.utils.LogType r0 = com.lokalise.sdk.utils.LogType.POST_INFLATION
                if (r11 == 0) goto L_0x00fa
                java.lang.Class r11 = r11.getClass()
                if (r11 == 0) goto L_0x00fa
                java.lang.String r11 = r11.getCanonicalName()
                goto L_0x00fb
            L_0x00fa:
                r11 = 0
            L_0x00fb:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "'PreferenceFragmentCompat' adapter has not supported adapter '"
                r1.append(r2)
                r1.append(r11)
                java.lang.String r11 = "'"
                r1.append(r11)
                java.lang.String r11 = r1.toString()
                r10.printError(r0, r11)
                goto L_0x011e
            L_0x0115:
                com.lokalise.sdk.utils.Logger r10 = com.lokalise.sdk.utils.Logger.INSTANCE
                com.lokalise.sdk.utils.LogType r11 = com.lokalise.sdk.utils.LogType.POST_INFLATION
                java.lang.String r0 = "PreferenceFragmentCompat dependency doesn't exist. Deprecated 'PreferenceFragment' is not supported"
                r10.printError(r11, r0)
            L_0x011e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.lokalise.sdk.LokalisePostInterceptor.Companion.setPreferenceFragmentTranslations$sdk_release(int, androidx.recyclerview.widget.RecyclerView):void");
        }

        private Companion() {
        }
    }

    public InflateResult intercept(Interceptor.Chain chain) {
        Intrinsics.i(chain, "chain");
        InflateResult n2 = chain.n(chain.m());
        if (Lokalise.isMaterial) {
            n2.a().getResources();
            n2.b();
        }
        return n2;
    }
}
